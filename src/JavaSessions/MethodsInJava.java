package JavaSessions;

public class MethodsInJava {
	
	//data  in a class:
	//1. class vars
	//2. class method --> it should start with small letter and for the rest use Camel letters 
	
	//function: a piece of program which we can call any time 
	//functions are independent
	//we can NOT create a function inside of a function, every function should be create inside of a class
	//2 + 2 = 4
	//3 + 2 = 5
	
	//1. no input and no return:
	// void --> no return : function can not return anything 
	//return type: void 
	public void test() {
		System.out.println("test method");
		int a =10;
		int h = 15;
		System.out.println(a+h);
	}
	
	//2. no input and some return:
	//return type: int 
	
	public int getBillAmount() {
		System.out.println("get billing amount");
		int foodBills = 100;
		int drinksBills = 50;
		int totalAmount = foodBills + drinksBills;
		return totalAmount;	
	}
	
	public String getEmployeeName() {
		System.out.println("get employee name");
		
		String name = "Naveen";
		return name;
	}
	
	public String getName() {
		System.out.println("get name");
		return "Selenium";
	}
	
	public int getNumber() {
		return 100;
	}
	
	public boolean isElementExist() {
		System.out.println("check element is present");
		boolean flag = true;
		return flag;
	}
	
	public int getMarks() {
		int a = 100;
		int bonus = 5;
		int negative = 10;
		int finalMarks = a + bonus-negative;
		return finalMarks;
	}
	
	//3. some input and some return: 
	// WAF(Write a Function):
	// two variables a and b 
	// return sum of these two numbers
	
	public int getSum(int a, int b) { // a and b are method parameters 
		System.out.println("sum of two numbers ......");
		int sum = a + b;
		return sum;
	}
	
	//input params: int, double
	//return multiplication of two numbers
	public double getMultiplication(int x, double y) {
		System.out.println("get multiplication of two numbers ......");
		double mul = x * y;
		return mul;
	}
	
	public String getEmpSalaryInfo(String empName, int bonusAmount) {
		System.out.println("emp salary");
		
		return empName + ":"+ bonusAmount;
	}
	
	//parameters are when we write the method/function 
	//arguments are the values inputed when we call the method 
	
	//methods/functions are the actions
	//variables are the properties or the features
	
	
	

	public static void main(String[] args) {
		
			//call the function: we have to create the object 
		
		MethodsInJava obj = new MethodsInJava();
		obj.test();
		
		int m1 = obj.getBillAmount();
		System.out.println(m1-10);// 10 discount
		
		System.out.println(obj.getBillAmount());// not recommended to call the method in the System.out.println();
		
		String emp = obj.getEmployeeName();
		System.out.println(emp);
		
		if(obj.isElementExist()) {
			System.out.println("click on element");
		}
		
		int s1 = obj.getSum(10, 20);
		System.out.println(s1);
		
		int s2 = obj.getSum(40, 50); // call by value -->calling a method by inputing method arguments 
		System.out.println(s2);
		
		double mult = obj.getMultiplication(10, 2.2);
		System.out.println(mult);//22.0
		
		
		String empInfo = obj.getEmpSalaryInfo("Amit",20);
		System.out.println(empInfo);
		
		//System.out.println("bye");
		
	}

}
