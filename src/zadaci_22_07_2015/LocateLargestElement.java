package zadaci_22_07_2015;

import java.util.Arrays;
import java.util.Scanner;

public class LocateLargestElement {
	
	/**
	 * Zadatak: 4. 
	 * Napisati metodu koja vraća lokaciju najvećeg elementa u 2D nizu. 
	 * Metoda treba da koristi sljedeći header:
	 * public static int[] locateLargest(double[][] a)
	 * Napisati test program koji pita korisnika da unese 2D niz 
	 * te mu ispisuje lokaciju najvećeg elementa u nizu.
	 */
	
	public static int[] locateLargest(double[][] a) {

		int row = 0; // Location of the row index
		int column = 0; // Location of the column index
		double max = a[0][0]; // Temp. declare max value at first indices in the matrix
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				/** Check if value in the max variable is lower than rest of the numbers... */
				if(max < a[i][j]) {
					/** ...if so, store those indices into max variable */
					max = a[i][j];
					row = i; // update row with current max index "i"
					column = j; // update column with current max index "j"
				}
			}
		}
		int[] location = {row, column}; // Initialize "location" array with row and column indices
		return location; // return location array
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/** Create multidimensional array with 3 rows and 3 columns */
		double[][] array = new double[3][3];
		
		/** Prompt user to enter values into multidimensional array */
		System.out.println("Enter a 3 rows and 3 columns: ");
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextInt(); // user's input
			}
		}
		
		/** Display matrix table (optional) */
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " "); // Display rows and columns
			}
			System.out.println(); // new line
		}
		
		/** Invoke locateLargest() method, and display returning result using toString() method */
		System.out.println("Location of the largest number is: " + Arrays.toString(locateLargest(array)));
		
		input.close(); // close scanner
	}
}
