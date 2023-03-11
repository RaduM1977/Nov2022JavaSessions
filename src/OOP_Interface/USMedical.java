package OOP_Interface;

public interface USMedical extends WHO,USHG{
	
	//variables : are static and final by default 
	static final int min_fee = 10;
	// or
	int fee = 100;
	
	// in Interface:
	// can NOT have the method body --> they are called abstract method 
	// only method declaration - no business logic
	// only method prototype/abstract methods 
	// in interface we can NOT create the Object 
	// NO encapsulation in Interface
	
	// can NOT create the object of interface 
	// can NOT have constructors in interface
	// can NOT have final methods
	
	//abstract methods: final and static method can not be overridden 
	// final - N/A
	// static - N/A 
	// private - N/A
	
	//Abstraction -- is hiding the implementation of the methods 
	//up to JDK 1.7: Interface is 100% abstraction 
	//JDK 1.8 " default non static method : ~100%
	//0% abstraction --> if no abstract methods are added 
	
	public void cardioServices();
	
	public void neuroServices();
	
	public void physioServices();
	
	public void emergencyServices();
	
	//main() ???
	
	//After JDK 1.8 we can have static methods in the interface with a body 
	
	//1. static method with method body:
	//we can not have final methods in an Interface 
	public static void taxCalculation() {
		System.out.println("US - taxCalculation");
	}
	
	//2.default methods: not static: use default keyword 
	
	default void getMedicalServices() {
		System.out.println("Us - getMedicalServices");
	}
	
	//Homework --> video 18 -->1:17
	
}
