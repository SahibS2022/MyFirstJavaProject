package assignment5;

//Program to print the multiplication table of the given number.

public class MultiplicationTable {

	public static void main(String[] args) {

		int number = 3;
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " * " + i + " = " + number * i);
		}
	}
}
