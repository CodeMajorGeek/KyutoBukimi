package com.KyutoBukimi.Panel;

import java.awt.Color;

public class Colors {

	public static Color normal, creepy, animation;
	
	public static Color TextDisplayable;
	public static Color ContinueatStartScreenDisplayable, LoadatStartScreenDisplayable, SettingsatStartScreenDisplayable, ExitatStartScreenDisplayable;
	public static Color YesatAnswersDisplayable, NoatAnswersDisplayable;
	
	public Colors() {
		
		normal = new Color(255, 174, 201);
		creepy = Color.BLACK;
		animation = new Color(255, 150, 200);
		
		TextDisplayable = normal;
		
		ContinueatStartScreenDisplayable = normal;
		LoadatStartScreenDisplayable = normal;
		SettingsatStartScreenDisplayable = normal;
		ExitatStartScreenDisplayable = normal;
		YesatAnswersDisplayable = normal;
		NoatAnswersDisplayable = normal;
	}
	
}
