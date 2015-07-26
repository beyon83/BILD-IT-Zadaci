package zadaci_25_07_2015;

import java.util.Scanner;

public class ReversePalindrom {
	
	/**
	 * Zadatak: 3. 
	 * Napisati metode sa sljedećim headerima: 
	 * public static int reverse(int number) 
	 * i 
	 * public static boolean isPalindrome(int number) 
	 * Prva metoda prima cijeli broj kao argument i vraća 
	 * isti ispisan naopako. (npr. reverse(456) vraća 654.) 
	 * Druga metoda vraća true ukoliko je broj palindrom a false ukoliko nije. 
	 * Koristite reverse metodu da implementirate isPalindrome metodu. 
	 * Napišite program koji pita korisnika da unese broj te mu vrati 
	 * da li je broj palindrome ili ne. 
	 */
	
	public static int reverse(int number) {
		/** Convert number into string, using valueOf() method */
		String s1 = String.valueOf(number);
		String s2 = "";
		/** Iterate for loop in reverse order */
		for(int i = s1.length()-1; i >= 0; i--) {
			/** Divide string by character sequence */
		//	System.out.print(s.charAt(i));
			s2 = s2 + s1.charAt(i);
		}
		/** Convert string s2 into integer */
		int n = Integer.parseInt(s2);
		return n; // return number
	}
	
///////////////////////////////////////////////////////////
	
	public static boolean isPalindrome(int number) {
		if(number == reverse(number)) {
			return true;
		} else {
			return false;
		}
	}
	
///////////////////////////////////////////////////////////
	                  /** Main */
///////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		
		
		/** Display number in reverse order */
		System.out.println("Number in reverse order: " + reverse(number));
		/** Display whether is number true or false */
		System.out.println("\nIs number a palindrome? " + isPalindrome(number));
		
		input.close();
	}
}
