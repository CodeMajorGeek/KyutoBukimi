package com.KyutoBukimi.Panel;

import java.awt.Font;

public class Fonts {

	public static Font normal, creepy, animation;
	public static Font btnNormal, btnCreepy, btnAnimation;
	
	
	public static Font TextDisplayable;
	public static Font ContinueatStartScreenDisplayable, LoadatStartScreenDisplayable, SettingsatStartScreenDisplayable, ExitatStartScreenDisplayable;
	public static Font YesatAnswersDisplayable, NoatAnswersDisplayable;
	
	public Fonts() {
		
		normal = new Font("AR BERKLEY", Font.BOLD, 30);
		creepy = new Font("AR DARLING", Font.BOLD, 40);
		animation = new Font("AR BLANCA", Font.BOLD, 30);
		
		btnNormal = new Font("AR BERKLEY", Font.BOLD, 50);
		btnCreepy = new Font("AR DARLING", Font.BOLD, 60);
		btnAnimation = new Font("AR BLANCA", Font.BOLD, 50);
		
		TextDisplayable = normal;
		
		ContinueatStartScreenDisplayable = btnNormal;
		LoadatStartScreenDisplayable = btnNormal;
		SettingsatStartScreenDisplayable = btnNormal;
		ExitatStartScreenDisplayable = btnNormal;
		YesatAnswersDisplayable = btnNormal;
		NoatAnswersDisplayable = btnNormal;
	}
	
}