package zadaci_26_07_2015;

import java.util.Scanner;

public class DaysInMonth {
	
	/**
	 * Zadatak: 2. 
	 * Napisati program koji pita korisnika da unese mjesec 
	 * i godinu te mu ispiše broj dana u datom mjesecu. 
	 * Na primjer, ukoliko korisnik unese kao godinu 2012 a 
	 * kao mjesec 2, program treba ispisati da je Februar 2012 
	 * imao 29 dana. 
	 * Ukoliko korisnik unese kao godinu 2015 a kao mjesec 3, 
	 * program treba ispisati da je Mart 2015 imao 31 dan. 
	 */
	
	/** Determine if a year is a leap year */
	public static boolean isLeap(int year) {
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true; // if year is a leap year, return true
		} else {
			return false; // otherwise return false
		}
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a month: ");
		int month = input.nextInt(); // enter a month
		System.out.println("Enter a year: ");
		int year = input.nextInt(); // enter a year
		
		/** If input is greater than 2015 or less than 0, prompt user to enter again */
		while(year > 2015 || year <= 0) {
			System.out.println("Please enter a valid year");
			year = input.nextInt();
		}
		
		int days;
		
		/** If February, return 29 if year is a leap year */
		if(month == 2 && isLeap(year)) {
			days = 29;
		} else {
			days = 28;
		}
		/** Assign months */
		switch(month) {
		case 1:
			System.out.println("January of year " + year + " has 31 days.");
			break;
		case 2:
			System.out.println("February of year " + year + " has " + days + " days.");
			break;
		case 3:
			System.out.println("March of year " + year + " has 31 days.");
			break;
		case 4:
			System.out.println("April of year " + year + " has 30 days.");
			break;
		case 5:
			System.out.println("May of year " + year + " has 31 days.");
			break;
		case 6: 
			System.out.println("June of year " + year + " has 30 days.");
			break;
		case 7: 
			System.out.println("July of year " + year + " has 31 days.");
			break;
		case 8:
			System.out.println("August of year " + year + " has 31 days.");
			break;
		case 9:
			System.out.println("September of year " + year + " has 30 days."); 
			break;
		case 10:
			System.out.println("October of year " + year + " has 31 days.");
			break;
		case 11:
			System.out.println("November of year " + year + " has 30 days.");
			break;
		case 12:
			System.out.println("December of year " + year + " has 31 days.");
			break;
		default: 
			System.out.println("Please enter a number 1 - 12");
		}
		
		input.close();
	}

}
