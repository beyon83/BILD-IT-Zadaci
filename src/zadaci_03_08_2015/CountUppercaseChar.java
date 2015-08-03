package zadaci_03_08_2015;

import java.util.Scanner;

public class CountUppercaseChar {
	
	/**
	 * Zadatak: 2. 
	 * Napisati program koji pita korisnika da unese 
	 * neki string te mu vraća broj uppercase karaktera 
	 * u unijetom stringu. Na primjer, ukoliko korisnik 
	 * unese string "Dobrodošli u Dubai" program mu vraća 
	 * da je broj uppercase karaktera 2.
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/** Prompt the user to enter string */
		System.out.println("Enter string with some uppercase characters: ");
		String str = input.nextLine();
		
		/** Initialize an array with all 26 uppercase characters */
		char[] uppercaseChars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 
                                 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
                                 'W', 'X', 'Y', 'Z'};
		int counter = 0; // set counter for uppercase chars
		
		/** Convert string into character array */
		char[] strArray = str.toCharArray();
		
		/** Use foreach loop to iterate through both arrays */
		for(char chars: uppercaseChars) {
			for(char s: strArray) {
				/** If character from uppercaseChars-array match
				 * to chars in strArray-array */
				if(chars == s) {
					counter++; // increment counter by +1
				}
			}
		}
		
		/** Display result */
		System.out.println("Number of uppercase characters in the string is: " + counter);
		
		input.close();
	}

}
