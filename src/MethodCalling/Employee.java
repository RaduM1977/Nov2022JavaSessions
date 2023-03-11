package MethodCalling;

public class Employee {
	
	String name;
	int age;
	
	
	public  int add(int a , int b) {
		
		System.out.println("sum of two numbers");
		int sum = a + b;
		return sum;
	}
	
	public void getInfo(Employee emp) {
		emp.name = "Amrita";
		emp.age = 25;
		System.out.println(emp.name + " " + emp.age);
		
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		//e1.add(10,20); //call by value -->  call the method by passing the value
		
		//System.out.println(e1.name + " " + e1.age);//null 0
		
		e1.name = "Garav";
		e1.age = 30;
		
		e1.getInfo(e1); //call the method by passing the reference --> call by reference 
		
		System.out.println(e1.name + " " + e1.age);//Amrita 25
		
		
		//ex: in Selenium we call zig- zag pattern --> driver 
	}

}
