package zadaci_03_08_2015;

import java.util.Scanner;

public class ReverseString {
	
	/**
	 * Zadatak: 1. 
	 * Napisati program koji pita korisnika da unese 
	 * neki string te mu vraća taj isti string naopako.
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/** Create StringBuilder to store string in it */
		StringBuilder strBuilder = new StringBuilder();
		
		/** Prompt the user to enter string */
		System.out.println("Enter some string: ");
		String str = input.nextLine();
		
		strBuilder.append(str); // add string to the StringBuilder
		strBuilder.reverse();   // use reverse() method to reverse string
		
		System.out.println(strBuilder); // display result
		
		input.close();
	}

}
