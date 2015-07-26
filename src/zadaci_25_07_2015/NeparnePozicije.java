package zadaci_25_07_2015;

import java.util.Scanner;

public class NeparnePozicije {
	
	/**
	 * Zadatak: 4. 
	 * Napisati program koji pita korisnika da unese neki string 
	 * te mu ispisuje sve karaktere koji se nalaze na neparnim pozicijama. 
	 * Na primjer, ako korisnik unese string Beijing Chicago, program vraća BiigCiao.
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		/** Prompt user to enter a string */
		System.out.println("Enter some string: ");
		String s = input.nextLine();
		
		/** In each iteration, increment i by +2 */
		for(int i = 0; i < s.length(); i=i+2) {
			/** Display and get result using charAt() method */
			System.out.print(s.charAt(i));
		}

		input.close();
	}

}
