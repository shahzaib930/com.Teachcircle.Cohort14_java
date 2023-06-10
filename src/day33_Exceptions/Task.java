package day33_Exceptions;

public class Task {

	public static void main(String[] args) {
		Task t = new Task();
      try {
    	  
        t.methodA(3);
        }catch(ArithmeticException e) {
        	System.out.println("ArithmeticException");
        	e.printStackTrace();
        }catch(NullPointerException e) {
        	System.out.println("NullPointerException");
        	e.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println("array exception");
        	e.printStackTrace();
        }finally { System.out.println("Done");}
        
       
    }
    
    
    
    public void methodA (int num) {
        
        if (num == 1) {
            throw new ArithmeticException();
        }
        
        if (num == 2) {
            throw new NullPointerException();
        }
        
        if (num == 3) {
            throw new ArrayIndexOutOfBoundsException();
        }
        
    }
}
