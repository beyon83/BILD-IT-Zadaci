package zadaci_20_07_2015;

import java.util.Scanner;

public class BrojSamoglasnika {
	
	/** 
	 * Zadatak: 2. 
	 * Pretpostavimo da su slova A, E, I, O i U samoglasnici.
	 * Napisati program koji pita korisnika da unese string te 
	 * mu ispište broj samoglasnika i suglasnika u datom stringu.
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String s = input.nextLine();
		
		/** Create counter for vowels */
		int vowelCounter = 0;
		
		/** Declare vowels */
		char[] vowels = {'A', 'E', 'I', 'O', 'U'};
		
		/** Remove empty spaces in users input, make it upper case letters, and convert it into character array */
		char[] str = s.replace(" ", "").toUpperCase().toCharArray();
		
		for(char letter: str) {
			for(char vowel: vowels) {
				/** Check if inputs letter is equal to vowels stored in an array */
				if(letter == vowel) {
					/** Count vowels */
					vowelCounter++;
				}
			}
		}
		
		/** Print number of vowels */
		System.out.println("Number of vowels: " + vowelCounter);
		/** Print number of consonants */
		System.out.println("Number of consonants: " + (str.length - vowelCounter));
		
		input.close();
		
	}

}