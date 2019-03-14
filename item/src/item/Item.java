package item;

import java.util.Scanner;

public class Item {
	protected String title;
	protected int playingTime;
	protected String gotIt;
	protected String comment;
	
	
	//SETTERS
	public void setComment(String comm) {
		comment = comm;
	}
	public void setOwn(String own) {
		gotIt = own;
	}
	
	//GETTERS
	public String getComment() {
		return comment;
	}
	public String getOwn() {
		return gotIt;
	}
}
