package JavaSessions;

public class Application {
	
	// Method Overloading: OOP Object Oriented Programming 
	// Within the same class: we have different methods:
	// 1. with the same name
	// 2. with different number of parameters with different type 
	// 3. with different sequence of parameters 
	// 4. return type does NOT  matter 
	// 5. We can overload static methods as well
	
	//Poly(Many) + Morphism(Forms) -- OOP
	//compile time (static) polymorphism
	
	public void test() { // 0 parameter
		System.out.println("test with  - 0 param");
	}
	
	
//	public String  test() { // 0 parameter
//		return "";
//	}  --> // this is not method overloading 

	public void test(int i) { // 1 parameter 
		System.out.println(" 1 param: " + i );
	}
	
	public void test(String i) {// 1 parameter 
		
	}
	
	public void test(int i, int j) { // 2 parameters
		
	}
	
	public void test(int i, String j ) { // 2 Parameters 
		
	}
	
	public void test(String i, int j) {// 2 parameters in different order 
		
	}

	// examples:
	//login :
	public void login() {
		
	}
	
	public void login(String un, String  pwd) {
		
	}
	
	public void login(String un, String pwd,String role) {
		
	}
	
	public void login(String un,String pwd,String role, String otp) {
		
	}
	
	//search:
	public void search() {
		
	}
	
	public void search(String productName) {
		
	}
	
	public void search(String productName,int price) {
		
	}
	
	public void search(String productName,int price, String color) {
		
	}
	
	//payment:
	public void doPayment(String cc, String cvv) {
		
	}
	
	public void doPayment(String upi) {
		
	}
	
	public void doPayment(String un,String pwd, int otp) {
		
	}
	
	
	public void go(float f) {
		System.out.println("float value " + f);
	}
	
	public void go(double f) {
		System.out.println("double value " + f);
	}
	
	public static void main(String[] args) {
	
		Application obj = new Application();
		obj.test();
		obj.test(20);
		obj.test("naveen");
		
		// when we call we specify if it is float otherwise it will call the highest in the class which is double 
		obj.go(12.33);//double value 12.33
		obj.go(12.33f);//float value 12.33

	}

}
