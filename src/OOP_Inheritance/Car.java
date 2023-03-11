package OOP_Inheritance;

public class Car extends Vehicle{
	
	//final:
	//1. final can be use for constant values 
	//2. final methods can NOT be overriding --> it is used to prevent overriding & Method hiding
	//3. final classes use to prevent inheritance  --> we can NOT have a child class of a final class 
	//4. overriding static method can not be possible only overloading, it is called method  is the calls in the parent and the child have the same name and they are 
			//both static --> if the static method is in the parent class it can be called with the name of the child as well!!
 

	public  void start() { 
		
		System.out.println("Car -- start");
	}
	
	
	public void stop() {
		System.out.println("Car -- stop");
	}
	
	public void refuel() {
		System.out.println("Car -- refuel");
	}
	
	
	public static void billing() {
		System.out.println("Car -- billing");
		} 
	
	//those 2 methods can not be overridden static and final
	public static final void dispaly() {
		System.out.println("Car -- display");
	}
	
	public final void running() {
		System.out.println("Car -- running");
	}
	
	
	
	
	public void payment(String cc,int cvv) {
		System.out.println("car payment using : "+ cc + ":" + cvv);
	}
	
	public void payment (String upi) {
		
		System.out.println("Car payment using : " + upi);
	}
	
	@Override
	public void engine() {
		System.out.println("Car -- engine");
	}
	
//	public void autoParking() {
//		System.out.println("Car -- Auto parking");
//	}
	
	
	
	
	
}
