package lab1;

public class Client {
	
	int id;
	String name;
	Sell sell;
	
	public Client(String name, int id ) {
		this.name = name;
		this.id = id;
		this.sell = new Sell();
		
		
	}
	public String getName() {
		return this.name;
		
	}
	
	
	/*public void print() {
		
		System.out.println(" Nome: " + this.name + " id: " + this.id + " Sell" + this.sell) ;
	
	}
	*/
	
	public String getDataClient() {
		return "Nome: " + this.name + " id: "+ this.id + " amount: " + this.sell.amount;
	}
	
	

}
