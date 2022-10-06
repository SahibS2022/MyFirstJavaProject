package assignment5;

//program that will keep adding 5 chocolates to a box which already has 27 chocolates and add a mechanism that number of chocolates should never go above 63

public class ChocolateFilling {

	public static void main(String[] args) {
		int chocolatesInBox = 27;// number of chocolates inside the box
		while (chocolatesInBox <= 100) {
			System.out.println("Now Total Chocolates in the Box are " + chocolatesInBox);
			chocolatesInBox += 5;
			if (chocolatesInBox >= 63) {
				System.out.println(
						"No more 5 Chocolates can be added to the box, It reached to the maximim capacity of box ");
				break;// By Using Break mechanism, number of chocolates should never go above 63
			}

		}

	}

}
