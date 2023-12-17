package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;


import javax.swing.JFrame;

import controller.Start;

public class Window  extends JFrame{
	
	
	
	
	private static final long serialVersionUID = 1L;
	
	FormPanel formDataGame;
	FormPositionPlanets formPositonPlanets;

	public Window(String titulo, Start start) {
		
		
	
		
		this.setTitle(titulo);
		this.setSize(750, 700);
		this.setLocation(400, 10);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(new BorderLayout());
		
		formDataGame = new FormPanel(start, this);
		formPositonPlanets = new FormPositionPlanets(start);
		
		this.add(formDataGame);
		this.add(formPositonPlanets);
		
		
		this.setVisible(true);
		
	}
	
	public void alternTitle() {
		this.setTitle(" Input posição de planetas");
		
	}
	
	
	      
	
	

}
