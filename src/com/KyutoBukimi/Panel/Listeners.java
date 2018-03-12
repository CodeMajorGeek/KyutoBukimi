package com.KyutoBukimi.Panel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Listeners implements KeyListener, MouseMotionListener, MouseListener, WindowListener{
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		if(Hitbox.Mouse.intersects(Hitbox.ContinueatStartScreen) && Screens.isStartScreen()) {
			
			Screens.inGame();
		} else if(Hitbox.Mouse.intersects(Hitbox.SettingsatStartScreen) && Screens.isStartScreen()) {
			
			
		} else if(Hitbox.Mouse.intersects(Hitbox.ExitatStartScreen) && Screens.isStartScreen()) {
			
			Screens.ExitScreen();
		} else if(Hitbox.Mouse.intersects(Hitbox.miniMenu) && Screens.isinGame()) {
			
			
		} else if(Hitbox.Mouse.intersects(Hitbox.YesatAnswersScreen) && (Screens.isYesNoChoice() || Screens.isYesChoice() || Screens.isNoChoice() ||Screens.isExitScreen())) {
			
			GamePhysics.AnswersResult = true;
			Screens.CancelScreenchoice();
		} else if(Hitbox.Mouse.intersects(Hitbox.NoatAnswersScreen) && (Screens.isYesNoChoice() || Screens.isYesChoice() || Screens.isNoChoice() ||Screens.isExitScreen())) {
			
			GamePhysics.AnswersResult = false;
			Screens.CancelScreenchoice();
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1) {
			
			if(Screens.isinGame() && !Screens.isYesNoChoice() && !Screens.isYesChoice() && !Screens.isNoChoice()  && !GamePhysics.InAction && !Hitbox.Mouse.intersects(Hitbox.miniMenu)) {
				
				if(!Animations.isTextAnimate) {
					
					Texts.PARTText++;
					Texts.TexttoDisplay = Texts.Opening[Texts.PARTText];
				} else {
					
					Animations.isTextAnimate = false;
				}
			}
		} else if(Screens.isinGame()){
			
			Animations.FrameandTextVisibility();
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		Hitbox.Mouse.setBounds(e.getX(), e.getY(), 10, 10);
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int k = e.getKeyCode();
		
		
		if(Screens.isinGame() && !Screens.isYesNoChoice() && !Screens.isYesChoice() && !Screens.isNoChoice()) {
			
			if(k == KeyEvent.VK_SPACE && !GamePhysics.InAction) {
				
				if(!Animations.isTextAnimate) {
					
					Texts.PARTText++;
					Texts.TexttoDisplay = Texts.Opening[Texts.PARTText];
				} else {
					
					Animations.isTextAnimate = false;
				}
			}
		} else if(Screens.isinGame()) {
			
			if(k == KeyEvent.VK_A) Screens.YesNochoice();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		SystemUtilitys.writeSave();
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		
		
	}
}