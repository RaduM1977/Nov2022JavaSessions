package JavaSessions;

public class Employee {

	//class : category of Objects, blueprint/template of objects
	//object: is the physical entity
	
	// class vars:
	String name;
	int age;
	String city;
	double salary;
	
	public static void main(String[] args) {
		
		// create the object of the class:
		//using new keyword
		
		Employee e1 = new Employee();
		// new Employee is the object of the type Employee
		//e1 --> object reference name of the object employee 
		//Employee --> is the class/template from where the object it is created 
		
		
		//assigning the values to the variables 
		e1.name ="Tom";
		e1.age = 25;
		e1.city = "LA";
		e1.salary = 12.33;
		
		System.out.println(e1.name + " "+ e1.age + " "+ e1.city + " "+ e1.salary);//Tom 25 LA 12.33
		
		//create a second object 
		Employee e2 = new Employee();
		
		System.out.println(e2.name);//null
		System.out.println(e2.age);//0
		System.out.println(e2.salary);//0.0
		
		
		//create a null object --> sometime in Selenium the driver pointing to null 
		
		Employee e3 = new Employee();
		e3 = null; // --> we created a null point reference object 
		//e3.name = "naveen";//NullPointerException (NPE)  -> the reference is pointing to null 
		System.out.println(e3);//null
		
		
		
		
		//objects without references - No ref object --> it create a new object for all the values assigned 
		new Employee().name = "Naveen";
		new Employee().age = 25;
		new Employee().salary = 12.33;
		new Employee().city = "Pune";
		//we created 4 objects 
		
		
		String name[] = new String[5];
		name[0] = "apex";
		name[1] = "apexon";
		name[2] = "apexon india";
		name[3] = "apexon chennai";
		name[3] = "apexon bangalore";
		
		for(String e : name) {
			System.out.println(e);
		}
		
		
		
	}

}
