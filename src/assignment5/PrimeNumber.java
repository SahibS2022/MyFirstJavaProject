package assignment5;

//Program to find either the number is prime or not

public class PrimeNumber {

	public static void main(String[] args) {

		int number = 8;
		int count = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		if (count > 1) {
			System.out.println("The number " + number + " is not a prime number");
		} else {
			System.out.println("The number " + number + " is a prime number");
		}
	}

}
