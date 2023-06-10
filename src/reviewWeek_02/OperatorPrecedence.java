package reviewWeek_02;

public class OperatorPrecedence {

	public static void main(String[] args) {
		int result = 1*2+3/1;
		//BODMAS rule
		//if they have the same priority always go left to right
		System.out.println(result);

		
		//interviewer Question
		int result2 = 1/2*3+4;
		System.out.println(result2);
//(for int)less number divide by large bigger number=0
		
		double result3 = 1/2*3+4;
		System.out.println(result3);

	}

}
