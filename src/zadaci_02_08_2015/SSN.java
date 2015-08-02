package zadaci_02_08_2015;

import java.util.Scanner;

public class SSN {
	
	/**
	 * Zadatak: 3. 
	 * Napisati program koji pita korisnika da unese 
	 * Social Security Number (SSN) u formatu DDD-DD-DDDD 
	 * gdje D predstavlja broj. 
	 * Program treba da provjerava da li je broj unesešen u 
	 * ispravnom formatu. Ukoliko nije, program pita korisnika 
	 * da pokuša ponovo. Ukoliko jeste unešen u pravom formatu, 
	 * program završava sa radom.
	 */
	
	public static boolean isFormatCorrect(String ssn) {
		/** Check if string length is not 11, or if characters at indices 3 and 6 are not hyphen signs */
		if(ssn.length() != 11 || ssn.charAt(3) != '-' && ssn.charAt(6) != '-') {
			return false;
		}
		return true;
	}
	
//////////////////////////////////////////////////////////////////////////////////	
	
	public static boolean isNumber(String ssn) {
		for(int i = 0; i < ssn.length(); i++) {
			/** Check if character at positions: 0, 1, 2, 4, 5, 7, 8, 9 and 10 are not numbers */
			if(!Character.isDigit(ssn.charAt(0)) ||
			   !Character.isDigit(ssn.charAt(1)) ||
			   !Character.isDigit(ssn.charAt(2)) || 
			   !Character.isDigit(ssn.charAt(4)) ||
			   !Character.isDigit(ssn.charAt(5)) ||
			   !Character.isDigit(ssn.charAt(7)) ||
			   !Character.isDigit(ssn.charAt(8)) ||
			   !Character.isDigit(ssn.charAt(9)) ||
			   !Character.isDigit(ssn.charAt(10))) {
				return false; // if they are not numbers, return false
			}
		}
		return true; // otherwise return true
	}
	
//////////////////////////////////////////////////////////////////////////////////
	                        /** Main */
//////////////////////////////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Social Security Number(SSN) in following format: \nDDD-DD-DDDD, where D represents a number.");
		String ssn = input.next();
		
		/** Loop through while methods are false */
		while(isFormatCorrect(ssn) == false || isNumber(ssn) == false) {
			System.out.println("You have entered format incorrectly. Please try again.");
			ssn = input.next();
		}
		
		System.out.println("Done. Your SSN is: " + ssn);
		
		input.close();
	}

}
