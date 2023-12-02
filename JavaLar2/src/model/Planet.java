package model;

public class Planet extends Astro {
	

	int days;
	int years;
	int velocity;
	int bugsColi;
	int devsColi;
	int tickpasted;
	int quadrante = 1;
	int counterQuinaFirstTime = 1;
	int quinaLimitator;
	
	
	public Planet(int row, int col, Planeta name, int quinaLimitator) {
		super(row, col, name);
		this.quinaLimitator = quinaLimitator;
		
		
	}
	
	public Planet(int row, int col, Planeta name ) {
		super(row, col, name);
		
	}

	public int getDays() {
		return days;
	}

	public int getYears() {
		return years;
	}

	public int getVelocity() {
		return velocity;
	}

	public int getBugsColi() {
		return bugsColi;
	}

	public int getDevsColi() {
		return devsColi;
	}

	public int getTickpasted() {
		return tickpasted;
	}
	
	public Planeta getName() {
		return super.getName();
	}

	public void setDays(int days) {
		this.days = days;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	public void setBugsColi(int bugsColi) {
		this.bugsColi = bugsColi;
	}

	public void setDevsColi(int devsColi) {
		this.devsColi = devsColi;
	}

	public void setTickpasted(int tickpasted) {
		this.tickpasted = tickpasted;
	}

	public int getQuadrante() {
		return quadrante;
	}

	public void setQuadrante(int quadrante) {
		this.quadrante = quadrante;
	}

	public int getCounterQuina() {
		return counterQuinaFirstTime;
	}

	public void setCounterQuina(int counterQuina) {
		this.counterQuinaFirstTime = counterQuina;
	}
	
	
	
	
	
}
