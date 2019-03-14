package item;

import java.util.Scanner;

public class DVD extends Item {
	protected String director;
	private static Scanner s;
	
	//SETTER
	public void setDirector(String director) {
		this.director = director;
	}
	//GETTER
	public String getDirector() {
		return director;
	}
}
