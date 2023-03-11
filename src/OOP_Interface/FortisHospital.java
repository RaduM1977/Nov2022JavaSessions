package OOP_Interface;

public class FortisHospital extends Hospital implements USMedical,UKMedical,IndiaMedical{
	
	//implements is used for the Interface --> after implements as many Interfaces 
	//extends is for ONLY one parent class
	
	//--->> click the name of the class and select unimplemented methods!!
	
	
	int min_fee = 50;
	
	//coming from UsMedical
	@Override
	public void cardioServices() {
		System.out.println("FH - cardioServices");
		
	}

	@Override
	public void neuroServices() {
		System.out.println("FH - neuroServices");
		
	}

	@Override
	public void physioServices() {
		System.out.println("FH - physioServices");
		
	}

	// those methods coming from  UkMedical 
	@Override
	public void entServices() {
		System.out.println("FH - entServices");		
	}

	@Override
	public void dentalServices() {
		System.out.println("FH - dentalServices");		
	}

	
	//----------> implements the methods from IndiaMedical
	@Override
	public void oncologyServices() {
		System.out.println("FH - oncologyServices");		
	}

	@Override
	public void gynicServices() {
		System.out.println("FH - gynicServices");		
	}

	@Override
	public void orthoServices() {
		System.out.println("FH - orthoServices");		
	}
	
	//common method: --> it will be implemented once
	@Override
	public void emergencyServices() {
		System.out.println("FH - emergencyServices");
		
	}
	
	
	
	//individual methods:
	public void medicalTraining() {
		System.out.println("Fh - medical trainig ");
	}
	
	public void medicalInsurance() {
		System.out.println("Fh - medical insurance  ");
	}


	

	// -----> implements the WHO method:

	@Override
	public void covidVaccination() {
		System.out.println("FH - Covid Vaccination");
		
	}
	
	//USHG

	@Override
	public void childCareServices() {
		System.out.println("FH - childCareServices");
		
	}

	
	//method hiding 
	public static void taxCalculation() {
		System.out.println("FH - taxCalculation");
	}
	
	//override default interface method:
	@Override
	public void getMedicalServices() {
		System.out.println("FH - getMedicalServices");
	}
	
}
