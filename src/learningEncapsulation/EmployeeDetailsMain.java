package learningEncapsulation;

import java.util.Scanner;

public class EmployeeDetailsMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeDetails sahib = new EmployeeDetails(12, "Sahib", 23);// Instantiating the class EmployeeDetails with
																		// arguments as value of Constructor
		int count = 0;
		String userType = "";
		System.out.println("Please enter your User Type :\nAdmin\nEmployee");
		userType = sc.next();// User Type entered by user
		while (!userType.equalsIgnoreCase("Admin") && !userType.equalsIgnoreCase("Employee")) {
			count++;
			if (count >= 3) {
				System.out.println(
						"You have reached the maximum number of attempts to enter you user type.\nPlease restart agian");
				System.exit(0);
			}
			System.out.println(userType);
			System.out.println("You must enter either Admin or Employee");
			userType = sc.next();
		}
		if (userType.equalsIgnoreCase("Admin")) {
			System.out.println("Do want to update the Employee Age?\nPlease enter Yes or No");
			String wantToUpdate = sc.next();
			if (wantToUpdate.equalsIgnoreCase("Yes")) {
				System.out.println("Please enter the new age you want update");
				int newage = sc.nextInt();
				boolean isValid = sahib.updateEmployeeAge(12, 23, newage);// CurrentEmpId, currentEmpAge, enteredNewAge
				if (isValid) {
					sahib.getUserDetails();
				}
			} else {
				sahib.getUserDetails();
			}
		} else {
			sahib.getUserDetails();
		}

	}

}
