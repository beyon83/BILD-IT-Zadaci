package zadaci_04_08_2015;

import java.util.Scanner;

public class StringPrefix {
	
	/**
	 * Zadatak: 4. 
	 * Napisati metodu sa sljedećim headerom: 
	 * public static String format(int number, int width) 
	 * koja vraća string broja sa prefiksom od jedne ili više nula. 
	 * Veličina stringa je width argument. Na primjer, ukoliko pozovemo 
	 * metodu format(34, 4) metoda vraća 0034, ukoliko pozovemo format(34, 5) 
	 * metoda vraća 00034. Ukoliko je uneseni broj veći nego width argument, 
	 * metoda vraća samo string broja. Npr. ukoliko pozovemo format(34, 1) metoda vraća 34.
	 */
	
	public static void format(int number, int width) {
		/** Convert number into string, so we can extract the length of the input */
		String num = String.valueOf(number);
		
		/** While length of the input number is greater than width... */
		while(num.length() > width) {
			/** ...add +1 to the width, so it can fit into length of the array
			 * so we can avoid NegativeSizeOfTheArrayException */
			width = width + 1; 
		}
		
		/** Create an array with zero's by default
		 * - size of array will depent of width - num.length() */
		int[] array = new int[width - num.length()];
		
		if(num.length() > width) {
			/** If length of the number is greater than width... */
			System.out.print(num); //...then print only number
		} else if(num.length() < width) { // otherwise
			for(int arr: array) {
				System.out.print(arr); // print array with zero's
			}
			System.out.print(num);
		} else if(num.length() == width) {
			System.out.print(num);
		}
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/** Prompt the user to enter numbers */
		System.out.println("Enter a number, and widht: ");
		int number = input.nextInt();
		int width = input.nextInt();
		
		/** Invoke method and display result */
		format(number, width);
		
		input.close();
	}

}
