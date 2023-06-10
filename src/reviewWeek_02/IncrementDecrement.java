package reviewWeek_02;

public class IncrementDecrement {

	public static void main(String[] args) {
		//++ --
//only use with num  
		//prefex / postflix
		int x = 100;
		x++;//x = x+1
		System.out.println(x);
		
		int y = 1;
	    y--; // y = y - 1
	    System.out.println(y);

	    // Postfix
	    int a = 1;
	    int b = a++;
	    // b = a
	    // a = a + 1
	    System.out.println("a:" + a); // 2
	    System.out.println("b:" + b); // 1

	    // Prefix
	    int c = 1;
	    int d = ++c;
	    // c = c + 1
	    // d = c
	    System.out.println("c:"+ c); // 2
	    System.out.println("d:"+ d); // 2
		
		
		
		
		
		
	}

}
