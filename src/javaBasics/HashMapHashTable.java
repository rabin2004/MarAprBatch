package javaBasics;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapHashTable {
	// Key-value pair
	
	// HashMap: HashMap class
	// Hashtable: Hashtable class

	public static void main(String[] args) {
		// creating HashMap
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		// inserting value
		hm.put(9, "Ronaldo");
		hm.put(10, "Messi");
		hm.put(11, "Suarez");
		hm.put(7, "Beckham");
		System.out.println(hm);
		hm.put(11, "C.Ronaldo"); // duplicate key -> value gets replaced
		System.out.println(hm);
		hm.put(5, "Messi");
		System.out.println(hm); // duplicate value -> no issue
		// all keys
		Set<Integer> keys = hm.keySet();
		System.out.println(keys);
		// extract value
		System.out.println("Player in No.7 jersy: "+hm.get(7));
		System.out.println("Player in No.8 jersy: "+hm.get(8));
		// all values
		Collection<String> allValues = hm.values();
		System.out.println(allValues);
		// to check key or value present
		System.out.println(hm.containsKey(8));
		System.out.println(hm.containsValue("Messi"));	
		// extract key-pair
		Set<Entry<Integer, String>> entries = hm.entrySet();
		System.out.println(entries);
		
		System.out.println("Number of entries: "+hm.size());
		hm.remove(7);
		System.out.println(hm);
		hm.replace(9, "Selah");
		System.out.println(hm);
	
		// dealing with null key/value
		hm.put(null, "Higuan");
		System.out.println(hm);
		hm.put(15, null);
		System.out.println(hm);
		hm.put(null, null);
		System.out.println(hm);
		
		
		// creating Hashtable
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		// inserting value
		ht.put(9, "Ronaldo");
		ht.put(10, "Messi");
		ht.put(11, "Suarez");
		ht.put(7, "Beckham");
		System.out.println(ht);
		ht.put(11, "C.Ronaldo"); // duplicate key -> value gets replaced
		System.out.println(ht);
		ht.put(5, "Messi");
		System.out.println(ht); // duplicate value -> no issue
		// all keys
		Set<Integer> keysHt = ht.keySet();
		System.out.println(keysHt);
		// Traversing Hashtable
		Iterator<Integer> it = keysHt.iterator();
		while(it.hasNext()) {
			System.out.print(ht.get(it.next())+"|");
		}
		
		System.out.println();
		
		// extract value
		System.out.println("Player in No.7 jersy: " + ht.get(7));
		System.out.println("Player in No.8 jersy: " + ht.get(8));
		// all values
		Collection<String> allValuesHt = ht.values();
		System.out.println(allValuesHt);
		// to check key or value present
		System.out.println(ht.containsKey(8));
		System.out.println(ht.containsValue("Messi"));
		// extract key-pair
		Set<Entry<Integer, String>> entriesHt = ht.entrySet();
		System.out.println(entriesHt);

		System.out.println("Number of entries: " + ht.size());
		ht.remove(7);
		System.out.println(ht);
		ht.replace(9, "Selah");
		System.out.println(ht);
		
		// dealing with null key/value
//		ht.put(null, "Higuan"); // NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
//		System.out.println(ht);
//		ht.put(15, null); // NullPointerException
//		System.out.println(ht);
//		ht.put(null, null); // NullPointerException
//		System.out.println(ht);
	}

}
