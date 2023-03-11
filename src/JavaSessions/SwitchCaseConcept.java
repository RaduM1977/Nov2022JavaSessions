package JavaSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		
		String browser = "chrome";
		
		//control+space to generate the switch 
		switch (browser) {
		case "chrome":
			System.out.println("chrome is launched");
			break; // without the break it will not stop the case 
		case "firefox":
			System.out.println("firefox is launched");
			break;
		case "safari":
			System.out.println("safari is launched");
			break;
		case "edge":
			System.out.println("edge is launched");
			break;
			
		default:
			System.out.println("invalid browser... please pass the right browser");
			break;
		}
		
		// switch can NOT take boolean,float,double,long, but it can be use with int(also lower then integer like byte and short), String and char
		int marks = 100;
		switch (marks) {
		case 90:
			System.out.println("grade A");
			break;
		case 80:
			System.out.println("grade B");
			break;
		case 70:
			System.out.println("grade C");
			break;

		default:
			System.out.println("FAIL");
			break;
		}
		//char in the switch
		
		char ch = 'o';
		switch (ch) {
		case 'a':
			System.out.println("vowel");
			break;
		case 'e':
			System.out.println("vowel");
			break;
		case 'i':
			System.out.println("vowel");
			break;
		case 'o':
			System.out.println("vowel");
			break;
		case 'u':
			System.out.println("vowel");
			break;

		default:
			System.out.println("not a vowel");
			break;
		}
		
		//real time of switch case use cases:
				//1. cross browser logic
				//2. ecomm - multiple countries - language
				//3. multi environment: DEV, QA, STAGE, UAT, PROD
				//4. API methods: GET, POST, PUT, DELETE
				//5. DropDown: Single, Multiple, All
				//6. Payment Methods: CC, UPI, PAYPAL, Xoom, WU, BANK video 1:15

	}

}
