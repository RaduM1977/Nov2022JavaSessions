package Assignments;

public class TestHospital {
	
	

	public static void main(String[] args) {
		
		Hospital hs = new Hospital();
		hs.appoitment();//H - appoitment
		hs.medication();//H - medication
		hs.vaccination();//H - vaccination

		
		Apollo ap = new Apollo();
		ap.appoitment();//A - appoitment -> overridden 
		ap.medication();//A - medication -> overridden 
		ap.vaccination();//H - vaccination -> inherited 
		ap.personal();//A - personal -> Apollo class method 
		
		//TopCasting 
		Hospital hsFortis = new Fortis();
		hsFortis.appoitment();
		hsFortis.medication();
		hsFortis.vaccination();
		
		((Fortis) hsFortis).location();
		
//		//downCasting 
//		Max mHospital = (Max) new Hospital();//ClassCastException
//		mHospital.appoitment();
//		mHospital.medication();
//		mHospital.vaccination();
//		mHospital.staff();
		
		
		Hospital mHospital =  new Max();
		((Max) mHospital).staff();
	}

}
