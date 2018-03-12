package com.KyutoBukimi.Panel;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Images {

	private ImageIcon iTextFrame, iminiMenu;
	private ImageIcon iAnswersFrame;
	
	private ImageIcon ichr1_pos1, ichr1_pos2;
	private ImageIcon ichr2_pos1;
	private ImageIcon ichr3_pos1;
	
	public static Image TextFrame, miniMenu;
	public static Image AnswersFrame;
	
	public static Image Chr1_pos1, Chr1_pos2;
	public static Image Chr2_pos1;
	public static Image Chr3_pos1;
	
	public static Image FinalChr1, FinalChr2, FinalChr3;
	
	public Images() {
		
		iTextFrame = new ImageIcon(getClass().getResource("/textures/Text/TextFrame_normal.png"));
		iminiMenu = new ImageIcon(getClass().getResource("/textures/onScreen/menu.png"));
		iAnswersFrame = new ImageIcon(getClass().getResource("/textures/onScreen/AnswersFrame.png"));
		
		ichr1_pos1 = new ImageIcon(getClass().getResource("/textures/characters/chr1-pos1.png"));
		ichr1_pos2 = new ImageIcon(getClass().getResource("/textures/characters/chr1-pos2.png"));
		
		ichr2_pos1 = new ImageIcon(getClass().getResource("/textures/characters/chr2-pos1.png"));
		
		ichr3_pos1 = new ImageIcon(getClass().getResource("/textures/characters/chr3-pos1.png"));
		
		TextFrame = iTextFrame.getImage();
		miniMenu = iminiMenu.getImage();
		AnswersFrame = iAnswersFrame.getImage();
		
		Chr1_pos1 = ichr1_pos1.getImage();
		Chr1_pos2 = ichr1_pos2.getImage();
		
		Chr2_pos1 = ichr2_pos1.getImage();
		
		Chr3_pos1 = ichr3_pos1.getImage();
		
		FinalChr1 = Chr1_pos1;
		FinalChr2 = Chr2_pos1;
		FinalChr3 = Chr3_pos1;
		
	}
	
}
