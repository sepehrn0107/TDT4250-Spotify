import spotipy
import csv
from spotipy.oauth2 import SpotifyClientCredentials

spotify = spotipy.Spotify(client_credentials_manager=SpotifyClientCredentials(client_id="a087144b6ff14d22864514e26b34fe93",client_secret="3594c547263a48f38f961ee1c3a415ad"))

playlist = spotify.search(input("playlist name: "),1, 0, "playlist")["playlists"]["items"][0]


results = spotify.playlist_tracks(playlist["uri"])

filename = "./playlist_"+"".join(x for x in playlist["name"] if x.isalnum())+".csv"

with open(filename,"w") as f:
    writer = csv.writer(f)
    writer.writerow(["Track title", "Album title", "duration (ms)","Artist names" "Artist IDs","track ID", "album ID"])
    for item in results["items"]:
        artistNames = " | ".join(artist["name"] for artist in item["track"]["artists"])
        artistIDs = " | ".join(artist["id"] for artist in item["track"]["artists"])
        writer.writerow([item["track"]["name"],item["track"]["album"]["name"],item["track"]["duration_ms"],artistNames,artistIDs,item["track"]["artists"][0]["id"],item["track"]["album"]["id"]])