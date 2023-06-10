package day35_mondayReview;

import java.util.*;


public class HashSetMaxMin {

	public static void main(String[] args) {
		Set <Integer>set= new HashSet<>();
		Random random = new Random();
		for(int i = 0 ; i<10;i++) {
			set.add(random.nextInt(50));
		}
		System.out.println(set);
		
	
		int max=Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int c : set) {
			if(c>max) {
				max=c;
				
			} if(c<min) {
				min = c;
				
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
