package day15_Task;

public class Task01SameTask {

	public static void main(String[] args) {
		 String email = "atestexample.c@om";
	        System.out.println(email.indexOf('@'));
	        // The email string must contain an '@' character. 
	        boolean containAt = (email.indexOf('@') > -1) ? true : false;
	        System.out.println(containAt);
//	        if (email.contains("@")) {
//	            containAt = true;
//	        }
//	        
//	        
//	        if (email.indexOf('@') > -1) {
//	            containAt = true;
//	        }
	        
	        // The email string must contain an '.' character. 
	        
	        boolean containDot = false;
	        
//	        if (email.contains(".")) {
//	            containDot = true;
//	        }
	        
	        if (email.indexOf('.')>-1) {
	            containDot = true;
	        }
	            
	        boolean hasLetterInFrontOfAt = false;
	        
	        if (email.indexOf('@') > 0) {
	            hasLetterInFrontOfAt = true;
	        }
	        
	        
	        System.out.println(containDot);
	        System.out.println(hasLetterInFrontOfAt);
	        
	        boolean atAndDotIsAropriatePlace = false;
	        
	        if (email.indexOf('.') > email.indexOf('@')) {
	            atAndDotIsAropriatePlace = true;
	        }
	        
	        
	        boolean isValidEmail =  containDot &&
	                                containAt && 
	                                hasLetterInFrontOfAt &&
	                                atAndDotIsAropriatePlace
	;
	        //System.out.println(email +" is valid "+isValidEmail);
	        
	        if (isValidEmail) {
	            System.out.println("Given email is valid email address");
	        }else {
	            System.out.println("Given email is not valid email address");
	        }
	        


	}

}
