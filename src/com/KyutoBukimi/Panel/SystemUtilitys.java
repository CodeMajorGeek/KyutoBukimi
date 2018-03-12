package com.KyutoBukimi.Panel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class SystemUtilitys {
	
	private static String[] Save;
	
	private static String inputText;
	
	private static String saveText;
	
	private static BufferedReader br;
	
	private static PrintWriter pw;
	
	private static File filetoRead;
	
	public SystemUtilitys() {
		
		readAnswersRessource();
		readAnswersText();
		readStartScreenRessource();
		readOpeningText();
		readsave();
	}
	
	private void readOpeningText() {
		filetoRead = new File("Text/OpeningText.txt");
		
		try {
			br = new BufferedReader(new FileReader(filetoRead));
			
			String line;
			while ((line = br.readLine()) != null) {
			   
				inputText += line;
			}
			br.close();
			
			Texts.Opening = inputText.split("/");
			
		} catch (Exception e) {
			
			System.exit(1);
		}
		inputText = "";
	}
	
	public static void readStartScreenRessource() {
		filetoRead = new File("Text/startscreenText.txt");
		
		try {
			br = new BufferedReader(new FileReader(filetoRead));
			
			String line;
			while ((line = br.readLine()) != null) {
			   
				inputText += line;
			}
			br.close();
			
			Texts.startScreenRessource = inputText.split(";");
			
		} catch (Exception e) {
			
			System.exit(1);
		}
		inputText = "";
	}
	
	
	private void readAnswersRessource() {
		filetoRead = new File("Text/AnswersFrameText.txt");
		
		try {
			br = new BufferedReader(new FileReader(filetoRead));
			
			String line;
			while ((line = br.readLine()) != null) {
			   
				inputText += line;
			}
			br.close();
			
			inputText = inputText.substring(4);
			
			Texts.AnswersScreen = inputText.split(";");
			
		} catch (Exception e) {
			
			System.exit(1);
		}
		inputText = "";
	}
	
	private void readAnswersText() {
		filetoRead = new File("Text/AnswersText.txt");
		
		try {
			br = new BufferedReader(new FileReader(filetoRead));
			
			String line;
			while ((line = br.readLine()) != null) {
			   
				inputText += line;
			}
			br.close();
			
			Texts.AnswersText = inputText.split("/");
			
		} catch (Exception e) {
			
			System.exit(1);
		}
		inputText = "";
	}
	
	public static void readsave() {
		filetoRead = new File("Save/save.save");
		
		if(filetoRead.exists()) {
			
			Texts.ContinueatStartScreen = Texts.startScreenRessource[1];
			
			try {
				br = new BufferedReader(new FileReader(filetoRead));
				
				String line;
				while ((line = br.readLine()) != null) {
				   
					saveText += line;
				}
				br.close();
				
				saveText = saveText.substring(4);
				
				Save = saveText.split(";");
				
				Texts.PARTText = Integer.parseInt(Save[1].substring(10));
				Texts.PART = Save[0].substring(5);
				Texts.Name = Save[2].substring(5);
				
			} catch (Exception e) {
				
				System.exit(1);
			}
		} else {
			
			try {
				
				Texts.PART = "opening";
				Texts.PARTText = 0;
				
				new Texts();
				filetoRead.createNewFile();
				writeSave();
				
				//modify when export with the file path name
				Runtime.getRuntime().exec("java -jar KyotoBukimi.jar");
				System.exit(-1);
			} catch (Exception e) {
				
				System.exit(1);
			}
		}
		
		
		
	}
	
	public static void writeSave() {
		filetoRead = new File("Save/save.save");
		
		try {
			pw = new PrintWriter(new BufferedWriter(new FileWriter(filetoRead)));
			
			pw.println("part=" + Texts.PART + ";");
			pw.println("part_text=" + Texts.PARTText + ";");
			pw.println("name=" + Texts.Name + ";");
			pw.close();
			
		} catch (Exception e) {
			
			System.exit(1);
		}
	}
}