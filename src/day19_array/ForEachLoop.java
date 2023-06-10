package day19_array;

public class ForEachLoop {

	public static void main(String[] args) {
		//ForEachLoop can use only for collection
// syntax
		//for (dataType variable : nameofArray) {};
		
		String fruits[] = { "apple", "orange", "kiwis", "banana", "ananas", "tawuz" };
        // for loop
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        for (String s : fruits) {
            System.out.println(s);
        }

        int[] numbers = { 2, 3, 4, 5, 6 };

        for (int n : numbers) {

            if (n % 2 == 0) {
                System.out.println(n);
            }

        }
		
		
	}

}
