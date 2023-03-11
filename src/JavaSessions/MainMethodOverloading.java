package JavaSessions;

public class MainMethodOverloading {
	


	//JVM -- main PVSM - String[]
	//JVM is looking for this main method 
	
	public static void main(String[] a) { // args --> command line arguments (runtime arguments)
		System.out.println("Hello");
		//System.out.println(a[0]); // ArrayIndexOutOfBoundsException -> AIOB -> because we did not declare the array 
		
		MainMethodOverloading.main(20);
		MainMethodOverloading.main(20,30);
		Car.speedTest();
		
		
	}
	
	
	
	
	// we can overload a static method and the main method 
	public static void main(String a) { // JVM will NOT call this method 
		System.out.println("Hello"+ a );
		
	}
	
	
	public static void main(int i) { // JVM will NOT call this method 
		System.out.println(i);
		System.out.println("main 1 parameter ");
	}
	
	
	public static void main(int i, int j ) { // JVM will  NOT call this method 
		System.out.println(i +" "+ j);
		System.out.println("main 2 parameter ");
	}
	
	

}
