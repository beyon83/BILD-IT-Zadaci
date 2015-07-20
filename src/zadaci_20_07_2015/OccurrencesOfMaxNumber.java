package zadaci_20_07_2015;

import java.util.Scanner;

public class OccurrencesOfMaxNumber {
	
	/**
	 * Zadatak: 5. 
	 * Napisati program koji učitava niz brojeva, 
	 * pronalazi najveći broj te ispisruje koliko se 
	 * puta taj broj ponavlja. Pretpostavimo da se unos 
	 * brojeva završava sa nulom.
	 */

	public static void main(String[] args) {
		
		/** Create Scanner */
		Scanner input = new Scanner(System.in);
		
		/** Initialize counter */
		int counter = 0;
		/** Set temporarily max at 0 */
		int max = 0;
		/** Initialize number for input */
		int number;
		
		do {
			System.out.println("Enter a number: ");
			/** Prompt user to input number */
			number = input.nextInt();
			/** If input number is not 0, and input number is greater than temporarily "max" number... */
			if(number != 0 && number > max) {
				/** ...than assign input number to the "max" variable */
				max = number;
			} else if(number == max) {
				/** If input number equals max number, count it by adding +1 to the "counter" value */
				counter++;
			}
		} while(number != 0);
		
		/** Print largest number */
		System.out.println("Largest number is: " + max);
		/** Print how many times that number repeat it self */
		System.out.println("It repeats: " + counter + " times");
		
	}

}