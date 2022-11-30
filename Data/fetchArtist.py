import spotipy
import csv
from spotipy.oauth2 import SpotifyClientCredentials

spotify = spotipy.Spotify(client_credentials_manager=SpotifyClientCredentials(client_id="a087144b6ff14d22864514e26b34fe93",client_secret="3594c547263a48f38f961ee1c3a415ad"))

artist = spotify.search(input("Artist name: "),1, 0, "artist")["artists"]["items"][0]

results = spotify.artist_albums(artist["uri"], album_type='album')
albums = results['items']
while results['next']:
    results = spotify.next(results)
    albums.extend(results['items'])

filename = "./artist_"+"".join(x for x in artist["name"] if x.isalnum())+".csv"

with open(filename,"w") as f:
    writer = csv.writer(f)
    writer.writerow(["Track title", "Album title","Artists", "Duration (ms)","Artist IDs","Track ID", "Album ID"])
    for album in albums:
        albumName = album["name"]
        tracksFromAlbum = spotify.album_tracks(album["uri"])
        for track in tracksFromAlbum["items"]:
            artistNames = " | ".join(artist["name"] for artist in track["artists"])
            artistIDs = " | ".join(artist["id"] for artist in track["artists"])
            writer.writerow([track["name"],albumName,artistNames,track["duration_ms"],track["id"],album["id"],artistIDs])