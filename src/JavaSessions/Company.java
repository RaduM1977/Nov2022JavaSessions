package JavaSessions;

public class Company {
	
	//class vars:
	
	String name;
	int empCount;
	String hq;
	boolean status;

	public static void main(String[] args) {
		
		
	Company obj = new Company();//- new Company() --> is the object 
	//obj - is the object reference name 

	obj.name = "IBM";
	System.out.println(obj.name);//IBM
	System.out.println(obj.status);//false
	
	//reference variables are kept in the Stack memory
	//the objects are kept in the Heap memory
	//garbage collector (gc) will come and destroy the no reference objects and null objects in the heap memory
	//JVM is monitoring the memory 
	
	System.gc();
	
	}

}
