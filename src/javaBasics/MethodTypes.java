package javaBasics;

public class MethodTypes {
	
	// Object -> something that has state & behavior
				// State: variables
				// Behavior: methods/function
	
	// Basic structure of a method: 1. return type (void-method returning nothing)	2. method signature - methodName()	3. method/code block -> {}
	static void test() {
		System.out.println("Test method");
	}
	
//	void test() { // duplicate method
//		
//	}
	
	// Method overloading: methods with same name but different number or types of parameter
	static void test(int a) {
		System.out.println(a);
	}
	
	static void test(int a, int b) {
		System.out.println(a+b);
	}
	
	static void test(double a, double b) {
		System.out.println(a+b);
	}
	
	// Parameters: -> dataType that will accept -> methodName(parameter)
	
	// Types of method: based on parameter
		// 1. Method without parameter
		// 2. Method with single parameter
		// 3. Method with multiple parameter
	
	static void test1() {
		System.out.println("Method without parameter");
	}
	
	static void test2(String name) {
		String nameUpperCase = name.toUpperCase();
		System.out.println(nameUpperCase);
	}
	
	static void test3(String name, int age) {
		System.out.println(name+" is "+age+" years old.");
	}
	
	// Constructor: special method -> 1. name of class		2. doesn't have return type		3. if instance/object of class-constructor will execute first
		// if no constructor created in a class -> instance/object creation will create a default constructor
	
	// Constructor overloading: multiple constructors -> different parameters
	
	MethodTypes() {
		System.out.println("Constructor method-1");
	}
	
	MethodTypes(int a) {
		System.out.println("Constructor method-"+a);
	}
	
	MethodTypes(int a, int b) {
		System.out.println("Constructor method-"+(a+b));
	}

	public static void main(String[] args) {
		test1();
		test2("David");
		test2("Micheal");
		test3("David", 30); // number of parameter and sequence needs to be satified
//		test3(30, "David"); 
		test();
		test(100);
		
		MethodTypes mt = new MethodTypes();
		MethodTypes mt1 = new MethodTypes(2);
		MethodTypes mt2 = new MethodTypes(2,1);
	}

}
