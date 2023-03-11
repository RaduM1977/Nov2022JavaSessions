package JavaSessions;

public class DoWhileLoopConcept {

	public static void main(String[] args) {
		
		int p =1;
		
		do {
			//p++; 2 3 4 5 ... 11
			System.out.println(p);//1 2 3 4 .. 10
			p++;
		}
		while (p<=10);
		
		System.out.println("----------------");
		p=1;
		do {
			p++;
			System.out.println(p);// 2  4 6 .. 10
			p++;
		}
		while (p<=10);
		
		System.out.println("----------------");
		p=1;
		do {
			
			System.out.println(p);//1
			p++;
		}
		while (p>=10);
		
		System.out.println("----------------");
		
		p=1;
		do {
			
			System.out.println(p);
			if(p % 5 == 0) {
				System.out.println("hi");
			}
			p++;
		}
		while (p<=50);
		
		//use cases:
		//1.launch a page: element: 0, 5, 10, 20 ...n seconds 
		//2. wait times 
	
		
		
		
//		do {
//			//element is present : yes 
//			//click on the element 
//		} while (cond);
		
		//to print the statement once 
				do {
					System.out.println("hello");
				} while (false);
		
		
		//infinite do-while loop
//		do {
//			System.out.println("hello");
//		} while (true);
		
		// it will print only one time --> the loop will not be executed 
//				do {
//					System.out.println("hello");
//				} while (false);
				
		
		
	}
	
}
