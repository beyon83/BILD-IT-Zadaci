package zadaci_23_07_2015;

import java.util.Scanner;

public class ISBN {
	
	/**
	 * @author Bojan Aleksic
	 * Zadatak: 2.  
	 * ISBN-10 (International Standard Book Number) se sadrži od 10 brojeva: 
	 * d1 d2 d3 d4 d5 d6 d7 d8 d9 d10. 
	 * Posljednji broj, d10, služi kao checksum i njega izračunavamo iz prvih 
	 * devet brojeva koristeći se sljedećom formulom: 
	 * (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11. 
	 * Ukoliko je checksum 10, zadnji broj označavamo sa X u skladu sa ISBN-10 konvencijom. 
	 * Napisati program koji pita korisnika da unese prvih 9 brojeva te ispiše desetocifreni 
	 * ISBN-10 broj. 
	 * (Primjer: ukoliko unesemo, kao prvih 9 brojeva, 013601267 program nam ispisuje 0136012671 
	 * kao ISBN-10 broj. Ukoliko unesemo 013031997 kao prvih 9 brojeva, program nam ispisuje 
	 * 013031997X kao ISBN-10 broj)
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/** Create an array with 10 elements */
		int[] array = new int[9];
		
		int formula = 0;
		
		System.out.println("Enter 9 numbers: ");
		
		/** Insert 9 numbers in an array */
		for(int i = 0; i < 9; i++) {
			array[i] = input.nextInt();
		//	formula += array[i] * i; // Missing something to get this formula done in the shorter way
		}
		//	formula = formula % 11;
		
		/** Formula for getting checksum */
		formula = (array[0] * 1 + array[1] * 2 + array[2] * 3 + array[3] * 4 + array[4] * 5 + array[5] * 6 + array[6] * 7 + array[7] * 8 + array[8] * 9) % 11;
		
		/** Print array of numbers */
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		/** If checksum is 10, append 'X' instead of 10 */
		if(formula == 10) {
			System.out.print('X');
		} else {
			/** otherwise append result of the formula */
			System.out.print(formula);
		}
		
		input.close();
	}

}
