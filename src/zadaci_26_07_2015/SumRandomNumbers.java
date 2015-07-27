package zadaci_26_07_2015;

import java.util.Random;
import java.util.Scanner;

public class SumRandomNumbers {
	
	/**
	 * Zadatak: 1. 
	 * Napisati program koji ispisuje tri nasumična cijela broja 
	 * te pita korisnika da unese njihov zbir. 
	 * Ukoliko korisnik pogriješi, program ispisuje pitanje ponovo 
	 * sve sa porukom da pokuša ponovo.  
	 * Ukoliko korisnik unese tačan odgovor, program mu čestita 
	 * i završava sa radom. 
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Random rand = new Random(); // Random class
		
		int number1 = rand.nextInt(10); // First random number
		int number2 = rand.nextInt(10); // Second random number
		int number3 = rand.nextInt(10); // Third random number
		
		int result = number1 + number2 + number3; // Get result
		int answer;
		
		do {
			/** Prompt user to enter a answer */
			System.out.println("Enter the sum of three numbers: " + number1 + " + " + number2 + " + " + number3);
			answer = input.nextInt();
			/** If answer is incorrect, continue with loop */
			if(answer != result) {
				System.out.println("Incorrect. Please try again.");
				continue; // continue with loop
			}
		} while(answer != result);
		
		System.out.println("Correct! Result is: " + result);
		
		input.close();
	}
}
