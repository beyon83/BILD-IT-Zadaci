package zadaci_29_07_2015;

public class ProstiBrojevi {
	
	/**
	 * Zadatak: 2.  
	 * Napisati program koji ispisuje sve proste brojeve od 
	 * 2 do 1000, ukljućujući i 2 i 1000. 
	 * Program treba da ispiše 8 brojeva po liniji te razmak 
	 * između brojeva treba da bude jedan space.
	 */
	
	public static boolean isPrime(int number) {
		for(int i = 2; i < number; i++) {
			if(number % i == 0) { // If number is divisible by "i"
				return false; // number is not prime
			}
		}
		return true;
	}
	
//////////////////////////////////////////////////////////
	                 /** Main */
//////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		int counter = 0; // Counter for new lines
		
		for(int i = 2; i <= 1000; i++) {
			if(isPrime(i)) { // If number is prime
				System.out.print(i + " "); // print it out
				if(counter == 8) { // If counter reach 8, enter new line
					System.out.println();
					counter = 0; // reset the counter
				}
				counter++; // increment counter by +1 during each iteration
			}
		}
		
	}
}
