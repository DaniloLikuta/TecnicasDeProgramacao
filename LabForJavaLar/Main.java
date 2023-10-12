package LabForJavaLar;



public class Main {

	public static void main(String[] args) {
		
		Mapa mapa = new Mapa();
		
		int amountBugAndDevForRound = 40;
		int round = 1;
		
		System.out.println(" Init map");
		
		mapa.gerarPlanets();
		//mapa.addlistaPlanetInMapa();
		mapa.getAllPlanetData();
		mapa.addlistaPlanetInMapa();
		
		mapa.round(round);
		
		//mapa.gerarBugs(amountBugAndDevForRound);
		//mapa.gerarDevs(amountBugAndDevForRound);
		
	
		
		 
		 
		//mapa.insertBugMapa(guarda);
		
		
		mapa.getMapa();
		System.out.println("=========================================================================================================");
		mapa.getMapaPositions();
		
	}

}
