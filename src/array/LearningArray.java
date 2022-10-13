package array;

public class LearningArray {

	public static void main(String[] args) {

		// Array of datatype String called as namList is populated with the elements;
		String[] nameList = { "Sahib", "Daman", "Swaroop", "Manveer", "Navjot", "Kuldeep", "Ketaki", "Sanil", "Amanpreet", "Shahrukh" };

		// Array of datatype Integer called as numList is populated with the elements;
		int[] numList = { 5, 10, 2, 3, 5, 10 };

		// To Check the age from two arrays
		String myName = nameList[0];
		int myAge = numList[0] + numList[1] + numList[4];
		System.out.println("My name is " + myName + " and I am " + myAge + " years Old");

		// To print the elements from nameList array
		System.out.println("List of the Names: \n");
		for (int i = 0; i < nameList.length; i++) {
			System.out.println(nameList[i]);
		}
		System.out.println("List of the Names in Reverse Order: \n");
		// To print the elements from nameList array in reverse Order
		for (int i = (nameList.length - 1); i >= 0; i--) {
			System.out.println(nameList[i]);
		}

		// To check whether the element of a nameList array is present or not
		for (int i = 0; i < nameList.length; i++) {
			int index = i;
			System.out.println(nameList[i]);
			if (nameList[i] == "Sahib") {
				System.out.println("Sahib is Present in list");
			}
		}

		//Another way to Define the String Array
		String[] nameList1 = new String[4]; 
	}

}
