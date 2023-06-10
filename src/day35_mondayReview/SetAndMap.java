package day35_mondayReview;

import java.util.*; //=> dont need to import anything cause of( * ) 


public class SetAndMap {

	public static void main(String[] args) {
		
		List<Integer>list = new ArrayList();
		Set<Integer>set = new HashSet();
		//Map<String,Integer>map= new HashMap();
		
		list.add(1);
		list.addAll(Arrays.asList(2,3,4,5,6,7));
System.out.println(list.size());

//         NOTE ABOUT SET IMPOTEANT     //
//    set hold duplicate => count 1 time

set.add(1);
set.addAll(Arrays.asList(2,3,5,5,6,2));
System.out.println(set.size());


System.out.println(list);
System.out.println(set);



for(int i = 0 ; i <list.size();i++) {
	System.out.println(list.get(i)); // access every element
}
// by for each loop            // same
for(Integer c : list) {
	System.out.println(c);// access every element
}


System.out.println("-------set---------");

   /// Set
Iterator<Integer>i = set.iterator();

System.out.println(i.next());// number
System.out.println(i.next());//next number one by one
System.out.println(i.hasNext());// true false
System.out.println(i.next());

for(Integer n : set) {
	System.out.println(n);// print whole set
}


System.out.println("-------Map---------");

Map<String,Integer>map= new HashMap();

map.put("Shah", 5);
map.put("Szaib", 7);
map.put("haha", 6);
map.put("okkkkkk", 2);

for(Map.Entry<String,Integer> m : map.entrySet()) {
	System.out.println(m.getKey()+" _ "+m.getValue());
}

System.out.println( "------linkedhasMap_------");



Map<String, Integer> map2 = new LinkedHashMap<>();

	map2.put("Ali", 100);
	map2.put("Mike", 101);
	map2.put("Sarah", 102);
	map2.put("Alex", 103);
	map2.put("John", 203);



	for (Map.Entry<String, Integer> m : map2.entrySet()) {
		System.out.println(m.getKey() +" _ "+m.getValue());
	}


	}

}
