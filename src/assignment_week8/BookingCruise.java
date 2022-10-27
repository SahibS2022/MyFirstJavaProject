package assignment_week8;

import java.text.DecimalFormat;

public class BookingCruise {
	String selectedCruise;
	double priceForAdult;
	double priceForChild;
	double buffetForAdults;
	double buffetForChildren;
	int noOfDays;
	DecimalFormat df = new DecimalFormat("0.00");

	public BookingCruise(String cruiseName, double priceAdults, double priceChild, int numberOfDays) {
		selectedCruise = cruiseName;
		priceForAdult = priceAdults;
		priceForChild = priceChild;
		noOfDays = numberOfDays;
	}

	void setbuffetPrice(String buffetMeal) {
		if (buffetMeal.equalsIgnoreCase("Y")) {
			buffetForAdults = 20.99;
			buffetForChildren = 4.99;
		}
	}

	double priceForAdults(int numofAdults) {
		double priceForAdults = numofAdults * priceForAdult * noOfDays;

		return priceForAdults;
	}

	double priceforChildren(int numofChildren) {
		double priceforChildren = numofChildren * priceForChild * noOfDays;

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
			double buffetTotalPriceChild) {
		double totalPrice = priceForAdults + priceforChildren + buffetTotalPriceAdult + buffetTotalPriceChild;

		return totalPrice;
	}

	double priceWithHst(double totalAmount) {
		double hstAmount = (totalAmount * 15) / 100;

		return hstAmount;
	}

	void finalPrice(double priceForAdults, double priceforChildren, double buffetTotalPriceAdult,
			double buffetTotalPriceChild, double totalPrice, double priceWithHst, int numofAdults, int numofChildren) {
		double finalPrice = totalPrice + priceWithHst;

		System.out.println("Your Package includes:\n" + selectedCruise + " Adults 		@ 		" + numofAdults + "	:$"
				+ df.format(priceForAdults) + "\n" + selectedCruise + " Children above 5 @ 		" + numofChildren
				+ "	:$" + df.format(priceforChildren) + "\n" + "Buffet Special Price Adults	@		" + numofAdults
				+ "	:$" + df.format(buffetTotalPriceAdult) + "\n" + "Buffet Special Price Children above 5 @ 	"
				+ numofChildren + "	:$" + df.format(buffetTotalPriceChild) + "\n" + "Total Price					"
				+ "	:$" + df.format(totalPrice) + "\n" + "HST	@ 15%					" + "	:$"
				+ df.format(priceWithHst) + "\n" + "Final Price						: $" + df.format(finalPrice)
				+ "\n");
	}
}
