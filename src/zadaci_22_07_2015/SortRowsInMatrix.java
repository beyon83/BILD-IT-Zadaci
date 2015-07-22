package zadaci_22_07_2015;

import java.util.Arrays;
import java.util.Scanner;

public class SortRowsInMatrix {
	
	/**
	 * Zadatak: 5. 
	 * Implementirati sljedeću metodu da sortira redove u 2D nizu.
	 * public static double[][] sortRows(double[][] array)
	 * Napisati testni program koji pita korisnika da unese 3x3 matricu 
	 * (ili da pita korisnika koliku matricu želi unijeti) te mu ispisuje 
	 * na konzoli matricu sa sortiranim redovima - od najmanjeg broja do najvećeg.
	 */
	
	public static double[][] sortRows(double[][] array) {
		
		/** Sorting an array using the bubble sort algorithm. 
		 * Bubble sort works by comparing each pair of elements 
		 * next one to another from the beginning of an array and, 
		 * if they are in reversed order, it swaps them. */
		for(int row = 0; row < array.length; row++) {
			for(int column = 0; column < array[row].length; column++) {
				for(int tempCol = column; tempCol < array[row].length; tempCol++) {
					if(array[row][column] > array[row][tempCol]) {
						double temp = array[row][column]; // use temp variable to temporarily store elements
						array[row][column] = array[row][tempCol];
						array[row][tempCol] = temp;
					}
				}
			}
		}
		
		/** Display sorted elements in an array */
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		return array;
	}

	public static void main(String[] args) {
		
		/** Create 3x3 2D array */
		double[][] array = new double[3][3];
		
		Scanner input = new Scanner(System.in);
		
		/** Prompt user to fill in 2D array */
		System.out.println("Enter numbers in a 3x3 matrix: ");
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextInt();
			}
		}
		
		/** Invoke method */
		sortRows(array);
		
		input.close();
	}
}
