package zadaci_31_07_2015;

import java.util.Scanner;

public class IzracunavanjeNapojnice {
	
	/**
	 * Zadatak: 1. (Izračunavanje napojnice) 
	 * Napisati program koji učitava ukupan iznos računa koji 
	 * treba uplatiti kao i procenat tog računa kojeg želimo 
	 * platiti kao napojnicu te izračunava ukupan račun i napojnicu. 
	 * Na primjer, ukoliko korisnik unese 10 kao račun i 15 % kao 
	 * procenat za napojnicu program treba da ispiše da je ukupan 
	 * račun za uplatiti 11.5 a napojnica 1.5. 
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Ukupan iznos racuna
		System.out.println("Unesite iznos racuna:");
		double racun = input.nextDouble();
				
		// Stopa napojnice
		System.out.println("Unesite stopu napojnice u %:");			
		double stopaNapojnice = input.nextDouble();
				
		// Izracunaj napojnicu
		double napojnica = (racun * stopaNapojnice) / 100.0;
				
     	// Ukupan iznos za naplatiti sa napojnicom
		double ukupno = racun + napojnica;
		System.out.println("Napojnica iznosi: " + napojnica + "KM");
		System.out.println("Ukupan racun za naplatiti iznosi: " + ukupno +"KM");
		
		input.close();
	}
}
