package view.Components;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Font;

public class PanelLabelAndRadio  extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	Font myFont = new Font("Arial", Font.BOLD, 15);
	
	
	private JRadioButton night;
	private JRadioButton day;
	
	
	public PanelLabelAndRadio(String labelName) {
		this.setBackground(new Color(30, 66, 66));
		
		JLabel label = new JLabel(labelName);
		label.setFont(myFont);
		label.setForeground(Color.WHITE);
		
		night = new JRadioButton("Noite");
		day = new JRadioButton("Dia");
		
		ButtonGroup gp = new ButtonGroup();
		gp.add(day);
		gp.add(night);
		
		night.setSelected(true);
		
		
		this.add(label);
		this.add(night);
		this.add(day);
		
		
		
		this.setVisible(true);
		
	}
	public String getSelect() {
		if(night.isSelected()) {
			return " selecionado: "+night.getText();
		}
		else {
			return "selecionado: "+day.getText();
		}
	}

}
