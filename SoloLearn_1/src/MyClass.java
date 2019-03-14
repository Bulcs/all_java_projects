import java.util.Scanner;

class MyClass {
	
	//CLASS AND METHODS SAYHELLO
			static void sayHello(String name) {
				System.out.println("Hello " + name);
			}
	//CLASS SUM
			static int getSum(int x, int y, int z) {
				return x+y+z;
			}
	public static void main(String[] args) {
		//single line comment
		/*
		 * A lot of lines comment
		 * */
		/** -It's a comment who appears in the Docs- */
		System.out.println("Write your mom's name");
		//O Scanner é o famoso cin em c++
		/**
		 * Read a byte - nextByte()
		Read a short - nextShort()
		Read an int - nextInt()
		Read a long - nextLong()
		Read a float - nextFloat()
		Read a double - nextDouble()
		Read a boolean - nextBoolean()
		Read a complete line - nextLine()
		Read a word - next()
		 * */
		Scanner name= new Scanner(System.in);
		String momName = name.nextLine();
		
		System.out.println(momName);
		
		
		String first_name = "Vinícius";
		String second_name = "Ribeiro";
		System.out.println("My name is: " + first_name + " " + second_name);
		
		int num = 10;
		++num;
		System.out.println(num);
		
		System.out.println("What day is today: ");
		Scanner week = new Scanner(System.in);
		int dayOftheWeek = week.nextInt();
		
		switch(dayOftheWeek) {
		case 1:
			System.out.println("Sunday");
		break;
		case 2:
			System.out.println("Monday");
			break;
		}
		
		/**
		 * O IF, FOR, WHILE, SWITCH SÃO EXATAMENTE IGUAIS AO C++
		 * 
		 * */
		//EXCESSÃO
		for(int x=0;x<=10;x+=2) {
			if(x==6 || x== 8) {
				continue;
			}
			System.out.println(x);
		}
		
		//Criando um array em Java 
		
		int[] arr = new int[5];
		arr[0] = 200;
		System.out.println(arr[0] + " -> Array comum que criou os espaços e depois foi implementado o número 200");
		System.out.println("Tamanho do Array: " + arr.length);
		
		//ARRAY LITERAL JÁ IMPLEMENTADO OS MEMBROS DA FAMILIA
		String[] familia = {"Vinícius","João","Hellen"};
		
		//NORMAL FOR
		System.out.println("Normal FOR");
		for(int contador = 0; contador < familia.length; contador++) {
			System.out.println(familia[contador]);
		}
		//ENHANCED FOR
		System.out.println("Enhanced FOR");
		for(String fam:familia) {
			System.out.println(fam);
		}
		
		//MULTIDIMENSIONAL ARRAY
		int[][] matriz = {{1,2,3,},{4,5,6}};
		
		System.out.println("Linha 2, Coluna 3: \nNúmero: " + matriz[1][2]);
		
		//CALLING THE CLASS SAYHELLO
		sayHello("Vini");
		//CALLING THE CLASS getSum
		int resultado = getSum(3,4,8);
		System.out.println(resultado);
		
		
	}
}
