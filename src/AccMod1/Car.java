package AccMod1;

public class Car {

	public String name;
	private int price;
	protected String color;
	String seller;
	
	//homework do the methods like the variables public private protected, default 
	public void m1() {
		System.out.println("Car - m1");
	}
	
	private void m2() {
		System.out.println("Car - m2");
	}
	
	protected void m3() {
		System.out.println("Car - m3");
	}
	
	void m4() {
		System.out.println("Car - m4");
	}
	
	

	public static void main(String[] args) {
		
		final int i = 10;// local variables can be only Final(constant)
		
		//the private var/method  we can use it only in this class
		Car c = new Car();
		c.price = 100;
		c.m2();
		
	}

}
