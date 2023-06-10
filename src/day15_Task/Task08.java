package day15_Task;

public class Task08 {

	public static void main(String[] args) {
		/*
Task8
write a program that asks the user enter a three letter word.
 Check if the middle character of the given word is 'a'.
  In the case it is print: "Cool word", 
  but in the case the middle letter is not 'a' print: "Okay word". 
  - If the user does not enter a 3 letter word tell them:
   If the word is less than 3 letters: "Word is too short"
    If the word is too long: "Word is too long"



*/
//	String word = "cat"	;
//	String output = "";	
//		
//	if (word.length()==3 && word.indexOf('1') == 'a' )
//		output = "Cool word";
//	else if (word.length()==3 && word.indexOf('1') != 'a' )
//		output = "Okay word";
//	else if (word.length()!= 3)
//		if (word.length()>3 )
//		output = "Too long";
//	if  (word.length()<3 )
//		output = "Too short";
//	System.out.println(output);
		
String str = "ac";
        
        if (str.length() == 3) {
            if (str.charAt(1) == 'a') {
                System.out.println("Cool Word");
            }else{
                System.out.println("Okay word");
            }
        }else if (str.length() < 3){
            System.out.println("word is too short");
        }else {
            System.out.println("Word is too long");
        }
	
		
		
		
		
		
	}

}
