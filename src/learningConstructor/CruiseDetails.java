package learningConstructor;

import java.text.DecimalFormat;

public class CruiseDetails {
	String cruiseSelection;
	double priceForAdult;
	double priceForchildren;
	int numDay;

	double buffetForAdults;
	double buffetForChildren;
	DecimalFormat df = new DecimalFormat("0.00");

	public CruiseDetails(String SelectCruise, double adultPrice, double childrenPrice, int numOfDay) {
		cruiseSelection = SelectCruise;
		priceForAdult = adultPrice;
		priceForchildren = childrenPrice;
		numDay = numOfDay;
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
		double priceForAdults = numofAdults * priceForAdult * numDay;
		double priceforChildren = numofChildren * priceForchildren * numDay;
		double buffetTotalPriceAdult = numofAdults * buffetForAdults;
		double buffetTotalPriceChildren = numofChildren * buffetForChildren;
		double totalPrice = priceForAdults + priceforChildren + buffetTotalPriceAdult + buffetTotalPriceChildren;
		double hst = (totalPrice * 15) / 100;
		double FinalPrice = totalPrice + hst;
		System.out.println("Your Package includes:\n" + cruiseSelection + " Adults 		@ 		" + numofAdults + "	:$"
				+ df.format(priceForAdults) + "\n" + cruiseSelection + " Children above 5 @ 		" + numofChildren
				+ "	:$" + df.format(priceforChildren) + "\n" + "Buffet Special Price Adults	@		" + numofAdults
				+ "	:$" + df.format(buffetTotalPriceAdult) + "\n" + "Buffet Special Price Children above 5 @ 	"
				+ numofChildren + "	:$" + df.format(buffetTotalPriceChildren) + "\n" + "Total Price					"
				+ "	:$" + df.format(totalPrice) + "\n" + "HST	@ 15%					" + "	:$" + df.format(hst)
				+ "\n" + "Final Price						: $" + df.format(FinalPrice) + "\n");
	}

}
