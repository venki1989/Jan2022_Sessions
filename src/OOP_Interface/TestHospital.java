package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.entServices();
		fh.cardioServices();
		fh.neuroServices();
		fh.emergencyServices();
		fh.medicalInsurance();
		fh.optServices();
		System.out.println(USMedical.min_fee); //Accessing static variable
		
	
		FortisHospital.billing();
		USMedical.billing();
		
		fh.medicalTraining();
		fh.medicalEquipment();
		fh.medicalStudy();
		
		fh.covid19Vaccination();
		
		int num = fh.getPatientNumber("Naveen");
		System.out.println(num);
		
		
		
		//top casting:
		//child class object can be referred by parent interface ref variable
		USMedical us = new FortisHospital(); //CAN CALL ONLY PARENT SPECIFIC SINCE reference is parent
		System.out.println("________________This is Paret - Child reference____________");
		us.physioServices(); //The implemented method in child class Fortis Hospital is called and executed
		us.cardioServices(); //The implemented method in child class Fortis Hospital is called and executed
		us.entServices(); //The implemented method in child class Fortis Hospital is called and executed
		us.emergencyServices(); //The implemented method in child class Fortis Hospital is called and executed
		
		//down casting:NA
		//FortisHospital fh1 = new USMedical();
		
		
		
		
		
		
	}

}
