package LabForJavaLar;
import java.util.Random;

public class RandomGeneratorInt {
	
	public int getRandom() {
		
		Random generator = new Random();  
		
		return generator.nextInt(255);
		
		
	}

}
