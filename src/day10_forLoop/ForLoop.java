package day10_forLoop;

public class ForLoop {

	public static void main(String[] args) {
		//print 1~10
		//while loop
		int count = 1;
		while (count<=10) {
			System.out.println(count);
			count++;
		}
///		
		System.out.println("------");//for space
		
		//Do loop
		
		int c = 5;
		do {System.out.println(c);
		c++;}
		while(c<10);
///
		System.out.println("------");
		
	//for loop
		
		int i = 5;
		for (i = 25; i<=25 ; i++) {
			System.out.println(i);
		}
	///	
		System.out.println("------");
		
		for (int a = 10;a >= 1 ;a-- )
			System.out.println(a);
		
		for (int b =5 ;b>=1 ; b--) {
			System.out.println();
		}
		
		
		
	}

}
