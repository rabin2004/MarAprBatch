package javaBasics;

public class ConditionConcept {
	
	
	// Conditions: 
		// if: -> if(condition-1) {code-1}
		// else if: ->else if(condition-2) {code-2}
		// else: -> else {code-3}
	
	// Inserting more than one condition:
			// 1. And operator -> "&&" -> if(condition-1 && condition-2) {code-1}
			// 2. Or operator -> "||" -> if(condition-1 || condition-2) {code-1}
		

	public static void main(String[] args) {
//		int tempC = 37;
//		int tempF;
//		int expectedTempF = 100;
//		
//		tempF = (tempC*9/5)+32;
		
//		if(tempF==expectedTempF) {
//			System.out.println("Don't turn AC.");
//		}
//		else if(tempF>expectedTempF) {
//			System.out.println("Turn AC on.");
//		}
//		else {
//			System.out.println("Do nothing.");
//		}
		
//		if(tempF>=expectedTempF) {
//			System.out.println("Turn AC on.");
//		}
//		else {
//			System.out.println("Don't AC on.");
//		}
		
//		if(tempF>expectedTempF) {
//			System.out.println("Turn AC on.");
//		}
		
		int a = 10;
		int b = 10;
		int c = 20;
		
		if(a>b && b>c) {
			System.out.println(a+"largest number");
		}
		
		if(a>b || b>c) {
			System.out.println("Either "+a+" or "+b+" is the largest number");
		}
		
		if (a==b && b==c && c==a) {
			System.out.println("All values are same.");
		}
		else if(a==b || a==c) {
			System.out.println("Any 2 numbers are same.");
		}
		
		}
	
	// Assignment: find largest number/smallest number out 3 numbers | Any calculation -> create verification point to check with expected value
}
