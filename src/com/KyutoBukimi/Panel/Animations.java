package com.KyutoBukimi.Panel;

public class Animations {

	public static boolean isTextAnimate = false;
	public static boolean isSoundsAnimate = false;
	public static boolean FrameandTextVisible = true;
	
	public Animations() {
		
		btnAnimation.start();
		TextAnimation.start();
		ScreenAnimation.start();
	}
	
	private Thread btnAnimation = new Thread() {
		public void run() {
			while(true) {
				if(Screens.isStartScreen()) {
					
					if(Hitbox.Mouse.intersects(Hitbox.ContinueatStartScreen)) {
						
						if(!isSoundsAnimate) {
							isSoundsAnimate = true;
							Sounds.playTempSound("/resources/song/2637.wav");
						}
						
						Colors.ContinueatStartScreenDisplayable = Colors.animation;
						Fonts.ContinueatStartScreenDisplayable = Fonts.btnAnimation;
					} else if(Hitbox.Mouse.intersects(Hitbox.SettingsatStartScreen)) {
						
						if(!isSoundsAnimate) {
							isSoundsAnimate = true;
							Sounds.playTempSound("/resources/song/2637.wav");
						}
						
						Colors.SettingsatStartScreenDisplayable = Colors.animation;
						Fonts.SettingsatStartScreenDisplayable = Fonts.btnAnimation;
					} else if(Hitbox.Mouse.intersects(Hitbox.ExitatStartScreen)) {
						
						if(!isSoundsAnimate) {
							isSoundsAnimate = true;
							Sounds.playTempSound("/resources/song/2637.wav");
						}
						
						Colors.ExitatStartScreenDisplayable = Colors.animation;
						Fonts.ExitatStartScreenDisplayable = Fonts.btnAnimation;
					} else {
						
						isSoundsAnimate = false;
						
						Fonts.ContinueatStartScreenDisplayable = Fonts.btnNormal;
						Fonts.LoadatStartScreenDisplayable = Fonts.btnNormal;
						Fonts.SettingsatStartScreenDisplayable = Fonts.btnNormal;
						Fonts.ExitatStartScreenDisplayable = Fonts.btnNormal;
						
						Colors.ContinueatStartScreenDisplayable = Colors.normal;
						Colors.LoadatStartScreenDisplayable = Colors.normal;
						Colors.SettingsatStartScreenDisplayable = Colors.normal;
						Colors.ExitatStartScreenDisplayable = Colors.normal;
					}
				}
				
				if(Screens.isYesNoChoice() || Screens.isExitScreen()) {
					
					if(Hitbox.Mouse.intersects(Hitbox.YesatAnswersScreen)) {
						
						if(!isSoundsAnimate) {
							isSoundsAnimate = true;
							Sounds.playTempSound("/resources/song/2637.wav");
						}
						
						Colors.YesatAnswersDisplayable = Colors.animation;
						Fonts.YesatAnswersDisplayable = Fonts.btnAnimation;
					} else if(Hitbox.Mouse.intersects(Hitbox.NoatAnswersScreen)) {
						
						if(!isSoundsAnimate) {
							isSoundsAnimate = true;
							Sounds.playTempSound("/resources/song/2637.wav");
						}
						
						Colors.NoatAnswersDisplayable = Colors.animation;
						Fonts.NoatAnswersDisplayable = Fonts.btnAnimation;
					} else {
						isSoundsAnimate = false;
						
						Colors.YesatAnswersDisplayable = Colors.normal;
						Colors.NoatAnswersDisplayable = Colors.normal;
						
						Fonts.YesatAnswersDisplayable = Fonts.btnNormal;
						Fonts.NoatAnswersDisplayable = Fonts.btnNormal;
					}
				}
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					
					System.exit(1);
				}
			}
		}
	};
	
	private Thread TextAnimation = new Thread() {
		public void run() {
			
			while(true) {
				while(Texts.Name.equals("Nothing"))
					System.out.print("");
				
				if(!Texts.TextDisplayable.equals(Texts.TexttoDisplay)) {
					Texts.TextDisplayable = "";
					
					isTextAnimate = true;
					
					for(int i = 0; i <= Texts.TexttoDisplay.length(); i++) {
						
						if(i <= Texts.TexttoDisplay.length() - 5) {
							
							if(Texts.TexttoDisplay.substring(i, i + 5).equals("§name")) {
								
								Texts.TexttoDisplay = Texts.TexttoDisplay.substring(0, i) + Texts.Name + Texts.TexttoDisplay.substring(i + 5, Texts.TexttoDisplay.length());
							}
						}
					}
					
					for(int nbrchar = 0; nbrchar <= Texts.TexttoDisplay.length(); nbrchar++) {
						
						if(!isTextAnimate) {
							
							Texts.TextDisplayable = Texts.TexttoDisplay;
							break;
						}
						
						if(Texts.TextDisplayable.length() != Texts.TexttoDisplay.length() - 1) {
							
							Texts.TextDisplayable += Texts.TexttoDisplay.substring(nbrchar, nbrchar + 1);
						} else {
							
							Texts.TextDisplayable = Texts.TexttoDisplay;
							isTextAnimate = false;
							break;
						}
						
						try {
							Thread.sleep(50);
						} catch (InterruptedException e) {
							
							System.exit(1);
						}
						while(!Screens.isinGame()) {
							
							try {
								Thread.sleep(10);
							} catch (InterruptedException e) {
								
								System.exit(1);
							}
						}
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
	
	private Thread ScreenAnimation = new Thread() {
		public void run() {
			while(true) {
				
				if(FrameandTextVisible) {
					
					Screens.FrameTextVisible = true;
					Screens.TextVisible = true;
				} else {
					
					Screens.FrameTextVisible = false;
					Screens.TextVisible = false;
				}
				
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					
					System.exit(1);
				}
			}
		}
	};
	
	public static void FrameandTextVisibility() {
		
		if(FrameandTextVisible) {
			
			FrameandTextVisible = false;
		} else {
			
			FrameandTextVisible = true;
		}
	}
	
}
