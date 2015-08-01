package zadaci_01_08_2015;

import java.util.Scanner;

public class PrintMatrix {

	/**
	 * Zadatak: 5. 
	 * Napisati metodu koja ispisuje n x n matricu koristeći 
	 * se sljedećim headerom: public static void printMatrix(int n). 
	 * Svaki element u matrici je ili 0 ili 1, nasumično generisana. 
	 * Napisati test program koji pita korisnika da unese broj n te mu 
	 * ispiše n x n matricu u konzoli. 
	 */
	
	public static void printMatrix(int[][] matrix) {
		/** Go through the for loops to assign values into matrix */
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				/** Assign randomly zero's and one's into matrix */
				matrix[i][j] = (int)(Math.random() * 2);
				System.out.print(matrix[i][j] + " "); // Display matrix
			}
			System.out.println(); // Enter a new line for next row
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj redova i kolona: ");
		/** Enter number of rows and columns */
		int n = input.nextInt();
		
		/** Declare n x n matrix */
		int[][] matrix = new int[n][n];
		
		/** Invoke printMatrix() method */
		printMatrix(matrix);
	
		input.close(); // Close scanner
	}

}
