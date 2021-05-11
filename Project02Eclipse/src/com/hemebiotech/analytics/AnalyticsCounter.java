package com.hemebiotech.analytics;


import java.util.List;
import java.util.Map;

/**
 * 
 * @author paul
 *
 */
public class AnalyticsCounter {

	
	public static void main(String args[]) throws Exception {
		
		System.out.println("Lancement du programme... "); 
		
		final ReadSymptomDataFromFile iSr = new ReadSymptomDataFromFile("symptoms.txt");
		System.out.println("Récupération du fichier OK .... ");
		final List<String> symptoms = iSr.getSymptoms();
		final SymptomWritter writer = new SymptomWritter(); 
		
		CounterSymptoms counterSymptoms = new CounterSymptoms();
		counterSymptoms.count(symptoms);
		Map<String, Integer> testMap = counterSymptoms.getMyMap(); 
		//writer.writeConsole(counterSymptoms.getMyMap());
		//writer.writeFile(counterSymptoms.getMyMap());
		SortSymptoms sortSymptoms = new SortSymptoms(); 
		sortSymptoms.sortMap(testMap);
		
		writer.writeFile(sortSymptoms.getMapSorted());
		
	}
}