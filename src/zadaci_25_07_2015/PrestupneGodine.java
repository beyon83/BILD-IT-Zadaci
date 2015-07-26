package zadaci_25_07_2015;

import java.util.Scanner;

public class PrestupneGodine {
	
	/**
	 * Zadatak: 2. 
	 * Napisati program koji ispisuje sve prijestupne godine, 
	 * 10 po liniji, u rasponu godina koje korisnik unese. 
	 * Program pita korisnika da unese početnu godinu, 
	 * krajnju godinu te ispisuje sve godine u tom rasponu. 
	 * Razmak između godina treba biti jedan space.
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int yearsPerLine = 1; // Counter for years per line
		int countYears = 0; // Counter for number of leap years
		
		/** Prompt user to enter year to begin with */
		System.out.println("Enter start year: ");
		int start = input.nextInt();
		/** Prompt user to enter end year */
		System.out.println("Enter end year: ");
		int end = input.nextInt();
		
		/** Start count from year 101 up to 2100 */
		for(int year = start; year <= end; year++) {
			/** Check if year is divisible by 4 without remainder etc, etc... */
			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				/** Display leap years */
				System.out.print(year + " ");
				countYears++; // Count leap years
				/** Make 10 years per each line */
				if(yearsPerLine % 10 == 0) {
					System.out.println();
				}
				yearsPerLine++; // Count lines
			}
		}
		
		/** Display number of leap years */
		System.out.println("\nNumber of leap years: " + countYears);
		
		input.close();
	}

}
