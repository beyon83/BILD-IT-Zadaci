package zadaci_29_07_2015;

public class CurrentTimeMillis {
	
	/**
	 * Zadatak: 3. 
	 * Ako pozovemo metodu System.currentTimeMillis() 
	 * dobijemo broj milisekundi od 1. januara 1970 do 
	 * trenutka pozivanja metode. 
	 * Napisati program koji ispisuje trenutačni datum 
	 * i vrijeme u formatu:
	 * "Trenutni datum i vrijeme: 22. juli, 2015 19:59:47"
	 */

	public static void main(String[] args) {
		
		/** Calling a constructor from the Date class */
		java.util.Date date = new java.util.Date();
		/** Display current time and date */
		System.out.println("Current date and time is: " + date);
		
	}

}
