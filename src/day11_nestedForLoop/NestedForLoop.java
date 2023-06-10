package day11_nestedForLoop;

public class NestedForLoop {

	public static void main(String[] args) {
//      for (int i = 1 ; i <= 10 ; i++) {
//      System.out.println(i);
//  }
//  
//  for (int i = 1 ; i <= 10 ; i++) {
//      System.out.println(i);
//  }
//  
//  for (int i = 1 ; i <= 10 ; i++) {
//      System.out.println(i);
//  }
//  
//  for (int i = 1 ; i <= 10 ; i++) {
//      System.out.println(i);
//  }
//  
//  for (int i = 1 ; i <= 10 ; i++) {
//      System.out.println(i);
//  }
  
//  for (int j = 1 ; j <= 5 ;j++) {
//      System.out.println("Hello "+j);
//      
//  }
//  
  for (int i = 1 ; i <= 10 ; i++) {
      System.out.println(i); // 1 ~ 10
      for (int j = 1 ; j <= 5 ;j++) {
          System.out.println("Hello "+j);
          
      }
  }
  
  
  //Print A to H 10 times
  
  for (int i= 'A' ; i <= 'H' ; i++) {
      
      char letter = (char)i;
      System.out.println(letter);
  }
  
  for (int j = 1 ; j < 11 ; j++) {
      for (int i= 'A' ; i <= 'H' ; i++) {
          
          char letter = (char)i;
          System.out.print(letter);
      }
      System.out.println();
  }
  
  	

	}

}
