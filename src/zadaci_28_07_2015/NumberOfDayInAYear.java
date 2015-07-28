package zadaci_28_07_2015;

import java.util.Scanner;

public class NumberOfDayInAYear {
	
	/**
	 * Zadatak: 1. 
	 * Napisati metodu koja vraća broj dana u godini. 
	 * Metoda koristi sljedeći header: 
	 * public static int numberOfDayInAYear(int year). 
	 * Napisati program koji pita korisnika da unese početnu godinu, 
	 * krajnju godinu te ispisuje broj dana za svaku godinu u rasponu.
	 */
	
	public static int numberOfDayInAYear(int year) {
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return 366; // If year is a leap year, return 366 days
		} else {
			return 365; // Otherwise return 365
		}
	}
	
///////////////////////////////////////////////////////////////////
	                    /** Main */
///////////////////////////////////////////////////////////////////	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/** Prompt user to enter starting year */
		System.out.println("Enter start year: ");
		int startYear = input.nextInt();
		
		/** Prompt user to enter ending year */
		System.out.println("Enter end year: ");
		int endYear = input.nextInt();
		
		/** Display result */
		for(int year = startYear; year <= endYear; year++) {
			System.out.println("Year " + year + " has: " + numberOfDayInAYear(year) + " days.");
		}
		
		input.close();
	}

}
