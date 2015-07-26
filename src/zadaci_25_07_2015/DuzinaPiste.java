package zadaci_25_07_2015;

import java.util.Scanner;

public class DuzinaPiste {
	
	/**
	 * Zadatak: 5. 
	 * Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlijeće v, 
	 * možemo izračunati minimalnu dužinu piste potrebne da avion uzleti 
	 * koristeći se sljedećom formulom: dužina = v * v / 2a. 
	 * Napisati program koji pita korisnika da unese v u m/s i a u m/s² 
	 * te ispisuje korisniku minimalnu dužinu piste. 
	 * (Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje dužina piste je 514.286)
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite ubrzanje aviona: ");
		double a = input.nextDouble(); // Ubrzanje aviona
		System.out.println("Unesite brzinu pri kojoj avion uzlijece: ");
		double v = input.nextDouble(); // Brzina uzlijetanja aviona
		
		double minDuzinaPiste = (v * v) / (2 * a); // formula za izracunavanje min duzine piste
		
		/** Isprintaj rezultat */
		System.out.printf("%s %.3f", "Minimalna duzina piste je: ", minDuzinaPiste);
		
		input.close();
	}

}
