package view;

import java.awt.Color;

import javax.swing.JPanel;

import controller.Start;
import view.Components.*;

public class FormPositionPlanets extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	Boolean Visible = true;
	
	PanelTitle title;

	PanelLabelAndPosition panelPositionPython;
	PanelLabelAndPosition panelPositionJavaScript;
	PanelLabelAndPosition panelPositionRUBY;
	PanelLabelAndPosition panelPositionPHP;
	PanelLabelAndPosition panelPositionC_SHARP;
	PanelLabelAndPosition panelPositionCPP;
	PanelLabelAndPosition panelPositionC;
	
	
	PanelButtonPost panelButtonPostPlanets;
	
	
	public FormPositionPlanets(Start start) {
		
		EventListenerPlanets postPlanet = new EventListenerPlanets(this, start);
		
		this.setSize(750, 700);
		this.setBackground(new Color(30, 38, 53));
		
		title = new PanelTitle(" Escolha as posições dos Planetas");

		PanelBetween space1 = new PanelBetween(2);

		panelPositionPython = new PanelLabelAndPosition(" Python:           ");

		PanelBetween space2 = new PanelBetween(2);

		panelPositionJavaScript = new PanelLabelAndPosition(" JavaScript     ");


		PanelBetween space4 = new PanelBetween(2);

		panelPositionRUBY = new PanelLabelAndPosition(" Ruby:              ");
		PanelBetween space5 = new PanelBetween(2);

		panelPositionPHP = new PanelLabelAndPosition(" PHP:               ");
		PanelBetween space6 = new PanelBetween(2);

		panelPositionC_SHARP = new PanelLabelAndPosition(" C#:                  ");
		PanelBetween space7 = new PanelBetween(2);

		panelPositionCPP = new PanelLabelAndPosition(" C++:                ");
		PanelBetween space8 = new PanelBetween(2);

		panelPositionC = new PanelLabelAndPosition(" C:                    ");
		PanelBetween space9 = new PanelBetween(2);
		
		panelButtonPostPlanets = new PanelButtonPost(" Inserir posições", postPlanet);
		panelButtonPostPlanets.setVisible(false);
		
		this.add(title);
		this.add(space1);
		this.add(panelPositionPython);
		this.add(space2);
		this.add(panelPositionJavaScript);
		this.add(space4);
		this.add(panelPositionRUBY);
		this.add(space5);
		this.add(panelPositionPHP);
		this.add(space6);
		this.add(panelPositionC_SHARP);
		this.add(space7);
		this.add(panelPositionCPP);
		this.add(space8);
		this.add(panelPositionC);
		this.add(space9);
		this.add(panelButtonPostPlanets);
		
		this.setVisible(Visible);
		
		
		
	}
	public void setVisible(Boolean turn) {
		Visible = turn;
		
	}
	

}
