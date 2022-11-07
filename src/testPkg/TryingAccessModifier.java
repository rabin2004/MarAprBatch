package testPkg;

import javaBasics.AccessModifierConcept;

public class TryingAccessModifier {

	public static void main(String[] args) {
		AccessModifierConcept amc = new AccessModifierConcept();
		//public access modifier
		amc.name = "public method";
		amc.printingName();

		// private access modifier - not accessible
//		amc.ssn = "12345678";
//		amc.printingSSN();
		
		// protected access modifier - not accessible
//		amc.dob = "1/1/22";
//		amc.printingDOB();
		
		//default access modifier - not accessible
//		amc.address = "New York";
//		amc.printingAddresss();
		
//		amc.accessModifier = "private";
		System.out.println(amc.accessModifier);
	}

}
