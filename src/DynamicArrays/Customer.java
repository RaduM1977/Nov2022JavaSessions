package DynamicArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer {

	public static void main(String[] args) {
		
	List<String> namesList = new ArrayList<String>();
		
		namesList.add("Tom");//0
		namesList.add("Peter");//1
		namesList.add("Rashmi");//2
		namesList.add("Ravi");//3
		namesList.add("Naveen");//4
		
		
		//reverse a list 
		
//		for(int i =namesList.size()-1;i>=0;i--) {
//			System.out.println(namesList.get(i));
//		}
		
		System.out.println(namesList);//[Tom, Peter, Rashmi, Ravi, Naveen]
		
		// using the Collections class to reverse an arrayList
		Collections.reverse(namesList);
		System.out.println(namesList);//[Naveen, Ravi, Rashmi, Peter, Tom]
		
		//sort ascending 
		Collections.sort(namesList);
		System.out.println(namesList);//[Naveen, Peter, Rashmi, Ravi, Tom]
		
		// swap elements 
		Collections.swap(namesList, 2, 3);
		System.out.println(namesList);//[Naveen, Peter, Ravi, Rashmi, Tom]
		
		//add elements because this arrayList is mutable 
		namesList.add("Amrita");
		namesList.add(0,"Kath");
		System.out.println(namesList);//[Kath, Naveen, Peter, Ravi, Rashmi, Tom, Amrita]
		namesList.add(7,"Vinutha");// we can add to a position where we already have an element -> PC
		
		// the methods work on the PC(Physical Capacity)
		//namesList.add(8,"Vinutha"); --> IndexOutOfBoundsException --> because we can NOT jump positions 
		//namesList.get(8); --> IndexOutOfBoundsException 
		System.out.println(namesList);
		
		namesList.remove(1);//Naveen will be removed 
		System.out.println(namesList);//[Kath, Peter, Ravi, Rashmi, Tom, Amrita]
		System.out.println(namesList.get(1));//Peter

		
		
	}

}
