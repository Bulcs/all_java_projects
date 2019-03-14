package main;

import java.util.Scanner;
import veiculos.Veiculos;

public class Main {

	private static Scanner cont;
	private static Scanner n;
	private static Scanner m;

	public static void main(String[] args) {
		int i=0;
		int t =1;
		System.out.println("This program is capable to simulate a car dealership");
		System.out.println("Note: Version 0.1");
		
		Veiculos[] v = new Veiculos[30];
		
		while(t == 1) {
		System.out.println("-------------------------------------------------------");
		System.out.println("Welcome friend\nType what would you like to do:");
		System.out.println("1 - Add a new vehicle");
		System.out.println("2 - Delete a vehicle");
		System.out.println("3 - Show a vehicle");
		System.out.println("4 - Close the program");
		
		cont = new Scanner(System.in);
		int contador = cont.nextInt();
		
		 
		if(contador == 1) {
			
				i++;
				v[i] = new Veiculos();
				System.out.println("Type the brand: ");
				m = new Scanner(System.in);
				String marca = m.nextLine();
				v[i].setMarca(marca);
				
				System.out.println("Type the vehicle year: ");
				Scanner a = new Scanner(System.in);
				int ano = a.nextInt();
				v[i].setAno(ano);
				
				System.out.println("Type the mileage: ");
				Scanner k = new Scanner(System.in);
				int km = k.nextInt();
				v[i].setKm(km);
				
				System.out.println("Type the price of the vehicle: ");
				Scanner p = new Scanner(System.in);
				float preco = p.nextFloat();
				v[i].setPreco(preco);
				
				System.out.println("Type how many km the vehicle can do with an 1 liter of gas: ");
				Scanner l = new Scanner(System.in);
				float liters = l.nextFloat();
				v[i].setPerformance(liters);
				
			}else if(contador == 2 && i !=0) {
				System.out.println("Type the number of the vehicle you want to delete: ");
				n = new Scanner(System.in);
				int num = n.nextInt();
				
				v[num] = null;
			}if(contador == 3){
				System.out.println("Type the number of the vehicle you want to see: ");
				n = new Scanner(System.in);
				int num2 = n.nextInt();
				System.out.println("Vehicle Brand: ");
				System.out.println(v[num2].getMarca());
				System.out.println("Year: ");
				System.out.println(v[num2].getAno());
				System.out.println("Mileage: ");
				System.out.println(v[num2].getKm());
				System.out.println("Price: ");
				System.out.println(v[num2].getPreco());
				System.out.println("Performance: ");
				System.out.println(v[num2].getPerformance());
			}else if(contador == 4) {
				t--;
			}
		}
	}
			
		
	}
































