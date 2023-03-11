package DynamicArrays;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
	
		//static array
//		int i[] = {1,2,3,4,5};
//		int l[] = new int[50]; //0-3
		
		//dynamic array
		//ArrayList - default class
		//ordered based collection: it maintains the order/index
		
		ArrayList ar = new ArrayList(); // first it will create 10 segments(10 virtual reserved memory spaces) --> from 0-9
		//VC(virtual Capacity) = 10;
		//PC(Physical Capacity) --> the size is 0 when we declare the arraylist
		
		System.out.println(ar.size());//PC = 0  -- VC = 10
		
		ar.add(100);//index 0
		ar.add(200);//index 1
		ar.add(300);//index 2
		
		System.out.println(ar.size());//PC = 3 -- VC = 7
		
		ar.add(400);//index 3
		ar.add(500);//index 4
		
		System.out.println(ar.size());//PC = 5 -- VC = 5
		
		
		//when the PC = 10 the VC = 0
		
		// once all the segments are filled Java will check how many PC (or current size) we have and it will create the VC = PC/2 => 10/2 =  5 segments 
		// after those 5 filled Java will create the next VC = PC/2 => 15/2 = 7.5 => 7 segments 
		// it is called load factor PC/2
		
		ar.add("testing");//index 5
		ar.add(23.44);//index 6
		ar.add(true);//index 7
		ar.add('g');//index 8
		ar.add(1000);//index 9
		
		System.out.println(ar.size());//10
		
		ar.add(1200);
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(9));
		System.out.println(ar.get(6));
		//System.out.println(ar.get(10));//IndexOutOfBoundsException
		
		ar.remove(8);
		System.out.println(ar.get(8));// 1000 --> the index 9 will become the new 8th because the 8th segment will be deleted 
		System.out.println(ar.size());// the current size will be 9
		System.out.println(ar);//[100, 200, 300, 400, 500, testing, 23.44, true, 1000]
		
		System.out.println("---------------");
		ArrayList empData = new ArrayList();
		empData.add("tom");
		empData.add("Bangalore");
		empData.add(1000);
		empData.add(true);
		
		System.out.println(empData.size());//4
		
		System.out.println(empData.get(1));//Bangalore
		
		System.out.println(empData);//[tom, Bangalore, 1000, true]
		
		//for loop to print an arrayLisit(dynamic array):
		System.out.println("-----Print the Arraylist with a for loop  -----");
		for(int i =0;i<empData.size();i++) {
			System.out.println(empData.get(i));
		}
		
		//to lunch debugger mode double click the line you want to start the debugging and press F6 (step over)
		
	}

}
