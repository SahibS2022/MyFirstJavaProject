package stringMethodPractice;

public class StringMethodPractice {

	public static void main(String[] args) {
		
		// Printing my full name
		String fullName = "Sahib Singh Gill";
		System.out.println("My full name is: " + fullName);

		// Masking the Last name only
		int indexOfLastName = fullName.indexOf("Gill");
		String updatedName = fullName.substring(indexOfLastName);
		System.out.println("Masked my Last name only: " + fullName.replaceAll(updatedName, "****"));

		// Printing the first name only
		System.out.println("My first name is: " + fullName.substring(0, 5));

		// Printing the length of my full name
		System.out.println("The length of my Full name is: " + fullName.length());

		// Replacing specific character i.e a with character e from string
		System.out.println("Replacing character a with character e from my Full name : " + fullName.replace("a", "e"));

	}

}
