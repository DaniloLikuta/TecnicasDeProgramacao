package model;

public class Astro {
	
	protected int col;
	protected int row;
	protected  Planeta name ;
	
	public Astro(int row, int col, Planeta name) {
		this.row = row;
		this.col = col;
		this.name =  name;
		
	}

	public int getCol() {
		return col;
	}

	public int getRow() {
		return row;
	}

	public Planeta getName() {
		return name;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public void setName(Planeta name) {
		this.name = name;
	}
	
	

}
