package zadaci_30_07_2015;

import java.util.Scanner;

public class CommonDivisors {
	
	/**
	 * Zadatak: 2. 
	 * Napisati program koji pita korisnika da unese dva cijela, 
	 * pozitivna broja te ispisuje najveći i najmanji zajednički djelilac za ta dva broja.
	 */
	
	public static int gcd(int number1, int number2) {
		/** Initialize greater common divisor(gcd) to 1 */
		int gcd = 1;
		for(int i = 2; i <= number1 && i <= number2; i++) {
			/** if input numbers are divisible by i, "gcd" will be updated with "i" */
			if(number1 % i == 0 && number2 % i == 0)
				gcd = i;
		}
		/** Return result */
		return gcd;
	}
	
	public static int lcd(int number1, int number2) {
		/** Initialize lowest common divisor(lcd) to 1 */
		int lcd = 1;
		for(int i = number1; i >= 2; i--) {
			/** if input numbers are divisible by i, "lcd" will be updated with "i" */
			if(number1 % i == 0 && number2 % i == 0)
				lcd = i;
		}
		/** Return result */
		return lcd;
	}

	public static void main(String[] args) {
		
		/** Prompt user to enter two numbers */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int number1 = input.nextInt();
		System.out.println("Enter second number: ");
		int number2 = input.nextInt();
		
		/** Print gcd() method */
		System.out.println("Greatest common divisor for numbers: " + number1 + " and " + number2 + " is: " + gcd(number1, number2));
		
		/** Print lcd() method */
		System.out.println("Lowest common divisor for numbers: " + number1 + " and " + number2 + " is: " + lcd(number1, number2));
		
		/** Close scanner */
		input.close();
	}

}
