package view.Components;

import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import view.*;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelLabelAndFileChooser extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = 1L;

	JFileChooser chooser; 
	
	Font myFont = new Font("Arial", Font.BOLD, 15);
	
	JButton buttonChoose;
	
	
	
	
	
	
	public PanelLabelAndFileChooser(String NameLabel, String buttonText) {
		this.setBackground(new Color(30, 66, 66));
		
		chooser = new JFileChooser();
		//chooser.showOpenDialog(this);
		
		
		
		JLabel label = new JLabel(NameLabel);
		label.setForeground(Color.WHITE);
		label.setFont(myFont);
		
		
		JButton buttonChoose = new JButton( buttonText);
		buttonChoose.addActionListener(this);
		
		
		
		this.add(label);
		this.add(buttonChoose);
		
		this.setVisible(true);
		
	}






	@Override
	public void actionPerformed(ActionEvent e) {
	 JButton a = (JButton) e.getSource();
		
		  int returnVal = chooser.showOpenDialog(this);
		  
		  if (returnVal == JFileChooser.APPROVE_OPTION) {
			  File selectedFile = chooser.getSelectedFile();

			  if(a.getText()== " choose Dev") {
				  ((FormPanel) this.getParent()).setSkinDev(selectedFile);

			  }
			  else {
				  ((FormPanel) this.getParent()).setSkinBug(selectedFile);
			  }
		  }

          
	}

}
