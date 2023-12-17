package view.Components;

import java.awt.Color;

import java.awt.Font;
import view.Components.*;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelTitle extends JPanel {
	
	JLabel title;
	PanelBetween space1;
	PanelBetween space2;
	
	private static final long serialVersionUID = 1L;

	public PanelTitle(String titleText) {
		
		this.setBackground(new Color(9, 38, 53));

		title = new JLabel(titleText);
		title.setFont(new Font("Arial", Font.BOLD, 20));
		title.setForeground(Color.WHITE);
		
		space1 = new PanelBetween(1);
		space2 = new PanelBetween(1);
		
		this.add(space1);
		this.add(title);
		this.add(space2);
		
	
	}

}
