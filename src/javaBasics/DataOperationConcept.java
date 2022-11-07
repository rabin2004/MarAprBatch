package javaBasics;

public class DataOperationConcept {
	// Data operation: 
		// 1. Arithmetic operation
		// 2. Comparative Operation -> true or false => boolean output
				// a. equal to -> "=="
				// b. not equal to -> "!="
				// c. more than - ">"
				// d. less than - "<"
				// e. more than or equal to - ">="
				// f. less than or equal to - "<="

	public static void main(String[] args) {
		// Temp conversion
//		int tempC = 37;
//		int tempF; // unassigned variable
//		
//		tempF = ((tempC*9)/5)+32;
//		
//		System.out.println("Temp in Farenheit: "+tempF);
//		
//		tempC = ((tempF-32)*5)/9;
//		System.out.println("Temp in Celsius: "+tempC);
//		
//		// Salary after tax
//		int salaryBeforeTax = 1000;
//		int bonus = 200;
//		int taxSalary = 8;
//		int taxBonus = 25;
//		
//		int salaryAfterTax;
//		
//		salaryAfterTax = (salaryBeforeTax-((salaryBeforeTax*taxSalary)/100))+(bonus-((bonus*taxBonus)/100));
//		
//		System.out.println("Take home total: "+salaryAfterTax);
//		
//		salaryBeforeTax = salaryBeforeTax+bonus;
//		
//		boolean result = salaryBeforeTax>salaryAfterTax;
//		System.out.println(result);
//		
//		int expectedSalary = 1000;
//		
//		System.out.println("Problem: "+(salaryAfterTax<expectedSalary));
//		System.out.println("Problem: "+(salaryAfterTax<=expectedSalary));
//		System.out.println("Satified: "+(salaryAfterTax>expectedSalary));
		
//		int a = 10;
//		int b = 10;
//		int c = 20;
//		
//		boolean result = a==b;
//		System.out.println(result);
//		result = a==c;
//		System.out.println(result);
//		result = a!=b;
//		System.out.println(result);
//		result = a!=c;
//		System.out.println(result);
//		result = a>b;
//		System.out.println(result);
//		result = c>b;
//		System.out.println(result);
//		result = a<b;
//		System.out.println(result);
//		result = b<c;
//		System.out.println(result);
//		result = a>=b;
//		System.out.println(result);
//		result = a<=c;
//		System.out.println(result);
		
		String customer = "David";
//		String custAccessing = "Tom";
		String custAccessing = new String("David");
		
		boolean result = custAccessing==customer;
		System.out.println("Access denied/granted: "+result);
	}

}
