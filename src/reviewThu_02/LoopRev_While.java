package reviewThu_02;

public class LoopRev_While {

	public static void main(String[] args) {
//		int a = 1;
//		
//		while(a <= 6) {
//			System.out.println(a);
//			
//		};
	
		
	//	Do While Loop;
		int i = 0;
		do{System.out.println(i);
		i++;}	
		while(i<=6);	
			
	//For loop;
		
	for (int b = 0; b <5 ; b++)	{
		System.out.println("Yes");
	}
		System.out.println("-------");
	//Nested loop;
	int n = 4;
	for (int c = 1; c <=n ; c++) {
		 for (int d = 1; d <=c ; d++)	{
			System.out.print(d);
			
		 }	
	System.out.println(); 
	}	 
	}

}
