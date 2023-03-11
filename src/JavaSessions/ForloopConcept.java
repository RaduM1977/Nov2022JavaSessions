package JavaSessions;

public class ForloopConcept {

	public static void main(String[] args) {
		
		// 1 to 10
		for(int i=1;i<=10;i++) {
			System.out.println(i);//1 2 3 4 5 .. 10
		}

		//infinite for loop
		int i=1;
		for(;i<=10;) {
			System.out.println(i);//1 2 3 4 5 .. 10
			//i++;
			//++i;
			i=i+1;
		}
		//infinite for loop
		for(;;) {
			System.out.println("Bye");
			break;
		}
		
//		for(;true;) {
//			System.out.println("Bye");
//		
//		}
		
		// Unreachable code  
//		for(;true;) {
//			System.out.println("Bye");
//		}
		
		//Homework 
		int count =1;
		for(;;) {
			System.out.println(count+"Bye");
			if(count ==50) {
			break;
			}
			count++;
		}
		System.out.println("-----homework-----------");
//		1. WAP to print following output:
//			I am Batman﻿
//			I am Batman﻿
//			I am Batman﻿
//			I am Batman
//			I am Batman
	
//		2. WAP to print following output:
//			I am Batman 1
//			
			
		for(int j = 1;j<=9;j++) {
			System.out.println("I am Batman "+j);
		}
		
//		3. WAP to print 10 to 1 using for, while and do-while loop
		
		int w=10;
		while(w>0) {
			System.out.println(w);
			w--;
		}
		for(w=10;w>0;w--) {
			System.out.println(w);
		}
		
		
//		//Unreachable code 
//		for(;;) {
//			System.out.println("hi");
//		}
//		System.out.println();
		
		System.out.println("-------------------------------");
		//5 to 50
		for(int k=5;k<=50;k++) {
			System.out.println(k);
			if(k%5==0) {
				System.out.println("hiiiii");
				break; // break the entire loop
			}
		}
		
		System.out.println("-----------------");
		//a to z
		for(char c ='a';c<='z';c++) {
			System.out.println((int)c+ ":"+c);
		}
		
		//byte loop
		for(byte b=1;b<=5;b++) {
			System.out.println(b);
		}
		
		System.out.println("----------");
		//double loop
		for(double d=1.1;d<=10.0;d++) {
			System.out.println(d);//1.1 2.1 3.1 ......9.1 
		}
		
		// infinite for loop using a String but we can put a break
		for(String s ="naveen";s.equals("naveen1");) {
			System.out.println("hi "+ s);
			break;
		}
		
		//use cases for loop
		//1.number of iteration are fixed;
		//2.month drop-down : --> jan to dec;
		//3.ecomm: category iterations
		//country,age, or any drop down 
		//
		
		
		
		
		
	}

}
