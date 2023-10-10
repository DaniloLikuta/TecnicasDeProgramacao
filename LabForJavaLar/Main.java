package LabForJavaLar;



public class Main {

	public static void main(String[] args) {
		
		Mapa mapa = new Mapa();
		
		int amountBugAndDevForRound = 240;
		
		System.out.println(" Init map");
		
		mapa.gerarBugs(amountBugAndDevForRound);
		mapa.gerarDevs(amountBugAndDevForRound);

	
		
		 
		 
		//mapa.insertBugMapa(guarda);
		
		
		mapa.getMapa();
		
	}

}
