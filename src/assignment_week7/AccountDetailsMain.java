package assignment_week7;

import java.util.Scanner;

public class AccountDetailsMain {

	public static void main(String[] args) {
		AccountDetails userOne = new AccountDetails("24001236556987", 1234, 4586.90);
		AccountDetails userTwo = new AccountDetails("24001236536985", 4567, 5596.67);
		AccountDetails userThree = new AccountDetails("24001236535968", 8963, 9685.34);
		AccountDetails userFour = new AccountDetails("24001236575698", 2587, 563.23);
		AccountDetails userFive = new AccountDetails("24001236534159", 4599, 478.54);

		AccountDetails accountD = new AccountDetails();

		// Array Of Objects
		AccountDetails[] accountDetails = { userOne, userTwo, userThree, userFour, userFive };
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int enteredPin = 0;
		do {
			System.out.println("Please enter your Account Number");
			String enteredAccountNumber = sc.next();
			if (!enteredAccountNumber.equals("")) {
				System.out.println("Please enter your four digit PIN");
				enteredPin = sc.nextInt();
			}
			for (int i = 0; i < accountDetails.length; i++) {
				if (accountDetails[i].userAccountNumber.equals(enteredAccountNumber)
						&& accountDetails[i].userPin == enteredPin) {
					double accountBalance = accountD.getBalance(accountDetails[i].userBalance);
					System.out.println("Your Current Account Balance is : $" + accountBalance);
					count++;
					break;
				}
			}
		} while (count< 1);
		if (count == 1) {
			System.out.println("You want to deposit or withdraw the money\n");
			String eitherDepositOrWithdraw = sc.next().toUpperCase();
			if(!eitherDepositOrWithdraw.equals("")||eitherDepositOrWithdraw.equals("DEPOSIT")||eitherDepositOrWithdraw.equals("WITHDRAW")) {
				double updatedBalance = accountD.updatedBalance(eitherDepositOrWithdraw);
				if (updatedBalance < 0) {
					System.out.println("You are not allowed to withdraw this amount.Your Balance is low.\nPlease try again.");
				} else if(eitherDepositOrWithdraw.equals("DEPOSIT")||eitherDepositOrWithdraw.equals("WITHDRAW")) {
					System.out
							.println("Your Current Balance after " + eitherDepositOrWithdraw + " is : $" + updatedBalance);
				}
			}
			

		}
	}

}
