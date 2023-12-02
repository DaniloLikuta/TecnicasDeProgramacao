package controller;

import model.Planet;
import model.Planeta;

public class Map {
	
	public Planet[][] map;
	
	public Map() {
		
		map = new Planet[17][17];
		
	}
	
	public void printMap() {
		int row = 16;
		int col = 16;
		
		Planet planet;
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(map[i][j] !=null) {
					System.out.print(map[i][j].getName());
					j++;
					
				}
				System.out.print("["+map[i][j]+"] ");
				
			}
			System.out.printf("%n");
			
		}
	}
	public Planet[][] getMap() {
		return map;
	}
	


}
