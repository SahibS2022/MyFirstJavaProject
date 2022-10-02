
public class ANDOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 18;
		boolean isAdult = age >= 18;
		boolean hasCashMoney = true;
		boolean hasCard = false;
		boolean hasCar = true;

		if (isAdult) {
			if (hasCar && (hasCashMoney || hasCard)) {
				System.out.println("You can buy Inside");

			} else {
				System.out.println("Go Home get atleast Cash or Card for payment");
			}

		} else
			System.out.println("You are not eligible to Buy");
	}

}
