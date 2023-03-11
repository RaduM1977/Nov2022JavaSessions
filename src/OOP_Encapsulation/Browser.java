package OOP_Encapsulation;

public class Browser {

	
	public void launchBrowser() {
		System.out.println("trying to launch browser");
		checkRAM();
		checkVersion() ;
		checkOS();
		checkBrowserServices();
		System.out.println("chrome is launched .....");
	}
	
	private void checkRAM() {
		System.out.println("check RAM");
	}
	
	private void checkVersion() {
		System.out.println("check Version");
	}
	
	private void checkOS() {
		System.out.println("check checkOS");
	}
	
	private void checkBrowserServices() {
		System.out.println("check checkBrowserServices");
	}
	
	
}
