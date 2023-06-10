package day35_mondayReview;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TaskTryCatch {

	public static void main(String[] args) {
		/*
		Create a Java program that reads in a file and catches any FileNotFoundExceptions
		that may be thrown. If a FileNotFoundException is caught, output a message 
		to the user indicating that the file was not found and prompt 
		the user to input a new file name.
		*/

	
		File file = new File("null");
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not Found"+ file.getName());
			System.out.println("Please enter new file location");
		}
	}

	}
