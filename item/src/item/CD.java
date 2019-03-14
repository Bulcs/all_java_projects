package item;

import java.util.Scanner;

public class CD extends Item {
	protected String artist;
	protected int numberOfTracks;
	
	//GETTERS
	public String getArtist() {
		return artist;
	} 
	public int getNumberOfTracks() {
		return numberOfTracks;
	}
	//SETTERS
	public void setNumberOfTracks(int num) {
		numberOfTracks = num;
	}
	public void setArtist(String art) {
		artist = art;
	}
}
