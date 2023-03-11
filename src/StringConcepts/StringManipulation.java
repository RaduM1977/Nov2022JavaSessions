package StringConcepts;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {

	
			
			String str = "hello hi this is my java code and I am so happy";
			
			System.out.println(str.length());//47
			
			int len = str.length();
			int li =0;//lowest index
			int hi = len-1;//highest index
			System.out.println(hi);//46
			
			//charAt():
			System.out.println(str.charAt(0));//h
			System.out.println(str.charAt(15));//s
			System.out.println(str.charAt(5));//' ' 
			System.out.println(str.charAt(42));//h
			//System.out.println(str.charAt(51)); //StringIndexOutOfBoundsException
			
			System.out.println(str.charAt(2));//l
			
			//indexOf();
			System.out.println(str.indexOf('h'));//0 --> check the position of a char
			System.out.println(str.indexOf("java"));//20 --> check the index of a String (Substring)
			
			String m1 = "Welcome null";
			
			if(m1.indexOf("admin") == 8) {
				System.out.println("admin user is present");
			} else {
				System.out.println("FAIL");
			}
			
			//Occurrence of a char/substring in a String
			System.out.println(str.indexOf('i'));//1st occurrence of i --> 7
			System.out.println(str.indexOf('i' ,str.indexOf('i')+1));//2st occurrence of i --> 11
			//Homework --> Video min 40
			
			//if a char/substring is not in the Sting it will return -1
			System.out.println(str.indexOf("Python"));//-1
			
			
			//how to check if a char/SubString is located in the String
			String m2 = "product name is mackbook";
			if(m2.indexOf("macbook") != -1) {
				
			}
			
			
			//toUpperCase()/toLowerCase()
			String test = "this is java program";
			System.out.println(test.toUpperCase());//THIS IS JAVA PROGRAM
			System.out.println(test.toLowerCase());//this is java program
			
			
			//trim():
			String p = "     hello world     ";
			System.out.println(p.trim());//hello world
			
			//replace():
			String p1 = "hello world";
			System.out.println(p1.replace("",""));//hello world
			
			String dob = "01-01-1990";
			System.out.println(dob.replace("-","/"));//01/01/1990
			
			String mesg = "I love Java";
			System.out.println(mesg.replace("love", "hate"));//I hate Java
			
			String q = "    hello world    ";
			System.out.println(q.replaceAll(" ", ""));//helloworld
			
			//equals:
			String e1 = "hello selenium";
			String e2 = "hello Selenium      ";
			System.out.println(e1.equals(e2));//false
			System.out.println(e1.equalsIgnoreCase(e2.trim()));//true
			
			//contains:
			String tg = "welcome to naveen training";
			System.out.println(tg.contains("naveen"));//true
			System.out.println(tg.contains("Naveen"));//false
			
			if(tg.contains("Naveen")) {
				System.out.println("enroll for it");
			}
			else {
				System.out.println("no need to enroll for it");
			}
			
			//split():
			String lang = "JAVA_PYTON_RUBY_DOTNET";
			String l[] = lang.split("_");
			System.out.println(l.length);//4
			System.out.println(Arrays.toString(l));
			
			System.out.println("------ Interviu Question: -----");
			//Interview question:
			String pop = "xXtestingxXseleniumXxXautomationXXxXTrainigX";
			String n[] = pop.split("xX");
			System.out.println(n[0]);//testing --> ""
			System.out.println(n[0].length());//0
			
			System.out.println(n[1]);//testing
			System.out.println(n[2]);//seleniumX
			System.out.println(n[3]);//automationXX
			System.out.println(n[4]);//TrainigX
			//System.out.println(n[5]);//ArrayIndexOutOfBoundsException
	
			
			
			
	}

}
