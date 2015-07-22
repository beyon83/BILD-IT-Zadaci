package zadaci_22_07_2015;

import java.util.Arrays;
import java.util.Scanner;

public class IdenticalArrays {
	
	/**
	 * Zadatak: 3. 
	 * Nizovi niz1 i niz2 su striktno identični ukoliko su 
	 * svi njihovi elementi na istim pozicijama jednaki. 
	 * Napisati metodu koja vraća true ukoliko su nizovi 
	 * niz1 i niz2 striktno identični. Koristiti sljedeći header:
	 * public static boolean equals(int[] niz1, int[] niz2)
	 * Napisati testni program koji pita korisnika da unese dva niza 
	 * cijelih brojeva te provjerava da li su striktno identični.
	 */
	
	public static boolean equals(int[] niz1, int[] niz2) {
		boolean b = false; // Return false if two arrays are not equal
		/** Use equals() method to check whether two arrays are equal */
		if(Arrays.equals(niz1, niz2)) { 
			return true; // Return true if two arrays are equal
		} 
		return b;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] niz1 = new int[5]; // First array
		int[] niz2 = new int[5]; // Second array
		
		System.out.println("Fill in first array of integers: ");
		for(int i = 0; i < niz1.length; i++) {
			/** Fill in first array of integers */
			niz1[i] = input.nextInt();
		}
		
		System.out.println("Fill in second array of integers: ");
		for(int i = 0; i < niz2.length; i++) {
			/** Fill in second array of integers */
			niz2[i] = input.nextInt();
		}
		
		/** Invoke method and display result */
		System.out.println(equals(niz1, niz2));

		input.close(); // close scanner
	}
}
