package com.KyutoBukimi.Panel;

public class Texts {
	
	public static String ContinueatStartScreen, LoadatStartScreen, SettingsatStartScreen, ExitatStartScreen;
	
	public static String TextDisplayable;
	public static String AnswersTextDisplayable;
	public static String TexttoDisplay;
	
	public static String YesatAnswersScreen, NoatAnswersScreen;
	
	public static String PART;
	
	public static String[] Opening, AnswersText, Save, startScreenRessource, AnswersScreen;
	
	public static String Name = "Nothing";
	
	public static int PARTText;
	
	public Texts() {
		
		PARTText = 1;
		TextDisplayable = "";
		TexttoDisplay = Opening[PARTText];
		
		LoadatStartScreen = startScreenRessource[0];
		SettingsatStartScreen = startScreenRessource[2];
		ExitatStartScreen = startScreenRessource[3];
		
		YesatAnswersScreen = AnswersScreen[0];
		NoatAnswersScreen = AnswersScreen[1];
		AnswersTextDisplayable = AnswersText[0];
		
	}
}
