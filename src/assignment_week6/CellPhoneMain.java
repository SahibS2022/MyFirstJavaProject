package assignment_week6;

import java.util.Scanner;

public class CellPhoneMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CellPhone cp = new CellPhone();
		String selectedModelOfBrand = " ";
		String selectedBrand = " ";

		// Input for the Brand Type
		System.out.println("Please enter the Brand that you want to choose from: Apple/Samsung\n");
		selectedBrand = sc.nextLine().toUpperCase();
		if (selectedBrand.equals("SAMSUNG")) {
			System.out.println("Please enter a model that you want to buy from below \nS22\nS22+\nS22 Ultra\nS22FE\n");
		} else if (selectedBrand.equals("APPLE")) {
			System.out.println(
					"Please enter a model that you want to buy from below \nIPhone 14\nIPhone 14 pro\nIPhone 14 pro max\nIphone 14 mini\n");
		} else {
			System.out.println("Please enter either Samsung or Apple");
		}

		// Input for the selection of model according to the Selected Brand
		selectedModelOfBrand = sc.nextLine().toUpperCase();
		int modelAmount = cp.amountOfSelectedBrandModel(selectedModelOfBrand);
		if (selectedModelOfBrand.equals("INVALID_INPUT") || selectedModelOfBrand.equals(" ")) {
			System.out.println("Please select the Model First");
		} else {
			System.out.println("Please select the plan that you want to opt for:Rogers/ Telus/ Bell\n");
		}
		String selectedPlan = sc.next().toUpperCase();
		int planAmount = cp.totalAmountOfSelectedModelWithPlan(selectedPlan);
		int finalAmount = modelAmount + planAmount;
		if (finalAmount != 0) {
			System.out.println("You have Selected " + selectedModelOfBrand + " with " + selectedPlan + " Plan.");
			System.out.println("Your Phone Tab will be: $" + modelAmount);
			System.out.println("Your Monthly Plan will be: $" + planAmount);
			System.out.println("Your Total Monthly Amount: $" + finalAmount);

		}
	}

}
