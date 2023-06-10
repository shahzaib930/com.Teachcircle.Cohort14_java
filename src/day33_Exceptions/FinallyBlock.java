package day33_Exceptions;

public class FinallyBlock {

	public static void main(String[] args) {
	int a=7,b=0; // --> change B to 1 and see the different result without error
	
	try{int result = a/b;
			System.out.println(result);
			}catch(Exception e) {
				e.printStackTrace();
				//Finally always run at the End..
			}finally {
				System.out.println("Always Run no matter it has error or not.. ");
			}
System.out.println("program is completed");
	}

}
