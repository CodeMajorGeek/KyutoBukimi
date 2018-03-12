package com.KyutoBukimi.Panel;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Panel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	public Panel() {
		setFocusable(true);
		requestFocus();
		setLayout(null);
		
		addKeyListener(new Listeners());
		addMouseListener(new Listeners());
		addMouseMotionListener(new Listeners());
	}
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		super.paint(g);
		
		if(Screens.btnContinueatStartScreen) {
			
			g2.setFont(Fonts.ContinueatStartScreenDisplayable);
			g2.setColor(Colors.ContinueatStartScreenDisplayable);
			g2.drawString(Texts.ContinueatStartScreen, Coordinates.xContinueatStartScreen + Hitbox.ContinueatStartScreen.width/6, Coordinates.yContinueatStartScreen + Hitbox.ContinueatStartScreen.height - 20);
		}
		
		if(Screens.btnSettingsatStartScreen) {
			
			g2.setFont(Fonts.SettingsatStartScreenDisplayable);
			g2.setColor(Colors.SettingsatStartScreenDisplayable);
			g2.drawString(Texts.SettingsatStartScreen, Coordinates.xSettingsatStartScreen + Hitbox.SettingsatStartScreen.width/6, Coordinates.ySettingsatStartScreen + Hitbox.SettingsatStartScreen.height - 20);
		}

		if(Screens.btnExitatStartScreen) {
	
			g2.setFont(Fonts.ExitatStartScreenDisplayable);
			g2.setColor(Colors.ExitatStartScreenDisplayable);
			g2.drawString(Texts.ExitatStartScreen, Coordinates.xExitatStartScreen + Hitbox.ExitatStartScreen.width/6, Coordinates.yExitatStartScreen + Hitbox.ExitatStartScreen.height - 20);
		}
		
		if(Screens.FrameText && Screens.FrameTextVisible) {
			
			g2.drawImage(Images.TextFrame, Coordinates.xTextFrame, Coordinates.yTextFrame, null);
		}
		
		if(Screens.Text && Screens.FrameTextVisible) {
			
			g2.setFont(Fonts.TextDisplayable);
			g2.setColor(Colors.TextDisplayable);
			g2.drawString(Texts.TextDisplayable, Coordinates.xText, Coordinates.yText);
		}
		
		if(Screens.miniMenu) {
			
			g2.drawImage(Images.miniMenu, Coordinates.xminiMenu, Coordinates.yminiMenu, null);
		}
		
		if(Screens.Chr1) {
			
			g2.drawImage(Images.FinalChr1, Coordinates.xchr1, Coordinates.ychr1, null);
		}
		
		if(Screens.Chr2) {
			
			g2.drawImage(Images.FinalChr2, Coordinates.xchr2, Coordinates.ychr2, null);
		}
		
		if(Screens.Chr3) {
			
			g2.drawImage(Images.FinalChr3, Coordinates.xchr3, Coordinates.ychr3, null);
		}
		
		if(Screens.AnswersFrame) {
			
			g2.drawImage(Images.AnswersFrame, Coordinates.xAnswersFrame, Coordinates.yAnswersFrame, null);
		}
		
		if(Screens.btnYesAnswers) {
			
			g2.setFont(Fonts.YesatAnswersDisplayable);
			g2.setColor(Colors.YesatAnswersDisplayable);
			g2.drawString(Texts.YesatAnswersScreen, Coordinates.xYesatAnswersScreen, Coordinates.yYesatAnswersScreen + Hitbox.YesatAnswersScreen.width / 2);
		}
		
		if(Screens.btnNoAnswers) {
			
			g2.setFont(Fonts.NoatAnswersDisplayable);
			g2.setColor(Colors.NoatAnswersDisplayable);
			g2.drawString(Texts.NoatAnswersScreen, Coordinates.xNoatAnswersScreen, Coordinates.yNoatAnswersScreen + Hitbox.NoatAnswersScreen.width / 2);
		}
		
		if(Screens.AnswersText) {
			
			g2.setFont(Fonts.normal);
			g2.setColor(Colors.normal);
			g2.drawString(Texts.AnswersTextDisplayable, Coordinates.xTextAnswersFrame, Coordinates.yTextAnswersFrame);
		}
		
		repaint();
	}
}
