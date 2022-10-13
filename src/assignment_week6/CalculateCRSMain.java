package assignment_week6;

import java.util.Scanner;

public class CalculateCRSMain {

	public static void main(String[] args) {
		String educationLevel = " ";
		int experienceInYears;
		int scoreOfEducationLevel;
		int scoreOfExperience;
		int scoreOfAge;
		int scoreAreRelativesInCanada;
		int scoreIsStudyDurationMoreThanTwoYearsInCanada;
		int scoreIsStudyInCanada;
		int scoreBandsInListening;
		int scoreBandsInSpeaking;
		int scoreBandsInReading;
		int scoreBandsInWriting;
		char isStudyDurationMoreThanTwoYearsInCanada;
		int age;
		float bandsInListening;
		float bandsInSpeaking;
		float bandsInReading;
		float bandsInWriting;
		char areRelativesInCanada;
		char isStudyInCanada;
		int totalScore = 0;
		Scanner sc = new Scanner(System.in);
		CalulateCRS calcrs = new CalulateCRS();// Instantiate class CalculateCRS

		// Input for Education Level
		System.out.println(
				"Enter your Education Level: \nPHD\nMasters\nTwo or more university degrees/diplomas at the bachelor's level one of which is a three years or longer duration\n12th+ Three years or longer Degree/Diploma\n");
		educationLevel = sc.nextLine().toUpperCase();
		scoreOfEducationLevel = calcrs.scoreOfEducationLevel(educationLevel);

		// Input for Experience Level
		System.out.println("Enter your Experience in years: \n");
		experienceInYears = sc.nextInt();
		scoreOfExperience = calcrs.scoreOfExperience(experienceInYears);

		// Input for Age
		System.out.println("Enter your Age in years: \n");
		age = sc.nextInt();
		scoreOfAge = calcrs.scoreOfAge(age);

		// Input for Bands In Listening
		System.out.println("Enter your IELTS Score for Listening: \n");
		bandsInListening = sc.nextFloat();
		scoreBandsInListening = calcrs.scoreOfListeningBands(bandsInListening);

		// Input for Bands In Speaking
		System.out.println("Enter your IELTS Score for Speaking: \n");
		bandsInSpeaking = sc.nextFloat();
		scoreBandsInSpeaking = calcrs.scoreOfSpeakingBands(bandsInSpeaking);

		// Input for Bands In Reading
		System.out.println("Enter your IELTS Score for Reading: \n");
		bandsInReading = sc.nextFloat();
		scoreBandsInReading = calcrs.scoreOfReadingBands(bandsInReading);

		// Input for Bands In Writing
		System.out.println("Enter your IELTS Score for Writing: \n");
		bandsInWriting = sc.nextFloat();
		scoreBandsInWriting = calcrs.scoreOfWritingBands(bandsInWriting);

		// Are relatives In Canada
		System.out.println(
				"If you have a relative  in Canada(Parents, Grand Parents, Brother, Sister, Aunt, Uncle, Nephew or Niece) who is a Canadian Citizen or PR holder (Y/N): \n");
		areRelativesInCanada = sc.next().charAt(0);
		scoreAreRelativesInCanada = calcrs.areRelativesInCanada(areRelativesInCanada);

		// Is study In Canada
		System.out.println("Have you studied in Canada for atleast 2 years(Y/N): \n");
		isStudyInCanada = sc.next().charAt(0);
		scoreIsStudyInCanada = calcrs.isStudyInCanada(isStudyInCanada);

		// Is job Experience in Canada for two or more years
		System.out.println("Have your job Experience in Canada for atleast 2 years at NOC 0, A, B(Y/N): \n");
		isStudyDurationMoreThanTwoYearsInCanada = sc.next().charAt(0);
		scoreIsStudyDurationMoreThanTwoYearsInCanada = calcrs
				.isStudyDurationMoreThanTwoYearsInCanada(isStudyDurationMoreThanTwoYearsInCanada);
		System.out
				.println("scoreIsStudyDurationMoreThanTwoYearsInCanada" + scoreIsStudyDurationMoreThanTwoYearsInCanada);

		// Total Score
		if (scoreOfEducationLevel != 0) {
			totalScore = scoreOfEducationLevel + scoreOfExperience + scoreOfAge + scoreBandsInListening
					+ scoreBandsInSpeaking + scoreBandsInReading + scoreBandsInWriting + scoreAreRelativesInCanada
					+ scoreIsStudyInCanada + scoreIsStudyDurationMoreThanTwoYearsInCanada;
			System.out.println("Total Points you have scored: \n" + totalScore);
		}
		if (totalScore >= 87) {
			System.out.println("You qualify to submit an Expression of Interest (EOI) to Immigration Canada");
		} else {
			System.out.println(
					"You need atleast 87 points to qualify for submit an Expression of Interest (EOI) to Immigration Canada");
		}
	}
}
