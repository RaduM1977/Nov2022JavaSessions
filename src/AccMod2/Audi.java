package AccMod2;

import AccMod1.Car;

public class Audi extends Car{

	public static void main(String[] args) {

		//we can access only public and protected
		Audi a = new Audi();
		
		a.color = "Red";//protected
		a.name = "Q5";//public
		
		//methods:
		a.m1();//public
		a.m3();//protected

	}

}
