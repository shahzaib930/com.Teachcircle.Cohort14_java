package day33_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {

	public static void main(String[] args) throws IOException {
		 
		       try { 
		        File file = new File(
		        		 "/Users/mac/eclipse-workspace/com.techcircle.cohod14_java/src/day33_Exceptions/NoErrorHandlingCode.java");

		        FileReader fr = new FileReader(file);
		        
		        //fr.close();
		        int i;
		        // Holds true till there is nothing to read
		        while ((i = fr.read()) != -1) {

		            // Print all the content of a file
		            System.out.print((char) i);
		            }}catch( FileNotFoundException e) {
		            	System.out.println();
		            }

	}
}

