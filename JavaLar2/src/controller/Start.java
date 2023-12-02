package controller;

import java.util.ArrayList;



import model.Planet;
import model.Planeta;
import view.Window;

public class Start {
	
	ArrayList<Planet> arrayPlanet;
	Map map;
	
	public Start() {
		 map = new Map();
		arrayPlanet = new ArrayList<>();

		Window janela = new Window(" aaaa");
		
		 try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

		janela.updateTitle(" novo ");
		InicializationOfPlanets(arrayPlanet);
		printArray(arrayPlanet);
		
		addPlanetsInMap(map.getMap(), arrayPlanet);
		
		

		map.printMap();
		System.out.println();
		
		for (int i = 0; i < 10; i++) {

			movePlanet(map.getMap(), arrayPlanet , 1);

			map.printMap();
			System.out.println();

			
		}

	
		
		

		
		
		
		map.printMap();

		
	}
	
	private  void InicializationOfPlanets(ArrayList<Planet> arrayPlanet){
		
		Planet python = new Planet(7, 8, Planeta.PYTHON,2);
		Planet javaScript = new Planet(6, 8, Planeta.JAVASCRIPT,4);
		Planet ruby = new Planet(5, 8, Planeta.RUBY,6);
		Planet php = new Planet(4, 8, Planeta.PHP,8);
		Planet c_sharp = new Planet(3, 8, Planeta.C_SHARP,10);
		Planet cpp = new Planet(2, 8, Planeta.CPP,12);
		Planet c = new Planet(1, 8, Planeta.C,14);
		
		arrayPlanet.add(c);
		arrayPlanet.add(cpp);
		arrayPlanet.add(c_sharp);
		arrayPlanet.add(php);
		arrayPlanet.add(ruby);
		arrayPlanet.add(javaScript);
		arrayPlanet.add(python);
	
	}
	private void printArray(ArrayList<Planet> array) {

		for (Planet planet : array) {
			System.out.println(" Name: "+ planet.getName() + "  Row:" + planet.getRow()+"  Col:" + planet.getCol() );	
		}

	}
	
	public void addPlanetsInMap(Planet[][] map, ArrayList<Planet> arrayPlanets) {

		for (Planet planet : arrayPlanets) {
			map[planet.getRow()][planet.getCol()] = planet;

		}

	}
	public void setQuadrante(ArrayList<Planet>  arrayPlanetas) {
		for (Planet planet : arrayPlanetas) {

			if((planet.getRow() < 8) && (planet.getCol() <= 8)) {
				planet.setQuadrante(1);
			}
			else if((planet.getRow() < 8) && (planet.getCol() > 8)) {
				planet.setQuadrante(2);
			}
			else if((planet.getRow() > 8) && (planet.getCol() < 8)) {
				planet.setQuadrante(3);

			}
			else if ((planet.getRow() > 8) && (planet.getCol() > 8)) {
				planet.setQuadrante(4);

			} 


		}
	}
		

		
		public void movePlanet(Planet[][] map, ArrayList<Planet> arrayPlanets, int tickMoves) {
			int counterCantoSuperiorDireitoCol = 9;
			int counterCantoSuperiorDireitoDistancia = 2;
			
			for (Planet planet : arrayPlanets) {
				
				int atualRow = planet.getRow();
				int atualCol = planet.getCol();
				
			    switch (planet.getQuadrante()) {
	            case 1:
	            	
	            if(planet.getRow() == planet.getCol()) {
	            
	            	planet.setRow(atualRow++);
	            	
	            }
	            else if (planet.getRow() <=8 && atualRow < atualCol ) {
	            	
	            	planet.setCol(atualCol--);
					
				}///proximo else if vai ser de aumentar row mas col fica igual
	            
	            else if  (planet.getRow() <=8 && atualRow > atualCol ){
	            	planet.setRow(atualRow++);
					
				}
	            
	            
	            break;
	            
	            case 2:
	            		///Quadrante 2
	            	   if(atualCol == counterCantoSuperiorDireitoCol && (planet.getCol()-planet.getRow() == counterCantoSuperiorDireitoDistancia)) {
	       	            
	   	            	planet.setRow(atualRow++);
	   	            	
	   	            }
	   	            else if (planet.getRow() <=8 && atualRow < counterCantoSuperiorDireitoCol ) {
	   	            	
	   	            	planet.setRow(atualRow++);
	   					
	   				}///proximo else if vai ser de subtrair row mas col fica igual
	   	            
	   	            else if  (planet.getRow() <=8 && atualRow < atualCol ){
	   	            	planet.setRow(atualRow++);
	   					
	   				}
	            	
	            		            	
	            	break;
	            	
	            case 3:
	            	
	            	
	            	break;
	            	
	            	
	            case 4:
	            	break;
			    }
			    
			    addPlanetsInMap(map, arrayPlanets);
			   /// map[atualRow][atualCol] = planet;// Sempre continua a atual row e col nós fazemos uma operaçao a partir dela
			    counterCantoSuperiorDireitoCol++;
			    counterCantoSuperiorDireitoDistancia+=2;
			    
			}	            
		
		}
		
		
		
		
		
	}//end of Class
	
		
		
	

	


