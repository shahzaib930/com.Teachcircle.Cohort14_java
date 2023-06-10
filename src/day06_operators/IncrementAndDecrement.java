package day06_operators;

public class IncrementAndDecrement {

	public static void main(String[] args) {
	int num = 1;
	System.out.println(num++);
	//postfix > update the variable value in next line
	System.out.println(num);
	//prefix > update the variable value in thhe same line
	
	num--;
	System.out.println(num--);
	System.out.println(--num);
	}

}
