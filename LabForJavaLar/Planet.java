package LabForJavaLar;

public class Planet extends Astro {
	
	int speed;
	int x;
	int y;
	int nowIndex;

	
	public Planet(Type type, String name, int speed, int x, int y) {
		super( name, type);
		this.x = x;
		this.y = y;
		this.speed = speed;
		
		
	}
	public int getX() {
		return this.x;
		
	}
	
	public int getY() {
		return this.y;
		
	}
	public String getName() {
		return this.name;
		
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public Type getType() {
		return this.type;
	
	}
	public int getSpeed() {
		return this.speed;
		
	}
	public int getNowIndex() {
		return this.nowIndex;
		
	}
	public void setNowIndex(int NowIndex) {
		this.nowIndex = NowIndex;
		
		
		
	}
		
	}

	


