package ExceptionHandling;

public class FinallyBlock {
	 // finally block always use with try block --> we can have catch too
	
	// we can use try with finally block but not point because we are not handling the exception
	// try should have a catch or finally block or both types of blocks 
	// we can write multiple catch blocks with try 
	public static void main(String[] args) {
		System.out.println("hi");
		
		try {
			int i = 9/0;
		}
		
		catch(ArithmeticException e) {
			System.out.println("AE is coming ...");
			e.printStackTrace();
		}
		
		// it will be always executed
		finally {
			System.out.println("finally block .......");
		}
		
		System.out.println("bye");
		
	/*	
		
		connect with DB - Oracle
		user name ,pwd,server ip: port
		hit the SQL
		try{
		get the result form DB --- FAIL -- exception
		}
		catch(){log}
		
		finally(){
		 disconnect with DB
		}	
		
			
	*/
		
		System.out.println("continuee shoppings");
		//logout

	}

}
