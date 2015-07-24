package zadaci_24_07_2015;

import java.util.Scanner;

public class CommonPrefix {
	
	/**
	 * Zadatak: 3. 
	 * Napisati program koji pita korisnika da unese 2 stringa 
	 * te ispisuje najveći zajednički prefix za ta dva stringa, 
	 * ukoliko isti postoji. Na primjer, ukoliko korisnik unese 
	 * sljedeća dva stringa "Dobrodošli u Dubai" i "Dobrodošli u Vankuver" 
	 * program treba da ispiše: 
	 * Najveći zajednički prefix za dva stringa je "Dobrodošli u".
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		/** Prompt user to enter two strings */
		System.out.println("Enter first string: ");
		String s1 = input.nextLine();
		System.out.println("Enter second string: ");
		String s2 = input.nextLine();
		
		String result = ""; // Empty string for inserting into common prefix

		/** Split strings by empty spaces and put words into arrays */
		String[] array1 = s1.split(" ");
		String[] array2 = s2.split(" ");
		
		/** Compare two arrays if they contain common words */
		for(int i = 0; i < array1.length; i++) {
			if(array1[i].equals(array2[i])) {
				/** Insert common words into result */
				result = result + array2[i] + " ";
			}
		}
		
		/** Check if result is empty or not */
		if(!result.isEmpty()) {
			System.out.println("Longest prefix for two strigs is: " + result);
		} else {
			System.out.println("There is no common prefix for two strings.");
		}
		
		input.close();
	}

}
