
public class IFCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 18;
		Boolean isAdult = age >= 18;
		Boolean hasNoLicence = false;
		Boolean hasCurrentLicenceLevelG1 = false;
		Boolean hasCurrentLicenceLevelG2 = false;
		Boolean hasCurrentLicenceLevelG = true;
		if (isAdult) {
			if (hasNoLicence) {
				System.out.println("Person Should apply for Licence");
			} else if (hasCurrentLicenceLevelG1 && (!hasCurrentLicenceLevelG2 || !hasCurrentLicenceLevelG)) {
				System.out.println("G2 Licence will be issued to a person");
			} else if (hasCurrentLicenceLevelG2 && (!hasCurrentLicenceLevelG || hasCurrentLicenceLevelG1)) {
				System.out.println("G Licence will be issued to a person");
			} else if (hasCurrentLicenceLevelG && (!hasCurrentLicenceLevelG1 || hasCurrentLicenceLevelG2)) {
				System.out.println("Person has already G Level Licence");
			} else {
				System.out.println("If person has Licence should show G1 or G2 or G");
			}
		} else {
			System.out.println("Person is Not eligible for any Level of Licence");
		}

		int num = 10;
		if (num % 2 == 0) {
			System.out.println("Entered Number is Even");
		} else {
			System.out.println("Entered Number is Odd");
		}

//		Boolean hasClass = true;
//		Boolean hasStudentID = false;
//		Boolean hasBooks = true;
//		if (hasClass) {
//
//			if (hasStudentID) {
//
//				System.out.println("You can study");
//
//			} else if (hasBooks) {
//
//				System.out.println("You can study");
//			}
//
//			else {
//
//				System.out.println("You cannot study");
//
//			}
//
//		}

	}
}
