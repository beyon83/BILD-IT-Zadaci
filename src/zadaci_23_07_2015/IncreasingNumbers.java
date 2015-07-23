package zadaci_23_07_2015;

import java.util.Arrays;
import java.util.Scanner;

public class IncreasingNumbers {
	
	/**
	 * Zadatak: 3. 
	 * Napisati metodu sa sljedećim headerom koja ispisuje
	 * tri broja u rastućem redosljedu: 
	 * public static void displaySortedNumbers(double num1, double num2, double num3).
	 * Napisati program koji pita korisnika da unese tri broja te ispiše ta tri broja 
	 * u rastućem redosljedu. 
	 */
	
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		/** Store numbers into array */
		double[] array = {num1, num2, num3};
		Arrays.sort(array); // Use sort() method to sort numbers
		/** Display numbers in ascending order */
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		/** Prompt user to enter 3 numbers */
		System.out.println("Enter 3 numbers: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		/** Invoke method */
		displaySortedNumbers(num1, num2, num3);
		
		input.close();
	}

}
