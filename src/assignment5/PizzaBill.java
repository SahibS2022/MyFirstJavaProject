package assignment5;

//Program to calculate the final bill according the order in pizza shop

public class PizzaBill {

	public static void main(String[] args) {
		String pizzaSize = "SMALL";//size of pizza should be in Capital Letters
		boolean pepperoniTopping = false;
		boolean extraCheese = false;
		int priceForSmallPizza = 15;//small pizza price is $15
		int priceForMediumPizza = 20;//medium pizza price is $20
		int priceForLargePizza = 25;//large pizza price is $25
		int finalBill;

		if (pizzaSize == "SMALL") {
			if (pepperoniTopping && extraCheese) {
				finalBill = priceForSmallPizza + 3;//$15+$2+$1 = $18
				System.out.println("YOU ORDER SMALL PIZZA, PEPPERONNI WITH EXTRA CHEESE:");
				System.out.println("Your final Bill is $" + finalBill);
			} else if (!pepperoniTopping && extraCheese) {
				finalBill = priceForSmallPizza + 1;//$15+$0+$1 = $16
				System.out.println("YOU ORDER SMALL PIZZA WITH EXTRA CHEESE:");
				System.out.println("Your final Bill is $" + finalBill);
			} else if (pepperoniTopping && !extraCheese) {
				finalBill = priceForSmallPizza + 2;//$15+$2+$0= $17
				System.out.println("YOU ORDER SMALL PIZZA WITH PEPPERRONI TOPPING :");
				System.out.println("Your final Bill is $" + finalBill);
			} else {
				finalBill = priceForSmallPizza;//$15+$0+$0 = $15
				System.out.println("YOU ORDER SMALL PIZZA WITH ,NO PEPPERRONI TOPPING,NO EXTRA CHEESE :");
				System.out.println("Your final Bill is $" + finalBill);
			}

		} else if (pizzaSize == "MEDIUM") {
			if (pepperoniTopping && extraCheese) {
				finalBill = priceForMediumPizza + 4;//$20+$3+$1 = $24
				System.out.println("YOU ORDER MEDIUM PIZZA, PEPPERONNI WITH EXTRA CHEESE:");
				System.out.println("Your final Bill is $" + finalBill);
			} else if (!pepperoniTopping && extraCheese) {
				finalBill = priceForMediumPizza + 1;//$20+$0+$1 = $21
				System.out.println("YOU ORDER MEDIUM PIZZA WITH EXTRA CHEESE:");
				System.out.println("Your final Bill is $" + finalBill);
			} else if (pepperoniTopping && !extraCheese) {
				finalBill = priceForMediumPizza + 3;//$20+$3+$0 = $23
				System.out.println("YOU ORDER MEDIUM PIZZA WITH PEPPERRONI TOPPING :");
				System.out.println("Your final Bill is $" + finalBill);
			} else {
				finalBill = priceForMediumPizza;//$20+$0+$0 = $20
				System.out.println("YOU ORDER MEDIUM PIZZA WITH ,NO PEPPERRONI TOPPING,NO EXTRA CHEESE :");
				System.out.println("Your final Bill is $" + finalBill);
			}
		} else if (pizzaSize == "LARGE") {
			if (pepperoniTopping && extraCheese) {
				finalBill = priceForLargePizza + 4;//$25+$3+$1 = $29
				System.out.println("YOU ORDER LARGE PIZZA, PEPPERONNI WITH EXTRA CHEESE:");
				System.out.println("Your final Bill is $" + finalBill);
			} else if (!pepperoniTopping && extraCheese) {
				finalBill = priceForLargePizza + 1;//$25+$0+$1 = $26
				System.out.println("YOU ORDER MEDIUM PIZZA WITH EXTRA CHEESE:");
				System.out.println("Your final Bill is $" + finalBill);
			} else if (pepperoniTopping && !extraCheese) {
				finalBill = priceForLargePizza + 3;//$25+$3+$0 = $28
				System.out.println("YOU ORDER MEDIUM PIZZA WITH PEPPERRONI TOPPING :");
				System.out.println("Your final Bill is $" + finalBill);
			} else {
				finalBill = priceForLargePizza;//$25+$0+$0 = $25
				System.out.println("YOU ORDER MEDIUM PIZZA WITH ,NO PEPPERRONI TOPPING,NO EXTRA CHEESE :");
				System.out.println("Your final Bill is $" + finalBill);
			}

		}

	}
}
