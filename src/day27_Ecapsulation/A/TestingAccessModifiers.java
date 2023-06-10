package day27_Ecapsulation.A;

public class TestingAccessModifiers {

	public static void main(String[] args) {
//	1: 
		AccessModofiers am = new AccessModofiers();
		//Default:
		//visible in same package
		//accessing default access modifier
		am.name = "TechCircle";
		am.methodA();
		
//  2:    		
		//Private member : Only available within  same class
		//                     Not available 
		// am.age = 10;

//  3:		
		//protected :
		//visible only in package and subclass
		am.phoneNumber = "1251433";
		am.methodC();
//  4: 
		// Public
		
		
		
		
		
	}

}
