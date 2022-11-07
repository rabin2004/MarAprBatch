package javaBasics;

public class ObjectMethodVariableConcept {
	
	// Object -> something that has state & behavior
		// State: variables
		// Behavior: methods/function
	
	public static String name = "David M.";
	
	public static void nameInUpperCase() {
		System.out.println(name.toUpperCase());
	}
	
	public static void main(String[] args) {
		nameInUpperCase();
	}

}
