package com.KyutoBukimi.Panel;

import javax.swing.JOptionPane;

public class GamePhysics {
	
	public static boolean Musicstart = false;
	public static boolean AnswersResult = false;
	public static boolean InAction = false;
	static Sounds s;
	
	public GamePhysics() {
		
		GamePhysicsLoop.start();
	}
	
	private Thread GamePhysicsLoop = new Thread() {
		public void run() {
			while(true) {
				
				if(Screens.isStartScreen() || Screens.isExitScreen()) {
					
					changeMusic("/resources/song/Miuzz.wav");
				} else if(Screens.isinGame()){
					
					changeMusic("/resources/song/Ramaya.wav");
					Screens.Chr1 = true;
					Screens.Chr2 = true;
					Screens.Chr3 = true;
				}
				
				if(Texts.PART.equals("opening") && Texts.PARTText == 0) {
					
					Texts.ContinueatStartScreen = Texts.startScreenRessource[0];
				} else {
					
					Texts.ContinueatStartScreen = Texts.startScreenRessource[1];
				}
				
				if(Texts.PART.equals("opening")) {
					if(Texts.PARTText == 0 && Screens.isinGame()) {
						
						if(Texts.Name.equals("Nothing"))
							Texts.Name = JOptionPane.showInputDialog("Rentrer vôtre prénom :");
					} else if(Texts.PARTText == 9) {
						Texts.AnswersTextDisplayable = Texts.AnswersText[1];
						
						Screens.YesNochoice();
						while(Screens.isYesNoChoice()) System.out.print("");
						InAction = true;
						
						Texts.PARTText++;
						Texts.TexttoDisplay = Texts.Opening[Texts.PARTText];
						
						InAction = false;
					}
					
					if(Texts.PARTText == 10 || Texts.PARTText == 2) {
						
						Fonts.TextDisplayable = Fonts.creepy;
						Colors.TextDisplayable = Colors.creepy;
						Images.FinalChr1 = Images.Chr1_pos2;
					} else {
						
						Fonts.TextDisplayable = Fonts.normal;
						Colors.TextDisplayable = Colors.normal;
						Images.FinalChr1 = Images.Chr1_pos1;
					}
					
				}
				
				if(Screens.isExitScreen()) {
					Texts.AnswersTextDisplayable = Texts.AnswersText[0];
					while(Screens.isExitScreen()) System.out.print("");
					
					if(AnswersResult) {
						
						SystemUtilitys.writeSave();
						System.exit(0);
					} else {
						
						Screens.StartScreen();
					}
				}
				
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					
					System.exit(1);
				}
			}
		}
	};
	
	public static void changeMusic(String music) {
		if(s != null && !Musicstart) {
			
			s.stopFontSound();
			s = new Sounds(true, music);
			Musicstart = true;
		} else if(s == null){
			
			s = new Sounds(true, music);
			Musicstart = true;
		}
		
		if(!Sounds.currentPist.equals(music)) {
			
			Musicstart = false;
			changeMusic(music);
		}
	}
}