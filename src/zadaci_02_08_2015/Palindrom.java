package zadaci_02_08_2015;

import java.util.Scanner;

public class Palindrom {
	
	/**
	 * Zadatak: 1. 
	 * Napisati program koji pita korisnika da unese cijeli 
	 * trocifreni broj te provjerava da li je unijeti broj palindrom. 
	 * Broj je palindrom ukoliko se čita isto i sa lijeva na desno i 
	 * sa desna na lijevo npr. 121, 131, itd.
	 */
	
	public static int reverseNumber(int number) {
		/** Convert int into string, using valueOf() method */
		String s = String.valueOf(number);
		String str = ""; // empty string 
		/** Iterate backwards through the loop */
		for(int i = s.length()-1; i >= 0; i--) {
			str = str + s.charAt(i); // add characters into "str" string
		}
		/** Convert back string into integer and return it */
		return Integer.parseInt(str);
	}
	
	public static boolean isPalindrome(int number) {
		String s = String.valueOf(number);
		for(int i = 0; i < s.length(); i++) {
			/** If reversed number equals inputs number */
			if(reverseNumber(number) == number) {
				return true; // number is a palindrome
			} 
		}
		return false; // otherwise it's not
	}
	
/////////////////////////////////////////////////////////
	                /** Main */
/////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite cijeli trocifreni broj: ");
		int number = input.nextInt();
		
		/** Display result */
		if(isPalindrome(number) == true) {
			System.out.println("Number " + number + " is palindrome.");
		} else {
			System.out.println("Number " + number + " is not a palindrome.");
		}
		
		input.close();
	}

}
