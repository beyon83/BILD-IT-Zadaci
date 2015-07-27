package zadaci_27_07_2015;

public class NumbersDivisibleByFive {
	
	/**
	 * Zadatak: 3. 
	 * Napišite program koji ispisuje sve brojeve, od 100 do 1000, 
	 * 10 brojeva po liniji, koji su djeljivi i sa 5 i sa 6. 
	 * Razmak između brojeva treba biti tačno jedan space. 
	 */

	public static void main(String[] args) {
		
		int counter = 0; // counter for counting lines
		
		for(int i = 100; i <= 1000; i++) {
			/** if a number is divisible by 5 and 6 */
			if(i % 5 == 0 && i % 6 == 0) {
				System.out.print(i + " "); // print it
				counter++; // increment counter by 1 each time
			}  
			/** If counter is equal to 10, enter new line */
			if(counter == 10) {
				System.out.println();
				counter = 0; // reset the counter 
			}
		}
		
	}

}
