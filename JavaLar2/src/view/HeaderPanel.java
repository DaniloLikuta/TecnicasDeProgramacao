package view;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class HeaderPanel  extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	JButton btt1;
	JButton btt2;
	JButton btt3;
	JButton btt4;
	JButton btt5;
	
	public HeaderPanel(ArrayList<JButton> arrayButtons) {

		setBackground(new Color(30, 56, 80));
		setSize(700, 50);
	
		setLayout(new FlowLayout());
		
		
		
		for (JButton jButton : arrayButtons) {
			this.add(jButton);
			
		}
		
		setVisible(true);
		
	
		
		
	}

}
