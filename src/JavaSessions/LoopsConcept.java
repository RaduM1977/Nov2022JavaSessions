package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//1 to 100
		//1.while
		
		int i =1;
		while(i<=10) {
			
			System.out.println(i);//1 2 3 4 ...9 10 ... 99 100 
			//if the i is not increase we have an infinity loop of printing 1 
			// if we decrease the i it will just print once 
			//i++;
			//++i;
			i=i+1;
		}
		
		int j=-1;
		while (j<11) {
			System.out.println(j);
			j++;
		}
		
		i= -128;
		while (i<=127) {
			System.out.println(i);//-128 .....127
			++i; 
		}
		
		//Infinite while loop --> we stop it with break
		while(true) {
			System.out.println("welcome to taj hotel");
			break;
		}
		
		// while loop for the odd/even numbers 
		//int p =0; --> for even numbers 
		int p =1;
		while(p<=100) {
			System.out.println(p);//1 3 5 7 .....99
			//System.out.println(p); --> 0 2 4 6 8 ......100
			p=p+2;
		}
		
		System.out.println("--------------------");
		
		//usig of break statement in the while loop
		int num =1;
			while(num <=100) {
				System.out.println(num);//1 2 3 4 5
					if(num % 5 ==0) {
						System.out.println("hi");
						break;
					}
			num++;		
			}
		
		//
		int n =1;
		while (n<=5) {
			System.out.println(n+" = "+"Anjali");
			n++;
		}
		
		//
		int counter = 100;
		while (counter>=100) {
			System.out.println(counter);//100
			if(counter == 500) {
				System.out.println("bye");
				break;
			}
			counter++;
		}
		
		//
		int score =0;
		while(score<=100) {
//			if(score == 25) {
//				System.out.println("score is 25...yay");
//			}
//			if(score == 50) {
//				System.out.println("half century");
//			}
//			
//			if(score == 100) {
//				System.out.println("century");
//			}
			
			// using switch with while loop
			switch (score) {
			case 25:
				System.out.println(score);
				System.out.println("score is 25...yay");
				break;
			case 50:
				System.out.println(score);
				System.out.println("half century");
				break;
			case 100:
				System.out.println(score);
				System.out.println("century");
				break;

			default:
				System.out.println(score);
				break;
			}
			
			
			score++;
		}
		
	//while loop use cases:
		//1. when number of iterations are not fixed ex: all the pictures in an application  
		//2. infinite loading: linkedin,swiggy,facebook
		//3. waiting for element on the page : 5 sec, 10 sec, 15 sec, 20 sec 
		//4. waiting for the page load: 5 secs, 10, 2, 20 
		//5. calendar handling
		//6. pagination(many pages --> previous/next) in webtable 
		
		
		
		
		
		
	}

}
