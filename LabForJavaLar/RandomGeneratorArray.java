package LabForJavaLar;
import java.util.Random;

public class RandomGeneratorArray {
	

	public int[] randomGenerator(int amountBugAndDevForRound ) {
		int array[] = new int[amountBugAndDevForRound];
		//Declara o vetor
		Random generator = new Random();
		
		
		for (int i = 0; i < array.length; i++) {
			array[i] = generator.nextInt(255); 
			
		}
		return array;
}
}
	
	