package JavaSessions;

public class IncrementAndDecrementalOperators {

	public static void main(String[] args) {
		
		//1.post increment ++
		
		int a =1;
		int b = a++;
		System.out.println(a);//2
		System.out.println(b);//1
		
		int c = -99;
		int d = c++;
		System.out.println(c);//-98
		System.out.println(d);//-99
		
		int x= 10;
		int y = x++;
		System.out.println(x);//11
		System.out.println(y);//10
		
		//2.Pre increment  ++
		
		int t = 1;
		int u = ++t;
		System.out.println(t);//2
		System.out.println(u);//2
		
		int k = -99;
		int p = ++k;
		System.out.println(k);//-98
		System.out.println(p);//-98
		
		int g = -1001;
		int h = ++g;
		System.out.println(g);//-1000
		System.out.println(h);//-1000
		
		//3. post decrement --
		int s = 2;
		int v = s--;
		System.out.println(s);//1
		System.out.println(v);//2
		
		int l1 = -999;
		int l2 = l1--;
		System.out.println(l1);//-999 -1 = -1000
		System.out.println(l2);//-999
		
		//4. pre decrement --
		
		int r1= 2;
		int r2 = --r1;
		System.out.println(r1);//1
		System.out.println(r2);//1
			
		///----------------------------///
		System.out.println("///----------------------------///");
		
		int num = 10;
		System.out.println(num++);//10
		System.out.println(num);//11
		
		int total = 10;
		System.out.println(++total);//11
		System.out.println(total);//11
		
		System.out.println(2*10);//20
		System.out.println(2*-10);//-20
		System.out.println(-2*-10);//20
		
		float f = 2.5f;
		float j = f++;
		System.out.println(f);//3.5
		System.out.println(j);//2.5
		
		//
		char ch = 'a';//97
		System.out.println((int) ++ch );//98
		System.out.println(++ch);//b
		
		//0-9: 48 to 57
		char th ='1';//49
		System.out.println(++th);//2-->50
		System.out.println(th);//2
		
		System.out.println((int)++th);//51
		System.out.println((int)th);//51
		
		int pop =1;
		pop = pop + 1;
		System.out.println(pop);//2
		
		int p11 = pop + 1;
		
		System.out.println(p11);//3
		
		//
		byte f1 = 120;
		byte f2 = 60;
		//byte f3 = f1+f2;//110--> the result is int or long (minimum int)
		int f3 = f1+f2;//180
		
		
		
		

//		 1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
//
//			Expected Output :
//			Hello 
//			Naveen K

		
		System.out.println("Hello");
		System.out.println("Radu M");
		
		
//		2. Write a Java program to print the sum of two numbers.
//		Test Data:
//		 74 + 36		
//		Expected Output:
//		110
		
		System.out.println(74+36);//110
		
//		3. Write a Java program to divide two numbers and print on the screen.
//		Test Data:
//		50/3
		
		System.out.println(50/3);//16
		
//		5. Write a Java program to compute the specified expressions and print the output. Go to the editor
//		Test Data:
//		((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
//		Expected Output
//		2.138888888888889
	
		System.out.println((25.5*3.5-3.5*3.5) / (40.5-4.5));//2.138888888888889
		
		//6. Try to concat "Hello Selenium" with a character 't'.
		
		System.out.println("Hello Selenium"+'t');//Hello Seleniumt
		

//		7. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
//
//		"Your Total amount is. 3700".
		
		int num1 = 100;
		int num2 =200;
		int num3 = 3400;
		
		System.out.println("Your Total Amount is. "+(num1+num2+num3));//Your Total Amount is. 3700
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
