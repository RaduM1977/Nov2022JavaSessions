package ExceptionHandling;

public class ApplicationException extends RuntimeException{

	public ApplicationException(String mesg) {
		super(mesg);// super keyword is used to call the parent class constructor from the child class constructor
	}
	
	/*
	 ****** INTERVIEW QUESTIONS: *******
	How do you create your own exception?
		a. Create my own class which extends the RunTimeException 
		b. Create a constructor which will generate my message
		
		When we want to use the exception we use the throw keyword and we generate the a new object of our created class
	
	*/
	

}
