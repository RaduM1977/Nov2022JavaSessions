package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start(); //BMW -- start(overriding) -->the method from BMW will be called 
		b.stop();// Car -- stop --> inherited  from Car class
		b.refuel(); //Car -- refuel --> inherited from Car class
		b.autoParking(); //BMW -- Auto parking --> individual method from BMW class
	
		//calling static methods 
		BMW.billing(); // BMW -- billing --> if not method billing() in the child the billing method will be called 
		Car.billing(); // Car -- billing
		
		//both static and final methods can be inherited but not overridden 
		BMW.dispaly(); //Car -- display
		b.running(); //Car -- running
		
		b.payment("naveen@okicici");//BMW payment using : naveen@okicici
		
		//multilevel inheritance:
		
		b.engine();//Car -- engine(if the method is overridden in the Car class but not in the grand child)
					// BMW -- engine if this method was overridden in the grand-child class BMW
				// vehicle -- engine if the method is not overridden in the children of grand-children it will be inherited by both the child and the grand-child 
		
		System.out.println("------Audi-------");
		
		Audi au = new Audi();
		au.theftSafety();
		au.start();
		au.engine();
		
		
		System.out.println("------ Car -------");
		
		Car c = new Car();
		c.start(); // Car -- start
		c.stop(); // Car -- stop
		c.refuel(); // Car -- refuel
		// we can NOT call --> c.autoParking(); //BMW -- Auto parking because this is a method of BMW and not Car and the Car object does NOT inherit the features of a child 
		
		c.payment("naveen@hdfc");//Car payment using : naveen@hdfc
		
		System.out.println("----- Car to BMW --------");
		
		//child class object can be referred by parent class ref variable
		//Top/Up Casting:
		
		Car c1 = new BMW(); //every BMW is a Car 
		c1.start(); //BMW -- start --> because the object created is a BMW object
		c1.stop();  //Car -- stop
		c1.refuel(); // Car -- refuel
		c1.petrolEngine();//vehicle -- petrol running
		//reference type check
		//we can NOT call the autoParking() because it is not related with car --> reference type check
		
		BMW.billing();//BMW -- billing
		
		System.out.println("------ Vehicle to BMW -------");
		//child class object can be referred by grandparent ref variable
		//Top/Up Casting
		
		Vehicle v = new BMW(); // we can take only the overridden and the method in the grandparent 
		//v object will have all the methods of the Vehicle but not from Car,BMW class or overridden  
		v.petrolEngine();//vehicle -- petrol running
		v.engine();//it will go to the lowest level of the method which is in the Car class 
		//Car -- engine
	
		
		//down casting:
		// parent class object can be referred by child class ref variable 
		
		
		//you can NOT put a small box in a big box -->it will be a Runtime error
		//BMW b1 = (BMW) new Car(); //ClassCastException at runtime
		
		//BMW b2 = (BMW) new Vehicle(); //ClassCastException at runtime
		
		/*
		 * HOMEWork create class Automobile ,Engineering,Physics,Science
		 */
	}

}
