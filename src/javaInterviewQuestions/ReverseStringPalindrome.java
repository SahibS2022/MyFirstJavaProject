package javaInterviewQuestions;

import java.util.Scanner;

//Write a program to reverse a string and check if it is a palindrome.
public class ReverseStringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String reEnter = null;
		System.out.println("---Welcome to Program to reverse a string and check if it is a palindrome---");
		do {
			System.out.println("Please enter the string :");
			String string = sc.nextLine();
			String reverseString = "";
			for (int i = string.length() - 1; i >= 0; --i) {
				reverseString = reverseString + string.charAt(i);
			}
			System.out.println("The given string is :" + string);
			System.out.println("The reverse of given string is :" + reverseString);
			if (reverseString.equalsIgnoreCase(string)) {
				System.out.println("The given string is a Palindrome String");
			} else {
				System.out.println("The given string is not a Palindrome String");
			}
			System.out.println(
					"\nDo you want to check one more String? Please press Y \nOr press any other key to exit.\n");
			reEnter = sc.nextLine();
			while (!reEnter.equalsIgnoreCase("Y")) {
				System.out.println("Thank you for using the service!!\n");
				System.exit(0);
			}
		} while (reEnter.equalsIgnoreCase("Y"));

	}

}
