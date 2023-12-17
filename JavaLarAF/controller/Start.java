package controller;

import java.io.File;

import model.SettingsInit;
import view.View;



public class Start {
	
	
	
	public String arrayDadosFormulario1[] = new String[12];
	public int arrayDadosFormulario2[] = new int[14];
	
	SettingsInit settingsInit;
	
	ArchiveWriter writer;
	
	public View view;
	
	
	public Start() {
		
		 view = new View(this);
		
		 
		 settingsInit = new SettingsInit();
		 
		 writer = new ArchiveWriter(this);
		 
		 
		
		 
	
		
		
		
	}
	
public void getDados() {
	System.out.println(settingsInit.getNameOfPlayer()); 
	System.out.println(settingsInit.getAmountOfBugs());
	System.out.println(settingsInit.getAmountOfDevs());
	System.out.println(settingsInit.getBugsSkin().getPath());
	System.out.println(settingsInit.getDevsSkin().getPath());
	System.out.println(settingsInit.getSetHour());
	
}

public void setDados() {
	 File auxConvertBugIcon = new File(arrayDadosFormulario1[3]);
	 File auxConvertDevIcon = new File(arrayDadosFormulario1[4]);
	
	 settingsInit.setNameOfPlayer(arrayDadosFormulario1[0]);
	 settingsInit.setAmountOfBugs(Integer.parseInt(arrayDadosFormulario1[1]) );
	 settingsInit.setAmountOfDevs(Integer.parseInt(arrayDadosFormulario1[2]));
	 
	 settingsInit.setSetHour(arrayDadosFormulario1[5]);
	
	 settingsInit.setBugsSkin(auxConvertBugIcon);
	 settingsInit.setDevsSkin(auxConvertDevIcon);
	 
	 
	 
	 
	 System.out.println(settingsInit.getNameOfPlayer());
	
}
public void writeInArchiveData() {
	
	writer.writerInArchive();
}
public void printFormulario2(){
	
	for (int  i : arrayDadosFormulario2) {
		System.out.println(" ["+ i+ "]");
	}
}
}
