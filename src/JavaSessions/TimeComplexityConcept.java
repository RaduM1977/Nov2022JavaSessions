package JavaSessions;

public class TimeComplexityConcept {

	public static void main(String[] args) {
		
		//Big O : O(n) n number of iterations 

		int i=1; // one time it will be generated this code 
		
		//O(1)
		
		String s = "hello";
		System.out.println(s);
		//O(1)
		
		int a =10;
		int b =20;
		int c =a+b;
		System.out.println(c);
		//O(1)
		
		for(int n =1;n<=10;n++) {
			System.out.println(n);
		}	
		//O(10)
		//O(n)
		
		//p=1 --> 10
		//1+ n + n + n => 3n => 3n+1 -- linear equation 
		//3n +1 (we are removing the constant 1) => 3n -->O(n)
		
		for(int v=1;v<=10;v++) {
			for(int u=1;u<=10;u++) {
				System.out.println("hi");
			}
		}
		
		//(1+n+n)(1+n+n+n)
		//(1+2n)(1+3n) => 1+3n+2n+6^2 =>6n^2 +5n+1 ==>Quadratic equation
		//6n^2 +5n +1 ==> 6n^2 +5n => n(6n +5) ==> n(6n) =>n^2 ==> O(n^2)
		
		for(int v=1;v<=10;v++) {
			System.out.println(v);
		}//n
		
		for(int v=1;v<=10;v++) {
			System.out.println(v);
		}//n
		//O(n)
		
		for(int v=1;v<=10;v++) {
			for(int u=1;u<=10;u++) {
				for(int l=1;l<=10;l++) {
				System.out.println("hi");
				}
			}
		}
		//O(n)
		//(1+n+n)(1+n+n)(1+n+n+n) => (1+2n)(1+2n)(1+3n)=>(1+2n+2n+4n^2)(1+3n)=>(1+4n+4n^2)(1+3n)=>1+3n+4n+12n^2+4n^2+12n^3 
		//12n^3+16n^2+7n+1=> 12n^3+16n^2=> 4n^2(3n+4) => 4n^2(3n) => n^2(3n) => n^3 =>O(n^3)
		
	}

}
