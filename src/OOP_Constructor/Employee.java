package OOP_Constructor;

public class Employee {
	
	//constructor it helps construct the object 
	//constructor .. is not a function but it looks like a function/method
	//constructor .. is having the same name as the class name
	//constructor .. can NOT return anything --> NO return type for constructor
	
	//constructor .. is helping to control the object creation 
	//constructor .. will be called when you create the object 
	
	//constructor .. overloading is possible in Java
	
	
	// default constructor  .. 0 parameters 
	public Employee() {
		System.out.println("default constructor .... ");
	}
	
	//overloading the constructor
	public Employee(int a) { // 1 parameter constructor 
		System.out.println("1 parameter constructor .... " + a);
	}
	
	public Employee(int a, int b) { // 2 parameter constructor 
		System.out.println("2 parameter constructor .... " + (a+b));
	}
	
	
	
	
	public static void main(String[] args) {
		
	Employee e1 = new Employee(); //default constructor .... 
	
	Employee e2 = new Employee(10); //1 parameter constructor .... 10
	
	Employee e3 = new Employee(10,20); //1 parameter constructor .... 10

	}

}
