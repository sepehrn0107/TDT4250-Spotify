package api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import spotify.Account;
import spotify.Album;
import spotify.AlbumType;
import spotify.Artist;
import spotify.Playlist;
import spotify.Spotify;
import spotify.SpotifyFactory;
import spotify.Track;
import spotify.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class InstanceGenerator {
	
    ArrayList<ArrayList<String>> artistList;
    SpotifyFactory factory;
    Spotify spotify;
    
    public InstanceGenerator() {
    	this.factory = SpotifyFactory.eINSTANCE;
    	this.spotify = factory.createSpotify();
    }


    public void generateArtist(ArrayList<String> artistData) {
        Artist artist = this.factory.createArtist();
        artist.setUserID(artistData.get(0));
        artist.setName(artistData.get(1));
        artist.setFollowers(Integer.parseInt(artistData.get(2)));
        this.spotify.getAccount().add(artist);

    }

    public void generateUser(ArrayList<String> userData) {
        User user = this.factory.createUser();
        user.setUserID(userData.get(0));
        user.setName(userData.get(1));
        user.setEmail(userData.get(2));
        user.setCountry(userData.get(3));
        this.spotify.getAccount().add(user);
    }

    public Album generateAlbum(String albumId, String albumName, String albumType) {
        Album album = this.factory.createAlbum();
        album.setID(albumId);
        album.setName(albumName);
        if (albumType == "album") {
            album.setAlbumType(AlbumType.ALBUM);
        }
        if (albumType == "single") {
            album.setAlbumType(AlbumType.SINGLE);
        }
        if (albumType == "compilation") {
            album.setAlbumType(AlbumType.COMPILATION);
        }
        return album;

    }

    public Track findTrack(String trackId) {
        Track tr = null;
        for (Account account : spotify.getAccount()) {
            if (account instanceof Artist) {
                for (Album album : ((Artist) account).getArtistAlbum()) {
                    for (Track track : album.getTrackInAlbum()) {
                        if (track.getID() == trackId) {
                            tr = track;
                        }
                    }
                }
            }

        }
        return tr;
    }

    public Artist findArtist(String artistId) {
        Artist art = null;
        for (Account account : spotify.getAccount()) {
            if (account instanceof Artist && account.getUserID() == artistId) {
                art = (Artist) account;
            }

        }
        return art;
    }

    public User findUser(String userId) {
        User usr = null;
        for (Account account : spotify.getAccount()) {
            if (account instanceof User && account.getUserID().equals(userId)) {
                usr = (User) account;
                return usr;
            }

        }
        return usr;
    }

    public Track generateTrack(ArrayList<String> trackData) {
        Track tr = findTrack(trackData.get(0));
        if (tr == null) {
            Track track = this.factory.createTrack();
            track.setID(trackData.get(0));
            track.setName(trackData.get(1));
            track.setHref(trackData.get(2));
            track.setDuration(Integer.parseInt(trackData.get(3)));
            track.setExplicit(Boolean.parseBoolean(trackData.get(4)));
            findAlbum(trackData.get(6),trackData.get(7),trackData.get(8),trackData.get(5))
            .getTrackInAlbum().add(track);
            tr = track;
        }
        ;
        return tr;
        // spotify.getAccount().stream
    }
    public Album findAlbum(String albumId,String albumName,String albumType, String artistId) {
    	Album al = null;
    	for(Account artist:this.spotify.getAccount()) {
    		if(artist.getUserID().equals(artistId)) {
    			for(Album album : ((Artist) artist).getArtistAlbum()) {
                    if (album.getID().equals(albumId)) {
                        return album;
                    }
                }
                al = generateAlbum(albumId,albumName,albumType);
                ((Artist)artist).getArtistAlbum().add(al);
    		}
        }
    	return al;
    }

    public void generatePlaylist(ArrayList<String> playlistMetaData, List<ArrayList<String>> playlistTracks) {
        Playlist playlist = this.factory.createPlaylist();
        playlist.setID(playlistMetaData.get(1));
        playlist.setName(playlistMetaData.get(2));
        playlist.setDescription(playlistMetaData.get(3));
        playlist.setPublic(Boolean.parseBoolean(playlistMetaData.get(4)));
        playlistTracks.forEach(track -> playlist.getTrackInPlaylist().add(generateTrack(track)));
        findUser(playlistMetaData.get(0)).getPlaylist().add(playlist);
    }
    
    
    
    public ArrayList<ArrayList<String>> csvReader(String path){
        String line = "";
        String cvsSplitBy = ",";
        ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
          while ((line = br.readLine()) != null) {
            // use comma as separator
        	ArrayList<String> values = new ArrayList(Arrays.asList(line.split(cvsSplitBy)));
            data.add(values);
          }

        } catch (IOException e) {
          e.printStackTrace();
        }
        return data;
      }
    
    public ArrayList<String> TXTReader(String path){
    	ArrayList<String> data = new ArrayList<String>();
    	String line = "";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
          while ((line = br.readLine()) != null) {
            data.add("../Data/"+line);
          }

        } catch (IOException e) {
          e.printStackTrace();
        }
        return data;
    }
    	
    public static void main(String[] args) {
    	InstanceGenerator gen = new InstanceGenerator();
    	ArrayList<ArrayList<String>> artists = gen.csvReader("../Data/artistList.csv");
    	for (ArrayList<String> art:artists.subList(1, artists.size())) {
    		gen.generateArtist(art);		
    	};
    	ArrayList<ArrayList<String>> users = gen.csvReader("../Data/userList.csv");
    	for (ArrayList<String> usr:users.subList(1, users.size())) {
    		gen.generateUser(usr);	
    	};
    	for (String path : gen.TXTReader("../Data/artistPaths.txt")) {
    		ArrayList<ArrayList<String>> allArtists = gen.csvReader(path);
    		for (ArrayList<String> artistData:allArtists.subList(1, allArtists.size())) {
    			gen.generateTrack(artistData);
    		}
    	}
    	for (String path : gen.TXTReader("../Data/playlistPaths.txt")) {
    		ArrayList<ArrayList<String>> allPlaylists = gen.csvReader(path);
    		ArrayList<String> metaData = allPlaylists.get(0);
    		gen.generatePlaylist(metaData, allPlaylists.subList(2, allPlaylists.size()));
    	}
    	
    	
    	Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        reg.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
        ResourceSet Spotify = new ResourceSetImpl();

        // Create the resource and load the Java object
        Resource res = Spotify.createResource(URI.createURI("Spotify.xmi"));
        EObject obj = (EObject) gen.spotify;

        // Add the object to the resource
        res.getContents().add(obj);

        // Save the resource
        try {
        res.save(Collections.EMPTY_MAP);}
        catch(IOException e){
        	System.out.println("NEI");
        	e.printStackTrace();
        }
    	
    }
}