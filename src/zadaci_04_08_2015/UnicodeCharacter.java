package zadaci_04_08_2015;

import java.util.Scanner;

public class UnicodeCharacter {
	
	/**
	 * Zadatak: 2. 
	 * Napisati program koji prima karakter te vraća 
	 * njegov Unicode. 
	 * Primjer: ukoliko korisnik unese karakter E program 
	 * mu vraća 69 kao unicode za taj karakter.
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		/** Prompt the user to enter a character */
		System.out.println("Enter a character: ");
		char inputChar = input.next().charAt(0); // take a input's character at index 0
		
		/** Type cast a character into integer */
		int unicode = (int)inputChar;
		
		/** Display result */
		System.out.println(unicode);
		
		input.close();
	}

}
