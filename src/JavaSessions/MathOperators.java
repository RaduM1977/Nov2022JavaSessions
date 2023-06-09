package JavaSessions;

public class MathOperators {

	public static void main(String[] args) {
		System.out.println(10/2);//5
		System.out.println(9/2);//4.5-->4
		
		System.out.println(9.0/2);//4.5
		System.out.println(9/2.0);//4.5
		System.out.println(9.0/2.0);//4.5
		
		//System.out.println(9/0);//AE -->ArithmeticException
		//System.out.println(0/0);//AE -->ArithmeticException
		
		System.out.println(0/9);//0
		System.out.println(0/1);//0
		
		//double gives infinity not AE
		System.out.println(9/0.0);//Infinity
		System.out.println(9.0/0);//Infinity
		System.out.println(9.0/0.0);//Infinity
		
		//System.out.println(0/0);//AE -->ArithmeticException
		
		System.out.println(0.0/0.0);//NaN --> not a number
		System.out.println(0.0/0);//NaN --> not a number
		System.out.println(0/0.0);//NaN --> not a number
		
		System.out.println(100/0.0);//Infinity
		
		System.out.println(10 % 2);//0
		System.out.println(9 % 2);//1
		
		System.out.println(9.2 % 2);//1.1999999999999993
		
	}

}
