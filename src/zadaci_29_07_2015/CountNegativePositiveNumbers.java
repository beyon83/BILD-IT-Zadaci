package zadaci_29_07_2015;

import java.util.Scanner;

public class CountNegativePositiveNumbers {

	/**
	 * Zadatak: 5. 
	 * Napisati program koji učitava neodređen broj cijelih brojeva, 
	 * određuje koliko je pozitivnih brojeva korisnik unijeo, koliko 
	 * negativnih te izračunava ukupnu sumu i prosjek svih unesenih brojeva. 
	 * (Korisnik prekida unos tako što unese nulu). 
	 * Na primjer, ukoliko korisnik unese 1 2 -1 3 0 program treba 
	 * da ispiše da je broj pozitivnih brojeva 3, negativnih brojeva 1, 
	 * suma ili zbir su 5.0 a prosjek svih brojeva je 1.25.
	 */
	
	public static void main(String[] args) {
		
		int number;
		
		double sum = 0; // Sum of all numbers
		int negCounter = 0; // Counter for numbers below zero
		int posCounter = 0; // Counter for positive numbers
		int numberOfInputs = 0; // Counter for number of inputs 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter some numbers: ");
		do {
			/** Insert numbers */
			number = input.nextInt();
			/** Compute sum */
			sum = sum + number;
			
			if(number < 0) {
				negCounter++; // Increment negative numbers
			} else if(number > 0) {
				posCounter++; // Increment positive numbers
			}
			if(number != 0) {
				numberOfInputs++; // Count number if inputs
			}
		} while(number != 0);
		
		/** Display result */
		System.out.println("Average of numbers: " + sum / numberOfInputs);
		System.out.println("Number of negative inputs: " + negCounter);
		System.out.println("Number of positive inputs: " + posCounter);
		System.out.println("Sum is: " + sum);
		
		input.close();
	}

}
