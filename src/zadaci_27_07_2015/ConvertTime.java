package zadaci_27_07_2015;

import java.util.Scanner;

public class ConvertTime {
	
	/**
	 * Zadatak: 5. 
	 * Napisati metodu koja pretavara milisekunde u sate, minute i sekunde. 
	 * Metoda treba da koristi sljedeći header: 
	 * public static String convertMillis(long millis). 
	 * Metoda treba da vraća vrijeme kao string u formatu sati:minute:sekunde.  
	 * Na primjer convertMillis(100000) treba da vrati 0:1:40.
	 */
	
	public static String convertMillis(long millis) {
		long seconds = (millis / 1000) % 60; // Converting milliseconds into seconds
		long minutes = (millis / (1000 * 60) % 60); // Converting milliseconds into minutes
		long hours = (millis / (1000 * 60 * 60)) % 24; // Converting mil.sec. into hours
		/** Return String's format, where %02d represents format with two digits */
		return String.format("%02d:%02d:%02d", hours, minutes, seconds);
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of milliseconds: ");
		/** Enter milliseconds */
		long millis = input.nextLong();
		/** Invoke the method */
		System.out.println(convertMillis(millis));;
		
		input.close();
	}

}
