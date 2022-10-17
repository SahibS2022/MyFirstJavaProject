package libraryProblem;

import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {

		BookDetails romeoAndJuliet = new BookDetails("Romeo and Juliet", "Shakespere");
		BookDetails peaceOfMind = new BookDetails("Peace of Mind", "Allen");
		BookDetails homeBody = new BookDetails("Home Body", "Rupi Kaur");
		BookDetails twoStates = new BookDetails("Two States", "Chetan Bhagat");
		BookDetails halfGirlfriend = new BookDetails("Half Girlfriend", "Chetan Bhagat");
		BookDetails oliverTwist = new BookDetails("Oliver Twist", "Charles Dickens");
		BookDetails macbeth = new BookDetails("Macbeth", "Shakespere");
		BookDetails harrypotter1 = new BookDetails("Harry Potter and the Sorcere's Stone", "J K Rowling");
		BookDetails malgudyDays = new BookDetails("Malgudy Days", "R K Narayan");
		BookDetails alchemist = new BookDetails("Alchemist", "Paulo Coehlo");

		// Array of Objects
		BookDetails[] bookDetails = { romeoAndJuliet, peaceOfMind, homeBody, twoStates, halfGirlfriend, oliverTwist,
				macbeth, harrypotter1, malgudyDays, alchemist };
		Scanner sc = new Scanner(System.in);
		int bookCount = 0;

		do {
			if (bookCount == 3) {
				System.out.println(
						"Now you cannot issue other book from the library, As you already issued three books.\nThank You and Have a wonderful day!");
				break;
			} else {
				System.out.println("Which book you want to be issued");
				String requiredBookName = sc.nextLine();
				System.out.println("Who is the author");
				String bookAuthor = sc.nextLine();

				// Iterating over the array
				for (int i = 0; i < bookDetails.length; i++) {
					if (requiredBookName.equals(bookDetails[i].bookName) && bookAuthor.equals(bookDetails[i].authorName)
							&& !bookDetails[i].isBookIssued) {
						bookDetails[i].isBookIssued = true;
						System.out.println("The Book name " + bookDetails[i].bookName + " is been issued");
						bookCount++;
						break;
					} else if (requiredBookName.equals(bookDetails[i].bookName)
							&& bookAuthor.equals(bookDetails[i].authorName) && bookDetails[i].isBookIssued) {
						System.out.println("The Book name " + bookDetails[i].bookName
								+ " is already issued,You cannot issue the same book again");
					}
				}
			}
		} while (bookCount <= 3);
	}

}
