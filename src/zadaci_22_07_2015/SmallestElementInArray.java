package zadaci_22_07_2015;

import java.util.Scanner;

public class SmallestElementInArray {
	
	/**
	 * Zadatak: 2. 
	 * Napisati metodu koja nalazi najmanji element u nizu 
	 * decimalnih vrijednosti koristeći se sljedećim headerom:
	 * public static double min(double[] array)
	 * Napišite potom test program koji pita korisnika da unese 
	 * deset brojeva te poziva ovu metodu da vrati najmanji element u nizu.
	 */
	
	public static double min(double[] array) {
		double min = array[0]; // Initialize variable "min" with first([0]) index in array
		for(int i = 1; i < array.length; i++) {
			/** If first index in array is greater than next index */
			if(min > array[i]) {
				min = array[i]; // Swap greater with lower one 
			}
		}
		return min; // Return min
	}

	public static void main(String[] args) {
		
		/** Declare array with 10 double values */
		double[] array = new double[10];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		
		/** Fill in an array with 10 double values */
		for(int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		/** Invoke method and display it */
		System.out.println(min(array));
		
		input.close(); // Close scanner
	}

}
