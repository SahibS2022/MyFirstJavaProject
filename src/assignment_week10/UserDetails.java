package assignment_week10;

import java.util.Scanner;

public class UserDetails {
	private String userEmail;
	private String userName;
	private String userPassword;
	private String userFullName;
	private String userPhoneNumber;
	Scanner sc = new Scanner(System.in);

	// Method to Register a User
	public void register() {

		boolean isValidEmail = false;
		String userEmail = "";
		int count = 0;
		// Input for Email Address
		do {
			if (count >= 3) {
				System.out.println(
						"Please start over you have reached the limit to enter Valid email address!\nThank You for your service!");
				System.exit(0);
			}
			System.out.println("Please enter your email address ex:xyz@gmail.com");
			userEmail = sc.nextLine();
			String email_regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
					+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
			String testString = userEmail;
			isValidEmail = testString.matches(email_regex);
			while (!isValidEmail) {
				count++;
				System.out.println("Invalid Email Address!");
				break;
			}
			this.userEmail = testString;
		} while (!isValidEmail);

		// Input for UserName
		System.out.println("Please create Username");
		this.userName = sc.nextLine();

		// Input for UserPassword
		System.out.println("Please create Password ");
		this.userPassword = sc.nextLine();

		// Input for User Full Name
		System.out.println("Please enter your full name");
		this.userFullName = sc.nextLine();

		// Input for User Phone Number
		String userPhoneNumber = "";
		int countPhone = 0;
		do {
			System.out.println("Please enter your 10-Digits Phone Number");
			userPhoneNumber = sc.nextLine();
			if (countPhone >= 2) {
				System.out.println(
						"Please start over you have reached the limit to enter Valid Phone Number!\nThank You for your service!");
				System.exit(0);
			}
			while (userPhoneNumber.length() != 10) {
				count++;
				System.out.println("Invalid Phone Number!\nPhone Number must be 10 digits only!");
				break;
			}
			this.userPhoneNumber = userPhoneNumber;
		} while (userPhoneNumber.length() != 10);
		System.out.println("Thank you for your Registration ! ");
	}

	// Method for authentication to login
	public void login() {
		boolean isValidCredentials = false;
		String enteredLogin = "";
		int loginCount = 0;
		int count = 0;
		do {
			System.out.println("Please enter Login to Continue");
			enteredLogin = sc.next();
			while (!enteredLogin.equalsIgnoreCase("Login")) {
				if (loginCount >= 2) {
					System.out.println(
							"Please start over you have reached the limit to Login!\nThank You for your service!");
					System.exit(0);
				}
				System.out.println("Invalid Selection try again below");
				loginCount++;
				enteredLogin = sc.nextLine();
				break;
			}
		} while (!enteredLogin.equalsIgnoreCase("Login"));
		do {
			System.out.println("Please enter your username");
			String loginUsername = sc.next();
			System.out.println("Please enter your Password");
			String loginPassword = sc.next();
			isValidCredentials = true;
			while (!userName.equalsIgnoreCase(loginUsername) || !userPassword.equalsIgnoreCase(loginPassword)) {
				count++;
				if (count >= 3) {
					System.out.println(
							"Please Start over,you have reached the limit to Login!\nThank You for your service!");
					System.exit(0);
				}
				System.out.println("Either your Username or Password is incorrect. Please Try again !");
				isValidCredentials = false;
				break;
			}
		} while (!isValidCredentials);
		System.out.println("You have Login successfully !");
	}
}
