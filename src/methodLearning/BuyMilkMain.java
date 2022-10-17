package methodLearning;

public class BuyMilkMain {

	public static void main(String[] args) {

		BuyMilk buyMilk = new BuyMilk();

		boolean isMilkAvailable = buyMilk.isMilkAvailable();
		if (isMilkAvailable) {
			System.out.println("Milk is available");
		} else {
			System.out.println("Milk is not available");
		}
	}

}
