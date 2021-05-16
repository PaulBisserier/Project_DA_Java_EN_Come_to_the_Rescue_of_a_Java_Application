package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * 
 * @author paul
 * écrit les résultats dans la console ou un fichier
 */
public class SymptomWritter implements ISymptomWriter {

	@Override
	public void writeConsole(Map<String, Integer> symptoms) {
		symptoms.forEach((key, value)-> System.out.printf("Le symptome : " + key + " " + " a une fréquence de : " + value + "\n"));			
	}
	
	public void writeFile(Map<String, Integer> map) {
		try {
		      FileWriter myWriter = new FileWriter("result.out");
		    
		      map.forEach((key, value)-> {
				try {
					myWriter.write( key + " = " +value + "\n");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});	
		      myWriter.close();
		      System.out.println("ECRITURE DANS LE FICHIER TERMINÉE.");
		    } catch (IOException e) {
		      System.out.println("ERREUR D'ECRITURE DANS LE FICHIER");
		      e.printStackTrace();
		    }
		
	}
}
