package zadaci_24_07_2015;

import java.util.Scanner;

public class CountLetters {
	
	/**
	 * Zadatak: 5. 
	 * Napisati metodu koja broji slova u stringu. 
	 * Metoda treba koristiti sljedeći header: 
	 * public static int countLetters(String s) 
	 * Napisati program koji pita korisnika da unese 
	 * neki string te mu vrati koliko taj string ima slova.
	 */
	
	public static int countLetters(String s) {
		int numOfLetters = 0; // Letters counter
		/** Remove any empty spaces with replaceAll() method */
		for(int i = 0; i < s.replaceAll(" ", "").length(); i++) {
			numOfLetters++; // increment counter
		}
		return numOfLetters;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		
		/** Enter a string */
		String s = input.nextLine();
		
		/** Display returning result */
		System.out.println("Number of letters that string contains is: " + countLetters(s));
		
		input.close();
	}

}
