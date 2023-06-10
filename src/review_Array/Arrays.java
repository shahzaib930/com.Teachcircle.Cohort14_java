package review_Array;

public class Arrays {

	public static void main(String[] args) {
		
int a[]= {100,28,501,40,-10,30};
int max = 0;
	
	for(int i =0 ;i<a.length;i++) {
		
		if (a[i]>max) {
			max=a[i];
		}
	}
	System.out.println(max);
	System.out.println(a.length);	
	//System.out.println(Arrays.sort(a));	
	//System.out.println(Arrays.toString(a));
	System.out.println(a[a.length-2]); //to take a number between

	
	
	//        TAsk
	
	
	
//	String[]fruits= {"banaana","orange","apple","grape"};
//    
//    Arrays.sort[fruits];
//    
//    System.out.println(Arrays.toString(fruits));
//	
	}

}
