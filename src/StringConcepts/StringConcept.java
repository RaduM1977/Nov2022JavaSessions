package StringConcepts;

public class StringConcept {

	public static void main(String[] args) {
		
		//String Constant Pool(SCP) after JDK 1.7 is part of Heap
		//SCP - can NOT have duplicate values 
		
		//String literals in the pool
		String str = "Selenium";//it will create one object --> internally it crates a String array
		String str1 = "Selenium";//internally it crates a String array
		
		
		String str2 =  "selenium";//it will create a second object 
		
		
		String t1 = "Java";//it will create the third object
		
		System.out.println(str == str1);//true
		System.out.println(str.equals(str1));//true
		
		System.out.println("-----------");
		
		//String object with new keyword: in the heap memory
		
		String s1 = new String("testing");// it will create 2 objects, one in the constant pool and the second in the HEAP
		String s2 = new String("testing");// it will create one more object in the HEAP but in the SCP it will not create another object --> total 3 object created 
		String s3 = "testing";// no more object will be created --> total of 3 objects 
		String s4 = "testing";// no more object will be created --> total of 3 objects
		
		System.out.println(s3 == s4);//true
		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s2));//true
		
		System.out.println(s1 == s3);//false
		System.out.println(s3 == s4);//true
		System.out.println(s1.equals(s3));//true
		
		String s5 = "Testing";// 1 entry in SCP candidate for the gc 
		s5 = null;
		//System.out.println(s5.length());//NullPointerException --> no operation on a null object 
		
		
		// 
		String s6 = "Naveen";//create one object 
		s6 = "Aksha"; // create a second object, "Naveen" will  be destroy by the gc(garbage collector) since no reference to this object 
		System.out.println(s6);//Aksha
		
		
	}

}
