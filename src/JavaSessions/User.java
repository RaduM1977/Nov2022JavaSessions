package JavaSessions;

public class User {
	
	String name;
	int age;
	String city;
	

	public static void main(String[] args) {
		
		User u1 = new User();
		u1.name= "Ravi";
		u1.age = 25;
		u1.city = "Prune";
		
		User u2 = new User();
		u2.name= "Anjali";
		u2.age = 27;
		u2.city = "LA";
		
		User u3 = new User();
		u3.name= "Kareem";
		u3.age = 30;
		u3.city = "NY";
		
		User u4 = new User();
		u4.name = "Rajeev";
		u4.age = 35;
		u4.city = "San Francisco";

		// one object can have multiple references --> it can be interchanged 
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);//Ravi 25 Prune
		System.out.println(u2.name + " " + u2.age + " " + u2.city);//Anjali 27 LA
		System.out.println(u3.name + " " + u3.age + " " + u3.city);//Kareem 30 NY
		System.out.println(u4.name + " " + u4.age + " " + u4.city);//Rajeev 35 San Francisco
		System.out.println();
		
		u1 = u2;
		u2.name = "Naveen";//both u1 and u2 will have same name because they are pointing to the same object 
		//u1.name = "Naveen"; // both u1 and u2 will have the same name because they are pointing to the same object 
		System.out.println(u1.name + " " + u1.age + " " + u1.city);//Naveen 27 LA
		System.out.println(u2.name + " " + u2.age + " " + u2.city);//Naveen 27 LA
		System.out.println(u3.name + " " + u3.age + " " + u3.city);//Kareem 30 NY
		System.out.println(u4.name + " " + u4.age + " " + u4.city);//Rajeev 35 San Francisco
		System.out.println();
		
		u2 = u3;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);//Anjali 27 LA
		System.out.println(u2.name + " " + u2.age + " " + u2.city);//Kareem 30 NY
		System.out.println(u3.name + " " + u3.age + " " + u3.city);//Kareem 30 NY
		System.out.println(u4.name + " " + u4.age + " " + u4.city);//Rajeev 35 San Francisco
		System.out.println();
		
		u3 = u4;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);//Anjali 27 LA
		System.out.println(u2.name + " " + u2.age + " " + u2.city);//Kareem 30 NY
		System.out.println(u3.name + " " + u3.age + " " + u3.city);//Rajeev 35 San Francisco
		System.out.println(u4.name + " " + u4.age + " " + u4.city);//Rajeev 35 San Francisco
		System.out.println();
		
		u4 = u1;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);//Anjali 27 LA
		System.out.println(u2.name + " " + u2.age + " " + u2.city);//Kareem 30 NY
		System.out.println(u3.name + " " + u3.age + " " + u3.city);//Rajeev 35 San Francisco
		System.out.println(u4.name + " " + u4.age + " " + u4.city);//Anjali 27 LA
		System.out.println();
		
		u1 = u2 = u3; // it will go form right to left for assignment 
						// arithmetic operation goes from left to right 
		int n = 555;
		//int n1 = _5_5_5; the underscore at the beginning will not work
		int n1 = 5_5_5;
		System.out.println(n + " "+ n1);//555 555
		
		
		
	}

	
	
	
	
	
}
