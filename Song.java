
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Song {
private String name;
private String artist; //Change to artist class
private int year;
private String Album; //Change to album class
private String Genre;// change to genre class
private static int likes =0;


public static void main(String[] args) {
	final JFXPanel fxP = new JFXPanel(); 
	String bip = "Juice WRLD - Robbery (Lyrics).mp3";
	Media hit = new Media(new File(bip).toURI().toString());
	MediaPlayer mediaPlayer = new MediaPlayer(hit);
	mediaPlayer.play();
}

public static int getLikes() {
	return likes;
}
public static void setLikes(int likes) {
	Song.likes = likes;
}
Song(String name, String artist, int year){
	this.name = name;
	this.artist = artist;
	this.year = year;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getArtist() {
	return artist;
}
public void setArtist(String artist) {
	this.artist = artist;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getAlbum() {
	return Album;
}
public void setAlbum(String album) {
	Album = album;
}
public String getGenre() {
	return Genre;
}
public void setGenre(String genre) {
	Genre = genre;
}
}
