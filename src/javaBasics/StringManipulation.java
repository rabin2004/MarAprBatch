package javaBasics;

public class StringManipulation {
	
	// String - Object/Class Reference data types

	public static void main(String[] args) {
		String customerName = "David";
		String employeeName = new String("David"); // object/instance of String class
//		System.out.println(customerName==employeeName);
//		System.out.println(customerName!=employeeName);
		String name = "David";
//		System.out.println(customerName==name);
//		System.out.println(customerName!=name);
		
		// comparing String value
		// equals() -> boolean, case sensitive
		System.out.println(customerName.equals(employeeName));
		System.out.println(customerName.equals(name));
		name = "daviD";
		System.out.println(customerName.equals(name));
		// equalsIgnoreCase() -> boolean, case sensitive
		System.out.println(customerName.equalsIgnoreCase(name));
		
		// compareTo() -> integer output, case sensitive, output: 0->same | any other number->not same
		System.out.println(customerName.compareTo(employeeName));
		System.out.println(customerName.compareTo(name));
		// compareToIgnoreCase() -> not case sensitive
		System.out.println(customerName.compareToIgnoreCase(employeeName));
		System.out.println(customerName.compareToIgnoreCase(name));
		
		String msg  = "integer output, case sensitive, output: 0->same | any other number->not same";
		System.out.println(msg.length());// count 1 to end
		
		// position of character/string
		System.out.println("Index of first t: "+msg.indexOf('t')); // first occurrence / indexing from 0
		System.out.println("Position of first t: "+(msg.indexOf('t')+1)); // Position=index+1 | Index=Position-1
		System.out.println("Index of last t: "+msg.lastIndexOf('t')); // last occurrence
		
		System.out.println("Index of second t: "+msg.indexOf('t', 3)); // second occurrence
		System.out.println("Index of second t: "+msg.indexOf('t', msg.indexOf('t')+1));
		System.out.println("Index of third t: "+msg.indexOf('t', msg.indexOf('t', msg.indexOf('t')+1)+1)); // third occurrence
		
		System.out.println("Begining index of a word: "+msg.indexOf("output")); // first occurrence
		System.out.println("Last occurrence of output: "+msg.lastIndexOf("output")); // last occurrence
		
		// character present at a certain position
		System.out.println("Character at 50th index: "+msg.charAt(50));
		
		// change casing of string
		System.out.println(msg.toUpperCase());
		String msgUpperCase = msg.toUpperCase();
		System.out.println(msgUpperCase);
		System.out.println(msgUpperCase.toLowerCase());
		
		// trim() - to remove extra spaces
		name = "   David    ";
		System.out.println("Welcome"+" "+name+"!");
		System.out.println("Welcome"+" "+name.trim()+"!");
		
		// contains() -> boolean
		System.out.println(msg.contains("same"));
		System.out.println(msg.contains("different"));
		
		// replace() -> replace old character/string with new
		String replacedString = msg.replace("same", "different");
		System.out.println(replacedString);
		System.out.println(msg.replace('i', 'I'));
		name = "   Da   vid    ";
		System.out.println(name.replace(" ", ""));
	
		// concat() -> ties Strings together
		String firstName = "David";
		String lastName = "Johns";
		String fullName = firstName+" "+lastName;
		System.out.println(fullName);
		System.out.println(firstName.concat(" "+lastName));
		System.out.println(firstName.concat(" ".concat(lastName)));
		
		// subString() -> capture section of string
		System.out.println(fullName.substring(6));
		System.out.println(fullName.substring(6, 10));
		
		String a = "    ";
		String b = "";
		System.out.println(a.length());
		System.out.println(b.length());
		System.out.println(a.isEmpty());
		System.out.println(a.isBlank());
		System.out.println(b.isEmpty());
		System.out.println(b.isBlank());
		
		// split() ????? - will be discussed after Array concept
	}

}
