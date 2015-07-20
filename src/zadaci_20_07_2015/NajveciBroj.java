package zadaci_20_07_2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NajveciBroj {
	
	/**
	 * Zadatak: 1. 
	 * Napisati sljedeću metodu koja vraća najveću vrijednosti u ArrayListu Integera. 
	 * Metoda vraća null ukoliko je lista null iil ukoliko lista sadrži 0 elemenata.
	 * public static Integer max(ArrayList<Integer> list)
	 */
	
	public static Integer max(ArrayList<Integer> list) {
		/** If list is empty, return null */
		Integer max = null;
		for(int i = 0; i < list.size(); i++) {
			/** Check if list is not empty */
			if(!list.isEmpty()) {
				/** if list is not empty, return largest number using "max" - method from "Collections" class */
				return max = Collections.max(list);
			} 
		}
		return max;
	}
	
//////////////////////////////////////////////////////////
	                /** Main */
//////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		/** Create Scanner */
		Scanner input = new Scanner(System.in);
		
		/** Initialize ArrayList */
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Input some numbers(program stops if input is 0): ");
		int number;
		
		do {
			/** Prompt for users input while input is not equal to 0 */
			number = input.nextInt();
			if(number != 0) {
				/** If users input is not 0, add numbers into ArrayList */
				list.add(number);
			}
		} while(number != 0);
		
		/** Print largest number from ArrayList */
		System.out.println("Largest number in list is: " + NajveciBroj.max(list));
		input.close();
	}

}