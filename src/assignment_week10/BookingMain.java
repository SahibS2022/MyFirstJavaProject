package assignment_week10;

import java.util.Scanner;

public class BookingMain {

	public static void main(String[] args) {
		String anotherBooking;
		String selectedService;
		Scanner sc = new Scanner(System.in);
		System.out.println("------Welcome To Booking Hotel/Cruise------\n");
		System.out.println("<<<<<<Please SignUp first for Booking>>>>>>\n");
		UserDetails userDetails = new UserDetails();
		userDetails.register(sc);// invoking method for User Registration
		int count = 0;
		boolean isValidInput = false;
		do {
			do {
				System.out.println("Please enter the service you want to book Hotel/Cruise:\n");
				selectedService = sc.next();
				isValidInput = true;
				while (!selectedService.equalsIgnoreCase("Hotel") && !selectedService.equalsIgnoreCase("Cruise")
						&& !selectedService.equalsIgnoreCase("")) {
					count++;
					isValidInput = false;
					System.out.println("Invalid Selection try again below");
					break;
				}
				if (count > 2) {
					System.out.println("Please Start over,you have reached the input limit");
					System.exit(0);
				}
			} while (!isValidInput);
			if (selectedService.equalsIgnoreCase("Hotel")) {
				BookingHotel bookingHotel = new BookingHotel();
				SuiteDeluxDetails suiteDeluxDetails = new SuiteDeluxDetails("Delux", 2, 180.0);
				SuiteFamilyDetails suiteFamilyDetails = new SuiteFamilyDetails("Family", 4, 230.0);
				BookingHotel[] allSuites = { suiteDeluxDetails, suiteFamilyDetails };
				String selectedSuite = bookingHotel.getSelectedSuite(sc);
				for (int i = 0; i < allSuites.length; i++) {
					if (selectedSuite.equalsIgnoreCase(allSuites[i].getSuiteName())) {
						int noOfAdults = allSuites[i].getNoOfAdults();
						int noOfChildrens = allSuites[i].getNoOfChildrens();
						allSuites[i].isSelectedSuiteValid(noOfAdults, noOfChildrens);
						allSuites[i].calculateFinalPrice(noOfAdults, noOfChildrens);
						break;
					}
				}
			} else {
				BookingCruise scenicCruiseDetails = new BookingCruise("Scenic Cruise", 43.99, 12.99, 50.0, 3, "Spa");
				BookingCruise sunsetCruiseDetails = new BookingCruise("Sunset Cruise", 52.99, 15.99, 45.0, 1,
						"Candle Light Dinner");
				BookingCruise discoveryCruiseDetails = new BookingCruise("Discovery Cruise", 39.99, 9.99, 50.0, 4,
						"Adventure");
				BookingCruise mysteryCruiseDetails = new BookingCruise("Mystery Cruise", 45.99, 12.99, 20.0, 2,
						"Casino");
				BookingCruise[] bookingCruise = { scenicCruiseDetails, sunsetCruiseDetails, discoveryCruiseDetails,
						mysteryCruiseDetails };
				String reEnter;
				int index = 0;
				String selectedCruiseName = "";
				double eventPrice = 0.0;
				String eventName = "";
				do {
					for (int i = 0; i < bookingCruise.length; i++) {
						selectedCruiseName = bookingCruise[i].getSelectedCruise(sc);
						if ((selectedCruiseName).equalsIgnoreCase(bookingCruise[i].getSelectedCruiseName())) {
							selectedCruiseName = bookingCruise[i].getSelectedCruiseName();
							index = i;
							eventName = bookingCruise[i].getEventName();
							eventPrice = bookingCruise[i].getPriceEvent();
							System.out.println("The cruise that you have selected is "
									+ bookingCruise[i].getSelectedCruiseName() + " which is a "
									+ bookingCruise[i].getNoOfdays() + " day cruise\r\n"
									+ "Price for Adults	(greater than 12)	: " + bookingCruise[i].getPriceAdult()
									+ " per day\r\n" + "Price for kids above 5			        : "
									+ bookingCruise[i].getPriceChild() + " per day\r\n" + "");
							break;
						}
					}
					System.out.println("Please press Y if you want to continue with the selection or\n"
							+ "press any other alphabet to select another");
					reEnter = sc.next();
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
				System.out.println("The " + selectedCruiseName + " have additional service on board.\ni.e " + eventName
						+ "\nDo you want to add Pre-Booking for $" + eventPrice
						+ "\nPlease press Y to Add or press any key ");
				String eventAdded = sc.next();
				bookingCruise[index].setbuffetPrice(buffetMeal);
				double priceEventAdded = bookingCruise[index].getPriceForAddedEvent(numAdults, ageAboveFive,
						eventPrice);
				bookingCruise[index].totalPriceCalculations(selectedCruiseName, priceEventAdded, numAdults,
						ageAboveFive);
			}
			System.out.println("\nDo you want to book another Hotel or Cruise\nPlease press Y to continue.\n");
			anotherBooking = sc.next();
			while (!anotherBooking.equalsIgnoreCase("Y")) {
				System.out.println("Thank You For Your service!");
				break;
			}
		} while (anotherBooking.equalsIgnoreCase("Y"));
	}
}
