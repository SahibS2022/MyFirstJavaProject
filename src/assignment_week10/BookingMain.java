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
		userDetails.register();// invoking method for User Registration
		userDetails.login();// invoking method for User Login
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
				SuiteDeluxDetails suiteDeluxDetails = new SuiteDeluxDetails();
				SuiteFamilyDetails suiteFamilyDetails = new SuiteFamilyDetails();
				boolean isValid = false;
				do {
					String selectedSuite = bookingHotel.getSelectedSuite();
					if (selectedSuite.equalsIgnoreCase("Delux Suite")) {
						int maxCapacity = suiteDeluxDetails.getCapacityMax();
						int noOfAdults = suiteDeluxDetails.getNoOfAdults();
						int noOfChildrens = suiteDeluxDetails.getNoOfChildrens();
						isValid = suiteDeluxDetails.isSelectedSuiteValid(noOfAdults, noOfChildrens, maxCapacity);
						if (isValid) {
							System.out.println("Enter the number of days of stay:\n");
							int stayingDays = sc.nextInt();
							String selectedSuiteName = suiteDeluxDetails.getSuiteName();
							double selectedSuitePrice = suiteDeluxDetails.getSuitePrice();
							double suitPriceWithDays = selectedSuitePrice * stayingDays;
							suiteDeluxDetails.isMealAdded();
							double priceAddMealAdults = suiteDeluxDetails.getPriceAddMealAdults(noOfAdults);
							double priceAddMealChilds = suiteDeluxDetails.getPriceAddMealChilds(noOfChildrens);
							double totalPrice = suiteDeluxDetails.getTotalPrice(suitPriceWithDays, priceAddMealAdults,
									priceAddMealChilds);
							double hstAmount = suiteDeluxDetails.getPriceWithHst(totalPrice);
							double finalPrice = suiteDeluxDetails.getFinalPrice(totalPrice, hstAmount);
							suiteDeluxDetails.calculateFinalPrice(selectedSuiteName, stayingDays, suitPriceWithDays,
									noOfAdults, noOfChildrens, priceAddMealAdults, priceAddMealChilds, totalPrice,
									hstAmount, finalPrice);
						}
					} else {
						int maxCapacity = suiteFamilyDetails.getCapacityMax();
						int noOfAdults = suiteFamilyDetails.getNoOfAdults();
						int noOfChildrens = suiteFamilyDetails.getNoOfChildrens();
						isValid = suiteFamilyDetails.isSelectedSuiteValid(noOfAdults, noOfChildrens, maxCapacity);
						if (isValid) {
							System.out.println("Enter the number of days of stay:\n");
							int stayingDays = sc.nextInt();
							String selectedSuiteName = suiteFamilyDetails.getSuiteName();
							double selectedSuitePrice = suiteFamilyDetails.getSuitePrice();
							double suitPriceWithDays = selectedSuitePrice * stayingDays;
							suiteFamilyDetails.isMealAdded();
							double priceAddMealAdults = suiteFamilyDetails.getPriceAddMealAdults(noOfAdults);
							double priceAddMealChilds = suiteFamilyDetails.getPriceAddMealChilds(noOfChildrens);
							double totalPrice = suiteFamilyDetails.getTotalPrice(suitPriceWithDays, priceAddMealAdults,
									priceAddMealChilds);
							double hstAmount = suiteFamilyDetails.getPriceWithHst(totalPrice);
							double finalPrice = suiteFamilyDetails.getFinalPrice(totalPrice, hstAmount);
							suiteFamilyDetails.calculateFinalPrice(selectedSuiteName, stayingDays, suitPriceWithDays,
									noOfAdults, noOfChildrens, priceAddMealAdults, priceAddMealChilds, totalPrice,
									hstAmount, finalPrice);
						}
					}
				} while (!isValid);
			} else {
				BookingCruise bookingCruise = new BookingCruise();
				BookingCruise scenicCruiseDetails = new BookingCruise("Scenic Cruise", 43.99, 12.99, 50.0, 3, "Spa");
				BookingCruise sunsetCruiseDetails = new BookingCruise("Sunset Cruise", 52.99, 15.99, 45.0, 1,
						"Candle Light Dinner");
				BookingCruise discoveryCruiseDetails = new BookingCruise("Discovery Cruise", 39.99, 9.99, 50.0, 4,
						"Adventure");
				BookingCruise mysteryCruiseDetails = new BookingCruise("Mystery Cruise", 45.99, 12.99, 20.0, 2,
						"Casino");
				BookingCruise[] allbookingCruise = { scenicCruiseDetails, sunsetCruiseDetails, discoveryCruiseDetails,
						mysteryCruiseDetails };
				String reEnter;
				String selectedCruiseName = "";
				double priceAdults = 0.0;
				double priceChilds = 0.0;
				double eventPrice = 0.0;
				String eventName = "";
				do {
					String selectedCruise = bookingCruise.getSelectedCruise();
					for (int i = 0; i < allbookingCruise.length; i++) {
						if ((selectedCruise).equalsIgnoreCase(allbookingCruise[i].getSelectedCruiseName())) {
							selectedCruiseName = allbookingCruise[i].getSelectedCruiseName();
							priceAdults = allbookingCruise[i].getPriceAdult();
							priceChilds = allbookingCruise[i].getPriceChild();
							eventName = allbookingCruise[i].getEventName();
							eventPrice = allbookingCruise[i].getPriceEvent();
							System.out.println("The cruise that you have selected is "
									+ allbookingCruise[i].getSelectedCruiseName() + " which is a "
									+ allbookingCruise[i].getNoOfdays() + " day cruise\r\n"
									+ "Price for Adults	(greater than 12)	: " + allbookingCruise[i].getPriceAdult()
									+ " per day\r\n" + "Price for kids above 5			        : "
									+ allbookingCruise[i].getPriceChild() + " per day\r\n" + "");
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
				double priceEventAdded = bookingCruise.getPriceForAddedEvent(numAdults, ageAboveFive, eventPrice);
				bookingCruise.setbuffetPrice(buffetMeal);
				double priceForAdults = bookingCruise.priceForAdults(numAdults, priceAdults);
				double priceforChildren = bookingCruise.priceforChildren(ageAboveFive, priceChilds);
				double buffetTotalPriceAdult = bookingCruise.buffetTotalPriceAdult(numAdults);
				double buffetTotalPriceChild = bookingCruise.buffetTotalPriceChild(ageAboveFive);
				double totalPrice = bookingCruise.totalPrice(priceForAdults, priceforChildren, buffetTotalPriceAdult,
						buffetTotalPriceChild, priceEventAdded);
				double priceWithHst = bookingCruise.priceWithHst(totalPrice);
				bookingCruise.finalPrice(selectedCruiseName, priceForAdults, priceforChildren, buffetTotalPriceAdult,
						buffetTotalPriceChild, totalPrice, priceWithHst, numAdults, ageAboveFive, eventName,
						priceEventAdded);
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
