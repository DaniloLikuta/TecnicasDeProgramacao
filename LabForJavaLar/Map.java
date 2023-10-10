package LabForJavaLar;
import java.util.*;





public class Map {

	public static void main(String[] args) {
		
		///Declarações, inicializações e instanciação;
		ArrayList<String> mapa =  new  ArrayList<String>();
		int controlOfMultiplication = 1;
		
		Random generator = new Random();
		
		int bugGenerator[] = new int[23];
		
		for (int i = 0; i < bugGenerator.length; i++) {
			
			bugGenerator[i] = generator.nextInt(256);
			
		}
		for (int i = 0; i < bugGenerator.length; i++) {
			System.out.println(bugGenerator[i]);
		}
		
		
		
		/// preenche todos valores de mapa com null
		for (int i = 0; i < 256; i++) {
			mapa.add(i, null);
			
		}
		for (int i = 0; i < bugGenerator.length; i++) {
			mapa.add(bugGenerator[i],"BUGE");
			
		}
		
		
		
		//plota os valores adicionados em mapa
		
		for (int j = 0; j < 256; j++) {
			
			//controle do break, quebra as linhas a cada multiplo de 16
		int controlOfBreak = j;
			if(controlOfBreak == (16 * controlOfMultiplication)) {
				System.out.println(" espaço" + (j/16));
				controlOfMultiplication++;
				
			 }
			
			System.out.print(" " + mapa.get(j));
			
			
		}
		}
		
		

	}


