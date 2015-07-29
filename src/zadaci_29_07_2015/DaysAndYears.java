package zadaci_29_07_2015;

import java.util.Scanner;

public class DaysAndYears {
	
	/**
	 * Zadatak: 4. 
	 * Napisati program koji pita korisnika da unese broj minuta 
	 * (npr. 1 milijardu) te ispiše korisniku koliko je to u godinama i danima. 
	 * Zbog jednostavnosti, pretpostavimo da godina ima 365 dana.  
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/** Prompt the user to enter number of minutes */
		System.out.println("Enter number of minutes: ");
		int minutes = input.nextInt();
		
		int year = (minutes / (60 * 24 * 365)); // get years
		int day = (minutes / (60 * 24) % 365); // get days
		
		/** Display result */
		System.out.println("Number of " + minutes + " has " + year + " years, and " + day + " days.");
		
		input.close();
	}
}
