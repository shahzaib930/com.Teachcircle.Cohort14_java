package day24_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class Marge2Array {

	public static void main(String[] args) {
		int num[]= {1,2,3,4};
		int num2[]= {5,6,7,8};
		
		int num3[] = new int[num.length + num2.length];
		int index = 0;
		
		for(int i : num) {
			num3[index] = i;
			index++;
		}
		for(int i : num2) {
			num3[index] = i;
			index++;
		}
		System.out.println(Arrays.toString(num3));
		
		System.out.println("-------");
		
		ArrayList<Integer>list = new ArrayList<>();
		
		for(int element : num) {
			list.add(element);
		}
		for(int element : num2) {
			list.add(element);
		}
		
		System.out.println(list);
		
		
	}

}
