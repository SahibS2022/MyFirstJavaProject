package learningPolymorphism;

import java.util.Scanner;

import assignment_week10.BookingCruise;
import assignment_week10.BookingHotel;
import assignment_week10.SuiteDeluxDetails;
import assignment_week10.SuiteFamilyDetails;
import assignment_week10.UserDetails;

public class BookMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserDetail userDetail = new UserDetail();
		userDetail.register(sc);// invoking method for User Registration
		String selectedService = userDetail.getSelectedService(sc).toUpperCase();
		switch (selectedService) {
		case "HOTEL":
			userDetail = new BookHotel();
			userDetail.finalCalculations(sc);
			break;
		case "CRUISE":
			break;
		default:
			break;
		}
	}
}
