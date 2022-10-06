package assignment5;

//Program to make simple calculator operations using Switch case

public class CalculatorUsingSwitch {

	public static void main(String[] args) {
		int number1 = 2;
		int number2 = 2;
		int result;

		char operator = '+';

		switch (operator) {

		case '+': {
			result = number1 + number2;
			System.out.println(number1 + " + " + number2 + " = " + result);
			break;
		}
		case '-': {
			result = number1 - number2;
			System.out.println(number1 + " - " + number2 + " = " + result);
			break;
		}
		case '*': {
			result = number1 * number2;
			System.out.println(number1 + " * " + number2 + " = " + result);
			break;
		}
		case '/': {
			result = number1 / number2;
			System.out.println(number1 + " / " + number2 + " = " + result);
			break;
		}
		default: {
			System.out.println("Invalid Operator");
			break;
		}
		}

	}

}
