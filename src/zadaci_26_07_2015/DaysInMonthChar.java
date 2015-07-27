package zadaci_26_07_2015;

import java.util.Scanner;

public class DaysInMonthChar {
	
	/**
	 * Zadatak: 3. 
	 * Napisati program koji pita korisnika da unese godinu i 
	 * prva tri slova imena mjeseca (prvo slovo uppercase) 
	 * te mu ispiše broj dana u tom mjesecu. Na primjer, 
	 * ukoliko korisnik kao godinu unese 2001 a kao mjesec 
	 * Jan program mu ispisuje da Jan 2011 ima 31 dan.
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
		String month = input.next(); // enter a month
		System.out.println("Enter a year: ");
		int year = input.nextInt(); // enter a year
		
		/** If input is greater than 2015 or less than 0, prompt user to enter again */
		while(year > 2015 || year <= 0) {
			System.out.println("Please enter a valid year");
			year = input.nextInt();
		}
		
		int days;
		
		/** If February, return 29 if year is a leap year */
		if(month.equals(2) && isLeap(year)) {
			days = 29;
		} else {
			days = 28;
		}
		/** Assign months */
		switch(month) {
		case "Jan":
			System.out.println("Jan of year " + year + " has 31 days.");
			break;
		case "Feb":
			System.out.println("Feb of year " + year + " has " + days + " days.");
			break;
		case "Mar":
			System.out.println("Mar of year " + year + " has 31 days.");
			break;
		case "Apr":
			System.out.println("Apr of year " + year + " has 30 days.");
			break;
		case "May":
			System.out.println("May of year " + year + " has 31 days.");
			break;
		case "Jun": 
			System.out.println("Jun of year " + year + " has 30 days.");
			break;
		case "Jul": 
			System.out.println("Jul of year " + year + " has 31 days.");
			break;
		case "Aug":
			System.out.println("Aug of year " + year + " has 31 days.");
			break;
		case "Sep":
			System.out.println("Sep of year " + year + " has 30 days."); 
			break;
		case "Oct":
			System.out.println("Oct of year " + year + " has 31 days.");
			break;
		case "Nov":
			System.out.println("Nov of year " + year + " has 30 days.");
			break;
		case "Dec":
			System.out.println("Dec of year " + year + " has 31 days.");
			break;
		default: 
			System.out.println("Please enter a number 1 - 12");
		}
		
		input.close();
		
	}

}
