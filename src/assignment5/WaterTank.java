package assignment5;

//Program to fill the tank with the bucket.

public class WaterTank {

	public static void main(String[] args) {

		int maxCapacityOfBucket = 10;
		int maxCapacityOfWaterTank = 100;
		int waterInTank = 0;

		if (maxCapacityOfBucket <= 10) {
			for (waterInTank = 2; waterInTank <= maxCapacityOfWaterTank; waterInTank += maxCapacityOfBucket) {
				System.out.println("Now Tank is filled with " + waterInTank + " Litres.");
				if (waterInTank > 90) {
					System.out
							.println("Tank is filled to the maximum capacity,It get overflowed if you add more water.");
					break;// Break mechanism to stop the tank from overflowing
				}

			}
		} else {
			System.out.println("Maximum Capacity of Bucket is " + maxCapacityOfBucket + " Litres");
		}
	}
}
