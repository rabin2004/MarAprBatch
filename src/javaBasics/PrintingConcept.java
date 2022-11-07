package javaBasics; // -> ";" -> end of statment

public class PrintingConcept { // -> javaBasics.PrintingConcept

	public static void main(String[] args) { // main method
		System.out.println("Hello Java!!"); // print in a line
		System.out.println(); // empty println()
		System.out.println("Coding for the first time.");
		
		// println() Vs print() -> print() - can't be empty
		System.out.print("comparing print() and println()"); 
		System.out.print("Checking");
		
		System.out.println("...checking again");
		System.out.print("comparing print() and println()");
		
		// Shortcut -> sysout+ctrl+spacebar
		System.out.println("checking shortcut");
		
		// Error printing
		System.err.println("Something went wrong!!");
		
		
		// breaking statement
		System.out.println("Always carry a travel first aid kit with bandages, antacids, aspirin, bee sting wipes, and other basic necessities.");
		
		System.out.println("Always carry a travel first aid kit with"+"\n"+" bandages"+"\n"+", antacids"+"\n"+", aspirin,"+"\n"+" bee sting wipes,"+"\n"+" "
				+ "and other basic necessities.");

		System.out.println();
		
		// creating tab space
		System.out.println("Name        Email Address       Username          DOB"); 
		System.out.println("Name"+"\t\t"+"Email Address"+"\t\t"+"Username"+"\t\t"+"DOB");
		System.out.println("---------------------------------------------------------");
		System.out.println("Mike"+"\t\t"+"mike@gmail.com"+"\t\t"+"m@12"+"\t\t"+"01/01/20222");
	}

}
