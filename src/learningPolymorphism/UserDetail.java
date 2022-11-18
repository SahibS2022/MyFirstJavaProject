package learningPolymorphism;

import java.util.Scanner;

public class UserDetail {
	private String userEmail, userName, userPassword, userFullName, userPhoneNumber;

	public void register(Scanner sc) {
		System.out.println("------Welcome To Booking Hotel/Cruise------\n");
		System.out.println("<<<<<<Please SignUp first for Booking>>>>>>\n");
		boolean isValidEmail = false;
		String userEmail = "";
		int count = 0;
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
		System.out.println("Please create Username");
		this.userName = sc.nextLine();
		System.out.println("Please create Password ");
		this.userPassword = sc.nextLine();
		System.out.println("Please enter your full name");
		this.userFullName = sc.nextLine();
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
		login(sc);
	}

	private void login(Scanner sc) {
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

	public void finalCalculations(Scanner sc) {
	}

	public String getSelectedService(Scanner sc) {
		boolean isValidInput = false;
		int count = 0;
		String selectedService;
		do {
			System.out.println("Please enter the service you want to book Hotel/Cruise:\n");
			selectedService = sc.next();
			isValidInput = true;
			while (!selectedService.equalsIgnoreCase("Hotel") && !selectedService.equalsIgnoreCase("Cruise")
					&& !selectedService.equalsIgnoreCase("")) {
				count++;
				isValidInput = false;
				System.out.println("Invalid Selection try again below");
				break;
			}
			if (count > 2) {
				System.out.println("Please Start over,you have reached the input limit");
				System.exit(0);
			}
		} while (!isValidInput);
		return selectedService;
	}
}
