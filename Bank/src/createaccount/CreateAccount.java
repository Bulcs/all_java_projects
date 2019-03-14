package createaccount;

import java.util.Scanner;

public class CreateAccount {
	private static Scanner a;
	
		protected String first_name;
		protected String second_name;
		protected String cpf;
		protected int age;
		protected int day;
		protected int month;
		protected int year;
		protected int pass;
		protected int card_number;
		protected float saldo;
	
	//GETTERS
	public String getFirstName() {
		return this.first_name;
	}
	public String getSecondName() {
		return this.second_name;
	}
	public String getCpf() {
		return this.cpf;
	}
	public int getAge() {
		return this.age;
	}
	public int getBMonth() {
		return this.month;
	}
	public int getBYear() {
		return this.year;
	}
	public int getPass() {
		return this.pass;
	}
	public int getCardNumber() {
		return this.card_number;
	}
	public int getBDay() {
		return this.day;
	}
	public float getSaldo() {
		return this.saldo;
	}
	
	//SETTERS
	public void setFirstName(String fn) {
		this.first_name = fn;
	}
	public void setSecondName(String sn) {
		this.second_name = sn;
	}
	public void setCpf(String cpf_) {
		this.cpf = cpf_;
	}
	public void setAge(int age_) {
		this.age = age_;
	}
	public void setBDay(int day_) {
		this.day = day_;
	}
	public void setBMonth(int month_) {
		this.month = month_;
	}
	public void setBYear(int year_) {
		this.year = year_;
	}
	public void setPass(int pass_) {
		this.pass = pass_;
	}
	public void setCardNumber(int cn) {
		this.card_number = cn;
	}
	
}











