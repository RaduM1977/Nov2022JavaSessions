package OOP_AbstractClasses;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("LP -- constr ...");
	}
	
	public LoginPage(int i ) {
		System.out.println("LP -- constr ..." + i);
	}
	
	@Override
	public void title() {
		System.out.println("LP - title");
	}

	@Override
	public void url() {
		System.out.println("LP - url");
	}

	//individual method:
	public void resetPwd() {
		System.out.println("LP - reset PWD");
		}
	
	@Override 
	public void pageLoadingTime() {
		System.out.println("Login Page loading time 5 secs");
	}
	
	//@Override --> can NOT override static methods 
	//method hiding
	public static  void pageCycle() {
		System.out.println("Login Page Cycle");
	}

	@Override
	public void privacyPolicy() {
		System.out.println("LP -- privacy policy");
		
	}
	
	
}
