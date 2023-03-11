package BuilderPattern;

public class EcommApplication {

	// return the class type object 
	// when we use the this for return the object type has to be the class name type ex:EcommApplication
	public EcommApplication login() {
		System.out.println("login to app");
		return this; //return the current class object 
		//we can return the new EcommApplication but inside the memory it will create a new object every time we call the method,
		//but with the 'this' keyword it will return the same object 
	}
	
	
	public EcommApplication login(String un, String pwd) {
		System.out.println("login to app : " + un + ":" + pwd);
		return this; //return the current class object 
		}
	
	public EcommApplication doSearch(String productName) {
		System.out.println("search product: "+ productName);
		return this;//return the current class object
	}
	
	
	public EcommApplication doSearch(String productName,int price ) {
		System.out.println("search product: "+ productName + ": price" + price);
		return this;//return the current class object
	}
	
	
	public EcommApplication doSearch(String productName,int price,String brand) {
		System.out.println("search product: "+ productName + ": price " + price + ": brand " + brand);
		return this;//return the current class object
	}
	
	public EcommApplication addToCart(String productName) {
		System.out.println("add to cart: "+ productName);
		return this;//return the current class object
	}
	
	public EcommApplication doPayment(String cc,int cvv) {
		System.out.println("making payment usign: "+ cc + ":"+ cvv);
		return this;//return the current class object
	}
	
	public EcommApplication doPayment(String upi) {
		System.out.println("making payment usign: "+ upi);
		return this;//return the current class object
	}
	
	public EcommApplication doPayment(String paypalId,String password) {
		System.out.println("making payment usign: "+ paypalId + ":"+ password);
		return this;//return the current class object
	}
	
	public EcommApplication generateOrder() {
		System.out.println("Your order id is: "+ 12345);
		return this;//return the current class object
	}
	
	public EcommApplication logout() {
		System.out.println("logout from app");
		return this;//return the current class object
	}
}
