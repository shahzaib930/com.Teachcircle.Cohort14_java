package day13_String;

public class StringMethodConcat {

	public static void main(String[] args) {
		String word1 = "re",word2="think", word3 ="ing";
		int num = 1;
		String result = word1 + word2;
		result += word3;
		System.out.println(result);
		
		System.out.println("-----");
		
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
		
		System.out.println("-----");
		
		//concat use as plus(+)
		//we can use only with string....
		
		
		String result2 = word1.concat(word2).concat(word3);
		System.out.println(result2);
		
		
		
	}

}
