package assignment5;

/*  9.	Write a program to prepare the bill for a pizza shop.
a.	Assume an order and work out the final bill.
b.	Take the Cheese Pizza prices as: Small Pizza: $15, Medium Pizza: $20, Large Pizza: $25
c.	For additional pepperoni topping: Pepperoni for Small Pizza: +$2, Pepperoni for Medium or Large Pizza: +$3
d.	Extra cheese for any size pizza: + $1
For eg: If the Pizza is medium, pepperoni with extra cheese the program should calculate the final bill as 20+3+1 = $24 and print as
“Your final bill is $24”
 */

public class RePizzaBill {

	public static void main(String[] args) {
		char pizzaSize = 'S';// size of pizza should be in Capital Letter
		boolean pepperoniTopping = false;
		boolean extraCheese = false;
		int priceForSmallPizza = 15;// small pizza price is $15
		int priceForMediumPizza = 20;// medium pizza price is $20
		int priceForLargePizza = 25;// large pizza price is $25
		int pricePepperoniForSmall = 2;
		int pricePepperoniForMediumLarge = 3;
		int priceExtraCheese = 1;
		int finalBill = 0;

		if (pizzaSize != ' ') {
			switch (pizzaSize) {
			case 'S':
				finalBill += priceForSmallPizza;
				if (pepperoniTopping == true) {
					finalBill += pricePepperoniForSmall;
				}
				if (extraCheese == true) {
					finalBill += priceExtraCheese;
				}
				break;
			case 'M':
				finalBill += priceForMediumPizza;
				if (pepperoniTopping == true) {
					finalBill += pricePepperoniForMediumLarge;
				}
				if (extraCheese == true) {
					finalBill += priceExtraCheese;
				}
				break;
			case 'L':
				finalBill += priceForLargePizza;
				if (pepperoniTopping == true) {
					finalBill += pricePepperoniForMediumLarge;
				}
				if (extraCheese == true) {
					finalBill += priceExtraCheese;
				}
				break;
			default:
				break;
			}
			System.out.println("Your Final Bill is $" + finalBill);
		} else {
			System.out.println("Please select the Pizza Size");
		}

	}

}
