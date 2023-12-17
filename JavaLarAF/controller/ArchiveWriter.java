package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;


public class ArchiveWriter {
	
	private String pathArchiveFile = "/settingsInit.txt";
	private String pathArchiveDiretory = "Memoria";
	
	Start startIntern;
	File Settings;
	File Memoria;
	
	public ArchiveWriter(Start start) {
		
	this.startIntern = start;
	
	Memoria = new File(pathArchiveDiretory);
	Settings = new File (pathArchiveDiretory + pathArchiveFile);
	
	
	makeDiretory();
	makeFile();
	
	
		
	}
	
	private void makeDiretory() {
		try {
			if (!Memoria.exists()) {
				
				File  Memoria = new File(pathArchiveDiretory);
				Memoria.mkdir();

				
				System.out.println(" Diretorio criado");
				
				
			}else {
				System.out.println(" Diretorio já existe");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public void makeFile() {
		try {
			if(!Settings.exists()) {

				FileWriter writer = new FileWriter(pathArchiveDiretory+pathArchiveFile);

				writer.close();
				
				System.out.println(" arquivo criado");
			}
			else {
				System.out.println("Arquivo já existe");
			}


		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void  writerInArchive() {
		
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			File fileSettings = new File(pathArchiveDiretory + pathArchiveFile);
			FileWriter writer = new FileWriter(fileSettings, true);
			
			String lineToBeWriter = "\n" + "Nome do Jogador: " + startIntern.settingsInit.getNameOfPlayer()+ " \n" + "Quantidade de Bugs: "+ startIntern.settingsInit.getAmountOfBugs()+
					"\n" + "Quatidade de Devs: "+ startIntern.settingsInit.getAmountOfDevs()+"\n" + "Horário "+ startIntern.settingsInit.getSetHour()+ "\n" + "Skin selecionada BUG: "+
					startIntern.settingsInit.getBugsSkin().getPath()+ "\n" +"Skin selecionada Dev:" + startIntern.settingsInit.getDevsSkin()+"\n" + "-----------------------------------------";
					
			
			
			
			if (fileSettings.exists() && fileSettings.isFile()) {
				System.out.println(" O arquvo exite, pronto para ser escrito");
			
			}
			else {
				System.out.println("O arquivo não existe ou não é tipo reconhecido");
			}
			
			writer.append(lineToBeWriter);
			writer.close();
			System.out.println("Arquivo escrito com sucesso");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}

}
