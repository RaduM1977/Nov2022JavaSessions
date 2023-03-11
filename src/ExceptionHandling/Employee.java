package ExceptionHandling;

public class Employee {
	
	//Exception is the child of Throwable class
	//Error(less prone to come) is the child of Throwable class too and are related to the JVM like stack overflow exception 
	
	String name;

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		// Handling exception with try - catch
		try {
			Employee obj = new Employee();
			//obj = null;
			obj.name = "Naveen";//NullPointerException
			
			
			int i = 9/0;//AE- ArithmeticException
			System.out.println("Hello"); // this will not be printed because after the exception the execution will jump to the catch block
		
		}
		
		//with a try block we can have more catches depending on the amount of exceptions--> we can NOT have the same type of exception twice
		
		catch( NullPointerException e) {  // --> we can write the Exception class also if we do not know the the type of exception 
			// catch(Error e) {
			// catch(Throwable e) {
			// catch (Exception e ) { --> we can NOT use this general class with another catch block with a lower class
			// System.out.println("AE is coming....");
			
			// exception reporting 
			e.printStackTrace();
		}
		
		catch(ArithmeticException e) {
			// exception reporting 
			e.printStackTrace();
		}
		
		
		System.out.println("hello");
		System.out.println("Bye");
		
		
		
	}

}
