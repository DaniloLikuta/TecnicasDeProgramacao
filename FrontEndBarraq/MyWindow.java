package frontEndBarraButtExtern;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class MyWindow  extends JFrame{
	
	
	/**
	 * 
	 */
	
	
	private static final long serialVersionUID = 1L;

	public MyWindow() {
		setSize( 600, 460);
		setLocation(400, 100);
		setLayout( new BorderLayout() );
		
		
		
		
		
		
		JPanel PanelMain = new JPanel(new GridLayout(1, 0));
	
	
		DataShow DS1 = new DataShow(Color.BLUE);
		

		DataShow DS2 = new DataShow(Color.RED);
		


		DataShow DS3 = new DataShow(Color.BLACK);
		


		DataShow DS4 = new DataShow(Color.red);
		
		PanelMain.add(DS1);
		PanelMain.add(DS2);
		PanelMain.add(DS3);
		PanelMain.add(DS4);
		
		this.add(PanelMain);

		ArrayList<JButton> arrayButtons= new ArrayList<JButton>(BuilderButtons(DS1, DS2, DS3, DS4));

		add(new HeaderPanel( arrayButtons), BorderLayout.NORTH);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		setVisible(true);
	}
	private ArrayList<JButton> BuilderButtons(DataShow DS1, DataShow DS2, DataShow DS3, DataShow DS4 ) {
		
		ArrayList<JButton> arrayButtons= new ArrayList<JButton>();
		
		 JButton btt1 = new JButton(" Realizar venda");
		 JButton btt2 = new JButton(" Listar vendas");
		 JButton btt3 = new JButton(" Mostrar relatório");
		 JButton btt4 = new JButton(" outro");
		 
		 actionListenerButton action = new actionListenerButton(DS1, DS2, DS3, DS4);
		 
		 btt1.addActionListener(action);
		 btt2.addActionListener(action);
		 btt3.addActionListener(action);
		 btt4.addActionListener(action);
		 
		 
		arrayButtons.add(btt1);
		arrayButtons.add(btt2);
		arrayButtons.add(btt3);
		arrayButtons.add(btt4);
		
		 return arrayButtons;
			
		}
		

}
