package oOPSconcept;

import java.util.Scanner;

public class ExecutingEncapsulation {

	public static void main(String[] args) {
		EncapsulationConcept ec = new EncapsulationConcept();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter full ssn (xxxxxxxxx): ");
		ec.setSsn(scan.nextLine());
		System.out.println("Enter DOB (MM/DD/YYYY): ");
		ec.setDob(scan.nextLine());
		scan.close();
		
		System.out.println();
		System.out.println("Check following details for confirmation: ");
		System.out.println("------------------------------------------");
		System.out.println("Last four SSN: "+"\t"+ec.getSsn());
		System.out.println("Birth year: "+"\t"+ec.getDob());
	}

}
