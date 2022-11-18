package javaInterviewQuestions;

import java.util.Scanner;

//program to find if the number is prime or not.
public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---Welcome to Program to check whether a given number is Prime or Not---");
		String reEnter = null;
		do {
			System.out.println("Please enter the number:");
			int num = sc.nextInt();
			int count = 0;
			for (int i = 1; i <= num / 2; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println("The num " + num + " is not a prime number.");
			} else {
				System.out.println("The num " + num + " is a prime number.");
			}
			System.out.println("\nDo you want to check another? Press Y or press any other key to exit.");
			reEnter = sc.next();
			while (!reEnter.equalsIgnoreCase("Y")) {
				System.out.println("Thank you for your service!!");
				System.exit(0);
			}
		} while (reEnter.equalsIgnoreCase("Y"));

	}

}
