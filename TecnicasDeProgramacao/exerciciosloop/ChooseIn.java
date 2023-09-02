package exerciciosloop;

import java.util.Scanner;

public class ChooseIn {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Give me the first number:");
		
		int i = entrada.nextInt();

		
			do {
				
				System.out.println(i);
				
				i++;
				
				
				
			} while(i <1501);

	}

}
