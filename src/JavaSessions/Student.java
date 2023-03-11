package JavaSessions;

public class Student {
	
	
	//WAF:
	// give the studentName(String) as a parameter
	//return the student mark(int)
	
	public int getStudentMarks(String studentName) {
		System.out.println("getting the student marks for : "+studentName);
		if(studentName.equals("Neha")){
			return 100;
		}
		else if(studentName.equals("Somesh")){
			return 90;
			
		}
		else if(studentName.equals("Amin")){
			return 80;
		}
		else {
			System.out.println("student is not found...");
			return -1;
		}
	}
	
	/*
	 HOMEWORK --> do the previous method with switch
	 */
	
	public int getStudentMarksSwitch(String studentName) {
		System.out.println("getting the student marks for : "+studentName);
		int mark = -1;
		switch (studentName) {
		
		case "Neha":
			mark = 100;
			break;

		case "Somesh":
			mark = 90;
			break;
			
		case "Amin":
			mark = 80;
			break;
			
		default:
			System.out.println("student is not found...");
			break;
		}
		
		
		return mark;
	}
	
	
	
	
	// bad example of a function/method 
//	public int test(int a,int b, String y) {
//		System.out.println("hi");
//		int total = 100+ 200;
//		return total;
//	}
	
	

	public static void main(String[] args) {
		
		Student st  = new Student();
		int m1 = st.getStudentMarks("Tom");
		System.out.println(m1);
		
		 m1 = st.getStudentMarksSwitch("Tom");
		System.out.println(m1);
		
		if(m1 == -1) {
			System.out.println("no need to print marksheet");
		}
		
		
	}

	
	
	
	
}
