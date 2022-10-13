package assignment_week6;

public class CalulateCRS {

	int age;
	int scoreOfEducationLevel = 0;
	int scoreOfExperience = 0;
	int scoreOfAge = 0;
	int scoreofListeningBands = 0;
	int scoreofSpeakingBands = 0;
	int scoreofReadingBands = 0;
	int scoreofWritingBands = 0;
	int scoreAreRelativesInCanada = 0;
	int scoreIsStudyInCanada = 0;
	int scoreisStudyDurationMoreThanTwoYearsInCanada = 0;
	int scorePHD = 25;
	int scoreMasters = 23;
	int scoreTwoOrMORE = 22;
	int scoreIntermediateWithThreeYears = 21;
	int scoreFourToFiveYearsExperience = 13;
	int scoreFiveYearsOrMoreExperience = 13;

	// Method to calculate score of Education with return type Integer
	int scoreOfEducationLevel(String educationLevel) {
		if (educationLevel != " ") {
			switch (educationLevel) {
			case "PHD":
				scoreOfEducationLevel += scorePHD;
				break;
			case "MASTERS":
				scoreOfEducationLevel += scoreMasters;
				break;
			case "TWOORMORE":
				scoreOfEducationLevel += scoreTwoOrMORE;
				break;
			case "INTERMEDIATEWITHTHREEYEARS":
				scoreOfEducationLevel += scoreIntermediateWithThreeYears;
				break;

			default:
				System.out.println("INVALID SELECTION");
				break;
			}
		}
		return scoreOfEducationLevel;
	}

	// Method to calculate score of Experience with return type Integer
	int scoreOfExperience(int experienceInYears) {
		if (experienceInYears != 0) {
			if (experienceInYears == 4 || experienceInYears == 5) {
				scoreOfExperience += scoreFourToFiveYearsExperience;
			} else if (experienceInYears > 5) {
				scoreOfExperience += scoreFiveYearsOrMoreExperience;
			} else {
				scoreOfExperience += 0;
			}
		} else {
			scoreOfExperience += 0;
		}
		return scoreOfExperience;
	}

	// Method to calculate score of Age with return type Integer
	int scoreOfAge(int age) {
		int scoreOfAge = 0;
		if (age != 0) {
			if (age > 17) {
				if (age >= 18 && age <= 35) {
					scoreOfAge = 12;
				} else if (age >= 36 && age <= 47) {
					switch (age) {
					case 36:
						scoreOfAge = 11;
						break;
					case 37:
						scoreOfAge = 10;
						break;
					case 38:
						scoreOfAge = 9;
						break;
					case 39:
						scoreOfAge = 8;
						break;
					case 40:
						scoreOfAge = 7;
						break;
					case 41:
						scoreOfAge = 6;
						break;
					case 42:
						scoreOfAge = 5;
						break;
					case 43:
						scoreOfAge = 4;
						break;
					case 44:
						scoreOfAge = 3;
						break;
					case 45:
						scoreOfAge = 2;
						break;
					case 46:
						scoreOfAge = 1;
						break;
					case 47:
						scoreOfAge = 11;
						break;
					default:
						System.out.println("Invalid Age: " + age);
						break;
					}
				} else {
					System.out.println(age);
				}
			}
		}
		return scoreOfAge;
	}

	// Method to calculate score of Listening Bands with return type Integer
	int scoreOfListeningBands(float bandsInListening) {
		if (bandsInListening != 0) {
			if (bandsInListening >= 8) {
				scoreofListeningBands = 6;
			} else if (bandsInListening == 7.5) {
				scoreofListeningBands = 5;
			} else {
				System.out.println("Please enter above 7 Bands");
			}
		}
		return scoreofListeningBands;
	}

	// Method to calculate score of Speaking Bands with return type Integer
	int scoreOfSpeakingBands(float bandsInSpeaking) {
		if (bandsInSpeaking != 0) {
			if (bandsInSpeaking >= 7) {
				scoreofSpeakingBands = 6;
			} else if (bandsInSpeaking == 6.5) {
				scoreofSpeakingBands = 5;
			} else {
				System.out.println("Please enter above 6 Bands");
			}
		}
		return scoreofSpeakingBands;
	}

	// Method to calculate score of Reading Bands with return type Integer
	int scoreOfReadingBands(float bandsInReading) {
		if (bandsInReading != 0) {
			if (bandsInReading >= 7) {
				scoreofReadingBands = 6;
			} else if (bandsInReading == 6.5) {
				scoreofReadingBands = 5;
			} else {
				System.out.println("Please enter above 6 Bands");
			}
		}
		return scoreofReadingBands;
	}

	// Method to calculate score of Writing Bands with return type Integer
	int scoreOfWritingBands(float bandsInWriting) {
		if (bandsInWriting != 0) {
			if (bandsInWriting >= 7) {
				scoreofWritingBands = 6;
			} else if (bandsInWriting == 6.5) {
				scoreofWritingBands = 5;
			} else {
				System.out.println("Please enter above 6 Bands");
			}
		}
		return scoreofWritingBands;
	}

	// Method to calculate score if the User Has Relatives in Canada with return
	// type Integer
	int areRelativesInCanada(char areRelativesInCanada) {
		if (areRelativesInCanada != ' ') {
			switch (areRelativesInCanada) {
			case 'y':
				scoreAreRelativesInCanada += 5;
				break;
			case 'n':
				scoreAreRelativesInCanada = 0;
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
		}
		return scoreAreRelativesInCanada;
	}

	// Method to calculate score if the User Has Study in Canada with return type
	// Integer
	int isStudyInCanada(char isStudyInCanada) {
		if (isStudyInCanada != ' ') {
			switch (isStudyInCanada) {
			case 'y':
				scoreIsStudyInCanada += 5;
				break;
			case 'n':
				scoreIsStudyInCanada = 0;
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
		}
		return scoreIsStudyInCanada;
	}

	// Method to calculate score if the User Has Experience more than Two years in
	// Canada with return type Integer
	int isStudyDurationMoreThanTwoYearsInCanada(char isStudyDurationMoreThanTwoYearsInCanada) {
		if (isStudyDurationMoreThanTwoYearsInCanada != ' ') {
			switch (isStudyDurationMoreThanTwoYearsInCanada) {
			case 'y':
				scoreisStudyDurationMoreThanTwoYearsInCanada += 10;
				break;
			case 'n':
				scoreisStudyDurationMoreThanTwoYearsInCanada = 0;
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
		}
		return scoreisStudyDurationMoreThanTwoYearsInCanada;
	}

}
