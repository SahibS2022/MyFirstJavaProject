package assignment_week10;

import java.text.DecimalFormat;

public class BookingCruise extends UserDetails {
	String cruiseName;
	double priceAdult;
	double priceChild;
	double priceEvent;
	int noOfDays;
	String eventName;
	double buffetForAdults;
	double buffetForChildren;
	DecimalFormat df = new DecimalFormat("0.00");

	public BookingCruise(String cruiseName, double priceAdult, double priceChild, double priceEvent, int noOfDays,
			String eventName) {
		this.cruiseName = cruiseName;
		this.priceAdult = priceAdult;
		this.priceChild = priceChild;
		this.priceEvent = priceEvent;
		this.noOfDays = noOfDays;
		this.eventName = eventName;
	}

	public BookingCruise() {
	}

	public String getSelectedCruiseName() {
		return this.cruiseName;
	}

	public int getNoOfdays() {
		return this.noOfDays;
	}

	public double getPriceAdult() {
		return this.priceAdult;
	}

	public double getPriceChild() {
		return this.priceChild;
	}

	public double getPriceEvent() {
		return this.priceEvent;
	}

	public double getBuffetPriceAdults() {
		return this.buffetForAdults;
	}

	public double getBuffetPriceChilren() {
		return this.buffetForChildren;
	}

	public String getEventName() {
		return this.eventName;
	}

	double priceForAdults(int numofAdults, double priceAdult) {
		double priceForAdults = numofAdults * priceAdult;
		return priceForAdults;
	}

	double getPriceForAddedEvent(int noOfAdults, int noOfChilds, double eventPrice) {
		priceEvent = (noOfAdults + noOfChilds) * eventPrice;
		return priceEvent;
	}

	public String getSelectedCruise() {
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
			if (count > 3) {
				System.out.println("Please Start over,you have reached the input limit");
				System.exit(0);
			}
			System.out.println("Invalid Selection try again below");
			selectedCruise = sc.nextLine();
		}
		return selectedCruise;
	}

	void setbuffetPrice(String buffetMeal) {
		if (buffetMeal.equalsIgnoreCase("Y") || buffetMeal.equalsIgnoreCase("Yes")) {
			buffetForAdults = 20.99;
			buffetForChildren = 4.99;
		}
	}

	double priceforChildren(int numofChildren, double priceChild) {
		double priceforChildren = numofChildren * priceChild;
		return priceforChildren;
	}

	double buffetTotalPriceAdult(int numofAdults) {
		double buffetTotalPriceAdult = numofAdults * buffetForAdults;
		return buffetTotalPriceAdult;
	}

	double buffetTotalPriceChild(int numofChildren) {
		double buffetTotalPriceChildren = numofChildren * buffetForChildren;
		return buffetTotalPriceChildren;
	}

	double totalPrice(double priceForAdults, double priceforChildren, double buffetTotalPriceAdult,
			double buffetTotalPriceChild, double priceEventAdded) {
		double totalPrice = priceForAdults + priceforChildren + buffetTotalPriceAdult + buffetTotalPriceChild
				+ priceEventAdded;
		return totalPrice;
	}

	double priceWithHst(double totalAmount) {
		double hstAmount = (totalAmount * 15) / 100;

		return hstAmount;
	}

	void finalPrice(String selectedCruise, double priceForAdults, double priceforChildren, double buffetTotalPriceAdult,
			double buffetTotalPriceChild, double totalPrice, double priceWithHst, int numofAdults, int numofChildren,
			String eventName, double priceEventAdded) {
		double finalPrice = totalPrice + priceWithHst;

		System.out.println("Your Package includes:\n" + selectedCruise + " Adults 		      @			" + numofAdults
				+ "	:$" + df.format(priceForAdults) + "\n" + selectedCruise + " Children above 5        @			"
				+ numofChildren + "	:$" + df.format(priceforChildren) + "\n"
				+ "Buffet Special Price Adults	      @			" + numofAdults + "	:$"
				+ df.format(buffetTotalPriceAdult) + "\n" + "Buffet Special Price Children above 5 @			"
				+ numofChildren + "	:$" + df.format(buffetTotalPriceChild) + "\n" + "For Special Event 		i.e :"
				+ eventName + "			:$" + priceEventAdded + "\n" + "Total Price					" + "		:$"
				+ df.format(totalPrice) + "\n" + "HST	@ 15%					" + "		:$"
				+ df.format(priceWithHst) + "\n" + "Final Price							: $" + df.format(finalPrice)
				+ "\n");
	}
}
