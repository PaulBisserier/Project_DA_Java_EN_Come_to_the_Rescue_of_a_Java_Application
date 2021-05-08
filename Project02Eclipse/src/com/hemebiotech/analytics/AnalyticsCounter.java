package com.hemebiotech.analytics;


import java.util.List;

public class AnalyticsCounter {

	
	public static void main(String args[]) throws Exception {
		
		
		final ReadSymptomDataFromFile iSr = new ReadSymptomDataFromFile("symptoms.txt");
		final List<String> symptoms = iSr.getSymptoms();
		final SymptomWritter writer = new SymptomWritter(); 
		
		CounterSymptoms counterSymptoms = new CounterSymptoms();
		counterSymptoms.count(symptoms);
		writer.writeConsole(counterSymptoms.getMyMap());
		
		
	}
}