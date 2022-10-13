package assignment_week6;

import java.util.Scanner;

public class CellPhone {

	int modelAmount = 0;
	int planAmount = 0;
	String selectedModelOfBrand;
	int amountS22 = 25;
	int amountS22Plus = 35;
	int amountS22Ultra = 55;
	int amountS22Fe = 20;
	int amountIPhone14 = 30;
	int amountIPhone14Pro = 40;
	int amountIPhone14ProMax = 65;
	int amountIphone14Mini = 25;
	int amountPlanRogers = 70;
	int amountPlanTelus = 75;
	int amountPlanBell = 80;
	Scanner sc = new Scanner(System.in);

	int amountOfSelectedBrandModel(String selectedModelOfBrand) {
		if (selectedModelOfBrand != " ") {
			switch (selectedModelOfBrand) {
			case "S22":
				modelAmount = amountS22;
				break;
			case "S22+":
				modelAmount = amountS22Plus;
				break;
			case "S22 ULTRA":
				modelAmount = amountS22Ultra;
				break;
			case "S22FE":
				modelAmount = amountS22Fe;
				break;
			case "IPHONE 14":
				modelAmount = amountIPhone14;
				break;
			case "IPHONE 14 PRO":
				modelAmount = amountIPhone14Pro;
				break;
			case "IPHONE 14 PRO MAX":
				modelAmount = amountIPhone14ProMax;
				break;
			case "IPHONE 14 MINI":
				modelAmount = amountIphone14Mini;
				break;
			default:
				System.out.println("INVALID_INPUT");

			}
		}
		return modelAmount;
	}

	int totalAmountOfSelectedModelWithPlan(String selectedPlan) {

		if (selectedPlan != " ") {
			switch (selectedPlan) {
			case "ROGERS":
				planAmount = amountPlanRogers;
				break;
			case "TELUS":
				planAmount = amountPlanTelus;
				break;
			case "BELL":
				planAmount = amountPlanBell;
				break;

			default:
				System.out.println("INVALID_INPUT");
				break;
			}
		}

		return planAmount;
	}

}
