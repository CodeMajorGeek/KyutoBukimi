package com.KyutoBukimi.Panel;


import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Sounds{

private static Clip c, cFont;
private static AudioInputStream ai, aiFont;
public static String currentPist = null;

	public Sounds(boolean Font, String son){
		
		if(!Font) {
			
			try{
				ai = AudioSystem.getAudioInputStream(getClass().getResource(son));
				c = AudioSystem.getClip();
				c.open(ai);
			}
			catch(Exception e){
				
				System.exit(1);
			}
		} else {
			currentPist = son;
			try {
				aiFont = AudioSystem.getAudioInputStream(getClass().getResource(son));
				cFont = AudioSystem.getClip();
				cFont.open(aiFont);
				
			} catch (Exception e) {

				System.exit(1);
			}
			cFont.loop(Clip.LOOP_CONTINUOUSLY);
			cFont.start();
		}
	}
	
	public void play(){
		c.start();
	}
	
	public void stop(){
		c.stop();
	}
	
	public void stopFontSound() {
		
		cFont.stop();
	}
	
	public Clip getClip(){
		return c;
	}
	
	public static void playTempSound(String son){
		Sounds s = new Sounds(false, son);
		s.play();
	}
}
