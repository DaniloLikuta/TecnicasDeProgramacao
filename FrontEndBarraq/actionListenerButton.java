package frontEndBarraButtExtern;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;






public class actionListenerButton implements ActionListener  {
	
	
	
	private DataShow DS1;
	private DataShow DS2;
	private DataShow DS3;
	private DataShow DS4;
	
	public actionListenerButton(DataShow DS1, DataShow DS2, DataShow DS3, DataShow DS4) {
		this.DS1 = DS1;
		this.DS2 = DS2;
		this.DS3 = DS3;
		this.DS4 = DS4;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	JButton buttonIntern = (JButton) e.getSource();
	String buttonName = buttonIntern.getText();
	
	System.out.println(buttonName);
		
	
	
	if(buttonName == " Realizar venda") {
		System.out.println("ListarVendas pressed");
		DS1.setVisible(true);
		DS2.setVisible(false);
		DS3.setVisible(false);
		DS4.setVisible(false);
	}
		
	else if (buttonName == " Listar vendas") {
		System.out.println("ListarVendas pressed");
		DS1.setVisible(false);
		DS2.setVisible(true);
		DS3.setVisible(false);
		DS4.setVisible(false);
	
		
		
	}
		
	
	else if (buttonName == " Mostrar relatório" ) {
		DS1.setVisible(false);
		DS2.setVisible(false);
		DS3.setVisible(true);
		DS4.setVisible(false);
	
	}
	else  {
		DS1.setVisible(false);
		DS2.setVisible(false);
		DS3.setVisible(false);
		DS4.setVisible(true);
	
		}
	
	
	}
	



}

	


	
	

