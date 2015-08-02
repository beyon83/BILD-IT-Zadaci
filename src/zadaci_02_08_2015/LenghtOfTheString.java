package zadaci_02_08_2015;

import java.util.Scanner;

public class LenghtOfTheString {
	
	/**
	 * Zadatak: 2. 
	 * Napisati program koji pita korisnika da unese 
	 * neki string te mu ispisuje dužinu tog stringa 
	 * kao i prvo slovo stringa.
	 */

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		/** Prompt the user to enter string */
		System.out.println("Enter some string: ");
		String str = input.nextLine();
		
		/** Obtain length of the specified string using length() method */
		System.out.println("Lenght of the entered string is: " + str.length());
		/** Obtain first character in the string, using charAt(index) method */
		System.out.println("First letter of the string is: " + str.charAt(0));
	
		input.close();
	}

}
