package Animais;

public class Dog {
	
	private String name;
	private int age;
	private double weight;
	private String color;
	private double price;
	//static é chamada a partir da classe -> Dog.count
	public static int count = 0;
	//static final é uma variável que é implementada apenas uma vez, nao se altera -> Dog.inalteravel
	public static final int inalteravel = 1;
	
	public Dog(){
		price = 180;
		count++;
	}
	//GETTERS
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getPrice() {
		return price;
	}
	//SETTERS
	public void setBirthday(Dog a) {
		a.setAge(getAge() + 1);
	}
	public void setAge(int a) {
		this.age = a;
	}
	public void setName(String n) {
		this.name = n;
	}
	public void bark() {
		System.out.println("Woof-Woof");
	}
}
