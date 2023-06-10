package day27_Ecapsulation;

public class LoginTest {

	public static void main(String[] args) {
 LoginPage lg = new LoginPage();
 lg.setUserName("user1");
 lg.setPassword("sicbewi");
 
 System.out.println(lg.getUserName());
 System.out.println(lg.getPassword());
 
	}

}
