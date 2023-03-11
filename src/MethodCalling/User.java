package MethodCalling;

public class User {
	String name;
	int age;
	String city;
	
	//use case of 'this' keyword : we can not call this in a static method 
	// 1. constructor
	// 2. methods --> encapsulation --> getter/setter
	// 3. builder pattern
	// 4. constructor is calling another constructor .. it should be the first statement --> u can not call more then 1 constructor 
	// 5. can be used in method to call another method in the same class
	
	

	public User(String name, int age, String city) {
		this(city); // we call the constructor with the city parameter 
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public User(String city) {
		this.city = "Paris";	
	}
	
	public User(String city,int age ) {
		this.city = "Paris";	
	}

	public void login() {
		this.logout();
		this.name = "Tom";
		
	}
	
	public void logout() {
		int x = 10; // no use for x since it is a local variables 
	}

	
	

	public static void main(String[] args) {
		
		User u1 = new User("Gaurav", 30,"Bangalore");
		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.city);

	}

}
