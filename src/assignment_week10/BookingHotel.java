package assignment_week10;

import java.util.Scanner;

public class BookingHotel extends UserDetails {
	private String suiteName;
	private double suitePrice, priceAddMealChilds, priceAddMealAdults, addMealPricePerAdult, addMealPricePerChild;
	private int capacityMax, stayingDays, count;
	private double hst = 18.0;
	Scanner sc = new Scanner(System.in);

	public BookingHotel(String suiteName, int capacityMax, double suitePrice) {
		this.suiteName = suiteName;
		this.suitePrice = suitePrice;
		this.capacityMax = capacityMax;
	}

	public BookingHotel() {
	}

	protected String getSuiteName() {
		return suiteName;
	}

	protected int getNoOfAdults() {
		System.out.println("Enter the number of Adults");
		int noOfAdults = sc.nextInt();
		return noOfAdults;
	}

	protected int getNoOfChildrens() {
		System.out.println("Enter the number of Childrens");
		int noOfChildrens = sc.nextInt();
		return noOfChildrens;
	}

	protected String getSelectedSuite(Scanner sc) {
		String selectedSuite;
		int count = 0;
		boolean isValidInput = false;
		do {
			System.out.println(
					"Please enter the room you want to select.\nDelux Suite: accommodates 2 adults and 2 children at the rate of $180/ night.\nFamily Suite: accommodates 4 adults and 4 children at $230/ night.\n");
			selectedSuite = sc.next();
			while (!selectedSuite.equalsIgnoreCase("Delux") && !selectedSuite.equalsIgnoreCase("Family")
					&& selectedSuite != "") {
				count++;
				isValidInput = false;
				System.out.println("Invalid Selection try again below");
				break;
			}
			if (count > 2) {
				System.out.println("Please Start over,you have reached the input limit");
				System.exit(0);
			}
			isValidInput = true;
		} while (!isValidInput);
		return selectedSuite;
	}

	protected void isSelectedSuiteValid(int noOfAdults, int noOfChildrens) {
		boolean isValid = true;
		if (count >= 2) {
			System.out.println("Please Start over,you have reached the input limit");
			System.exit(0);
		}
		while (noOfAdults > this.capacityMax || noOfChildrens > this.capacityMax) {
			count++;
			System.out.println(
					"!!!!Please select another suite!\nThe Selected Suite is not suitable for the number of guests you have entered.!!!!\n");
			isValid = false;
			break;
		}
		if (isValid) {
			isMealAdded();
		}
	}

	private void isMealAdded() {
		System.out.println("Enter the number of days of stay:\n");
		this.stayingDays = sc.nextInt();
		System.out.println(
				"All rooms come with free breakfast.\nDo you want to add lunch in your room at a discounted pre-booking rate of $25/ adult and $5/ child ?\n");
		String isAdditionalMealAdded = sc.next();
		if (isAdditionalMealAdded.equalsIgnoreCase("Y") && !isAdditionalMealAdded.equalsIgnoreCase("Yes")) {
			this.addMealPricePerAdult = 25.0;
			this.addMealPricePerChild = 5.0;
		}
	}

	protected void calculateFinalPrice(int noOfAdults, int noOfChildrens) {
		double priceAddMealAdults = addMealPricePerAdult * noOfAdults;
		double priceAddMealChilds = addMealPricePerChild * noOfChildrens;
		double suitePriceWithDays = suitePrice * stayingDays;
		double totalPrice = suitePriceWithDays + this.priceAddMealAdults + this.priceAddMealChilds;
		double hstAmount = (totalPrice * hst) / 100;
		double finalPrice = totalPrice + hstAmount;
		System.out.println("The total amount you will be charged is\n" + suiteName.toUpperCase() + " Suite" + "		@ "
				+ stayingDays + " nights 	        :	$" + suitePriceWithDays + "\n"
				+ "Lunch Pre-Booked Special Rate Adults	@ " + noOfAdults + "	: 	$" + priceAddMealAdults + "\n"
				+ "Lunch Pre-Booked Special Rate Children @ " + noOfChildrens + "	: 	$" + priceAddMealChilds + "\n"
				+ "Total Price					: 	$" + totalPrice + "\n" + "HST	@ 18%					: 	$"
				+ hstAmount + "\n" + "Final Price					:	$" + finalPrice + "\n"
				+ "\n !!!!!!Thank You for your Service!!!!!!");
	}

}
