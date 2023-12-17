package view.Components;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelBetween  extends JPanel{
	Font myFontSpace = new Font("Arial", Font.BOLD, 4);
	JLabel labelSpace2;
	JLabel labelSpace1;
	
public PanelBetween(int type) {
	this.setBackground(new Color(9, 45, 53));
	
	if(type == 1) {
		
		labelSpace2 = new JLabel( "                                                                        " );
		labelSpace2.setFont(myFontSpace);
		
		
		
	}
	if(type == 2 ) {
		labelSpace2 = new JLabel( "                                                                "
				+ "                                                                                                                                 "
				+ "                                                                           "
				+ "                                                                                                                             "
				+ "                                                                                                        "
				+ "                                                                                    " );
		labelSpace2.setFont(myFontSpace);
	
	}
	
	this.add(labelSpace2);
	
	
	this.setVisible(true);
}
	
	

}
