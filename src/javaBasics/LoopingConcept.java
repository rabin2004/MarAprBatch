package javaBasics;

public class LoopingConcept {
	
	// Loop -> repeating action over and over
		// -> requirement: 1. counter variable(start point) 2. condition(end point) 3. sequence (increment/decrement)
	
	// 2 ways:
		// 1. for loop: -> for (1;2;3){action}
		// 2. while loop; -> 1; while(2){action; 3;}

	public static void main(String[] args) {
		// print 1 - 100
//		int a = 1;
//		int b = 2; //.......100
//		System.out.println(a);
//		System.out.println(b); // .....100
		
//		for(int i=1; i<=100; i++) { // i++ -> i = i+1;
//			System.out.println(i);
//		}
		
//		int i = 1;
//		while(i<=100) {
//			System.out.println(i);
//			i=i+1; // i++
//		}
		
		// print 100-1
//		for(int i=100; i>=1; i--) { // i-- -> i=1-1;
//			System.out.println(i);
//		}
		
		int i = 100;
		while(i>=1) {
			System.out.println(i);
			i=i-1; // i--
		}

	} 
	
	// Assignment: print 1-1000 & 1000-1 > using for & while | print odd & even number -> using for & while

}
