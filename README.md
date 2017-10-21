# YouTube-Downloader-Java
A simple YouTube downloader in java.
##### This project uses maven.

#### Libraries used : VGet api (see POM.xml file for maven dependency).

##### #Note. please change the code accordingly for windows filesystem, as this program was made with unix filesystem in mind.
##### Know bugs : sometimes downloads videoplayback and audio separately (in *.webm or *.mp4), use ffmpeg command as shown below merge those files and resolve this isuue :

$ sudo ffmpeg -i videoplayback.mp4 -i audio.mp4 merged_output.mp4

### Screenshots: 

##### In Action : 
![in action youtube downloader](https://user-images.githubusercontent.com/29705703/31852571-854f314a-b697-11e7-8cb3-99f15c6aa128.png)

##### Main Program : 
![main program youtube downloader](https://user-images.githubusercontent.com/29705703/31852576-a3cb00ea-b697-11e7-80de-ae507985ca6c.png)

 
