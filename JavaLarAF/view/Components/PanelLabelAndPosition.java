package view.Components;

import javax.swing.JPanel;

import view.FormPositionPlanets;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Color;


public class PanelLabelAndPosition  extends JPanel{
	
	
	private static final long serialVersionUID = 1L;
	

	Font myFont = new Font("Arial", Font.BOLD, 15);
	
	public JLabel nameOfPlanet;
	
	public JComboBox<String> comboBoxPositionX;
	public JComboBox<String> comboBoxPositionY;
	
	
	
	boolean visibilidade = false ;
	
	
	
	public PanelLabelAndPosition(String nameLabel) {
		this.setBackground(new Color(30, 38, 53));
		
		
		
		nameOfPlanet = new JLabel(nameLabel);
		nameOfPlanet.setForeground(Color.WHITE);
		nameOfPlanet.setFont(myFont);
		
		comboBoxPositionX = new JComboBox<>();
		comboBoxPositionY = new JComboBox<>();
//		
//		comboBoxPositionX.setVisible(false);
//		comboBoxPositionY.setVisible(false);
		
		// add x numbers
		comboBoxPositionX.addItem(" 0 ");
		comboBoxPositionX.addItem(" 1 ");
		comboBoxPositionX.addItem(" 2 ");
		comboBoxPositionX.addItem(" 3 ");
		comboBoxPositionX.addItem(" 4 ");
		comboBoxPositionX.addItem(" 5 ");
		comboBoxPositionX.addItem(" 6 ");
		comboBoxPositionX.addItem(" 7 ");
		comboBoxPositionX.addItem(" 8 ");
		comboBoxPositionX.addItem(" 9 ");
		comboBoxPositionX.addItem(" 10 ");
		comboBoxPositionX.addItem(" 11 ");
		comboBoxPositionX.addItem(" 12 ");
		comboBoxPositionX.addItem(" 13 ");
		comboBoxPositionX.addItem(" 14 ");
		comboBoxPositionX.addItem(" 15 ");

		
		// add y numbers 
		comboBoxPositionY.addItem(" 0 ");
		comboBoxPositionY.addItem(" 1 ");
		comboBoxPositionY.addItem(" 2 ");
		comboBoxPositionY.addItem(" 3 ");
		comboBoxPositionY.addItem(" 4 ");
		comboBoxPositionY.addItem(" 5 ");
		comboBoxPositionY.addItem(" 6 ");
		comboBoxPositionY.addItem(" 7 ");
		comboBoxPositionY.addItem(" 8 ");
		comboBoxPositionY.addItem(" 9 ");
		comboBoxPositionY.addItem(" 10 ");
		comboBoxPositionY.addItem(" 11 ");
		comboBoxPositionY.addItem(" 12 ");
		comboBoxPositionY.addItem(" 13 ");
		comboBoxPositionY.addItem(" 14 ");
		comboBoxPositionY.addItem(" 15 ");

		
		
		
		
		this.add(nameOfPlanet);
		this.add(comboBoxPositionX);
		this.add(comboBoxPositionY);
		
		
		
		
		
		this.setVisible(visibilidade);
	}
	
	public void alternVisibility(boolean turn) {
		this.visibilidade = turn;
	}
	
	

}
