package item;
import java.util.Scanner;

import item.Item;

public class main {
	
	private static Scanner s;
	
	public static void main(String[] args) {
		
		int cond;
		int cont_cd = 0;
		int cont_dvd = 0;
		
		String artist;
		String own;
		String comment;
		int numTracks;
		String director;
		
		CD[] c = new CD[100]; 
		DVD[] d = new DVD[100];
		s = new Scanner(System.in);
		System.out.println("What do u wanna take a cd -1 or dvd -2");
		cond = s.nextInt();
		switch(cond) {
		case 1:
			cont_cd +=1;
			//IN
			c[cont_cd] = new CD();
			System.out.println("Set your name: ");
			s.nextLine();
			own = s.nextLine();
			c[cont_cd].setOwn(own);
			System.out.println("Set an comment: ");
			s.nextLine();
			comment = s.nextLine();
			c[cont_cd].setComment(comment);
			System.out.println("Set artists: ");
			s.nextLine();
			artist = s.nextLine();
			c[cont_cd].setArtist(artist);
			System.out.println("Set how many tracks: ");
			numTracks = s.nextInt();
			c[cont_cd].setNumberOfTracks(numTracks);
			//OUT
			System.out.println("------------------------------------------");
			System.out.println("name: ");
			System.out.println(c[cont_cd].getOwn());
			System.out.println("comment: ");
			System.out.println(c[cont_cd].getComment());
			System.out.println("artist: ");
			System.out.println(c[cont_cd].getArtist());
			System.out.println("Number of Tracks: ");
			System.out.println(c[cont_cd].getNumberOfTracks());
			break;
		
		case 2:
			cont_dvd +=1;
			//IN
			d[cont_dvd] = new DVD();
			System.out.println("Set your name: ");
			s.nextLine();
			own = s.nextLine();
			d[cont_dvd].setOwn(own);
			System.out.println("Set an comment: ");
			s.nextLine();
			comment = s.nextLine();
			d[cont_dvd].setComment(comment);
			System.out.println("Set the director: ");
			s.nextLine();
			director = s.nextLine(); 
			d[cont_dvd].setDirector(director);
			//OUT
			System.out.println("------------------------------------------");
			System.out.println("name: ");
			d[cont_dvd].getOwn();
			System.out.println("comment: ");
			d[cont_dvd].getComment();
			System.out.println("director: ");
			d[cont_dvd].getDirector();
		}

	}

}




