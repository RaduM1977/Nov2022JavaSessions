package OOP_Encapsulation;

public class Employee {
	
	public String name;
	public int age;
	private double salary;
	
	// encapsulate the data members by creating private data members by using public setters and getters methods internally 
	
	// public getter and setter:
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary; 
	}
	
	
	
}
