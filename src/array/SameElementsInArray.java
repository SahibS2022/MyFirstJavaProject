package array;

import java.util.Scanner;

public class SameElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nameList = { "Sahib", "Daman", "Sahib", "Manveer", "Navjot", "Kuldeep", "Sahib" };
		int count = 0;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the name ");
		name = sc.next();
		System.out.println("Entered name is " + name);
		if (nameList.length != 0) {
			for (int i = 0; i < nameList.length; i++) {
				if (name.equals(nameList[i])) {
					System.out.println(name + " is Present in List at index " + i);
					count++;
				}
			}
			if(count>=1) {
				System.out.println("It is present " + count + " times in the list");
			}else {
				System.out.println("It is not present in the list");
			}
			
		}
	}

}
