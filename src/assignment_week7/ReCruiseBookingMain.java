package assignment_week7;

import java.util.Scanner;

public class ReCruiseBookingMain {

	public static void main(String[] args) {
		String selectedCruise;
		Scanner sc = new Scanner(System.in);
		ReCruiseBooking secenicCruise = new ReCruiseBooking("Secenic Cruise", 43.99, 12.99, 3);
		ReCruiseBooking sunsetCruise = new ReCruiseBooking("Sunset Cruise", 52.99, 15.99, 1);
		ReCruiseBooking discoveryCruise = new ReCruiseBooking("Discovery Cruise", 39.99, 9.99, 4);
		ReCruiseBooking mysteryCruise = new ReCruiseBooking("Mystery Cruise", 45.99, 12.99, 2);

		ReCruiseBooking[] ReCruiseBooking = { secenicCruise, sunsetCruise, discoveryCruise, mysteryCruise };
		int index = 0;
		String again;

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

			for (int i = 0; i < ReCruiseBooking.length; i++) {
				if ((selectedCruise).equalsIgnoreCase(ReCruiseBooking[i].selectedCruise)) {
					index = i;
					System.out.println("The cruise that you have selected is " + ReCruiseBooking[i].selectedCruise
							+ " which is a " + ReCruiseBooking[i].noOfDays + " day cruise\r\n"
							+ "Price for Adults	(greater than 12)	: " + ReCruiseBooking[i].priceForAdult
							+ " per day\r\n" + "Price for kids above 5			: " + ReCruiseBooking[i].priceForChild
							+ " per day\r\n" + "");
					break;
				}
			}
			System.out.println("Please press Y if you want to continue with the selection or\n"
					+ "press any other alphabet to select another");
			again = sc.nextLine();
		} while (!again.equalsIgnoreCase("Y"));
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
		ReCruiseBooking[index].setbuffetPrice(buffetMeal);
		ReCruiseBooking[index].output(numAdults, ageAboveFive);
	}

}
