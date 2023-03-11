package BuilderPattern;

public class UserShopping {

	public static void main(String[] args) {
		
		//create an object of EcommApplication class
		EcommApplication  app = new EcommApplication(); // one object 
		
		//method chaining is called a builder pattern
		app.login("naveen@gmail.com", "naveen123") // this method is returning the same object after executing the login method
			.doSearch("macbook pro")
				.addToCart("macbook pro")
					.doPayment("1212 1212 1313 1444",899)
						.generateOrder()
							.logout();
		
			System.out.println("---------------");
		
		// we can do it again and only one object will be created 
		app.login("naveen@gmail.com","naveen@123")
			.doSearch("thirt",5000,"Nike")
				.addToCart("tshirt")
					.logout();
		
		System.out.println("---------------");
		
		app.login("naveen@gmail.com","naveen@123")
			.addToCart("tshirt")
				.doPayment("naveen@hdfc")
					.generateOrder()
						.logout();
		
		
		System.out.println("---------------");
		
		app.login("naveen@gmail.com","naveen@123")
			.logout();
		
		EcommApplication  app1 = new EcommApplication(); // another  object 
		
		//ex: in Selenium we have the action class where we can use the builder pattern 

	}

}
