package JavaSessions;

public class Testing {

	
	//WAF 
	//pass the student name(String)
	//return the student marks
	
	public int getStudentMarks(String studentName) {
		System.out.println("getting marks for student : " + studentName);
		
		int marks = -1;
		
		if(studentName.equals("Ravi")) {
			//return 100;
			marks = 100;
		}
		
		else if(studentName.equals("Rashmi")) {
			//return 90;
			marks = 90;
		}
		
		else if(studentName.equals("Naveen")) {
			//return 10;
			marks = 10;
		}
		
		else {
			System.out.println("student is not found..." + studentName);
			//return -1;
		}
		
		return marks;
	}
	
	
	//WAF
	// launch the browser: FF/ch/SF/IE
	// create a function :
	// name: launchBrowser(browserName -- String)
		//logic
	//return: true/false: Boolean
	
	public boolean launchBrowser(String browserName) {
		System.out.println("launching the browser : " + browserName);
		boolean flag = true;
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("chrome is launched....");
			//flag = true;
			break;
		case "firefox":
			System.out.println("firefox is launched....");
			//flag = true;
			break;
			
		case "safari":
			System.out.println("safari is launched....");
			//flag = true;
			break;
			
		case "ie":
			System.out.println("ie is launched....");
			//flag = true;
			break;
				
			
		default:
			System.out.println("browser is not found...");
			flag = false; //we can use this way 
			break;
		}
		return flag;
		
		/*
		 homework the same function with if-else
		 */
	}
	
//	public boolean launchBrowserIfElse() {
//		
//	}
	
	public static void main(String[] args) {
	
		Testing obj = new Testing();
		int m1 = obj.getStudentMarks("Tom");
		System.out.println(m1);
		
		//launch the browser function
		if(obj.launchBrowser("  Chrome    ")) {
			System.out.println("launch the url");
		}
		else {
			System.out.println("no need to enter url");
		}
		
		
		
		
	}

}
