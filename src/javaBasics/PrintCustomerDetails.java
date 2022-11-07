package javaBasics;

import java.util.Scanner;

public class PrintCustomerDetails {
	
	static String msg = "Please check following provided details!";
	String firstName;
	String lastName;
	int age;
	String address;
	
	PrintCustomerDetails(String firstName, String lastName, int age, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
	}
	
	// return type concept
	String returnIntial() {
		String intial = firstName.substring(0, 1)+lastName.substring(0, 1);
		return intial.toUpperCase();
	}
	
	void printDetails() {
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println(msg);
		System.out.println("-------------------------------------------------");
		System.out.println("Intial: "+returnIntial());
		System.out.println("Full name: "+firstName+" "+lastName);
		System.out.println("Age: "+age);
		System.out.println("Address: "+address);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("First name:");
		String firstName = scan.nextLine();
		System.out.println("Last name:");
		String lastName = scan.nextLine();
		System.out.println("Address:");
		String address = scan.nextLine();
		System.out.println("Age:");
		int age = scan.nextInt();
		scan.close();
		PrintCustomerDetails pcd = new PrintCustomerDetails(firstName, lastName, age, address);
		pcd.printDetails();
	}

	// Assignment: Customer or Employee Registration page - returning validation | Login functionality logic | Library application | Student profile extraction
}
