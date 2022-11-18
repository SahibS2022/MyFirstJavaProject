package learningPolymorphism;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BookCruise extends UserDetail{
	private String cruiseName, eventName;
	private double priceAdult, priceChild, priceEvent, buffetForAdults, buffetForChildren;
	private int noOfDays;
	DecimalFormat df = new DecimalFormat("0.00");
	
	public BookCruise(String cruiseName, double priceAdult, double priceChild, double priceEvent, int noOfDays,
			String eventName) {
		this.cruiseName = cruiseName;
		this.priceAdult = priceAdult;
		this.priceChild = priceChild;
		this.priceEvent = priceEvent;
		this.noOfDays = noOfDays;
		this.eventName = eventName;
	}

	public BookCruise() {
	}

	protected String getSelectedCruiseName() {
		return this.cruiseName;
	}

	protected int getNoOfdays() {
		return this.noOfDays;
	}

	protected double getPriceAdult() {
		return this.priceAdult;
	}

	protected double getPriceChild() {
		return this.priceChild;
	}

	protected double getPriceEvent() {
		return this.priceEvent;
	}

	protected String getEventName() {
		return this.eventName;
	}

	protected double getPriceForAddedEvent(int noOfAdults, int noOfChilds, double eventPrice) {
		priceEvent = (noOfAdults + noOfChilds) * eventPrice;
		return priceEvent;
	}

	protected String getSelectedCruise(Scanner sc) {
		String selectedCruise;
		System.out.println(
				"We offer 4 different packages as displayed below. Please enter the cruise that you want to select.\n"
						+ "Scenic Cruise\nSunset Cruise\nDiscovery Cruise\nMystery Cruise\n");
		selectedCruise = sc.nextLine();
		int count = 1;
		while (!selectedCruise.equalsIgnoreCase("Scenic Cruise") && !selectedCruise.equalsIgnoreCase("Sunset Cruise")
				&& !selectedCruise.equalsIgnoreCase("Discovery Cruise")
				&& !selectedCruise.equalsIgnoreCase("Mystery Cruise")) {
			count++;
			System.out.println("Invalid Selection try again below");
			selectedCruise = sc.nextLine();
		}
		return selectedCruise;
	}

	protected void setbuffetPrice(String buffetMeal) {
		if (buffetMeal.equalsIgnoreCase("Y") || buffetMeal.equalsIgnoreCase("Yes")) {
			buffetForAdults = 20.99;
			buffetForChildren = 4.99;
		}
	}

	protected void totalPriceCalculations(String selectedCruiseName, double priceEventAdded, int numOfAdults,
			int ageAboveFive) {
		double priceForAdults = numOfAdults * priceAdult;
		double priceForChildren = ageAboveFive * priceChild;
		double buffetTotalPriceAdult = numOfAdults * buffetForAdults;
		double buffetTotalPriceChildren = ageAboveFive * buffetForChildren;
		double totalPrice = priceForAdults + priceForChildren + buffetTotalPriceAdult + buffetTotalPriceChildren
				+ priceEventAdded;
		double hstAmount = (totalPrice * 15) / 100;
		double finalPrice = totalPrice + hstAmount;
		System.out.println("Your Package includes:\n" + selectedCruiseName + " Adults 		      @			"
				+ numOfAdults + "	:$" + df.format(priceForAdults) + "\n" + cruiseName
				+ " Children above 5        @			" + ageAboveFive + "	:$" + df.format(priceForChildren) + "\n"
				+ "Buffet Special Price Adults	      @			" + numOfAdults + "	:$"
				+ df.format(buffetTotalPriceAdult) + "\n" + "Buffet Special Price Children above 5 @			"
				+ ageAboveFive + "	:$" + df.format(buffetTotalPriceChildren) + "\n" + "For Special Event 		i.e :"
				+ eventName + "			:$" + priceEventAdded + "\n" + "Total Price					" + "		:$"
				+ df.format(totalPrice) + "\n" + "HST	@ 15%					" + "		:$" + df.format(hstAmount)
				+ "\n" + "Final Price							: $" + df.format(finalPrice) + "\n");
	}
}
