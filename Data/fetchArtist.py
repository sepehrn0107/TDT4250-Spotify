import spotipy
import csv
from spotipy.oauth2 import SpotifyClientCredentials

spotify = spotipy.Spotify(client_credentials_manager=SpotifyClientCredentials(client_id="a087144b6ff14d22864514e26b34fe93",client_secret="3594c547263a48f38f961ee1c3a415ad"))

artist = spotify.search(input("Artist name: "),1, 0, "artist")["artists"]["items"][0]

def checkArtist(id:str):
    artist = spotify.artist(id)
    exists = False
    with open("artistList.csv","r+",newline='',encoding="utf-8") as f:
        reader = csv.reader(f)
        writer = csv.writer(f)
        for item in reader:
            if(item and item[0]==artist["id"]):
                exists = True
        if not exists:
            writer.writerow([artist["id"],artist["name"],artist["followers"]["total"],artist["genres"][0]])


results = spotify.artist_albums(artist["uri"], album_type='album')
albums = results['items']

while results['next']:
    results = spotify.next(results)
    albums.extend(results['items'])

filename = "./artist_"+"".join(x for x in artist["name"] if x.isalnum())+".csv"

checkArtist(artist["id"])

with open(filename,"w", encoding="utf-8",newline='') as f:
    writer = csv.writer(f)
    writer.writerow(["Track Id", "Track title","href", "Duration (ms)","Explicit","Artist IDs", "Album ID"])
    for album in albums:
        albumName = album["name"]
        tracksFromAlbum = spotify.album_tracks(album["uri"])
        for track in tracksFromAlbum["items"]:
            writer.writerow([track["id"],track["name"],track["href"],track["duration_ms"],track["explicit"],track["artists"][0]["id"],album["id"]])
