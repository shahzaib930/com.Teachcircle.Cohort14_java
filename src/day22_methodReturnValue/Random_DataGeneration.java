package day22_methodReturnValue;

import java.util.Random;

public class Random_DataGeneration {

	public static void main(String[] args) {}
		public static String getRandomEmail() {
	        Random random = new Random();
	        String domains[] = {"Oracle","Amazon","Github","Walmart","Costco","techcircle"};
	        String userName = "john"+random.nextInt(10000000);
	        //System.out.println(userName);
	        String email = userName+"@"+getRandomValueFromAnArray(domains) +".com";
//	        System.out.println(email);
	        return email;
	        
	    }
	    
	
	    
	    public static String getRandomValueFromAnArray(String arr[]) {
	        Random random = new Random();
	        int index = random.nextInt(arr.length);
	        return arr[index];
	    }
	    
	
	    
	    
	    
	    public static String randomPhoneNumber () {
	        String phoneNumber = "";
	        Random random = new Random();
	        int num = random.nextInt(999);
	        //System.out.println(num);
	        int num2 = random.nextInt(999);
	        //System.out.println(num2);
	        int num3 = random.nextInt(9999);
	        //System.out.println(num3);
	        phoneNumber = ""+num + num2 + num3;
	        
	        //System.out.println(phoneNumber);
	        return phoneNumber;
	    

	}

}
