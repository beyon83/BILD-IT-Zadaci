package zadaci_28_07_2015;

import java.util.Scanner;

public class CountCharOccurrences {
	
	/**
	 * Zadatak: 4. 
	 * Napisati metodu koja pronalazi broj ponavljanja određenog 
	 * karaktera u stringu. 
	 * Metoda treba da koristi sljedeći header: 
	 * public static int count(String str, char a). 
	 * Na primjer, ukoliko pozovemo metodu na sljedeći način: 
	 * count("Welcome", e) metoda treba da vrati 2. 
	 * Napisati program koji pita korisnika da unese string i 
	 * koji karakter želi da prebroji u datom stringu te mu 
	 * ispiše koliko se puta određeni karakter ponovio u zadatom stringu.
	 */
	
	public static int count(String str, char a) {
		int counter = 0; // set counter for characters
		for(int i = 0; i < str.length(); i++) {
			/** If input's character "a" match input's string... */
			if(str.charAt(i) == a) {
				counter++; // ... count occurrences of "a" characters
			}
		}
		return counter; // return counter
	}
	
///////////////////////////////////////////////////////////////
	                  /** Main */
///////////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/** Prompt user to enter a string */
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		/** Prompt user to enter a character to search/count for */
		System.out.println("Which character do you want to count? ");
		char a = input.next().charAt(0); // Set input char at 0 position in input
		
		/** Display result */
		System.out.println(count(str, a));
		
		input.close();
	}

}
