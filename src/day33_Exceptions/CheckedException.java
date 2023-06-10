package day33_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) throws IOException {
	/*    IO.Exception:
	 They are checked by the compiler at the compile time and
	 tprogram is prompted to handle thesee exception.
	 . show before to Run it..
	 */
    
		File file = new File(
                "/Users/mac/eclipse-workspace/com.techcircle.cohod14_java/src/day33_Exceptions/NoErrorHandlingCode.java");

        try {
            FileReader fr = new FileReader(file);

            int i;
            // Holds true till there is nothing to read
            while ((i = fr.read()) != -1) {

                // Print all the content of a file
                System.out.print((char) i);
            }

        } catch (FileNotFoundException e) {
            System.out.println("The file that you are trying to open is not available.");
        }

		
		
		
		
		
	}

}
