package day10_forLoop;

public class Task08 {

	public static void main(String[] args) {
	  for (int a = 0 ; a<= 100 ; a++) {
		  if (a%3 ==0 && a%5 == 0)
		  System.out.println("Finra");
		  else if (a%3 ==0 )
			  System.out.println("Fin");
		  else if ( a%5 == 0)
			  System.out.println("RA");
		  else {System.out.println(a);}
	  }

	}

}
