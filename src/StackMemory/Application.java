package StackMemory;

public class Application {
	
	//LIFO --> Last In Fist Out
	// the calling of the methods happened in stack memory

	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	
	public void m3() {
		System.out.println("m3 method");
		//m1(); -- > stack overflow --> it keep calling the methods (creating space in the stack memory) until runs out of memory
	}
	
	//static methods:
//	t1
//	t2
//	t3
	
	
	public static void main(String[] args) {
		
		Application obj = new Application();
		obj.m1();
		
	}
	
}
