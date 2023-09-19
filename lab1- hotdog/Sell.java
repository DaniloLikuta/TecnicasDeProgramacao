package lab1;

public class Sell {
	
	int amount;
	HotDog hotdog;
	
	public Sell() {
		this.hotdog = new HotDog();
		
		
	}
	
	public int setAmount(int amount) {
		this.amount = amount;
		
		return this.amount;
	}
	
	public int getAmount() {
		
		return this.amount;
		
	}
	
	
	

}
