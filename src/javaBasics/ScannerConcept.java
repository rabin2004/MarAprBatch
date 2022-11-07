package javaBasics;

import java.util.Scanner;

public class ScannerConcept {
	
	// Scanner -> to bring data/values into code | Scanner class

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter 2 whole numbers: ");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		System.out.println("Addition: "+(a+b));
//		System.out.println("Substraction: "+(a-b));
//		
		System.out.println("Enter first name: ");
		String firstName = scan.nextLine();
		System.out.println("Enter last name: ");
		String lastName = scan.nextLine();
		scan.close();
		String fullName = firstName.concat(" "+lastName);
		System.out.println("Welcome back "+fullName);
	}
	// Assignment: Use Scanner concept to all assignment completed before | String manipulation | Return - Initials for fullName | Customer or Employee Registration page - returning validation | Login functionality logic

}
