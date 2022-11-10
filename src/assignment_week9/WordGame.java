package assignment_week9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WordGame {
	private String chosenWord;
	private String underscoredWord = "";
	private String wronglyGuessedWords = "";
	private int count = 0;
	Scanner sc = new Scanner(System.in);

	// method to start the game by reading the given text file from the system
	public void startGame() {
		try {
			// Reading file from file location by using Buffer Reader class
			BufferedReader nameList = new BufferedReader(
					new FileReader("C:\\Users\\Sahib\\Desktop\\Pivot Coaching\\Assignments\\NameList.txt"));
			getRandomWord(nameList);// method to get the random name from list of names
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// method to get random word from name list
	private void getRandomWord(BufferedReader nameList) {
		String name = "";
		String playAgain = "";
		ArrayList<String> nameArrayList = new ArrayList<String>();// Create an ArrayList object named as nameArrayList
		try {
			name = nameList.readLine();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		while (name != null) {
			nameArrayList.add(name);
			try {
				name = nameList.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		do {
			count = 0;
			wronglyGuessedWords = "";
			Random random = new Random();// choose a random name from the nameArrayList
			chosenWord = nameArrayList.get(random.nextInt(nameArrayList.size())).toUpperCase();
			underscoredWord = new String(new char[chosenWord.length()]).replace("\0", "_");
			System.out.println("-----Welcome to Guess the Student Name Game-----\n");
			while (underscoredWord.contains("_")) {
				if (count >= 5) {
					System.out.println("Please start again!.You've loose all your 5 points to guess a student name.");
					break;
				}
				System.out.println("You are guessing student name:");
				System.out.println(underscoredWord);
				System.out.println("You have guessed (" + count + ") wrong letters: " + wronglyGuessedWords);
				System.out.println("Guess a letter: ");
				String guess = sc.next().toUpperCase();
				checkingGuess(guess);// method to verify the entered guess from user
			}
			System.out.println("\nPlease press Y to play again! or press any other key to exit!");
			playAgain = sc.next();
			while (!playAgain.equalsIgnoreCase("Y")) {
				System.out.println("Good Luck for Next Time!");
				System.exit(0);
			}
		} while (playAgain.equalsIgnoreCase("Y"));
	}

	// method to verify the entered guess from user
	private void checkingGuess(String guess) {
		String newUnderscoredWord = "";
		for (int i = 0; i < chosenWord.length(); i++) {
			if (chosenWord.charAt(i) == guess.charAt(0)) {
				newUnderscoredWord += guess.charAt(0);
			} else if (underscoredWord.charAt(i) != '_') {
				newUnderscoredWord += chosenWord.charAt(i);
			} else {
				newUnderscoredWord += "_";
			}
		}
		if (!underscoredWord.equalsIgnoreCase(newUnderscoredWord)) {
			underscoredWord = newUnderscoredWord;
		} else {
			count++;
			wronglyGuessedWords += guess + " ";
			wrongAttemts();// method to print the statements on each wrong guess by using count
		}
		if (underscoredWord.equals(chosenWord)) {
			System.out.println(
					"\n!!!!WINNER!!!! \nSo pleased to see you accomplishing great things !\nCongratulations on a well-deserved win! You played so beautifully. \nThe Student name was "
							+ chosenWord);
		}
	}

	// method to print the statements on each wrong guess by using count
	private void wrongAttemts() {
		switch (count) {
		case 1:
			System.out.println("Wrong guess, please try again");
			System.out.println("You can do it !");
			break;
		case 2:
			System.out.println("Wrong guess, please try again");
			System.out.println("To Win the game, Just remain in the game !");
			break;
		case 3:
			System.out.println("Wrong guess, please try again");
			break;
		case 4:
			System.out.println("Wrong guess, please try again");
			System.out.println("Its hard to beat a person, who never give up!");
			break;
		case 5:
			System.out.println("GAME OVER!\nBetter Luck Next Time!");
			break;
		default:
			System.out.println("INVALID COUNT");
			break;
		}
	}
}
