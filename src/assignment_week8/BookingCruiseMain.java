package assignment_week8;

import java.util.Scanner;

public class BookingCruiseMain {

	public static void main(String[] args) {
		UserDetails userDetails = new UserDetails();
		BookingCruise secenicCruise = new BookingCruise("Secenic Cruise", 43.99, 12.99, 3);
		BookingCruise sunsetCruise = new BookingCruise("Sunset Cruise", 52.99, 15.99, 1);
		BookingCruise discoveryCruise = new BookingCruise("Discovery Cruise", 39.99, 9.99, 4);
		BookingCruise mysteryCruise = new BookingCruise("Mystery Cruise", 45.99, 12.99, 2);

		BookingCruise[] bookingCruise = { secenicCruise, sunsetCruise, discoveryCruise, mysteryCruise };
		Scanner sc = new Scanner(System.in);

		System.out.println("--------Welcome to Cruise Booking--------\n");
		System.out.println("Please SignUp to book a Cruise !\n");

		// method invoked from UserDetails Class for user registration and Login,
		userDetails.register();
		userDetails.login();
		int index = 0;
		String reEnter;
		String selectedCruise;
		do {
			System.out.println(
					"We offer 4 different packages as displayed below. Please enter the cruise that you want to select.\n"
							+ "Scenic Cruise\nSunset Cruise\nDiscovery Cruise\nMystery Cruise\n");
			selectedCruise = sc.nextLine();
			int count = 1;
			while (!selectedCruise.equalsIgnoreCase("Scenic Cruise")
					&& !selectedCruise.equalsIgnoreCase("Sunset Cruise")
					&& !selectedCruise.equalsIgnoreCase("Discovery Cruise")
					&& !selectedCruise.equalsIgnoreCase("Mystery Cruise")) {
				count++;
				if (count > 3) {
					System.out.println("Please Start over,you have reached the input limit");
					System.exit(0);
				}
				System.out.println("Invalid Selection try again below");
				selectedCruise = sc.nextLine();
			}
			for (int i = 0; i < bookingCruise.length; i++) {
				if ((selectedCruise).equalsIgnoreCase(bookingCruise[i].selectedCruise)) {
					index = i;
					System.out.println("The cruise that you have selected is " + bookingCruise[i].selectedCruise
							+ " which is a " + bookingCruise[i].noOfDays + " day cruise\r\n"
							+ "Price for Adults	(greater than 12)	: " + bookingCruise[i].priceForAdult
							+ " per day\r\n" + "Price for kids above 5			: " + bookingCruise[i].priceForChild
							+ " per day\r\n" + "");
					break;
				}
			}
			System.out.println("Please press Y if you want to continue with the selection or\n"
					+ "press any other alphabet to select another");
			reEnter = sc.nextLine();
		} while (!reEnter.equalsIgnoreCase("Y"));
		System.out.println("Enter the number of adults");
		int numAdults = sc.nextInt();
		System.out.println("Enter the number of children");
		int numChildren = sc.nextInt();
		int ageAboveFive = 0;
		int age;
		if (numChildren > 0) {
			for (int i = 0; i < numChildren; i++) {
				System.out.println("Enter the age of child " + (i + 1));
				age = sc.nextInt();
				while (age >= 13 || age <= 0) {
					System.out.println("Please enter a valid age of child " + (i + 1) + " from (1-12)");
					age = sc.nextInt();
				}
				if (age >= 5) {
					ageAboveFive++;
				}
			}
		}
		System.out.println(
				"All our cruises have food service on board. Do you want to pre-book for dinner buffet meals at \n20.99 per day for adults and 4.99 per day for kids?"
						+ "\nPlease press Y if you want to Prebook otherwise press any other alphabet");
		String buffetMeal = sc.next();
		bookingCruise[index].setbuffetPrice(buffetMeal);
		double priceForAdults = bookingCruise[index].priceForAdults(numAdults);
		double priceforChildren = bookingCruise[index].priceforChildren(ageAboveFive);
		double buffetTotalPriceAdult = bookingCruise[index].buffetTotalPriceAdult(numAdults);
		double buffetTotalPriceChild = bookingCruise[index].buffetTotalPriceChild(ageAboveFive);
		double totalPrice = bookingCruise[index].totalPrice(priceForAdults, priceforChildren, buffetTotalPriceAdult,
				buffetTotalPriceChild);
		double priceWithHst = bookingCruise[index].priceWithHst(totalPrice);
		bookingCruise[index].finalPrice(priceForAdults, priceforChildren, buffetTotalPriceAdult, buffetTotalPriceChild,
				totalPrice, priceWithHst, numAdults, ageAboveFive);
		String yesUpdate = "";
		do {
			System.out.println(
					"Do you want to change your personal information. Press Y to change. Press any other alphabet to exit.");
			yesUpdate = sc.next();
			while (!yesUpdate.equalsIgnoreCase("Y")) {
				System.out.println("Thank you for your service!");
				System.exit(0);
			}
		} while (!yesUpdate.equalsIgnoreCase("Y"));
		if (yesUpdate.equalsIgnoreCase("Y")) {
			int countTo = 0;
			boolean isUpdated = false;
			do {
				System.out.println("Please enter the information you want to change.\r\n" + "1.	Username\r\n"
						+ "2.	Password\r\n" + "3.	Phone number\r\n" + "4.	Email\r\n");
				String selectedOption = sc.next().toUpperCase();
				if (countTo >= 2) {
					System.out.println(
							"Please start over!.You have reached the limit to enter Valid options to update\nThank you for your service!");
					System.exit(0);
				}
				switch (selectedOption) {
				case "1":
				case "USERNAME":
					isUpdated = true;
					userDetails.updateUserName();
					break;
				case "2":
				case "PASSWORD":
					isUpdated = true;
					userDetails.updateUserPassword();
					break;
				case "3":
				case "PHONE NUMBER":
					isUpdated = true;
					userDetails.updateUserPhoneNumber();
					break;
				case "4":
				case "EMAIL":
					isUpdated = true;
					userDetails.updateUserEmail();
					break;

				default:
					countTo++;
					System.out.println("Invalid Selection !\nPlease enter from valid options given below!");
					break;
				}
			} while (!isUpdated);
		}
	}
}
