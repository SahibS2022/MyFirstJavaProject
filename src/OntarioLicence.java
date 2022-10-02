
public class OntarioLicence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int age = 16;
		Boolean isAdult = age >= 16;
		String currentLevel = " ";
		
		if (isAdult) {
			if (currentLevel ==" ") {
				System.out.println("Person Should apply for Licence");
			} else if (currentLevel =="G1") {
				System.out.println("G2 Licence will be issued to a person");
			} else if (currentLevel =="G2") {
				System.out.println("G Licence will be issued to a person");
			} else if (currentLevel =="G") {
				System.out.println("Person has already has the Highest Level for Car Licence");
			}
		} else {
			System.out.println("Person is Not eligible for any Level of Licence");
		}



	}

}
