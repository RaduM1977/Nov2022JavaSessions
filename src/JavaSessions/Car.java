package JavaSessions;

public class Car {
	
	
	
	String name;
	int price;
	String color;
	
	// static use for common property VALUE
	static final int wheels = 4;
	static int steering;
	
	// we use static --> when we have a common property value 
	//the static is created in CMA (Common Memory Allocation)  - permanent generation -> MetaSpace
	
	// obj are created in the Heap memory and the references are created in the Stack
	
	
	
	public void start() {
		System.out.println("Car -- start");
	}
	
	public static void speedTest() {
		System.out.println("Car -- speed test");
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		// static int i = 10;-> static can NOT be used for the local variables 

		
		final int i;
		final int days = 7;
		//days = 10;
		System.out.println(days * 100);
		
		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 90;
		c1.color = "Red";
		
		
		Car c2 = new Car();
		c2.name = "Audi";
		c2.price = 80;
		c2.color = "White";
	
		
		Car c3 = new Car();
		c3.name = "Honda";
		c3.price = 20;
		c3.color = "Black";
	

		//How to access/assign/define static variable -->  no need to use the object 
		
		// 1. direct calling: -> if in the same class 
		System.out.println(wheels);//4
		System.out.println(c1.name + " " + c1.price + " " + c1.color + " " + wheels);
		
		// 2. by using class name:
		System.out.println(Car.wheels);//4 --> static variables --> in the same class or different class
		System.out.println(c1.name + " " + c1.price + " " + c1.color + " " + Car.wheels);
		
		
		
		//How to call static method :    no need to use the object 
		
		// 1. Direct calling: --> if in the same class
		speedTest();
		c1.start();
		
		// 2. By using the class name: --> in the same class or a different class
		Car.speedTest();
		
		//static methods/functions/variables can be accessed by obj reference name with a warning 
		c1.speedTest();
		System.out.println(c1.wheels);
		
		//Car.wheels = 5; --> can not be changed because this variable has a final value (final)
		
		Car.steering = 1;
		System.out.println(Car.steering);
		
	
		
		
	}

}
