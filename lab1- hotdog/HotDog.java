package lab1;

public class HotDog {
	
	String protein;
	String cheese;
	String vet[] =  new String[4];
	
	public String setProtein(int choose ){
		if(choose == 1 ) {
			this.protein = "sausage";
			
		}
		else if (choose == 2 ) {
			this.protein = "linguiça";
			
		}
		else if(choose == 3 ) {
			this.protein = "Chicken";
			
		}
		else if(choose == 4) {
			this.protein= "bacon";
			
		}
		else {
			setProtein(choose);
			
		}
	
		return protein;
	}
	
	
	//below there  the method get value protein
	public String getProtein(){
		
		
		return this.protein;
	}	
	
	
	//below there get and set of cheese
	
	public String setCheese(int choose) {
		int i = 3;
		
		if(choose == 1 ) {
			this.cheese = "mussarela";
			
		}
		else if (choose == 2 ) {
			this.cheese = " prato";
			
		}
		else if(choose == 3 ) {
			this.cheese = "parmesão";
			
		}
		else if(choose == 4) {
			this.cheese= "coalho";
			
		}
		else {
			if( i <= 0)
				return " ERROR: select cheese";
				
			setProtein(choose);
			
		}
	
		
		
		
		
		return cheese;
	}
	
	public String getCheese() {
		
		return this.cheese;
	}

}
