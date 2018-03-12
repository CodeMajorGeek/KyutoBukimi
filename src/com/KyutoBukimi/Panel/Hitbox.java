package com.KyutoBukimi.Panel;

import java.awt.Rectangle;

public class Hitbox {

	public static Rectangle Mouse;
	
	public static Rectangle ContinueatStartScreen, SettingsatStartScreen, ExitatStartScreen;
	public static Rectangle miniMenu;
	
	public static Rectangle YesatAnswersScreen, NoatAnswersScreen;
	
	public Hitbox() {
		
		Mouse = new Rectangle(0, 0, 10, 10);
		
		ContinueatStartScreen = new Rectangle(Coordinates.xContinueatStartScreen, Coordinates.yContinueatStartScreen, 361, 77);
		SettingsatStartScreen = new Rectangle(Coordinates.xSettingsatStartScreen, Coordinates.ySettingsatStartScreen, 361, 77);
		ExitatStartScreen = new Rectangle(Coordinates.xExitatStartScreen, Coordinates.yExitatStartScreen, 361, 77);
		
		miniMenu = new Rectangle(Coordinates.xminiMenu, Coordinates.yminiMenu, 34, 34);
		
		YesatAnswersScreen = new Rectangle(Coordinates.xYesatAnswersScreen, Coordinates.yYesatAnswersScreen, 95, 60);
		NoatAnswersScreen = new Rectangle(Coordinates.xNoatAnswersScreen, Coordinates.yNoatAnswersScreen, 95, 60);
	}
	
}
