package zadaci_28_07_2015;

import java.util.Scanner;

public class CheckSubstring {
	
	/**
	 * Zadatak: 5. 
	 * Napisati program koji pita korisnika da unese dva stringa 
	 * te provjerava i ispisuje da li je drugi string substring 
	 * prvog stringa. 
	 * Na primjer, ukoliko korisnik unese ABCD kao prvi string a BC 
	 * kao drugi string program mu ispisuje da je BC substring ABCD stringa.
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/** Prompt user to enter two strings to compare */
		System.out.println("Please enter first string: ");
		String s1 = input.next();
		System.out.println("Please enter a second string: ");
		String s2 = input.next();
		
		/** Check if first string contains second string */
		if (s1.contains(s2)) {
			System.out.println(s2 + " is a substring of the " + s1);
		} else {
			System.out.println(s2 + " is not a substring of the " + s1);
		}
		
		input.close();
	}

}
