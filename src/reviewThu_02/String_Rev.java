package reviewThu_02;

public class String_Rev {

	public static void main(String[] args) {
		String str1 = "Wellcome to java class";
		
		System.out.println(str1.length());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		//indexOf
		String str2 = "Hello Everybody";
		System.out.println(str2.indexOf('e'));
		System.out.println(str2.indexOf(" "));
		System.out.println(str2.indexOf('e',5));
		
	}

}
