package javaBasics;

public class AccessModifierConcept {
	
	// Access Modifier: access of properties->variable/method
	
		
	// Types of Access modifier for properties:
		// 1. public: - widely visible -> within class, within package and outside package 
		// 2. private: - only available from the same class
		// 3. protected: - within class, within package but not outside the package | in inheritance, subclass can access superclass protected properties
		// 4. default: - within class, within package but not outside the package | even in inheritance, subclass can't access superclass default properties
	
				// protected Vs default-???
	
		// final: value can't reassigned in terms properties | class can't instantiated outside the pkg in terms of class
	
	// Access modifier types of class: -> public-same pkg & different pkg | final-allowed from same pkg but not from different pkg | abstract-??
		// Note: accessing class is by creating instance/object of the class
	
	public final String accessModifier = "public"; 
	
	public String name;
	public void printingName() {
		System.out.println(name);
	}
	
	private String ssn;
	private void printingSSN() {
		System.out.println(ssn);
	}
	
	protected String dob;
	protected void printingDOB() {
		System.out.println(dob);
	}
	
	String address;
	void printingAddresss() {
		System.out.println(address);
	}

	public static void main(String[] args) {
		AccessModifierConcept amc = new AccessModifierConcept();
		//public access modifier
		amc.name = "public method";
		amc.printingName();
		// private access modifier
		amc.ssn = "12345678";
		amc.printingSSN();
		// protected access modifier
		amc.dob = "1/1/22";
		amc.printingDOB();
		//default access modifier
		amc.address = "New York";
		amc.printingAddresss();
		
//		amc.accessModifier = "private";
		System.out.println(amc.accessModifier);
	}

}
