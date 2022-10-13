package scanner;

import java.util.Scanner;

public class printName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		String name  = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name ");
		name = sc.next();
		System.out.println("Your name is "+name);
	}

}
