package assignment_week10;

public class BookingHotel extends UserDetails {
	double addMealPricePerAdult;
	double addMealPricePerChild;
	double hst = 18.0;
	int count;

	public int getNoOfAdults() {
		System.out.println("Enter the number of Adults");
		int noOfAdults = sc.nextInt();
		return noOfAdults;
	}

	public int getNoOfChildrens() {
		System.out.println("Enter the number of Childrens");
		int noOfChildrens = sc.nextInt();
		return noOfChildrens;
	}

	public String getSelectedSuite() {
		String selectedSuite;
		int count = 0;
		System.out.println(
				"Please enter the room you want to select.\nDelux Suite: accommodates 2 adults and 2 children at the rate of $180/ night.\nFamily Suite: accommodates 4 adults and 4 children at $230/ night.\n");
		selectedSuite = sc.nextLine();
		while (!selectedSuite.equalsIgnoreCase("Delux Suite") && !selectedSuite.equalsIgnoreCase("Family Suite")
				&& selectedSuite != "") {
			count++;
			if (count > 2) {
				System.out.println("Please Start over,you have reached the input limit");
				System.exit(0);
			}
			System.out.println("Invalid Selection try again below");
			selectedSuite = sc.nextLine();
		}
		return selectedSuite;
	}

	public boolean isSelectedSuiteValid(int noOfAdults, int noOfChildens, int maxCapacity) {
		boolean isValid = true;
		if (count >= 2) {
			System.out.println("Please Start over,you have reached the input limit");
			System.exit(0);
		}
		while (noOfAdults > maxCapacity || noOfChildens > maxCapacity) {
			count++;
			System.out.println(
					"!!!!Please select another suite!\nThe Selected Suite is not suitable for the number of guests you have entered.!!!!\n");
			isValid = false;
			break;
		}
		return isValid;
	}

	public void isMealAdded() {
		System.out.println(
				"All rooms come with free breakfast.\nDo you want to add lunch in your room at a discounted pre-booking rate of $25/ adult and $5/ child ?\n");
		String isAdditionalMealAdded = sc.next();
		if (isAdditionalMealAdded.equalsIgnoreCase("Y") && !isAdditionalMealAdded.equalsIgnoreCase("Yes")) {
			this.addMealPricePerAdult = 25.0;
			this.addMealPricePerChild = 5.0;
		}
	}

	public double getPriceAddMealAdults(int noOfAdults) {
		double priceAddMealAdult = addMealPricePerAdult * noOfAdults;
		return priceAddMealAdult;
	}

	public double getPriceAddMealChilds(int noOfChildrens) {
		double priceAddMealChilds = addMealPricePerChild * noOfChildrens;
		return priceAddMealChilds;
	}

	public double getTotalPrice(double suitPriceWithDays, double finalAddMealPriceAdult,
			double finalAddMealPriceChild) {
		double totalPrice = suitPriceWithDays + finalAddMealPriceAdult + finalAddMealPriceChild;
		return totalPrice;
	}

	public double getPriceWithHst(double totalPrice) {
		double hstAmount = (totalPrice * hst) / 100;
		return hstAmount;
	}

	public double getFinalPrice(double totalPrice, double hstAmount) {
		double finalPrice = totalPrice + hstAmount;
		return finalPrice;
	}

	public void calculateFinalPrice(String selectedSuiteName, int stayingDays, double suitePriceWithDays,
			int noOfAdults, int noOfChildrens, double priceAddMealAdults, double priceAddMealChilds, double totalPrice,
			double hstAmount, double finalPrice) {
		System.out.println("The total amount you will be charged is\n" + selectedSuiteName.toUpperCase() + "		@ "
				+ stayingDays + " nights 	        :	$" + suitePriceWithDays + "\n"
				+ "Lunch Pre-Booked Special Rate Adults	@ " + noOfAdults + "	: 	$" + priceAddMealAdults + "\n"
				+ "Lunch Pre-Booked Special Rate Children @ " + noOfChildrens + "	: 	$" + priceAddMealChilds + "\n"
				+ "Total Price					: 	$" + totalPrice + "\n" + "HST	@ 18%					: 	$"
				+ hstAmount + "\n" + "Final Price					:	$" + finalPrice + "\n"
				+ "\n !!!!!!Thank You for your Service!!!!!!");
	}

}
