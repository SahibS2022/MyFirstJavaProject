package assignment5;

//Program to fill the tank with the bucket.

public class WaterTank {

	public static void main(String[] args) {

		int maxCapacityOfBucket;
		int maxCapacityOfTank = 100;

		for (maxCapacityOfBucket = 10; maxCapacityOfBucket <= 200; maxCapacityOfBucket += 10) {
			if (maxCapacityOfBucket <= 100) {
				System.out.println("Now Tank is filled with " + maxCapacityOfBucket + " Buckets");
				if (maxCapacityOfBucket >= 100) {
					System.out
							.println("Now Tank is filled to its maximum capacity i.e " + maxCapacityOfTank + " Litres");
					break;// Break mechanism to stop the tank from overflowing
				}
			}
		}

	}

}
