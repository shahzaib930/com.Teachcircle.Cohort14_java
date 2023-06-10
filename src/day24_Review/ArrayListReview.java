package day24_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListReview {

	public static void main(String[] args) {
	
		ArrayList<Character>list = new ArrayList<>();
	list.add('A');	
	list.add("hello".charAt(0));	
	list.addAll(Arrays.asList('a','b','@'));
	
	System.out.println(list);
	
	ArrayList<Character>lowerCase = new ArrayList<>();
	
	for(int i = 0 ; i<list.size();i++) {
		if(list.get(i)<='a' && list.get(i)>='z') {
			lowerCase.add(list.get(i));
		}
	}
	System.out.println(lowerCase);
	}

}
