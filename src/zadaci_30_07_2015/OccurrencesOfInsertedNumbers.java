package zadaci_30_07_2015;

import java.util.Scanner;

public class OccurrencesOfInsertedNumbers {
	
	/** 
	 * Zadatak: 5. 
	 * Napisati program koji učitava cijele brojeve u rasponu 
	 * od 1 do 100 te broji i ispisuje koliko je koji broj puta unijet. 
	 * Pretpostavimo da nula prekida unos brojeva. 
	 * Ukoliko unesemo sljedeći niz brojeva 2 5 6 23 42 58 2 6 0 program nam 
	 * ispisuje da se broj 2 ponavlja 2 puta, broj 5 jednom, broj 6 2 puta, broj 23 jednom, itd.
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] array = new int[100]; // Brojevi od 1 do 100
		
		int[] counter = new int[array.length]; // Counter za brojeve od 1 do 100
		
		System.out.println("Unesite brojeve:");
		
		for(int i = 1; i < array.length; i++) {
			array[i] = input.nextInt(); // Unesi brojeve
			if(array[i] != 0) {	
				/** Ako korisnik unese broj veci od 100, ili manji od 0, vrati na "input" i nastavi sa unosom */
				if(array[i] > 100 || array[i] < 0) { 
					System.out.println("Unesite samo pozitivne brojeve od 1 do 100");
					continue;
				}
			    counter[array[i]]++; // Inkrementiraj unesene duple brojeve
			} else {
				break; // Ako je uneseni broj 0, zavrsi operaciju
			}
		}
		/** Prikazi koliko je koji broj puta unesen */
		for(int i = 0; i < 100; i++) {
		    if(counter[array[i]] != 0) {
			   System.out.println("Broj: " + array[i] + " = " + counter[array[i]] + "x");
			}
		}
		
		input.close();
	}
}
