import re
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
            artistName = re.sub("[^(A-z0-9<> )]|( {2,})", "", artist["name"])
            writer.writerow([artist["id"],artistName,artist["followers"]["total"]])

def checkUser(id:str):
    user = spotify.user(id)
    exists = False
    with open("userList.csv","r+",newline='',encoding="utf-8") as f:
        reader = csv.reader(f)
        writer = csv.writer(f)
        for item in reader:
            if(item and item[0]==user["id"]):
                exists = True
        if not exists:
            userName = re.sub("[^(A-z0-9<> )]|( {2,})", "", user["display_name"])
            email = "email@email.com" if "email" not in user else user["email"]
            country = "countryless" if "country" not in user else user["country"]
            writer.writerow([user["id"],userName,email,country])

checkUser(playlist["owner"]["id"])

results = spotify.playlist_tracks(playlist["uri"])

filename = "./playlist_"+"".join(x for x in playlist["name"] if x.isalnum())+".csv"
with open("playlistPaths.txt","a", encoding="utf-8") as f:
    f.write(filename[2:]+"\n")

with open(filename,"w",newline='',encoding="utf-8") as f:
    writer = csv.writer(f)
    description = re.sub("[^(A-z0-9<> )]|( {2,})", "", playlist["description"])
    writer.writerow([playlist["owner"]["id"],playlist["id"],playlist["name"],description,(playlist["public"] or "false")])
    writer.writerow(["track ID","Track title","href",  "duration (ms)","explicit","Artist ID", "album ID", "Album Name", "Album Type"])
    for item in results["items"]:
        for art in item["track"]["artists"]:
            checkArtist(art["id"])
        trackName = re.sub("[^(A-z0-9<> )]|( {2,})", "", item["track"]["name"])
        albumName = re.sub("[^(A-z0-9<> )]|( {2,})", "", item["track"]["album"]["name"])
        writer.writerow([item["track"]["id"],trackName,item["track"]["href"],item["track"]["duration_ms"],item["track"]["explicit"],item["track"]["artists"][0]["id"],item["track"]["album"]["id"],albumName,item["track"]["album"]["album_type"]])

