package view.Components;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelButtonPost  extends JPanel{
	
	JButton myButton;
	
public PanelButtonPost(String buttonText, ActionListener actionListener) {
	this.setBackground(new Color(9, 38, 53));
	
	
	
	myButton = new JButton(buttonText);
	myButton.addActionListener(actionListener);
	
	add(myButton);
	
	this.setVisible(true);
}
}
