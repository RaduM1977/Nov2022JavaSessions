package OOP_Constructor;

public class User {
	
	//class variables 
	String name;
	int age;
	String email;
	String password;
	String phone;

	
	// hidden constructor --> default const... will be added by JVM if not define by us
	
	
	public boolean forgotPass() {
		//business logic
		return true;
	}
	
	public User(String name , int age) { //local variables 
		
		this.name = name; // this is used for the class variables
		this.age = age;
	}

	public User(String name, int age, String email) { //local variables 
		
		this.name = name; // this is used for the class variables
		this.age = age;
		this.email = email;
		
	}
	
	// the role of the constructor is to construct the object
	
	
	public User(String name, int age, String email, String password) {
	
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
	}

	public User(String name, int age, String email, String password, String phone) {
		
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}

	
	
	
	
	public static void main(String[] args) {
		
		//User u1 = new User(); // default constructor
		User u1 = new User("Tom",25);
		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.email);//null
		
		
		
		User u2 = new User("Lisa",30,"lisa@gmail.com");
		System.out.println(u2.name);//Lisa
		System.out.println(u2.email); //lisa@gmail.com
		System.out.println(u2.password);//null
		
		
		//User u3 = new User(); we can not create an object with the default constructor 
		
		User u3 = new User("Nasha",25,"nisha@gmail","nisha@123","908567432");
		System.out.println(u3.name + " " + u3.phone);
		
	}

}
