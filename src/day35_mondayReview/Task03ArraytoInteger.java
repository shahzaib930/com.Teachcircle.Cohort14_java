package day35_mondayReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task03ArraytoInteger {

	public static void main(String[] args) {
	List <Integer>list= new ArrayList<>();
	Random random = new Random();
	for(int i = 0 ; i<10;i++) {
		list.add(random.nextInt(10));
	}
	System.out.println(list);
//	list.add(2);
//	list.addAll(Arrays.asList(3,5,7,3));
	int sum=0;
	for(Integer c : list) {
		sum+=c;
	}
System.out.println(sum);




////     












	}

}
