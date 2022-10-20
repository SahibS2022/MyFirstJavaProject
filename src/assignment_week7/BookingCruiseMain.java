package assignment_week7;

import java.util.Iterator;
import java.util.Scanner;

public class BookingCruiseMain {

	public static void main(String[] args) {

		BookingCruise secenicCruise = new BookingCruise("Secenic Cruise", 43.99, 12.99, 3);
		BookingCruise sunsetCruise = new BookingCruise("Sunset Cruise", 52.99, 15.99, 1);
		BookingCruise discoveryCruise = new BookingCruise("Discovery Cruise", 39.99, 9.99, 4);
		BookingCruise mysteryCruise = new BookingCruise("Mystery Cruise", 45.99, 12.99, 2);

		// Array of Objects
		BookingCruise[] bookingCruise = { secenicCruise, sunsetCruise, discoveryCruise, mysteryCruise };
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String selectedYes = " ";
		String selectedYesForBuffet = " ";
		String cruiseName = " ";
		int noOfAdults = 0;
		int noOfChildren = 0;
		double priceSpecialBuffetForAdults = 20.99;
		double priceSpecialBuffetForChild = 4.99;
		double finalPriceSpecialBuffetForAdults = 0.0;
		double finalPriceSpecialBuffetForChild = 0.0;
		double cruisePriceForAdults = 0.0;
		double cruisePriceForChild = 0.0;
		double agePriceForAdults = 0.0;
		double agePriceForChild = 0.0;
		double totalPrice = 0.0;
		double priceHST = 0.0;
		double finalPrice = 0.0;
		System.out.println("\nWELCOME TO THE CRUISE BOOKING\n");

		do {
			if (!selectedYes.equals("Y")) {
				System.out.println(
						"We offer 4 different packages as displayed below. Please enter the cruise that you want to select.\nSecenic Cruise\nSunset Cruise\nDiscovery Cruise\nMystery Cruise\n");
				String selectedCruise = sc.nextLine();
				if (bookingCruise.length != 0) {
					if (!selectedCruise.equals(" ")) {
						for (int i = 0; i < bookingCruise.length; i++) {
							if (selectedCruise.equals(bookingCruise[i].cruiseName)) {
								cruiseName = bookingCruise[i].cruiseName;
								cruisePriceForAdults = bookingCruise[i].priceAdults;
								cruisePriceForChild = bookingCruise[i].priceChild;
								int numberOfDays = bookingCruise[i].noOfDays;
								System.out.println("The cruise that you have selected is " + bookingCruise[i].cruiseName
										+ " which is a " + numberOfDays
										+ " day cruise\nPrice for Adults (greater than 12) : " + cruisePriceForAdults
										+ " per day\nPrice for Kids (above 5) : " + cruisePriceForChild + " per day\n");
								System.out.println(
										"Please press Y if you want to continue or press any other alphabet to select another");
								selectedYes = sc.next().toUpperCase();
								count++;
								break;
							}
						}
					}
				}
			}
		} while (count <= 1);

		if (selectedYes.equals("Y")) {
			System.out.println("Please enter the number of Adults\n");
			noOfAdults = sc.nextInt();
			if (noOfAdults != 0) {
				agePriceForAdults = noOfAdults * cruisePriceForAdults;
			}
			System.out.println("Please enter the number of children above 5 years\n");
			noOfChildren = sc.nextInt();
			if (noOfChildren != 0) {
				agePriceForChild = noOfChildren * cruisePriceForChild;
			}
			System.out.println(
					"All our cruises have food service on board. Do you want to pre-book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids?");
			selectedYesForBuffet = sc.next().toUpperCase();
			System.out.println(selectedYesForBuffet);
			if (selectedYesForBuffet.equals("YES") || selectedYesForBuffet.equals("Y")) {
				finalPriceSpecialBuffetForAdults = noOfAdults * priceSpecialBuffetForAdults;
				finalPriceSpecialBuffetForChild = noOfChildren * priceSpecialBuffetForChild;
			}
			totalPrice = agePriceForAdults + agePriceForChild + finalPriceSpecialBuffetForAdults
					+ finalPriceSpecialBuffetForChild;
			priceHST = 0.15 * totalPrice;
			finalPrice = priceHST + totalPrice;
			System.out.println(cruiseName + " Adults @ " + noOfAdults + " : $" + agePriceForAdults);
			System.out.println(cruiseName + " Children above 5 @ " + noOfChildren + " : $" + agePriceForChild);
			System.out
					.println("Buffet Special Price Adults @ " + noOfAdults + " : $" + finalPriceSpecialBuffetForAdults);
			System.out.println("Buffet Special Price Children above 5 @ " + noOfChildren + " : $"
					+ finalPriceSpecialBuffetForChild);
			System.out.println("Total Price : $" + totalPrice);
			System.out.println("HST @ 15% : $" + priceHST);
			System.out.println("Final Price : $" + finalPrice);

		}

	}

}
