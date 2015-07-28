package zadaci_28_07_2015;

public class TwinPrimeNumbers {
	
	/**
	 * Zadatak: 2. 
	 * Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. 
	 * Na primjer, brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 
	 * su također twin primes. Napisati program koji ispisuje sve twin 
	 * prime brojeve manje od 10000, 10 parova po liniji. 
	 */

	public static void main(String[] args) {
		
		int counter = 0; // Set counter for each 10 lines

		/** Loop through 10000 numbers and increment each iteration by +2 */
		for(int i = 3; i <= 10000; i += 2) {
			if(counter == 10) { // If counter equals 10, enter new line
				System.out.println();
				counter = 0; // reset the counter to 0
			}
			/** Display numbers */
			System.out.print(i + " ");
			counter++; // Increment counter
		}
		
	}

}
