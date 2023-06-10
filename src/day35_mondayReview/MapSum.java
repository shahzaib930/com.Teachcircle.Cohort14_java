package day35_mondayReview;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapSum {

	public static void main(String[] args) {
		Map<String,Integer>map=new HashMap<>();
	//	map.put("shah", 56);
		Random random = new Random();
		for(int i = 0 ; i<10;i++) {
			map.put("num"+i, random.nextInt(50));
		}
		System.out.println(map);
		int total =0;
		

 		for (Map.Entry<String, Integer> m : map.entrySet()) {
 			total += m.getValue();
 		}

 		System.out.println(total);

		
		
		
		

	}

}
