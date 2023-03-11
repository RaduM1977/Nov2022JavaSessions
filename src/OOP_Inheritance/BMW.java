package OOP_Inheritance;

public class BMW extends Car { // BMW is the child/subclass of Car

	
	//Method overriding: PolyMorphism --> runtime / Dynamic polyMorphism
	// when we have a method in parent class and the same method in child class:
	// with the same method name
	// with the same number of parameters 
	// with the same sequence of parameters 
	
	//with the same return type
	
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}
	
	//@Override --> this is how we check if the method is overridden 
	public void autoParking() {
		System.out.println("BMW -- Auto parking");
	}
	
	
	
	//Method hiding --> if both parent and child have a static method with the same name 
	public static void billing() {
	System.out.println("BMW -- billing");
	} 
	
	//we can Not overriding a final and static method 
//	public static final void display() {
//		System.out.println("Car -- display");
//	}

	// we can NOT override(have) a final methods in the child class
//	public final void running() {
//		System.out.println("Car -- running");
//	}
	
	@Override
	public void payment(String cc,int cvv) {
		System.out.println("BMW payment using : "+ cc + ":" + cvv);
	}
	
	@Override 
	public void payment (String upi) {
		
		System.out.println("BMW payment using : " + upi);
		
	}
	
//	@Override
//	public void engine() {
//		System.out.println("BMW -- engine");
//	}
	
}
