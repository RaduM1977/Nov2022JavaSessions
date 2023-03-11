package JavaSessions;

public class CoditionalOperators {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 20;
		
		//System.out.println(i==j);//false;
		
		if(i==j) {
			System.out.println("both are equal");
		}
		//the else is not mandatory 
		else {
			System.out.println("both are not equal");
		}
		
		if(j>=i) {
			System.out.println("j is gr than i");
		}
		else {
			System.out.println("i is gr than j");
		}
		
		//conditional operators 
		//> >= < <= == != (in Ruby or Python <>)
		
		int total =100;
		if(total != 100) {
			System.out.println("BYE");
		}
		else {
			System.out.println("HI");//HI
		}
		
		// Nested if 
		int marks = 100;
		if(marks <= 100) {
			System.out.println("valid marks");
			if(marks>=90) {
				System.out.println("A Grade");
					if(marks>=95) {
						System.out.println("eligible for scholarship");
							if(marks==100) {
								System.out.println("100% fee waived off");
							}
					}
			}
			else {
				if(marks<=80) {
					System.out.println("B Grade");
				}
			}
			
		}else {
			System.out.println("not a valid mark");
		}
		
		// if if if if if else
		
//		String browser = "ie";
//		if(browser.equals("chrome")){
//			System.out.println("chrome is launched");
//		}
//		
//		if(browser.equals("firefox")){
//			System.out.println("firefox is launched");
//		}
//		
//		if(browser.equals("safari")){
//			System.out.println("safari is launched");
//		}
//		
//		if(browser.equals("edge")){
//			System.out.println("edge is launched");
//		}
//		
//		else {
//			System.out.println("invalid browser");
//		}
		
		//if -elseif
		String browser = "ie";
		if(browser.equals("chrome")){
			System.out.println("chrome is launched");
		}
		else if(browser.equals("firefox")){
			System.out.println("firefox is launched");
		}
		else if(browser.equals("safari")){
			System.out.println("safari is launched");
		}
		else if(browser.equals("edge")){
			System.out.println("edge is launched");
		}
		else {
			System.out.println("invalid browser");
		}
		
		// optimize it will go faster the program than the non-optimized 
		
		
		
		
		
	}

}
