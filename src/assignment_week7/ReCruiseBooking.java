package assignment_week7;

public class ReCruiseBooking {

	String selectedCruise;
	double priceForAdult;
	double priceForChild;
	double buffetForAdults;
	double buffetForChildren;
	int noOfDays;

	public ReCruiseBooking(String cruiseName, double priceAdults, double priceChild, int numberOfDays) {
		selectedCruise = cruiseName;
		priceForAdult = priceAdults;
		priceForChild = priceChild;
		noOfDays = numberOfDays;
	}

	void setbuffetPrice(String buffetMeal) {
		if (buffetMeal.equalsIgnoreCase("Y")) {
			buffetForAdults = 20.99;
			buffetForChildren = 4.99;
		} else {
			buffetForAdults = 0.0;
			buffetForChildren = 0.0;
		}
	}

	void output(int numofAdults, int numofChildren) {
		double priceForAdults = numofAdults * priceForAdult * noOfDays;
		double priceforChildren = numofChildren * priceForChild * noOfDays;
		double buffetTotalPriceAdult = numofAdults * buffetForAdults;
		double buffetTotalPriceChildren = numofChildren * buffetForChildren;
		double totalPrice = priceForAdults + priceforChildren + buffetTotalPriceAdult + buffetTotalPriceChildren;
		double hst = (totalPrice * 15) / 100;
		double FinalPrice = totalPrice + hst;
		System.out.println("Your Package includes:\n" + selectedCruise + " Adults 		@ 		" + numofAdults + "	:$"
				+ priceForAdults + "\n" + selectedCruise + " Children above 5 @ 		" + numofChildren + "	:$"
				+ priceforChildren + "\n" + "Buffet Special Price Adults	@		" + numofAdults + "	:$"
				+ buffetTotalPriceAdult + "\n" + "Buffet Special Price Children above 5 @ 	" + numofChildren + "	:$"
				+ buffetTotalPriceChildren + "\n" + "Total Price					" + "	:$" + totalPrice + "\n"
				+ "HST	@ 15%					" + "	:$" + hst + "\n" + "Final Price						: $"
				+ FinalPrice + "\n");
	}

}
