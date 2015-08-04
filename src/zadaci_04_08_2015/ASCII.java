package zadaci_04_08_2015;

import java.util.Scanner;

public class ASCII {
	
	/**
	 * Zadatak: 1. 
	 * Napisati program koji prima ASCII kod (cijeli broj između 0 i 127) 
	 * te ispisuje koji je to karakter. 
	 * Na primjer, ukoliko korisnik unese 69 kao ASCII kod, program mu 
	 * ispisuje da je karakter sa tim brojem karakter E.
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/** Prompt the user to enter a number */
		System.out.println("Enter number between 0 - 127: ");
		int number = input.nextInt();
		
		/** Type cast int into character */
		char ascii = (char)number;
		System.out.println(ascii); // print result
		
		input.close();
	}

}
