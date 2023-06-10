package day32_MondayReviewWithIrfan.inheritance;

import day32_MondayReviewWithIrfan.encapsulation.Bank;

public class AccountTest {

	public static void main(String[] args) {
		//Reference Type = 
		// you have access the date(method) from reference class...
		Bank pnc = new PNC();
		pnc.setAccountNumber("2576123");
	      pnc.deposit(300);
	      pnc.setUserName("zaib");
	      pnc.setPassword("dhisw");
		pnc.getBalance();
		
		
	}

}
