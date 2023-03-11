package OOP_Constructor;

public class LoginPage {
	
	String userName;
	String password;
	
	// constructor
	public LoginPage(String userName, String password) {
		
		this.userName = userName;
		this.password = password;
		
	}
	
	//method for login
	public boolean doLogin() {
		System.out.println("enter the user name : " + userName);
		System.out.println("enter the password : " + password);
		System.out.println("click the login button " );
		System.out.println("user is login in" );
		return true;
	}
	
	
	//method to reset the password 
	public void resetPassword() {
		System.out.println("reset pwd : "+ password);
	}

}
