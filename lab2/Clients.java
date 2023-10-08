package lab2;

public class Clients {
	
	String name;
	int matricula;
	int Siape;
	Venda venda;
	int AmountVenda;
	
	public Clients( String name) {
		this.name = name;
		
	}
	
	
	public void setMatricula(int Matricula ) {
		
		this.matricula = Matricula;
	}
	
	public void setSiape(int Siape) {
		
		this.Siape = Siape;
		
	}
	public String getName() {
		return this.name;
		
	}
	public void setAmount(int amount) {
		this.AmountVenda = amount;
		
	}
	public int getAmount() {
		
		return this.AmountVenda;
		
		
	}
	

}
