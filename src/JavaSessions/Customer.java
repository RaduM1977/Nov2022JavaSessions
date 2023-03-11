package JavaSessions;

import java.util.Arrays;

public class Customer {

	//WAF:
	//getEmployeeDevices(empName -- String)
	//return device list
	
	//String[] devices;
	
	public String[] getEmployeeDevices(String empName) {
		System.out.println("getting devices information for employee: " + empName);
		String[] devices = null;
		
		
		if(empName.equals("Ravi")) {
		  devices = new String[]{"mackbook pro","ipad","iph13"};
			//return devices;
			
		}
		
		else if(empName.equals("Om")){
			devices = new String[]{"window 10","samsung s10"};
			//return devices;

		}
		else if(empName.equals("Rashmi")){
			 devices = new String []{"window 10","samsung s10","iphone13","Airtel SIM"};
			//return devices;	
			
		}
		
		else {
			System.out.println("emp name is not found...");
			
			//return null;
		}
		
		//return null; --> it can be used this way
		return devices;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
	Customer obj = new Customer();
	
	String d[] = obj.getEmployeeDevices("Tom");
	System.out.println(Arrays.toString(d));
	//System.out.println(d.length);// if the array is null we will get the --> NullPointerException
	
	
	
	}

	
	
}
