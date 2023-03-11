package DynamicArrays;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
		
		// all the collections are dynamic storage
		//hashMap is a dynamic storage(array)
		//<k,v>
		//name = naveen
		//marks = 100
		//seller = seller@gmail.com
		//does NOT maintain the order
		
		
		HashMap<String,String> empMap = new HashMap<String,String>();
		
		//put() --> map.put(key , value)
		//hashMap it will not maintain the order of the elements
		empMap.put("Naveen","SDET");
		empMap.put("Amrita","SDET1");
		empMap.put("Rashmi","SDET2");
		empMap.put("Ravi","SDET Manager");
		empMap.put("Kareem","VP");
		
		empMap.put("Kareem", "CEO");// Kareem will be given the value "CEO" because the HashMap the keys are unique 
		
		empMap.put("Kareem", "CEO");// the latest value is CEO
		empMap.put("Sheela", null);
		empMap.put(null,"CTO");
		empMap.put(null,null); // the latest value is null
		
		//get() value
		System.out.println(empMap.get("Rashmi"));//SDET2
		System.out.println(empMap.get("Kareem"));//VP --> CEO --> it will give you the latest value
		System.out.println(empMap.get("Tom"));// null
		System.out.println(empMap.get("Sheela"));//null
		System.out.println(empMap.get(null));//CTO --> null
		
		
		System.out.println(empMap);//{Amrita=SDET1, null=null, Sheela=null, Naveen=SDET, Ravi=SDET Manager, Kareem=CEO, Rashmi=SDET2}

		
		HashMap<String,Integer> browserMap = new HashMap<String,Integer>();
		
		browserMap.put("chrome", 100);
		browserMap.put("firefox", 90);
		browserMap.put("ie", 7);
		browserMap.put("safari", 10);
		
		System.out.println(browserMap);//{chrome=100, safari=10, firefox=90, ie=7} --> 
		
		// for HashMsap the default VC(virtual segments  or capacity) = 15 (0 - 14)
		// each segment is divided in 3 parts 
		// Java will calculate a hashcode (key)
		// then it will calculate the index = some internal calculation internally 
		//JDK 1.8 threshold = 8 --> max of 8 collision(nods) can happened because the list will be converted in a binary tree 
		//List will be converted in a binary Tree O(log n) which is faster 
		
		//load factor LF = VC/2 => 14/2 =7
	}

}
