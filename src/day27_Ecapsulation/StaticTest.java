package day27_Ecapsulation;

public class StaticTest {

	public static void main(String[] args) {
	//static:
		//we call it directly
		//static always run first
		int value = StaticMember.maxPlayer;
	String value2 =	StaticMember.name;
	
		StaticMember.displayStaticMessage();//static method
		
		//non static:
		//need to create an object method
	
		StaticMember sm = new StaticMember();
		int value3 = sm.num;
		
		sm.displayMessage();//hello //dont need to use sysout...
		
		
		
		System.out.println(value);
		System.out.println(value2);
		System.out.println(value3);
		
		
	}

}
