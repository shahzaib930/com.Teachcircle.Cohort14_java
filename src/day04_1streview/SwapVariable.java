package day04_1streview;

public class SwapVariable {

	public static void main(String[] args) {
	
		int x = 10; 
		int y = 20;
		System.out.println("x;");
		System.out.println(x);//20
		System.out.println(y);//10
		//after Swapping
		int temp = x;
		x = y;
		y = temp;
		System.out.println(x);
		System.out.println(y);
	}
}
