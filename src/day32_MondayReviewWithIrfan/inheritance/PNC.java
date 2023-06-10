package day32_MondayReviewWithIrfan.inheritance;

import day32_MondayReviewWithIrfan.encapsulation.Bank;
    // subclass always extends superClass.//
public class PNC extends Bank{
//  java inheritance (Subclass and super Class)//
	
	
    
/*Inheritance pt.2:
     * You can also directly set up a value for a variable from the super class
     * in the Constructor using super keyword:
     * public CapitalOne(String bankAccNum, String Name, String location){
     *     super(bankAccNum, Name, "123 Main St")
     *                     }
     */
	
	
	
 final String name="PNC";
 final String interestRate="0.065%";
	public PNC() {
		// super represent super class variables
		super.setLocation("woodbridge");
	}
	@Override
	public String toString() {                                         //adding from SuperClass
		return "PNC [name=" + name + ", interestRate=" + interestRate +super.toString()+ "]";
	}

	//@Override
//	public String toString() {
//		return "[ PNC " + "]";
//	}
//	
	
	
	
}
