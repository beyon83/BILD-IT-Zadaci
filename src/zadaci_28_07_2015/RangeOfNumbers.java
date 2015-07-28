package zadaci_28_07_2015;

public class RangeOfNumbers {
	
	/**
	 * Zadatak: 3. 
	 * Napisati program koji ispisuje sve moguće kombinacije 
	 * za biranje dva broja u rasponu od 1 do 7. 
	 * Također, program ispisuje broj svih mogućih kombinacija.  
	 * Dakle, program treba da ispiše sve moguće parove brojeva 
	 * u datom rasponu, krenuvši sa 1 2, 1 3, 1 4, itd. 
	 * Broj mogućih kombinacija je 21. 
	 */

	public static void main(String[] args) {
		
		for(int i = 1; i <= 7; i++) { // Iterate "i" from 1 to 7
			for(int j = i + 1; j <= 7; j++) { // iterate "j" from i + 1 to 7
				System.out.println(i + " " + j); // Print "i" and "j"
			}
		}
		
	}
}
