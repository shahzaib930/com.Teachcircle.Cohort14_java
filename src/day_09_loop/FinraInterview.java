package day_09_loop;

public class FinraInterview {
//interviewer QUESTION
	public static void main(String[] args) {
		int i = 1;
		//start
		do { if (i%3==0 && i%5==0) {
			System.out.println("finra");}
		 if (i%3==0) {
			System.out.println("fin");}
			if (i%5==0) {
			System.out.println("Ra");}
		else {System.out.println(i);
		}
		//end
		i++;
		}while (i<=100);
		
	}
	

}
