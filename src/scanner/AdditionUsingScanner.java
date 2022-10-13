package scanner;

import java.util.Scanner;

public class AdditionUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the first number");
		num1 = sc.nextInt();
		System.out.println("Please enter the second number");
		num2 = sc.nextInt();
		System.out.println("Please enter the third number");
		num3 = sc.nextInt();

		int num4 = num1 + num2 + num3;

		System.out.println("The addition of given three numbers is :" + num4);

	}

}
