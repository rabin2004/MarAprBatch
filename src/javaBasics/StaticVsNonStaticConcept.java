package javaBasics;

public class StaticVsNonStaticConcept {
	
	// Static -> closer to class
		// 1. call directly
		// 2. call by className
		// 3. call by instance reference name (not a good)
	
	// Non-static -> closer to instance
		// 1. can't call directly
		// 2. can't call by className
		// 3. call by instance reference name
 	
	// Static & Non-static mismatch
	
	static String firstName = "David"; // class variable
	String lastName = "Jordon"; // instance variable
	
	void printIntials() { // Non-Static method
		System.out.println(lastName);
		System.out.println(firstName);
		System.out.println(StaticVsNonStaticConcept.firstName);
		System.out.println(firstName.substring(0,1)+lastName.substring(0,1));
	}
	
	static void printName() { // Static method
		System.out.println(firstName);
//		System.out.println(lastName); // calling non-static properties in static method is not allowed
//		System.out.println(StaticVsNonStaticConcept.lastName); // calling non-static properties in static method is not allowed
		StaticVsNonStaticConcept svs = new StaticVsNonStaticConcept();
		System.out.println(svs.lastName);
		System.out.println(svs.firstName);
		System.out.println(firstName+" "+svs.lastName);
	}

	public static void main(String[] args) {
		printName();
//		printIntials();
		StaticVsNonStaticConcept.printName();
//		StaticVsNonStaticConcept.printInitials();
		StaticVsNonStaticConcept svs = new StaticVsNonStaticConcept();
		svs.printIntials();
		svs.printName(); // shouldn't be called in non-static way

	}

}
