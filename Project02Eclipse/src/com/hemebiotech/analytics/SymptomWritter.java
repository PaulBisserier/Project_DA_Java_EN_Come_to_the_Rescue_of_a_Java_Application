package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class SymptomWritter implements ISymptomWriter {

	@Override
	public void writeConsole(Map<String, Integer> symptoms) {
		symptoms.forEach((key, value)-> System.out.printf("Le symptome : " + key + " " + " a une fréquence de : " + value + "\n"));	
	}
	
	public void writeFile(Map<String, Integer> symptoms) {
		try {
		      FileWriter myWriter = new FileWriter("result.out");
		      symptoms.forEach((key, value)-> {
				try {
					myWriter.write("Le symptome : " + key + " " + " a une fréquence de : " + value + "\n");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});	
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
	}
}
