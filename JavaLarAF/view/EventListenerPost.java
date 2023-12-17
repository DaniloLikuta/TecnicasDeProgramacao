package view;

import java.awt.event.ActionListener;

import controller.Start;


import java.awt.event.ActionEvent;

public class EventListenerPost implements ActionListener{

	FormPanel formPanel;
	String[] dados;
	Start startInside;
	
	public EventListenerPost(FormPanel formPanel, Start start) {
		
	this.formPanel = formPanel;
	this.startInside = start;
	
	dados = new String[12];
	

	
	}
	
	public void actionPerformed(ActionEvent e) {
		dados[0] = formPanel.nameDoFieldJogador.getText();
		dados[1] = formPanel.nameOfFieldBugs.getText();
		dados[2] = formPanel.nameOfFieldDevs.getText();
		dados[3] = formPanel.BugsSkin.getPath();
		dados[4] = formPanel.DevsSkin.getPath();
		dados[5] = formPanel.dayNight.getSelect();
		
		formPanel.setVisible(false);
		
		startInside.arrayDadosFormulario1 = dados;
		startInside.view.janela.formPositonPlanets.setVisible(true);
		startInside.view.janela.formPositonPlanets.panelPositionPython.setVisible(true);
		startInside.view.janela.formPositonPlanets.panelPositionJavaScript.setVisible(true);
		startInside.view.janela.formPositonPlanets.panelPositionRUBY.setVisible(true);
		startInside.view.janela.formPositonPlanets.panelPositionPHP.setVisible(true);
		startInside.view.janela.formPositonPlanets.panelPositionC_SHARP.setVisible(true);
		startInside.view.janela.formPositonPlanets.panelPositionCPP.setVisible(true);
		startInside.view.janela.formPositonPlanets.panelPositionC.setVisible(true);
		startInside.view.janela.formPositonPlanets.panelButtonPostPlanets.setVisible(true);
		
		
		
		
		startInside.setDados();
		//startInside.getDados();
		startInside.writeInArchiveData();
		
	}
	
}
