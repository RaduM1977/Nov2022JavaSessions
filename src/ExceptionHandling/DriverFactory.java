package ExceptionHandling;

public class DriverFactory {

	public static void main(String[] args) {
	
		
		//String browser = "chrome";
		String browser = null;
		
		if(browser == null) {
			
			// if we want to handle our own exception we use the keyword throw
			try {
			throw new Exception("browser not found");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("browser is launched");
		}

		
	}

}
