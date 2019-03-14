import java.util.Scanner;
import Animais.Dog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		d1.bark();
		d2.setName("Vini");
		d2.setAge(4);
		d2.setBirthday(d2);
		System.out.println(d2.getName());
		System.out.println(d1.getPrice());
		System.out.println(d2.getPrice());
		System.out.println(d2.getAge());
		System.out.println("Quantos dogs criados: ");
		System.out.println(Dog.count);
		
/**
 * A CLASSE MATH JA ESTÁ INSERIDA NO JAVA
 * int a = Math.abs(10);  // 10
 * int b = Math.abs(-20); // 20
 * double c = Math.ceil(7.342);  // 8.0
 * double f = Math.floor(7.343);  // 7.0
 * int m = Math.max(10, 20);  // 20
 * int m = Math.min(10, 20);  // 10
 * double p = Math.pow(2, 3); // 8.0
 * Math.sqrt() = raiz quadrada
 * */
		
		
		/**
		 * METODOS ARRAYLIST
		 * - contains(): Returns true if the list contains the specified element
		 * - get(int index): Returns the element at the specified position in the list
		 * - size(): Returns the number of elements in the list
		 * - clear(): Removes all of the elements from the list
		 * */
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Brown");
		colors.add("Blue");
		colors.add("Rose");
		colors.remove("Brown");
		System.out.println(colors);
		
		//Collections.sort(colors); -> ORGANIZA DE FORMA ALFABÉTICA array/hash
		/**
		 * OUTROS MÉTODOS DA CLASSE COLLECTIONS
		 * max(Collection c): Returns the maximum element in c as determined by natural ordering.
		 * min(Collection c): Returns the minimum element in c as determined by natural ordering.
		 * reverse(List list): Reverses the sequence in list.
		 * shuffle(List list): Shuffles (i.e., randomizes) the elements in list.
		 * */
		Collections.sort(colors);
		System.out.println(colors);
		
		//ITERATOR
		  Iterator<String> it = colors.iterator();
		  String value1 = it.next();
		  String value2 = it.next();
		  System.out.println(value1);
		  System.out.println(value2);
	}

}
