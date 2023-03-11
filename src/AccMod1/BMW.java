package AccMod1;

public class BMW extends Car{

	public static void main(String[] args) {
		
		// we can NOT take the private vars/functions
		BMW b = new BMW();
	
		//variables:
		b.color = "Blue";//protected
		b.name = "M5";//public
		b.seller = "Dealer";//default
		
		//methods:
		b.m1();//public
		b.m3();//protected
		b.m4();//default
		
	}

}
