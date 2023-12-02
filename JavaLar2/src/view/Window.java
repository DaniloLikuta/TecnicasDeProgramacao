package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Window  extends JFrame{
	PanelGrid pg;
	
	public Window(String titulo) {
		
		
	
		
		this.setTitle(titulo);
		this.setSize(750, 700);
		this.setLocation(400, 10);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(new BorderLayout());
		
		 pg = new PanelGrid();
		
		HeaderPanel hp = new HeaderPanel(this.BuilderButtons());
		
		
		
		
		this.add(hp, BorderLayout.NORTH);
		this.add(pg, BorderLayout.CENTER);
		
		
		this.setVisible(true);
		
	}
	 public void updateTitle(String newTitle) {
		
	            this.setTitle(newTitle);
		 
	 }
	 public void updatePanelgrid() {
		 pg.setVisible(false);
		 pg.revalidate();
		 pg.repaint();
	 }
	      
	
	private ArrayList<JButton> BuilderButtons() {
		
		ArrayList<JButton> arrayButtons= new ArrayList<JButton>();
		
		 JButton btt1 = new JButton(" Processar instante");
		 JButton btt2 = new JButton(" Ler arquivo de entrada");
		 JButton btt3 = new JButton(" Gravar relatório");
		 JButton btt4 = new JButton(" Ler participantes");
		 JButton btt5 = new JButton(" Gravar saída");
		 
		 btt1.setFont(new Font("Haettenschweiler", Font.PLAIN, 17));
		 btt2.setFont(new Font("Haettenschweiler", Font.PLAIN, 17));
		 btt3.setFont(new Font("Haettenschweiler", Font.PLAIN, 17));
		 btt4.setFont(new Font("Haettenschweiler", Font.PLAIN, 17));
		 btt5.setFont(new Font("Haettenschweiler", Font.PLAIN, 17));
		// actionListenerButton action = new actionListenerButton();
//		 
//		 btt1.addActionListener(new ActionBotaoRealizarVenda(DS1, this));
//		 btt2.addActionListener(new ActionBttnListar(DS2, this));
//		 btt3.addActionListener((new ActionBttnRelatorio(DS3, this)));
//		 btt4.addActionListener((new ActionBttnOutro(DS4, this)));
//		 
		 
		arrayButtons.add(btt1);
		arrayButtons.add(btt2);
		arrayButtons.add(btt3);
		arrayButtons.add(btt4);
		arrayButtons.add(btt5);
		
		 return arrayButtons;
			
		}
	

}
