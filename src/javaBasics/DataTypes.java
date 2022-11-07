package javaBasics;

public class DataTypes {
	// Types: 1. Primitive Data types 		2. Reference/Object(Class) data types
	
		// Primitive Data Types: predefined data types | no class to refer to
			// numerical values:
			// 1.byte: small whole number 
			// 2.short: bigger than byte, whole number 
			// 3.int: integer, bigger than short, whole number 
			// 4.long: biggest whole number, "L" or "l"
			// 5.float: small decimal values, "f" 
			// 6.double: big decimal values, "d"
			
			// Non-numerical values:
			// 7. boolean: true or false
			// 8. char: character, single alphabet or numerical values -> '1' or 'A' or 'a'
			
		// Reference/Object(Class) data types: -> have class to refer to
			// String: any values (alphabetic, numerical or special characters or combination or space), "123values@(^*@^    "
			
			
		// creating data/Creating variables: 1. DataTypes 2. ReferenceName 3. Value

	public static void main(String[] args) {
		
		// Creating Variables:
		byte byteData = 10; // variable with value assigned
		System.out.println(byteData); // calling referenceName
		short shortData = 100;
		System.out.println(shortData);
		int integerData = 1000;
		System.out.println(integerData);
		long longData = 100000000L;
		System.out.println(longData);
		float floatData = 10.9999f;
		System.out.println(floatData);
		double doubleData = 10.99999999999999d;
		System.out.println(doubleData);
		
		boolean booleanData1 = true;
		boolean booleanData2 = false;
		System.out.println(booleanData1+"\t"+booleanData2);
		char charData1 = 'A';
		char charData2 = '1';
		System.out.println(charData1+"\n"+charData2);
		
		String stringData1 = "12324IHLJKFHDLKFNDSLKFN        #@^$#@&^&#@^(@#^"; // #1
		String stringData2 = new String("Hello Java"); // #2
		System.out.println(stringData1);
		System.out.println(stringData2);

	}

}
