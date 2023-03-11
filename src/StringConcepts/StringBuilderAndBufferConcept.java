package StringConcepts;

public class StringBuilderAndBufferConcept {

	public static void main(String[] args) {
			
		
		StringBuilder sb = new StringBuilder("selenium");
		
		//StringBuilder s1 = "naveen"; --> not allowed only String 
		
		sb.append("testing");
		System.out.println(sb);//seleniumtesting
		
		String s1 = "cypress";
		s1.concat("ui testing");
		System.out.println(s1);	//cypress
		
		
		
		
	}

}
