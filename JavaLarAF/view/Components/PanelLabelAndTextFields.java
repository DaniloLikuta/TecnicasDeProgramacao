package view.Components;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

public class PanelLabelAndTextFields  extends JPanel{
	
	JLabel label;
	JTextField textfield;
	Font myFont = new Font("Arial", Font.BOLD, 15);

	private static final long serialVersionUID = 1L;

	public PanelLabelAndTextFields(String labelName, JTextField name) {
		this.setBackground(new Color(30, 66, 66));
		
		
		
		this.label = new JLabel(labelName);
		label.setForeground(Color.WHITE);
		label.setFont(myFont);
		
		
		this.textfield = name;
		
		this.add(label);
		this.add(textfield);
		
		this.setVisible(true);
		
	}

}
