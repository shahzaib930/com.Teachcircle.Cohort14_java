package day19_array;

public class ArraySize {

	public static void main(String[] args) {
int arr[] = {10,11,21,31,41,51}; // 6
        
        System.out.println(arr.length);
        
        String str = "Java";
        System.out.println(str.length());
        
        String strArr[] = new String[10];
        
        
        
        System.out.println(strArr.length);
        
        
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(i); // index position for the array
            System.out.println(arr[i]); // each element of the array
        }	

	}

}
