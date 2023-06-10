package day07_ControlFlowStatement;

public class TasklargeValue {

	public static void main(String[] args) {
	double n1 = -1.0;	
	double n2 = 4.5; 	
		double n3 =-5.3;
		if(n2>n1 && n2> n3) {
			System.out.println("Max Value " + n2);}
		if(n3>n2 && n3>n1) {
			System.out.println("Max Value " +n3);
			if (n1>n2 && n1>n3) {
				System.out.println("Max Value  " +n1);
			}
		}
		
		
		
		
		
		
	}

}
