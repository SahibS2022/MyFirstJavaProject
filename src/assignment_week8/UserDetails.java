package assignment_week8;

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
			userEmail = testString;
			this.userEmail = userEmail;
		} while (!isValidEmail);

		// Input for UserName
		System.out.println("Please create Username");
		String userName = sc.nextLine();
		this.userName = userName;

		// Input for UserPassword
		System.out.println("Please create Password ");
		String userPassword = sc.nextLine();
		this.userPassword = userPassword;

		// Input for User Full Name
		System.out.println("Please enter your full name");
		String userFullName = sc.nextLine();
		this.userFullName = userFullName;

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
			System.out.println("Please enter Login to continue for Cruise Booking");
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
	}

	// Method to Update User Password
	public void updateUserPassword() {
		String currentPass = "";
		int count = 0;
		do {
			System.out.println("Please enter your Current Password");
			currentPass = sc.next();
			if (count >= 2) {
				System.out.println(
						"Please start over !\nYou have reached the limit to enter your current password!\nThank You for your service!");
				System.exit(0);
			}
			while (!userPassword.equalsIgnoreCase(currentPass)) {
				count++;
				System.out.println("Your Password is incorrect.Please try again !");
				break;
			}
		} while (!userPassword.equalsIgnoreCase(currentPass));
		System.out.println("Please enter your new Password");
		String newPass = sc.next();
		this.userPassword = newPass;
		System.out.println("You password has been changed successfully!\nThank You for your service!");
	}

	// Method to Update User's UserName
	public void updateUserName() {
		String currentUserName = "";
		int count = 0;
		do {
			System.out.println("Please enter your Current Username");
			currentUserName = sc.next();
			if (count >= 2) {
				System.out.println(
						"Please start over !\nYou have reached the limit to enter your current Username!\nThank You for your service!");
				System.exit(0);
			}
			while (!userName.equalsIgnoreCase(currentUserName)) {
				count++;
				System.out.println("Your Username is incorrect.Please try again !");
				break;
			}
		} while (!userName.equalsIgnoreCase(currentUserName));
		System.out.println("Please enter your new Username");
		String newUserName = sc.next();
		this.userName = newUserName;
		System.out.println("You username has been changed successfully!\nThank You for your service!");
	}

	// Method to Update User Email address
	public void updateUserEmail() {
		boolean isValidEmail = false;
		String currentUserEmail = "";
		int count = 0;
		do {
			System.out.println("Please enter your current email address");
			currentUserEmail = sc.next();
			if (count >= 2) {
				System.out.println(
						"Please start over !\nYou have reached the limit to enter your current Email Address!\nThank You for your service!");
				System.exit(0);
			}
			while (!userEmail.equalsIgnoreCase(currentUserEmail)) {
				count++;
				System.out.println("Your Email Address is incorrect.Please try again !");
				break;
			}
			System.out.println("Please enter your new email Address ex:xyz@gmail.com");
			String newUserEmail = sc.next();
			String email_regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
					+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
			String testString = newUserEmail;
			isValidEmail = testString.matches(email_regex);
			if (isValidEmail) {
				this.userEmail = newUserEmail;
				System.out.println("You email has been changed successfully!\nThank You for your service!");
			}
		} while (!isValidEmail);
	}

	// Method to Update User Phone Number
	public void updateUserPhoneNumber() {
		String currentUserPhoneNo = "";
		int count = 0;
		do {
			System.out.println("Please enter your Current Phone Number");
			currentUserPhoneNo = sc.next();
			if (count > 2) {
				System.out.println(
						"Please start over !\nYou have reached the limit to enter your current Phone Number!\nThank You for your service!");
				System.exit(0);
			}
			while (!userPhoneNumber.equalsIgnoreCase(currentUserPhoneNo)) {
				count++;
				System.out.println("Your Phone Number is incorrect.Please try again !");
				break;
			}
		} while (!userPhoneNumber.equalsIgnoreCase(currentUserPhoneNo));
		System.out.println("Please enter your new Phone Number");
		String newUserPhoneNo = sc.next();
		this.userPhoneNumber = newUserPhoneNo;
		System.out.println("You Phone Number has been changed successfully!\nThank You for your service!");
	}

}
