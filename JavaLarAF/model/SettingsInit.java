package model;

import java.io.File;

public class SettingsInit {
	
	private String nameOfPlayer;
	
	private int amountOfBugs;
	private int amountOfDevs;
	
	private String setHour;
	

	private File BugsSkin;
	private File DevsSkin;
	
	public SettingsInit() {
		
	}

	public String getNameOfPlayer() {
		return nameOfPlayer;
	}

	public int getAmountOfBugs() {
		return amountOfBugs;
	}

	public int getAmountOfDevs() {
		return amountOfDevs;
	}

	public String getSetHour() {
		return setHour;
	}

	public File getBugsSkin() {
		return BugsSkin;
	}

	public File getDevsSkin() {
		return DevsSkin;
	}

	public void setNameOfPlayer(String nameOfPlayer) {
		this.nameOfPlayer = nameOfPlayer;
	}

	public void setAmountOfBugs(int amountOfBugs) {
		this.amountOfBugs = amountOfBugs;
	}

	public void setAmountOfDevs(int amountOfDevs) {
		this.amountOfDevs = amountOfDevs;
	}

	public void setSetHour(String setHour) {
		this.setHour = setHour;
	}

	public void setBugsSkin(File bugsSkin) {
		
		this.BugsSkin = bugsSkin;
	}

	public void setDevsSkin(File devsSkin) {
		this.DevsSkin = devsSkin;
	}
	
	

}
