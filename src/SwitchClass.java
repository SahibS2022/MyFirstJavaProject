
public class SwitchClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1 = 2;
		int number2 = 2;
		int result;

		String operator = "+";

		switch (operator) {

		case "+": {
			result = number1 + number2;
			System.out.println(number1 + " + " + number2 + " = " + result);
			break;
		}
		case "-": {
			result = number1 - number2;
			System.out.println(number1 + " - " + number2 + " = " + result);
			break;
		}
		case "*": {
			result = number1 * number2;
			System.out.println(number1 + " * " + number2 + " = " + result);
			break;
		}
		case "/": {
			result = number1 / number2;
			System.out.println(number1 + " / " + number2 + " = " + result);
			break;
		}
		default: {
			System.out.println("Invalid Operator");
		}
		}
	}

}
