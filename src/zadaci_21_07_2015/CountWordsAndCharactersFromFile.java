package zadaci_21_07_2015;

import java.io.File;
import java.util.Scanner;

public class CountWordsAndCharactersFromFile {
	
	/**
	 * Zadatak: 3. 
	 * Napišite program koji će brojati broj karaktera, 
	 * riječi i linija teksta u nekom fileu. Riječi trebaju 
	 * biti odvojene jednim spaceom. Ime file proslijediti 
	 * kao argument u vaš program.
	 */

	public static void main(String[] args) throws Exception {
		
		/** Instantiate file object */
		File file = new File("Lincoln.txt");
		/** Create a scanner for reading from the file */
		Scanner input = new Scanner(file);
		
		int numOfChar = 0; // Number of characters
		int numOfWords = 0; // Number of words
		int numOfLines = 0; // Number of lines
		
		while(input.hasNext()) {
			/** Number of characters */
			String s = input.nextLine(); // Read all content from the file
			String characters = s.replaceAll(" ", ""); // Ignore empty spaces while counting characters
			numOfChar += characters.length(); // Count characters
			
			/** Number of words */
			numOfWords += s.split(" ").length; // Use the split() - method to divide all content by empty spaces
			
			/** Number of lines */
			numOfLines++;
		}

		/** Display number of characters */
		System.out.println("Number of characters: " + numOfChar);
		/** Display number of words */
		System.out.println("Number of words: " + numOfWords);
		/** Display number of lines */
		System.out.println("Number of lines: " + numOfLines);
		input.close();
	}
}
