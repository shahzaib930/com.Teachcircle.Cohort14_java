package day21_Method;

public class TaskMethod_reverseString {

	public static void main(String[] args) {
		reverseString("Java");
        reverseString("Apple");
        reverseString("TechCircle");
    }

    public static void reverseString(String str) {
//        012
//        String str = "abc";
        String newStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
//System.out.println(str.charAt(i));
            newStr += str.charAt(i);
        }

        System.out.println(newStr);
    }

}
