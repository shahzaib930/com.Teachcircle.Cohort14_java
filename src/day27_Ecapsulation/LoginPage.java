package day27_Ecapsulation;

public class LoginPage {
// private available into the same class
	private String userName;
	private String password;
	
	//getter read value
	public String getUserName() {
		return userName;
	}
	// setter update value
	public void setUserName(String userName1) {
		 userName= userName1;
	}
	
	public String getPassword() {
		return password;
		}
	
	public void setPassword(String password1) {
		password= password1;
	}
	
	//This represent class
	
	public void getInfo() {
		this.getPassword();
		this.getUserName();
	}
//	public LoginPage(String userName , String password) {
//		//this.use
//	}
	
	
}
