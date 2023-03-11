package JavaSessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
	//array is a collection of similar elements --> continuous memory allocation 
	
		
		//Array: static array --> size is FIXED 
		//collection of elements with the same type		
		
		//limitation of an array:
		//	1. the size is fixed: to overcome this issue, we have to use dynamic array(ArrayList)
		//	2. only similar type of data can be stored: to overcome this issue, we can use Object static array
		
//		li = 0; --> lowest index
//		len = 4 --> length 
//		hi len -1 --> highest index
//		len = hi +1
		
		int i[] = new int [4];//Array is a NON primitive data type -->  integer memory size is  4 bytes x 4 (number of elements ) = 16 bytes 

		System.out.println(i.length);//4
		int len = i.length;
		int hi = len -1;
		int li = 0;
		
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		//i[4] = 50; //ArrayIndexOutOfBoundsException --> AIOB
		
		System.out.println(i[0]);//10
		System.out.println(i[3]);//40
		
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException-->AIOB
		
		//System.out.println(i[-1]);//ArrayIndexOutOfBoundsException -->AIOB
		
		
		System.out.println("-- print an array using a for loop --------");
		// to print all the values from array:
		
		//index based loop:
		for(int index = 0; index < i.length; index++) { // you can put index <= i.length-1
			System.out.println(i[index]);// 10 20 30 40
		}
		
		
		System.out.println("--------- print array w/out loop ----------");
		//to print all the array without loop:--> by using the Arrays class and toString() method 
		System.out.println(Arrays.toString(i));
		
		System.out.println("---------- for each loop-------------");
		//for each loop:
		for(int num : i) {
			System.out.println(num);
			if(num == 20) {
				System.out.println("bye!!");
				break;
			}
		}
		
		// the memory address of the array it will be printed without the loop of Arrays.toString
		System.out.println("----------");
		System.out.println(i);//[I@2c8d66b2
		
		System.out.println("---------- default values of an array ------");
		
		// default for int  is 0, char is nothing(blank), boolean is false, double is 0.0, String is null
		int p[] = new int [4];
		p[2] = 30;
		System.out.println(p[0]);
		System.out.println(p[2]);
		System.out.println(p[3]);
		
		
		//2.double array:
		double d[] = new double[4];
		d[0] = 12.33;
		d[1] = 23.44;
		d[2] = 34.55;
		d[3] = 45.66;
		
 		System.out.println(d[0]+d[1]);//35.77 --> mathematical operations 
 		System.out.println(Arrays.toString(d));//[12.33, 23.44, 34.55, 45.66]
		
		for(double e: d) {
			System.out.println(e);
		}
		
		//3.Char array:
		char ch[] = new char [4];
		ch[0] = 'a';
		ch[1] = '1';
		ch[2] = '$';
		ch[3] = 'd';
		
		System.out.println(ch.length);//4
		System.out.println(ch.length-1);//3
		System.out.println("li = "+ 0);
		
		System.out.println("-------------");
		for(char e : ch) {
			System.out.println((int)e +" : " +e);
		}
		
		
		//4.String array:
		String lang[] = new String[4];
		lang[0] = "Java";
		lang[1] = "Python";
		lang[2] = "JavaScript";
		lang[3] = "DotNet"; 
		
		System.out.println(lang.length);//4
		
		for(String e : lang) {
			System.out.println(e);
			if(e.equals("Java")) { // if you apply any method on a null Object you will get --> NullPointerException (no element can be null) 
				System.out.println("I love Java");
			}
			if(e.equals("JavScript")) {
				System.out.println("I hate JS");
			}
		}
		
		System.out.println("-----------");
		
		
		//Object Array:
		//Object is a class in Java--> is a super class of all the classes in Java
		
		//Emp Info: Name(String), age(int), salary(double), gender(char), isPermanent(boolean): 
		
		Object emp[] = new Object[5];
		emp[0] = "Rashmi";
		emp[1] = 25;
		emp[2] = 25.55;
		emp[3] = 'f';
		emp[4] = true;
		
		
		System.out.println(emp.length);//5
		
		for(Object e: emp) {
			System.out.println(e);
			if(e.equals("Rashmi")) {
				System.out.println("emp is from QA");
			}
		}
		
		
		System.out.println("-----------");
		Object emp1[] = new Object[5];
		emp1[0] = "Naveen";
		emp1[1] = 25;
		emp1[2] = 25.55;
		emp1[3] = 'm';
		emp1[4] = false;
		
		for(int index=0; index<=emp1.length-1; index++) {
			System.out.println(emp1[index]);
			if(emp1[index].equals("Naveen")) {
				System.out.println("emp is from DEV");
			}
		}
		
		
		System.out.println("----- array literals  ----");
		
		// static:
		//1. new keyword 
		//2. array literals: the values are known at the moment of declaration no need for new keyword
		
		int num[] = {11,2,3,4,5,610,11};
		System.out.println(num.length);//7
		
		String product[] = new String[10];
		product[0] = "Java";
		product[1] = "Python";
		product[2] = "JavaScript";
		product[3] = "DotNet"; 
		
		String pr[] = {"macbook","iphone","samsung"};
		//System.out.println(pr[3]);
		
		Object data [] = {"macbook",1000, 23.44,'g',true};// default value for Object is null
		for(Object e : data) {
			System.out.println(e);
		}
		
		System.out.println(Arrays.toString(data));
		System.out.println(Arrays.toString(pr)); // String representation of an array
	}

}
