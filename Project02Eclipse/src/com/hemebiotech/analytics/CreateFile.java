package com.hemebiotech.analytics;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

/**
 * 
 * @author paul
 * créer un fichier txt
 */

public class CreateFile {

	 public static void main(String[] args) {
		    try {
		      File myObj = new File("filename.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
}
