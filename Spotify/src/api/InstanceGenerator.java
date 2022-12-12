package api;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import spotify.Account;
import spotify.Album;
import spotify.AlbumType;
import spotify.Artist;
import spotify.Playlist;
import spotify.Spotify;
import spotify.SpotifyFactory;
import spotify.Track;
import spotify.User;

public class InstanceGenerator {
    ArrayList<ArrayList<String>> artistList;
    SpotifyFactory factory = SpotifyFactory.eINSTANCE;
    Spotify spotify = factory.createSpotify();

    public void generateArtist(ArrayList<String> artistData) {
        Artist artist = factory.createArtist();
        artist.setUserID(artistData.get(0));
        artist.setName(artistData.get(1));
        artist.setFollowers(Integer.parseInt(artistData.get(2)));
        artist.setGenres(artistData.get(3));;
        spotify.getAccount().add(artist);

    }

    public void generateUser(ArrayList<String> userData) {
        User user = factory.createUser();
        user.setUserID(userData.get(0));
        user.setName(userData.get(1));
        user.setEmail(userData.get(2));
        user.setCountry(userData.get(3));
        spotify.getAccount().add(user);
    }

    public Album generateAlbum(ArrayList<String> albumData) {
        Album album = factory.createAlbum();
        album.setID(albumData.get(0));
        album.setName(albumData.get(1));
        if (albumData.get(2) == "0") {
            album.setAlbumType(AlbumType.ALBUM);
        }
        if (albumData.get(2) == "1") {
            album.setAlbumType(AlbumType.SINGLE);
        }
        if (albumData.get(2) == "2") {
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
            if (account instanceof User && account.getUserID() == userId) {
                usr = (User) account;
            }

        }
        return usr;
    }

    public Track generateTrack(ArrayList<String> trackData) {
        Track tr = findTrack(trackData.get(0));
        if (tr == null) {
            Track track = factory.createTrack();
            track.setID(trackData.get(0));
            track.setName(trackData.get(1));
            track.setHref(trackData.get(2));
            track.setDuration(Integer.parseInt(trackData.get(3)));
            track.setExplicit(Boolean.parseBoolean(trackData.get(4)));
            spotify.getAccount().forEach(artist -> {
                if (artist instanceof Artist && artist.getUserID() == trackData.get(5)) {
                    ((Artist) artist).getArtistAlbum().forEach(album -> {
                        if (album.getID() == trackData.get(6)) {
                            ((Album) album).getTrackInAlbum().add(track);
                        }
                    });
                }
            });
            tr = track;
        }
        ;
        return tr;
        // spotify.getAccount().stream
    }

    public void generatePlaylist(ArrayList<String> playlistMetaData, ArrayList<ArrayList<String>> playlistTracks) {
        Playlist playlist = factory.createPlaylist();
        playlist.setID(playlistMetaData.get(1));
        playlist.setName(playlistMetaData.get(2));
        playlist.setDescription(playlistMetaData.get(3));
        playlist.setPublic(Boolean.parseBoolean(playlistMetaData.get(4)));
        playlistTracks.forEach(track -> playlist.getTrackInPlaylist().add(generateTrack(track)));
        findUser(playlistMetaData.get(0)).getPlaylist().add(playlist);
    }
}
