package AccMod1;

public class Cycle {

	public static void main(String[] args) {
		
	//same package and no subclass  default, protected and public, can NOT use private var/method
	Car c = new Car();
	
	//variables:
	c.color = "Black";//protected
	c.name = "Bycycle";//public
	c.seller = "Dealer";//default
	
	//methods:
	c.m1();//public
	c.m3();//protected
	c.m4();//default

	}

}
