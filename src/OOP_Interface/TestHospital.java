package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		
		FortisHospital fh = new FortisHospital();
		
		//Overridden methods 
		fh.cardioServices();
		fh.neuroServices();
		fh.physioServices();
		fh.dentalServices();
		fh.entServices();
		fh.oncologyServices();
		
		//common overridden method 
		fh.emergencyServices();
		
		//individual methods: 
		fh.medicalInsurance();
		fh.medicalTraining();
		
		//inherited methods:
		fh.medicalRD();
		fh.medicalNews();
		//inherited from grand-parent interface WHO
		fh.covidVaccination();
		
		//System.out.println(FortisHospital.min_fee); if we have the same var in the child FortisHospital we need to use the object if not static 
		System.out.println(fh.min_fee);//50 --> 
		System.out.println(USMedical.min_fee);//10
		System.out.println(fh.min_fee);//50
		
		USMedical.taxCalculation();//US - taxCalculation 
		
		fh.getMedicalServices();// we can inherit the 'default' method from an Interface
		
		//USMedical.min_fee = 20; we can NOT change the value of the var 
		
		//N/A
		//USMedical us = new USMedical();
		//WedDriver driver =  new ChromeDriver();
		
		
		//top casting:
		//child class object can be referred by parent interface ref variable 
		
		USMedical us = new FortisHospital();
		us.cardioServices();
		us.neuroServices();
		us.physioServices();
		us.emergencyServices();
		
		
		UKMedical uk = new FortisHospital();
		uk.dentalServices();
		uk.entServices();
		uk.emergencyServices();
		
		IndiaMedical in = new FortisHospital();
		
		in.orthoServices();
		in.gynicServices();
		in.oncologyServices();
		in.emergencyServices();
		
		
		//down casting ?? at the compile time it will give us an error because the Interface parent can NOT create an object of interface type
		//FortisHospital fh1 = new USMedical();
		
		
		//use constants:
		System.out.println(Constants.OK_MESSG_200);
		System.out.println(Constants.DEFAULT_TIME_OUT);
		System.out.println(Constants.DEFAULT_PAGE_LOAD_TIME_OUT);

	}

}
