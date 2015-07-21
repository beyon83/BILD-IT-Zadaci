package zadaci_21_07_2015;

public class PrestupneGodine {
	
	/**
	 * Zadatak: 1. 
	 * Napisati program koji ispisuje sve prestupne godine, 
	 * 10 po liniji, od godine 101 do 2100, odvojene jednim 
	 * spaceom. Također ispisati i ukupan broj prijestupnih 
	 * godina u ovom vremenskom periodu.
	 */
	
	public static void main(String[] args) {
		
		int yearsPerLine = 1; // Counter for years per line
		int countYears = 0; // Counter for number of leap years
		
		/** Start count from year 101 up to 2100 */
		for(int year = 101; year <= 2100; year++) {
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
		System.out.println("Number of leap years: " + countYears);
		
	}
}
