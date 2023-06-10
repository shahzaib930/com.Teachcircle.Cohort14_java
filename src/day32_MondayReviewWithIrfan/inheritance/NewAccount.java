package day32_MondayReviewWithIrfan.inheritance;

public class NewAccount {

	public static void main(String[] args) {
		PNC pnc = new PNC();
		// showing cause of the connection subClass(PNC) and SuperClass(Bank)
      pnc.setAccountNumber("2576123");
      pnc.deposit(300);
      pnc.setUserName("zaib");
      pnc.setPassword("dhisw");
      System.out.println(pnc.toString());
      
	}

}
