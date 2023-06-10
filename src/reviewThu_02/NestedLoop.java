package reviewThu_02;

public class NestedLoop {

	public static void main(String[] args) {
		int n = 4;
		for (int c = 1; c <=n ; c++) {
			 for (int d = 1; d <=c ; d++)	{
				System.out.print(d);
				
			 }	
		System.out.println(); 
		}
		
		
		System.out.println("-----");
		
		for (int i = 1; i <= 5; i++) {

	        for (int j = i-1 ; j >= 0; j--) {

	            System.out.print(i);

	        }

	        System.out.println();
	   
		
		}	
		
	}

}
