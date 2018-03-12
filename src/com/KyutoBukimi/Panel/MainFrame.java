package com.KyutoBukimi.Panel;

import javax.swing.JFrame;

public class MainFrame {

	public static JFrame frame = new JFrame("KyutoBukimi");
	
	public static void main(String[] args) {
		
		frame.addWindowListener(new Listeners());
		
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		Init();
		
		frame.setContentPane(new Panel());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	private static void Init() {
		Screens.StartScreen();
		
		new SystemUtilitys();
		new Coordinates();
		new Hitbox();
		new Images();
		new Listeners();
		new Texts();
		new Fonts();
		new Colors();
		new Animations();
		new GamePhysics();
	}
}
