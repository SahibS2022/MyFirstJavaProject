package assignment_week7;

import java.util.Scanner;

public class AccountDetails {
	String userAccountNumber;
	int userPin;
	double userBalance;
	Scanner sc = new Scanner(System.in);

	AccountDetails(String accountNumber, int pin, double balance) {
		userAccountNumber = accountNumber;
		userPin = pin;
		userBalance = balance;
	}

	public AccountDetails() {
	}

	public double getBalance(double currentUserBalance) {
		userBalance = currentUserBalance;
		return userBalance;
	}

	public double updatedBalance(String eitherDepositOrWithdraw) {
		double amount = 0.0;
		if (eitherDepositOrWithdraw != " ") {
			switch (eitherDepositOrWithdraw) {
			case "DEPOSIT":
				System.out.println("Enter the amount you want to deposit\n");
				double amountToDeposit = sc.nextDouble();
				amount = userBalance + amountToDeposit;
				break;
			case "WITHDRAW":
				System.out.println("Enter the amount you want to withdraw\n");
				double amountToWithdraw = sc.nextDouble();
				amount = userBalance - amountToWithdraw;
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
		}
		return amount;
	}
}
