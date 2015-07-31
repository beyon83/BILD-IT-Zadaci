package zadaci_31_07_2015;

public class EmirpNumbers {
	
	/**
	 * Zadatak: 3. 
	 * Emirp brojevi (prime unazad) je nepalindromski prosti 
	 * broj koji je prosti broj i kada ispišemo naopako. 
	 * Na primjer, broj 17 i broj 71 su prosti brojevi tako 
	 * da su brojevi i 17 i 71 emirp brojevi. 
	 * Napisati program koji ispisuje prvih 100 emirp brojeva, 
	 * 10 brojeva po liniji. 
	 */
	
	/** Method for checking whether number is prime */
	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2 ; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
///////////////////////////////////////////////////	
	
	/** Reversal method */
	public static void reverse(int number) {
		/** Create StringBulder for storing numbers */
		StringBuilder builder = new StringBuilder();
		/** Convert integer into string using valueOf() method */
		String n = String.valueOf(number);
		
		for(int i = 0; i < n.length(); i++) {
			char num = n.charAt(i); // Break apart numbers into characters
			builder.append(num); // add number into StringBuilder
		}
		builder.reverse(); // use reverse() method to reverse numbers
		System.out.print(builder + " ");
	}
	
//////////////////////////////////////////////////	
	               /** Main */
//////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		int counter = 0; // set counter for new lines
		
		for(int i = 2; i < 100; i++) {
			if(isPrime(i)) { // if number is prime, print it 
				reverse(i);
				counter++; // increment counter
				if(counter == 10) { // enter new line after 10 numbers
					System.out.println();
					counter = 0;
				}
			}
		}
		
	}

}
