package javaBasics;

public class Array1Dand2D { 
	
	// Array -> Data table -> single column-1D(Dimensional) -> multiple column-2D(Dimensional)

	public static void main(String[] args) {
		// 1D array
		// #1 - creating 1D array
//		int studentRollNumber[] = new int[10];
//		int[] studentRollNumber = new int[10]; // 10 -> total number of rows
		// inserting data
//		studentRollNumber[0] = 101;
//		studentRollNumber[1] = 102;
//		studentRollNumber[2] = 103;
//		studentRollNumber[3] = 104;
//		studentRollNumber[4] = 105;
//		studentRollNumber[5] = 106;
//		studentRollNumber[6] = 107;
//		studentRollNumber[7] = 108;
//		studentRollNumber[8] = 109;
//		studentRollNumber[9] = 110;
//		studentRollNumber[3] = 111; // reassigning value
//		studentRollNumber[10] = 111; // ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
		
		// #2 - creating 1D array
		int[] studentRollNumber = {101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116};
		//extracting data
//		System.out.println("Roll number for 5th boy: "+studentRollNumber[4]);
//		System.out.println("Roll number for 8th boy: "+studentRollNumber[7]);
//		System.out.println("Roll number for 4th boy: "+studentRollNumber[3]);
		
		// total number of numbers -> .length
		int totalNumberOfRows = studentRollNumber.length;
		System.out.println("Total number of rows: "+totalNumberOfRows);
		
		// Traversing 
		for(int i=0; i<studentRollNumber.length; i++) {
			System.out.println("Roll number of a student: "+studentRollNumber[i]);
		}
		while(totalNumberOfRows>=1) {
			System.out.print(studentRollNumber[totalNumberOfRows-1]+"|");
			totalNumberOfRows--;
		}
		
		String[] custName = {"David B", "Anthony K", "Jane M", "Mark T"};
		System.out.println("Number of customers: "+custName.length);
		for(int i=0; i<custName.length; i++) {
			System.out.println(custName[i]);
		}
		
		// Assignment: Use Scanner concept to all assignment completed before | Return - Initials for fullName
		
		// 2D array
		// #1 creating 2D array
		int[][] arrayTwo = new int[3][2];
		// inserting value
		// 1st row
		arrayTwo[0][0] = 101;
		arrayTwo[0][1] = 102;
		// 2nd row
		arrayTwo[1][0] = 103;
		arrayTwo[1][1] = 104;
		// 3rd row
		arrayTwo[2][0] = 105;
		arrayTwo[2][1] = 106;
		// extracting value
		System.out.println(arrayTwo[1][1]);
		System.out.println(arrayTwo[2][0]);
		
		// #2 creating 2D array
		int[][] arrayThree = {{101,102,100},{103,104,200},{105,106,300},{105,106,300},{105,106,300}};
		
		// row count  & column count
		int rowCount = arrayThree.length;
		System.out.println("Total number of rows: "+rowCount);
		int columnCount = arrayThree[0].length;
		System.out.println("Total number of columns: "+columnCount);
		
		// Traversing 2D array
		for(int i=0; i<rowCount; i++) { // traversing rows
			for(int j=0; j<columnCount; j++) { // traversing columns
				System.out.print(arrayThree[i][j]+"|");
			}
			System.out.println();
		}
		
		// Assignment: Customer or Employee Registration page - returning validation | Login functionality logic

	}

}
