package zadaci_27_07_2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RepeatsOfLargestNumber {
	
	/**
	 * Zadatak: 4. 
	 * Napišite program koji učitava neodređen broj cijelih brojeva 
	 * (unos prekida nula), pronalazi najveći od unijetih brojeva te 
	 * ispisuje koliko se najveći broj puta ponovio. 
	 * Na primjer, ukoliko unesemo 3 5 2 5 5 5 0 program ispisuje 
	 * da je najveći broj 5 te ispisuje da se isti ponavlja 4 puta. 
	 */

	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		
		/** Create ArrayList for storing numbers */
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Enter a sequence of numbers(program stops if input is 0): ");
		int number;
		
		do {
			/** Enter numbers */
			number = input.nextInt();
			if(number != 0) {
				/** If input is not 0, add numbers to the ArrayList */
				list.add(number);
			}
		} while(number != 0);
		
		int counter = 0; // Counter for largest numbers
	
		/** Get largest number using max() method */
		int largest = Collections.max(list);
		
		/** Iterate through the list to count largest numbers */
		for(int i = 0; i < list.size(); i++) {
			if(largest == list.get(i)) {
				counter++; // count largest
			}
		}
		
		/** Display result */
		System.out.println("Largest number is: " + largest);
		System.out.println("Largest number repeats: " + counter + " times.");
		
		input.close();
	}

}
