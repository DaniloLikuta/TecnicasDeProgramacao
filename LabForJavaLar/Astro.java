package LabForJavaLar;

public class  Astro  {
	
	
		 String name;
		 int x;
		 int y;
		 Type type;
		 
		 public Astro(String name, Type externtype) {
			this.name = name;
			this.type = externtype;
			
		 }
		 
		

		 
	public Astro(int externX, int externY, String name ) {
		this.x = externX;
		this.y = externY;
		this.name = name;
		
		
	}
	
	public String getName() {
		
		return this.name;
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
	
		
	
	public void setType() {
		
		
		  
		
	}
	public Type getType() {
	return 	this.type;
		
	}
	
	public void setX( int externX) {
		this.x = externX;
		
	}
	

	public void setY( int externY) {
		this.y = externY;
		
	}
	

}
