package zadaci_03_08_2015;

import java.util.Scanner;

public class VowelOrConsonant {
	
	/**
	 * Zadatak: 3. 
	 * Napisati program koji pita korisnika da unese 
	 * slovo te provjerava da li je unijeti karakter 
	 * samoglasnik ili suglasnik. 
	 * Na primjer, ukoliko korisnik unese B, program 
	 * vraća da je dati karakter suglasnik. Ukoliko unese A, 
	 * program vraća da je dati karakter samoglasnik.
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/** Prompt the user to enter a character */
		System.out.println("Enter one character: ");
		/** Make input be character, by using charAt(0) method */
		char charInput = input.next().toLowerCase().charAt(0);
		
		/** Use switch() method to check whether input is a vowel or consonant */
		switch(charInput) {
		case 'a':
			System.out.println("Character is a vowel. ");
			break;
		case 'e':
			System.out.println("Character is a vowel. ");
			break;
		case 'i':	
			System.out.println("Character is a vowel. ");
			break;
		case 'o':
			System.out.println("Character is a vowel. ");
			break;
		case 'u': 
			System.out.println("Character is a vowel. ");
			break;
		default: 
			System.out.println("Characters is a consonant. ");
		}
		
		input.close();
	}

}
