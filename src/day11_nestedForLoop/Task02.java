package day11_nestedForLoop;

public class Task02 {

	public static void main(String[] args) {
		
		 for (int row  = 1 ; row <= 5 ; row++) {
	            for (int column = 1 ; column <= 5 ; column++) {
	                if (row == column) {
	                    System.out.print("* ");
	                }else {
	                    System.out.print(column +" ");
	                }
	                
	            }
	            System.out.println();
	        }
		}
		
		
		
		

	}


