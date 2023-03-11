package StringConcepts;

public class StringImmutable {

	public static void main(String[] args) {
		
		//int is mutable --> the previous values are gone from the memory!
		int i =10;
		i = 20;
		i = 30;//latest value of i
		
		//String is immutable --> the previous values are still there(they are not reference ) until gs(garbage collector) comes and delete them
		String s = "Selenium";
		s = "Cypress"; // create a new obj "Cypress", "Selenium" has no reference now 
		System.out.println(s);//Cypress
		
		String t = "Selenium";
		
		System.out.println(t + "automation");// it will create a new object "Seleniumautomation" with no reference, candidate for the gc
		System.out.println(t); //Selenium

		String p = "Naveen";// new object "Naveen"
		p = p + " Automation Labs"; // create a new object "Naveen Automation Labs" , "Naveen" will have no reference now because p was given to the new object
		System.out.println(p);//Naveen Automation Labs
		
		String t2 = "Naveen";
		System.out.println(t2);//Naveen
		
		String r = "     hello selenium      "; //new object with spaces
		r = r.trim(); // create a new object without the spaces(trim()), the object with the spaces will have no reference 
		System.out.println(r);//hello selenium
		
		String s11 = "java_py_ruby";
		String arr[] = s11.split("_");
		String t11 = arr[0] + "testing";
		System.out.println(t11);//javatesting
		
		
		String test = "             testing java    selenium    ";
		System.out.println(test.replaceAll(" ", "m"));//"mmmmmmmmmmmmmtestingmjavammmmseleniummmmm"
		System.out.println(test.replaceAll("m"," "));//"             testing java    seleniu      "
		System.out.println(test.replace(" ", ""));//testingjavaselenium
		
		
		
		String rest = "i am binita and this is my code and I am so happy";
		System.out.println(rest.indexOf('i'));//0
		
		System.out.println(rest.indexOf('i',rest.indexOf('i')+1));//6
		
		System.out.println(rest.indexOf('i',rest.indexOf('i',rest.indexOf('i')+1)+1));//8
		
		System.out.println(rest.indexOf('i',rest.indexOf('i',rest.indexOf('i',rest.indexOf('i')+1)+1)+1));
		
		//while loop : give me to occurrence of all i
		
		System.out.println("------- Index of 'i' with while loop --------");
		
		int occurance = rest.indexOf('i');
		
		while (rest.indexOf('i',occurance)  != -1) {
			
			System.out.println(rest.indexOf('i',occurance));
			
			occurance = rest.indexOf('i',occurance) + 1;
			
		}
		
		
	}

}
