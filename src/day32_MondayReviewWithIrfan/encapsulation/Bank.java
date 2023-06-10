package day32_MondayReviewWithIrfan.encapsulation;

public class Bank {
     
	//final String bankName = "PNC";
	// if subclass have same method it called overriding
	// if subclass does not have same mothed ( will run from superclass)its called overloaded
	
	// polymorphism --> 
	
	
	private String accountNumber;
	
	// Getter --> reading acount number 
	public String getAccountNumber() {
		return accountNumber;
	}
    // setter --> setting value to account number variable.
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	//
	
	private String userName;
	private String password;
	private double balance;
    private String location;
    
              //Constructor//
    public Bank() {
    	//no args Constructor
    }
    public Bank(String accountNumber) {
    	//no args Constructor
    	setAccountNumber(accountNumber);//--> calling it directly 
    }
    
    
    
    
    
	public Bank(String accountNumber, String userName, String password, double balance, String location) {
		this.accountNumber = accountNumber;
		this.userName = userName;
		this.password = password;
		this.balance = balance;
		this.location = location;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void withDraw(double amount) {
		if( balance>=amount) {
			balance -= amount;
		}
		System.out.println(balance);
	}
	public void deposit(double amount) {
		
			balance += amount;
		
		System.out.println(balance);
	
	}
	@Override
	public String toString() {
		return "Bank [accountNumber=" + accountNumber + ", userName=" + userName + ", password=" + password
				+ ", balance=" + balance + ", location=" + location + "]";
	}
	
}
