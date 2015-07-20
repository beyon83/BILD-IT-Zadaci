package zadaci_20_07_2015;

import java.util.Scanner;

public class NajveciZajednickiDjelilac {
	
	/**
	 * Zadatak: 3. 
	 * Napisati metodu koja prima dva cijela broja kao argumente 
	 * te vraća najveći zajednički djelilac za ta dva broja.
	 * 
	 * PRIMJER:
	 * Unesite prvi broj: 125
	 * Unesite drugi broj: 2525
	 * Najveći zajednički djelilac za brojeve 125 i 2525 je 25.
	 */
	
	public static int nzd(int number1, int number2) {
		/** Initialize greater common divisor(nzd) to 1 */
		int nzd = 1;
		for(int i = 2; i <= number1 && i <= number2; i++) {
			/** if input numbers are divisible by i, "nzd" will be updated with "i" */
			if(number1 % i == 0 && number2 % i == 0)
				nzd = i;
		}
		/** Return result */
		return nzd;
	}

	public static void main(String[] args) {
		
		/** Prompt user to enter two numbers */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int number1 = input.nextInt();
		System.out.println("Enter second number: ");
		int number2 = input.nextInt();
		
		/** Print nzd() method */
		System.out.println("Greatest common divisor for numbers: " + number1 + " and " + number2 + " is: " + nzd(number1, number2));
		
		/** Close scanner */
		input.close();
	}

}
