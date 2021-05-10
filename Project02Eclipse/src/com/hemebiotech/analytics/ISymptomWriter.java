package com.hemebiotech.analytics;

import java.util.Map;

/**
 * 
 * @author paul
 *
 */
public interface ISymptomWriter {
	
	/**
	 * Ecrit dans la console.
	 * 
	 * @param symptoms symptomes décrit et compte le nombre occurences. 
	 */
	public void writeConsole(Map<String, Integer> symptoms); 

}
