package com.KyutoBukimi.Panel;

public class Screens {

	public static boolean btnContinueatStartScreen, btnSettingsatStartScreen, btnExitatStartScreen;
	public static boolean FrameText, miniMenu, Text, FrameTextVisible, TextVisible;
	public static boolean AnswersFrame, btnYesAnswers, btnNoAnswers, AnswersText;
	public static boolean Chr1, Chr2, Chr3;
	
	public static void StartScreen() {
		changeScene();
		
		btnContinueatStartScreen = true;
		btnSettingsatStartScreen = true;
		btnExitatStartScreen = true;
	}
	
	public static void inGame() {
		changeScene();
		
		FrameText = true;
		miniMenu = true;
		Text = true;
		FrameTextVisible = true;
		TextVisible = true;
	}
	
	public static void YesNochoice() {
		
		AnswersFrame = true;
		AnswersText = true;
		btnYesAnswers = true;
		btnNoAnswers = true;
	}
	
	public static void Yeschoice() {
		
		AnswersFrame = true;
		AnswersText = true;
		btnYesAnswers = true;
		btnNoAnswers = false;
	}
	
	public static void CancelScreenchoice() {
		
		AnswersFrame = false;
		AnswersText = false;
		btnYesAnswers = false;
		btnNoAnswers = false;
	}
	
	public static void Nochoice() {
		
		AnswersFrame = true;
		AnswersText = true;
		btnYesAnswers = false;
		btnNoAnswers = true;
	}
	
	public static void ExitScreen() {
		changeScene();
		
		AnswersText = true;
		btnYesAnswers = true;
		btnNoAnswers = true;
	}
	
	private static void changeScene() {
		
		btnContinueatStartScreen = false;
		btnSettingsatStartScreen = false;
		btnExitatStartScreen = false;
		FrameText = false;
		miniMenu = false;
		Text = false;
		AnswersFrame = false;
		btnYesAnswers = false;
		btnNoAnswers = false;
		AnswersText = false;
		FrameTextVisible = false;
		TextVisible = false;
	}
	
	public static boolean isStartScreen() {
		
		return btnContinueatStartScreen == true  && btnSettingsatStartScreen == true && btnExitatStartScreen == true;
	}
	
	public static boolean isinGame() {
		
		return FrameText == true && miniMenu == true && Text == true;
	}
	
	public static boolean isYesNoChoice() {
		
		return AnswersFrame == true && btnYesAnswers == true && btnNoAnswers == true && AnswersText == true;
	}
	
	public static boolean isYesChoice() {
		
		return AnswersFrame == true && btnYesAnswers == true && btnNoAnswers == false && AnswersText == true;
	}
	
	public static boolean isNoChoice() {
		
		return AnswersFrame == true && btnYesAnswers == false && btnNoAnswers == true && AnswersText == true;
	}
	
	public static boolean isExitScreen() {
		
		return btnYesAnswers == true && btnNoAnswers == true && AnswersFrame == false && AnswersText == true;
	}
}
