import spotipy
import csv
from spotipy.oauth2 import SpotifyClientCredentials

spotify = spotipy.Spotify(client_credentials_manager=SpotifyClientCredentials(client_id="a087144b6ff14d22864514e26b34fe93",client_secret="3594c547263a48f38f961ee1c3a415ad"))

playlist = spotify.search(input("playlist name: "),1, 0, "playlist")["playlists"]["items"][0]

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
            writer.writerow([artist["id"],artist["name"],artist["followers"]["total"]])


results = spotify.playlist_tracks(playlist["uri"])

filename = "./playlist_"+"".join(x for x in playlist["name"] if x.isalnum())+".csv"

with open(filename,"w",newline='',encoding="utf-8") as f:
    writer = csv.writer(f)
    writer.writerow([playlist["owner"]["id"],playlist["id"],playlist["name"],playlist["description"],playlist["public"]])
    writer.writerow(["track ID","Track title","href",  "duration (ms)","explicit","Artist ID", "album ID"])
    for item in results["items"]:
        for art in item["track"]["artists"]:
            checkArtist(art["id"])
        writer.writerow([item["track"]["id"],item["track"]["name"],item["track"]["href"],item["track"]["duration_ms"],item["track"]["explicit"],item["track"]["artists"][0]["id"],item["track"]["album"]["id"]])

