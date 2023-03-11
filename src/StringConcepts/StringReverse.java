package StringConcepts;

import java.util.Calendar;

public class StringReverse {

	//write a function 
	//reverseString()
	//return: reverse of String
	
	public static String reverseString(String name) {
		
		//String name = "Selenium";//muineleS
		
		//null check 
		if(name == null) {
			System.out.println("null is not allowed ... please pass the right value");
			return null;
		}
		
		int len = name.length();//8
		
		//length check, if len =1
		if(len == 1) {
			return name;
		}
		
		String rev = "";
		for(int i = len-1; i>=0; i--) {
			
			rev = rev + name.charAt(i);//muineleS //N
			
			// we can use substring where we have more methods 
			// rev = rev + name.substring(i,i+1); 
			
		}
		//System.out.println(rev);
		return rev;
	}
	
	public static int reverseInt(int num) {
		
		String name = String.valueOf(num);
		
//		if(name == null) {
//			System.out.println("null is not allowed ... please pass the right value");
//			return null;
//		}
		
		int len = name.length();//8
		
		//length check, if len =1
		if(len == 1) {
			return Integer.parseInt(name);
		}
		
		String rev = "";
		for(int i = len-1; i>=0; i--) {
			
			rev = rev + name.charAt(i);//muineleS //N
			
			// we can use substring where we have more methods 
			// rev = rev + name.substring(i,i+1); 
			
		}
		if(rev.endsWith("-")) {
			rev = "-" + rev.replace("-","");
		}
		
		return Integer.parseInt(rev);
		
	} 

	
	public static void main(String[] args) {
		
		String r1 = reverseString("Selenium");
		System.out.println(r1);
		
		r1 = reverseString("10011");
		System.out.println(r1);
		
		r1 = reverseString("Selenium Automation");
		System.out.println(r1);
		
		r1 = reverseString("N");
		System.out.println(r1);
		
		r1 = reverseString(null);
		System.out.println(r1);
		
		r1 = reverseString("TT");
		System.out.println(r1);
		
		//HOMEWORK:
		//int reverse 
		//123  --> 321
		//456789 --> 987654
		
		int number = 123;
		int reverse =0;
		while(number != 0) {
			int remainder = number % 10; //123 % 10 = 3
			reverse = reverse * 10 + remainder ;
			number = number /10;
			System.out.println(reverse);
		}
		
		System.out.println("------------------");
		int i = reverseInt(123);
		System.out.println(i);
		i = reverseInt(-123);
		System.out.println(i);
		
		i = reverseInt(456789);
		System.out.println(i);
		
		
		
		//Calendar class
		
	}

}
