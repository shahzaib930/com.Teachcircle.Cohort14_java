package day24_Review;

public class Task03_duplicate {

	public static void main(String[] args) {
		String str = "abccfkag";
		System.out.println(removedDuplicateletter(str));
	//String str = "abcchkla";
	}
	public static String removedDuplicateletter(String str) {
String output = "";

for(int i = 0 ; i <str.length();i++) {
	char letter = str.charAt(i);
	if(!output.contains(Character.toString(letter))) {
		output +=letter;
	}
}
return output;

	}

}
