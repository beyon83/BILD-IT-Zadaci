package zadaci_22_07_2015;

public class ProstiBrojevi {
	
	/**
	 * Zadatak: 1. 
	 * Napisati metodu koja prima 2 argumenta: 
	 * početni broj i krajnji broj te printa sve proste brojeve u zadanom rangu.
	 * BONUS: metoda može primati i treći argument, broj brojeva za isprintati po liniji.
	 */
	
	public static void primeNumbers(int INIT_NUMBER, int END_NUMBER, int NUM_PER_LINE) {
		
		int counter = 0; // Counter for number of prime numbers
		int isNumberPrime = 2; // Number to be checked whether is prime
		
		while(counter < END_NUMBER) {
			/** Initially set boolean to true */
			boolean isPrime = true;
			
			/** Check if number is prime */
			for(int i = INIT_NUMBER; i <= isNumberPrime / 2; i++ ) {
				if(isNumberPrime % i == 0) { // If number is not prime,
					isPrime = false; // set isPrime to false and 
					break; // exit for loop
				}
			}
			
			if(isPrime == true) { // If number is prime
				counter++; // increase the counter
				/** Display prime numbers 10 per line */
				if(counter % NUM_PER_LINE == 0) {
					System.out.println(isNumberPrime);
				} else {
					System.out.print(isNumberPrime + " ");
				}
			}
			/** Increase isNumberPrime by +1, to check whether next number is prime */
			isNumberPrime++;
		}
	}
	
/////////////////////////////////////////////////////////
	                 /** Main */
/////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		final int INIT_NUMBER = 2; // Declare constant initial number to 2
		final int END_NUMBER = 100; // Declare constant ending number to 100
		final int NUM_PER_LINE = 10; // Set numbers per line to 10
		
		System.out.println("Prime numbers are: ");
		/** Invoke method and print prime numbers */
		primeNumbers(INIT_NUMBER, END_NUMBER, NUM_PER_LINE);
		
	}

}
