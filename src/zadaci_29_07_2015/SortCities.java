package zadaci_29_07_2015;

import java.util.Scanner;
import java.util.TreeSet;

public class SortCities {
	
	/**
	 * Zadatak: 1. 
	 * Napisati program koji pita korisnika da unese imena 
	 * tri grada te ih ispiše u abecednom redu. 
	 * Na primjer, ukoliko korisnik unese Chicago, Los Angeles 
	 * i Atlanta kao gradove, program vraća Atlanta, Chicago, Los Angeles.
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/** Instead of using ArrayList and Collections.sort() method
		 * we will use TreeSet - list, which automatically sort elements in alphabetic order */
		TreeSet<String> treeSet = new TreeSet<>();
		
		/** Prompt the user to enter 3 cities */
		System.out.println("Enter 3 cities: ");
		for(int i = 0; i < 3; i++) {
			String cities = input.nextLine();
			treeSet.add(cities); // add cities into TreeSet list
		}
		
		/** Display sorted cities */
		for(String city: treeSet) {
			System.out.println(city);
		}
		
		input.close();
	}
}
