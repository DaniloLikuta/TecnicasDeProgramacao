package frontEndBarraButtExtern;

import java.awt.Color;
import java.awt.FlowLayout;


import javax.swing.JPanel;



import javax.swing.JButton;

import java.util.ArrayList;
public class HeaderPanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton btt1;
	JButton btt2;
	JButton btt3;
	JButton btt4;
	
	DataShow DS1;
	DataShow DS2;
	DataShow DS3;
	DataShow DS4;	
	
	
	
	public HeaderPanel(ArrayList<JButton> arrayButtons) {
		setBackground(new Color(30, 56, 129));
		setSize(460, 50);
	
		setLayout(new FlowLayout());
		
		
		
		for (JButton jButton : arrayButtons) {
			this.add(jButton);
			
		}
		
		setVisible(true);
		
		
	}

	
	

}
//JButton bbt1, JButton bbt2, JButton bbt3, JButton bbt4 
//
//this.btt1 = bbt1;
//this.btt2 = bbt2;
//this.btt3 = bbt3;
//this.btt4 = bbt4;
