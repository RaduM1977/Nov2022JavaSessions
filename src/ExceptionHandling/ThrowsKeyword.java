package ExceptionHandling;

public class ThrowsKeyword {
	
	//we can NOT handle the exception with a throws keyword, it will only give it to another class the exception
	
	//public void m1() throws ArithmeticException{
	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	
	//public void m2() throws ArithmeticException{
	public void m2() {
		System.out.println("m2 method");
		
		// if we handle the exception with a try - catch block we do not need throws in the method anymore
		try {
		m3();
		//System.out.println("NAVEENNNNN"); the code after the exception will not be printed
		} catch(ArithmeticException e) { // catch block will help us with information about the exception 
			System.out.println("Ae is coming....");
			e.printStackTrace(); // the exception information 
		} finally {
			System.out.println("finally bye");
			try {
				int p = 9/0;
			} catch(ArithmeticException e){
				System.out.println("bye 2022");
				e.printStackTrace();
			}
		}
	}
	
	public void m3() throws ArithmeticException{
		System.out.println("m3 method");
		int a =10;
		int b =0;
		int c = a/b;
	}

	
	
	
	public static void main(String[] args) { //throws ArithmeticException{ --> it should not be handle in the main method 
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();
		System.out.println("bye");

	}

}
