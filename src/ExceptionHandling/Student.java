package ExceptionHandling;

//Interview question:

public class Student {

	public static int getMarks(String name) {
		System.out.println("getting marks for:" + name);
		
		if(name.equals("Rashmi")){
			try {
			int i =9/0;
			} catch(ArithmeticException e) {
				System.out.println("AE is coming.....");
				return 85;
			}
			//with the finally block it will return 70 because the finally has to be executed in a try - catch - finally block!!!
			//Preference will be given to the finally block in front of the catch block if we have an exception 
			finally {
				System.out.println("print mark sheet");
				//return 70;
			}
			return 90;
		}
		
		else if(name.equals("Tom")){
			return 95;
		}
		
		else if(name.equals("Ravi")){
			return 70;
		}
		
		else {
			System.out.println("student not found ...");
			return -1;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		int m1 = getMarks("Rashmi");
		System.out.println(m1);
		System.out.println("bye");
		
		
		
	}
}
