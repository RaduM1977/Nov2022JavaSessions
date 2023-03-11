package OOP_AbstractClasses;

public abstract class Page implements Web{
	
	//2 abstract methods and 2 not abstract classes 
	
	//0% abstraction : no abstract methods 
	//X% abstraction: partial abstraction
	//100% abstraction: all abstract methods 
	
	
	// can NOT create the Object of abstract class
	// but we can create the constructor of the abstract class
	// and it will be called when we create the object of child class
	
	public Page() {
		System.out.println("Page -- constr..");
		
	}
	
	public Page(int i) {
		System.out.println("Page -- constr.." + i);
		
	}
	
	public abstract void title();
	
	public abstract void url();
	
	public final void displayLogo() {
		System.out.println("Page -- logo");
	}
	
	public void pageLoadingTime() {
		System.out.println("Page loading time 10 secs");
	}
	
	//static method
	public static  void pageCycle() {
		System.out.println("Page Cycle");
	}
	
	
	@Override
	public void privacyPolicy() {
		System.out.println("Page -- privacy policy");
		
	}
	
	public final static void copyright() {
		System.out.println("Page -- copyright ");
	}
	
}
