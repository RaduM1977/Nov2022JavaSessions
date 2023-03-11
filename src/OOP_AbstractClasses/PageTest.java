package OOP_AbstractClasses;

public class PageTest {

	public static void main(String[] args) {
		
		 // java will ALWAYS call the default parent contractor all the time and then the child constructor 
		//if we do not add the default constructor JVM will add it if we do NOt have a constructor in that class
		//HOMEWORK grad-parent constructor 
		LoginPage lp = new LoginPage(10); // java will call the default parent contractor all the time and then the child constructor 
		
		lp.title();//LP - title
		lp.url();
		lp.displayLogo();
		lp.pageLoadingTime();
		lp.resetPwd();
		
		Page.pageCycle();//pageCycle() from Page class
		LoginPage.pageCycle();//pageCycle() from LoginPage class
		
		System.out.println("----- calling the static method with the obj ---------");
		lp.pageCycle();//Login Page Cycle, but with the warning because it should be called with the class name!!
		
		lp.privacyPolicy();//LP -- privacy policy
		
		//static final method can be called with the parent or child class
		Page.copyright();//Page -- copyright 
		LoginPage.copyright();//Page -- copyright 
		
		//Page pg = new LoginPage; --> can NOT create an object of an abstract class
		
		System.out.println("---- Top casting: ---------");
		//top casting:
		//Child class object can be referred by abstract parent class ref variable:
		Page pg = new LoginPage();
		pg.title();
		pg.url();//LP - url
		pg.displayLogo();
		pg.pageLoadingTime();//Login Page loading time 5 secs
		
		//pg.resetPwd(); --> we can Not call the method from the LoginPage class
		
		pg.privacyPolicy();//LP -- privacy policy -- it will call the method overridden in the child class
		
		pg.pageCycle();//Page Cycle
		
		Page.copyright();//Page -- copyright 
		LoginPage.copyright();//Page -- copyright 
		
		//down casting ?? - N/A
		
		// when we use abstract classes vs Interfaces
		// Abstract classes we use when parent class will have some implementation also(some regular methods)
		// Interfaces has no implementation -- we use it when we need to set up global rules which will be implemented in the classes
		
	}

}
