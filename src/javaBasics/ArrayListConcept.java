package javaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	
	// ArrayList -> ArrayList class -> multiple method can be called

	public static void main(String[] args) {
		// Creating ArrayList
//		ArrayList al = new ArrayList(); // raw arrayList/non-parameterized arrayList
		ArrayList<String> al = new ArrayList<String>(); // parameterized arrayList
		// inserting data
		al.add("David");
//		al.add(false);
//		al.add(80);
		al.add("Mike");
		al.add("Danny");
		al.add("Jenny");
		al.add("Manny");
		System.out.println(al);
		
		// inserting data in middle
		al.add(1, "Dan");
		System.out.println(al);
		
		// remove data
		al.remove(1);
		System.out.println(al);
		
		// number of rows
		System.out.println("Number of rows: "+al.size());
		
		// extracting data
		System.out.println("Customer in 4th row: "+al.get(3));
		
		// check if a data present
		System.out.println("Is Dan present? "+al.contains("Dan"));
		al.add(1, "Dan");
		System.out.println("Is Dan present? "+al.contains("Dan"));
		
		// index of a value
		System.out.println("Index of Jenny: "+al.indexOf("Jenny"));
		System.out.println("Position of Jenny: "+(al.indexOf("Jenny")+1));
		
		// remove all values
//		System.out.println(al);
//		System.out.println("Is array empty? "+al.isEmpty());
//		al.clear();
//		System.out.println(al);
//		System.out.println("Is array empty? "+al.isEmpty());
		
		// create duplicate of array
		Object alClone = al.clone();
		
		// compare 2 arrays
		System.out.println(al);
		System.out.println("Are both array same? "+al.equals(alClone));
		al.add(3, "Micheal");
		System.out.println(al);
		System.out.println("Are both array same? "+al.equals(alClone));
		
		// Traversing arraylist
		System.out.println(al);
		
		// for loop concept
		for(int i=0; i<al.size(); i++) {
			System.out.print(al.get(i)+"|");
		}
		
		System.out.println();
		
		// while loop concept
		int i=0;
		while(i<al.size()) {
			System.out.print(al.get(i)+"|");
			i++;
		}
		
		System.out.println();
		
		// for each loop
		for(String name: al) {
			System.out.print(name+"|");
		}
		
		System.out.println();
		
		// Iterator concept
		Iterator<String> it = al.iterator();
//		String firstRowValue = it.next();
//		System.out.println("First row value: "+firstRowValue);
//		boolean result = it.hasNext();
//		System.out.println("Is there next row?: "+result);
		
		while(it.hasNext()) {
			System.out.print(it.next()+"|");
		}
	}
}
