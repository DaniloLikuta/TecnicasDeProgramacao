package LabForJavaLar;

public class  Astro  {
	
	
		 String name;
		 int x;
		 int y;
		 
	public Astro(String name) {
		this.name = name;
		
	}
	
		 
	public Astro(int externX, int externY, String name) {
		this.x = externX;
		this.y = externY;
		this.name = name;
		
	}
	
	public String getName() {
		
		return name;
	}
	
	public int getX() {
		
		return x;
	}

	public int getY() {
		
		return y;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	

}
