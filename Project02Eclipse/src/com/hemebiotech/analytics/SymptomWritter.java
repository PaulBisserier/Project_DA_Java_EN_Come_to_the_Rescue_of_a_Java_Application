package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SymptomWritter implements ISymptomWriter {


	@Override
	public void writeConsole(Map<String, Integer> symptoms) {
		symptoms.forEach((key, value)-> System.out.print("Le symptome : " + key + " " + " a une fréquence de : " + value));		
		
	}

}
