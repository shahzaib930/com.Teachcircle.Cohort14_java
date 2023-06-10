package review_week03;

public class BreakCountinueStatement {

	public static void main(String[] args) {
		for(int i = 0 ; i <=5; i++) {
			System.out.println("Hi..");
			
			if(i ==3) continue;
			//CONTINUE will start running back again
			//Break will stop the process
			System.out.println(i);
			System.out.println("End the Loop");
			
			
		}
	}

}
