# Semester Project Group 13

We used the spotify api to fetch artists with albums and tracks, as well as some playlists and stored them in a csv file. This was done usin python and the spotipy library, which made it easy to access data from spotify, without having to fill out headers, log in, etc. Python code is available under “Data” folder.


We then created the classes representing the objects in ecore. 
INSERT PICTURE HERE



The data was mapped from the csv file to an xmi file (based on the ecore object) using the InstanceGenerator.java file. The methods puts the data and links objects like songs (tracks) with its corresponding album, playlist and artist. The output is shown in spotify.xmi.

INSERT PICTURE HERE


We attempted to create an EMF forms using the data on the xmi file, but realized that the amount of work needed, the complexity of the project when the group consisted of two member, as well as the workload considering the exam period were too high to complete the project. We were able to create a form for the accounts objects and import sample data from the Spotify.xmi file, but could only show it in preview.

INSERT PICTURE HERE
