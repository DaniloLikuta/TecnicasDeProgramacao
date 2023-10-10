package LabForJavaLar;

import java.util.ArrayList;


public class Mapa {
	
	public static ArrayList<Astro> mapa;
	RandomGeneratorInt generator = new RandomGeneratorInt();
	
	
	String name="null";
	int externX= -1;
	int externY= 15;
	
	
	public Mapa() {

		 mapa =  new  ArrayList<Astro>();
		 int controlOfMultiplication = 1;
		 
		
		

		for (int i = 0; i < 256; i++) {
			
		
					
			int controlOfBreak= i;
			if(controlOfBreak == (controlOfMultiplication*16)) {
				externY--;
				controlOfMultiplication++;
				externX=-1;
				
				
			}
			externX++;
				
			
			
			mapa.add(new Astro(externX, externY, name));
				
			}
			
		}
		
	///End of constructor
	
	public void getMapa() {
		int controlOfMultiplication = 1;
		
		for (int i = 0; i < mapa.size(); i++) {
			
			int controlOfBreak = i;
			if(controlOfBreak == (16 * controlOfMultiplication)) {
				
				System.out.println(" espaço" + (i/16));
				controlOfMultiplication++;
				
			 }
	
//			System.out.print(" "+mapa.get(i).getName());
//			System.out.print(" "+mapa.get(i).getX());
//			System.out.print(" "+mapa.get(i).getY());
			
			// System.out.printf("%s%d%s%d%s%s","[", mapa.get(i).getX(),", ",mapa.get(i).getY(),"]", " ");
			
			System.out.printf("%s%s%s", "[",  mapa.get(i).getName(), "]");
			
	
		}
		
		
		
			
	}
		

	public void gerarBugs(int Amount) {
		///Dentro de um for  a variavel externa que contem a quantidade de bugs a serem gerados serve como contador.
		//A cada execução é criadoo um objeto Astro de nome "bug_", após isso é gerado uma posição  atráves do generator o antigo null é destruido e o bug adicnoando
		
		for (int i = 0; i < Amount ; i++) {
			
			Astro bug = new Astro("bug_");
			
			int random = generator.getRandom();
			mapa.remove(random);
			mapa.add(random, bug );
			
		
			
			
		}
		
}
	
	
	public void gerarDevs(int amount) {
		
		for (int i = 0; i < amount; i++) {
			
			Astro dev = new Astro("Dev_");
			
			int random = generator.getRandom();
			if( (mapa.get(random).getName()) != "null") {
			dev.setName("hsBu");
			mapa.remove(random);
			mapa.add(random, dev);
				
			}
			else {
				mapa.remove(random);
				mapa.add(random, dev);
				
				
			}
			
			
		
			
		}
		
	}
	
		
		
		
}
		
	
	
//end of Class 
