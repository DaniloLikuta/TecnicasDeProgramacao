package LabForJavaLar;

import java.util.ArrayList;




public class Mapa {
	
	public static ArrayList<Astro> mapa;
	RandomGeneratorInt generator = new RandomGeneratorInt();
	ArrayList<Planet> listaPlanetas;
	
	
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
			
			System.out.printf("%s%s%s", "[",  mapa.get(i).getType(), "]");
			
	
		}
		System.out.println("\n");
		
		
			
	}
		

	public void gerarBugs(int Amount) {
		///Dentro de um for  a variavel externa que contem a quantidade de bugs a serem gerados serve como contador.
		//A cada execução é criadoo um objeto Astro de nome "bug_", após isso é gerado uma posição  atráves do generator o antigo null é destruido e o bug adicnoando
		
		for (int i = 0; i < Amount ; i++) {
			
			Astro bug = new Astro("bug_", Type.BUG);
			
			int random = generator.getRandom();
			//Pega a posição x,y do objeto que estava antes 
			bug.setX(mapa.get(random).getX());
			bug.setY(mapa.get(random).getY());
			
			
			mapa.remove(random);
			mapa.add(random, bug );
			
			
		
			
			
		}
		
}
	
	
	public void gerarDevs(int amount) {
		
		for (int i = 0; i < amount; i++) {
			
			Astro dev = new Astro("Dev_", Type.DEV);
			
			int random = generator.getRandom();
			
			dev.setX(mapa.get(random).getX());
			dev.setY(mapa.get(random).getY());
			
			mapa.remove(random);
			mapa.add(random, dev);
			
				
			}
			
				
				
			}
			
			
		
			
		
	
	public void getMapaPositions() {
		int controlOfMultiplication = 1;
		
		for (int i = 0; i < mapa.size(); i++) {
			
			int controlOfBreak = i;
			if(controlOfBreak == (16 * controlOfMultiplication)) {
				
				System.out.println(" espaço" + (i/16));
				controlOfMultiplication++;
				
			 }
	
			System.out.printf("%s%d%s%d%s%s","[", mapa.get(i).getX(),", ", mapa.get(i).getY(),"]", " ");
			
				
	
		}
		
		
		
			
	}

	public void  gerarPlanets() {
		
		
		listaPlanetas = new ArrayList<Planet>();
		
		for (int i = 0; i < 7; i++) {
		
			switch(i) {
			case 0:
				Planet planeta = new Planet( Type.PYTHON, "Python", 4, 8 , 9);
				listaPlanetas.add(planeta);
				break;
			case 1:
	            Planet planeta2 = new Planet(Type.JS, "Javascript", 3, 8 , 10);
	            listaPlanetas.add(planeta2);
	            break;
	        case 2:
	            Planet planeta3 = new Planet(Type.RUBY, "Ruby", 2, 8 , 11);
	            listaPlanetas.add(planeta3);
	            
	            break;
	        case 3:
	            Planet planeta4 = new Planet(Type.PHP, "PHP", 2, 8 , 12);
	            listaPlanetas.add(planeta4);
	            break;
	        case 4:
	            Planet planeta5 = new Planet(Type.CSHARP, "C#", 1,  8 , 13);
	            listaPlanetas.add(planeta5);
	            break;
	        case 5:
	            Planet planeta6 = new Planet(Type.CPP, "C++",2, 8 , 14);
	            listaPlanetas.add(planeta6);
	            break;
	        case 6:
	            Planet planeta7 = new Planet(Type.C, "C", 10, 8 , 15);
	            listaPlanetas.add(planeta7);
	            	            break;
	            
	    }
			
			
			}
					for (int i = 0; i < listaPlanetas.size(); i++) {
						System.out.println(listaPlanetas.get(i).getName());
						
						
					}
					
					
				}
	
	public void getAllPlanetData() {
		for (Planet planet : listaPlanetas) {
			System.out.println(planet.getName()+" : "+ planet.getX()+", "+ planet.getY()+ " " + planet.getType()+ " " + planet.getSpeed() );
			
		}
	}
	
	public void addlistaPlanetInMapa() {
		for (int i = 0; i < listaPlanetas.size(); i++) {
	        for (int j = 0; j < mapa.size(); j++) {
	            if (mapa.get(j).getX() == listaPlanetas.get(i).getX() && mapa.get(j).getY() == listaPlanetas.get(i).getY()) {
	                mapa.remove(j);
	                mapa.add(j, listaPlanetas.get(i));
	                
	            }
	        }
	    }
	}
	public void round(int round) {
		for (int i = 0; i < listaPlanetas.size(); i++) {
			int Executions = (round*listaPlanetas.get(i).getSpeed());
			System.out.println(listaPlanetas.get(i).getName()+" :" + Executions);
			movePlanet(i , Executions );
			
		
			
			
		}
		
	}
	public void movePlanet(int indice, int executions) {
		int coordenadaX = mapa.get(indice).getX();
		int coordenadaY = mapa.get(indice).getY();
		int multiplo8 = coordenadaY-8;
		
		int fatorLadoPula = (multiplo8*(indice++))/4;
		
		coordenadaX-=(fatorLadoPula/2);
		
		
		for (int i = 0; i < executions; i++) {
			for (int j = 0; j < fatorLadoPula; j++) {
				coordenadaY--;
				
			}
			
			
			
			
		}
		
		
		
		
		
		
	}
	
	}
	
				
				
				
			
			
			
			
				///Uma vai ter que criar planetas outra verificar a posição e outra adicionar em mapa
			//end of for 
		
			
			
			
		
	
		
		
	
		
		
	
		
		
	
	
//		
//		
//	 for (int j = 0; j < listaPlanetas.size(); j++) {
//		 for (int j2 = 0; j2 < mapa.size(); j2++) {
//			 if((listaPlanetas.get(j).getX() == mapa.get(j2).getX()) && (listaPlanetas.get(j).getY()  == mapa.get(j2).getY())) {
//				 listaPlanetas.get(j).setX(mapa.get(j).getX());
//				 listaPlanetas.get(j).setY(mapa.get(j).getY());
//				 
//				 mapa.remove(j2);
//				 mapa.add(j2, listaPlanetas.get(j));
//				 System.out.println(listaPlanetas.get(j).getName() + " : " + listaPlanetas.get(j).getY() +", " + listaPlanetas.get(j).getX() );
//				 
//
//		
	
	
//end of Class 
