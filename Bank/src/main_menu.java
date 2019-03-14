import java.util.Scanner;

import javax.swing.JOptionPane;

import createaccount.CreateAccount;
import java.util.Random;

public class main_menu {

	private static Scanner s;

	public static void main(String[] args) {
		
		int i = 0;
		int cont =0;
		String scont = "y";
		String first_name;
		String second_name;
		String cpf;
		int age;
		int day;
		int month;
		int year;
		int pass;
		int card_number;
		
		System.out.println("Welcome to a Bank Simulator in Java");
		System.out.println("Note: this is just a little thing that I create.");
		System.out.println("Version: 1.0");
		
		CreateAccount[] conta = new CreateAccount[100];
		Random num = new Random();
		
		while(cont != 4 && !scont.equalsIgnoreCase("n")) {
		System.out.println("--------------------------------------------------");
		System.out.println("1 - Access your account\n2 - Create an account\n3 - Delete an account\n4 - End session");
		
		s = new Scanner(System.in);
		cont = s.nextInt();
		
			if(cont == 1) {
				System.out.println("Type your card number");
				card_number = s.nextInt();
				System.out.println("Type your password");
				pass = s.nextInt();
				for(CreateAccount c:conta) {
					if(card_number == c.getCardNumber() && pass == c.getPass()) {
						
					}
				}
			}	
			
			if(cont == 2) {
				i++;
				conta[i] = new CreateAccount();
				s.nextLine();
				System.out.println("Type your first name");
				first_name = s.nextLine();
				conta[i].setFirstName(first_name);
				
				System.out.println("Type your second name");
				second_name = s.nextLine();
				conta[i].setSecondName(second_name);
				
				System.out.println("Type your CPF");
				cpf = s.nextLine();
				conta[i].setCpf(cpf);
				
				System.out.println("Your age");
				age = s.nextInt();
				conta[i].setAge(age);
				
				System.out.println("The day of your birth");
				day = s.nextInt();
				conta[i].setBDay(day);
				
				System.out.println("The month of your birth");
				month = s.nextInt();
				conta[i].setBMonth(month);
				
				System.out.println("The year of your birth");
				year = s.nextInt();
				conta[i].setBYear(year);
				
				System.out.println("Please, choose a password with 6 numbers");
				pass = s.nextInt();
				conta[i].setPass(pass);
				
				card_number = num.nextInt(99999999);
				conta[i].setCardNumber(card_number);
				
				
				System.out.println("Your account is:");
				System.out.println(conta[i].getFirstName() + " " + conta[i].getSecondName());
				System.out.println("Account number " + conta[i].getCardNumber());
				System.out.println("Your password " + conta[i].getPass());
				
				s.nextLine();
				System.out.println("Want to continue? [y/n]");
				scont = s.nextLine();
				
			}
			
			if(cont == 3) {
				
			}
		}
	}

}



















