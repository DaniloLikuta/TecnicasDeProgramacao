package view;


import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.Start;
import view.Components.*;

import java.awt.*;
import java.io.File;

public class FormPanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	///String pra dar espaçamento
	String space = "                                     ";
	///font
	Font myFont = new Font("Arial", Font.BOLD, 15);
	
	Boolean  Visible = true;
	
	
	//Title 
	PanelTitle title;
	
	
	//declarations of all labels and JTexfields
	PanelLabelAndTextFields panelNomeDoJogador;
	JTextField nameDoFieldJogador = new JTextField(20);
	
	PanelLabelAndTextFields panelQuantidadeDeBugs;
	JTextField  nameOfFieldBugs = new JTextField(20);
	
	
	PanelLabelAndTextFields panelQuantidadeDeDevs;
	JTextField  nameOfFieldDevs = new JTextField(20);
	
	
	///declarations of radioButton Day/Night
	PanelLabelAndRadio dayNight;
	
	//Panel personagem
	PanelLabelAndFileChooser panelEscolhaImagemBUG;
	PanelLabelAndFileChooser panelEscolhaImagemDEV;
	
	
	PanelButtonPost  buttonPost;
	
	PanelBetween labelSpace1;
	PanelBetween labelSpace2;
	PanelBetween labelSpace3;
	PanelBetween labelSpace4;
	PanelBetween labelSpace5;
	PanelBetween labelSpace6;
	
	
	public File BugsSkin;
	public File DevsSkin;
	
	String[] arrayDados;
	
	
	

public FormPanel(Start start, Window window) {
	
	this.setSize(750, 700);
	this.setBackground(new Color(9, 38, 53));
	
	EventListenerPost post = new EventListenerPost(this, start);

	title = new PanelTitle("configurações de jogo");

	panelNomeDoJogador = new PanelLabelAndTextFields(" Nome do Jogador:         " + space, nameDoFieldJogador);

	labelSpace1 = new PanelBetween(2);

	panelQuantidadeDeBugs = new PanelLabelAndTextFields(" Quantidade de Bugs:    " + space, nameOfFieldBugs);

	labelSpace2 = new PanelBetween(2);

	panelQuantidadeDeDevs = new PanelLabelAndTextFields(" Quantidade de Devs:    " + space, nameOfFieldDevs);

	labelSpace3 = new PanelBetween(2);


	dayNight = new PanelLabelAndRadio(" Selecione a vibe:                                          "+space);

	labelSpace4 = new PanelBetween(2);

	panelEscolhaImagemBUG = new PanelLabelAndFileChooser("Escolha o personagem BUG:                       "+ space, " choose Bug");
	panelEscolhaImagemDEV = new PanelLabelAndFileChooser("Escolha o personagem DEV:                        "+ space," choose Dev");

	labelSpace5 = new PanelBetween(2);

	buttonPost = new PanelButtonPost("               Iniciar                  ", post);
	
	
	
	this.add(title);
	this.add(panelNomeDoJogador);
	this.add(labelSpace1);
	this.add(panelQuantidadeDeBugs);
	this.add(labelSpace2);
	this.add(panelQuantidadeDeDevs);
	this.add(labelSpace3);
	this.add(dayNight);
	this.add(labelSpace4);
	this.add(panelEscolhaImagemDEV);
	this.add(panelEscolhaImagemBUG);
	this.add(labelSpace5);
	this.add(buttonPost);
	
	
	this.setVisible(Visible);
	
	 
}
public void setVisible(Boolean turn) {
	Visible = turn;
	
}





public void setSkinBug(File file) {
	this.BugsSkin = file;
	
}

public void setSkinDev(File file) {
	this.DevsSkin = file;
	
}


}
