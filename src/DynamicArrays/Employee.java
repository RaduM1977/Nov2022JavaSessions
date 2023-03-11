package DynamicArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {

	public static void main(String[] args) {
		
		//List is an interface --> top casting
		
		List<String> namesList = new ArrayList<String>();
		
		namesList.add("Tom");
		namesList.add("Peter");
		namesList.add("Rashmi");
		namesList.add("Ravi");
		namesList.add("Naveen");
		
		System.out.println(namesList);//[Tom, Peter, Rashmi, Ravi, Naveen]
		System.out.println(namesList.size());//5
		
		
		// we can use the for each loop if we need to add a logic to the elements --> to manipulate the elements
		for(String e : namesList) {
			System.out.println(e);
			if(e.equals("Rashmi")) {
				System.out.println("she is a manager");
				break;
			}
		}
		
		
		// Arrays.asList method to add elements 
		List<String> browserList = Arrays.asList("chrome","firefox","IE","Safari","Edge");
		System.out.println(browserList.size());//4
		System.out.println(browserList);//[chrome, firefox, Safari, Edge]
		
		
		List<Integer> numList = Arrays.asList(100,200,300,400,500);
		
		//static array to convert to an dynamic array:
		
		String country[] = {"India","USA","UK","Brazil","Germany"};//static array
		List<String> countryList = Arrays.asList(country);//dynamic array
		
		System.out.println(countryList);
		
		
		
		//countryList.add("France");//UnsupportedOperationException --> the List is immutable and it will get an error in runtime if we try to add another element
		//System.out.println(countryList);
		
		

	}

}
