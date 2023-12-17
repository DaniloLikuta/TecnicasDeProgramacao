package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

import controller.Start;

public class EventListenerPlanets  implements  ActionListener{
	 
	FormPositionPlanets formPositionPlanets;
	Start start;
	int[] dados;
	
	public EventListenerPlanets(FormPositionPlanets f, Start s) {
		
		
		this.formPositionPlanets = f;
		this.start = s;
		
		dados = new int[14];
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(" ativado");
		dados[0] = formPositionPlanets.panelPositionPython.comboBoxPositionX.getSelectedIndex();
		dados[1] = formPositionPlanets.panelPositionPython.comboBoxPositionY.getSelectedIndex();
		
		// Repeat the process for other panelPosition instances
		dados[2] = formPositionPlanets.panelPositionJavaScript.comboBoxPositionX.getSelectedIndex();
		dados[3] = formPositionPlanets.panelPositionJavaScript.comboBoxPositionY.getSelectedIndex();

		dados[4] = formPositionPlanets.panelPositionRUBY.comboBoxPositionX.getSelectedIndex();
		dados[5] = formPositionPlanets.panelPositionRUBY.comboBoxPositionY.getSelectedIndex();
		
		
		dados[6] = formPositionPlanets.panelPositionPHP.comboBoxPositionX.getSelectedIndex();
		dados[7] = formPositionPlanets.panelPositionPHP.comboBoxPositionY.getSelectedIndex();

		dados[8] = formPositionPlanets.panelPositionC_SHARP.comboBoxPositionX.getSelectedIndex();
		dados[9] = formPositionPlanets.panelPositionC_SHARP.comboBoxPositionY.getSelectedIndex();

		dados[10] = formPositionPlanets.panelPositionCPP.comboBoxPositionX.getSelectedIndex();
		dados[11] = formPositionPlanets.panelPositionCPP.comboBoxPositionY.getSelectedIndex();

		dados[12] = formPositionPlanets.panelPositionC.comboBoxPositionX.getSelectedIndex();
		dados[13] = formPositionPlanets.panelPositionC.comboBoxPositionY.getSelectedIndex();

		for (int dado : dados) {
			start.arrayDadosFormulario2[dado] = dados[dado];
		}
		start.printFormulario2();
		
	}
	
	

}
