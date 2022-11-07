package javaBasics;

public class VariableTypes {
	
	// Object -> something that has state & behavior
			// State: variables
			// Behavior: methods/function
	
	// creating data/Creating variables: 1. DataTypes 2. ReferenceName 3. Value
	
	// Type Variables:
		// 1. Local variable: variable created inside a method
		// 2. Class/Static variable: inside class but not inside any method, static keyword -> static in nature
		// 3. Instance/Non-static variable: inside class but not inside any method, no static keyword -> non-static in nature
	
	static String name = "David"; // class variable 
	String address = "New York"; // instance variable
	
	public void test() {
		int a = 10;
		int b;
		b = 20;
		System.out.println(a+b);
		System.out.println(address);
	}

	public static void main(String[] args) {
//		System.out.println(a+b);
		System.out.println(name);
	}

}
