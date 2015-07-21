package zadaci_21_07_2015;

import java.util.Scanner;

public class GenerisanjeNasumicnihPitanja {
	
	/**
	 * Zadatak: 2. 
	 * Napisati metodu koja prima jedan argument, 
	 * broj pitanja, te generiše toliko nasumičnih, 
	 * jednostavnih pitanja oduzimanja tipa : "Koliko je 5 - 2 ?". 
	 * Metoda treba da broji broj tačnih i netačnih odgovora 
	 * te ih ispiše korisniku.
	 */
	
	public static int nasumicnaPitanja(int brojPitanja) {
		/** Create scanner */
		Scanner input = new Scanner(System.in);
		
		int broj1;
		int broj2;
		/** Counter for while-loop condition */
		int counter = 0;
		/** Number of correct answers */
		int brojTacnih = 0;
		/** Number of incorrect answers */
		int brojNetacnih = 0;
		
		while(counter < brojPitanja) {
			/** Generate first random number */
			broj1 = (int)(Math.random() * 10);
			/** Generate second random number */
			broj2 = (int)(Math.random() * 10);
			
			/** If first number is lower than second number, swap their positions */
			if(broj1 < broj2) {
				int temp = broj1;
				broj1 = broj2;
				broj2 = temp;
			}
			
			System.out.println("Koliko je: " + broj1 + " - " + broj2 + "?");
			/** Enter an answer */
			int odgovor = input.nextInt();
			/** Check if answer is correct */
			if(odgovor == broj1 - broj2) {
				/** Increment number of correct answers */
				brojTacnih++;
			} else {
				/** Increment number of incorrect answers */
				brojNetacnih++;
			}
			/** Increment counter for while-loop condition by +1 */
			counter++;
		}
		/** Display number of correct answers */
		System.out.println("Broj tacnih odgovora je: " + brojTacnih);
		/** Display number of incorrect answers */
		System.out.println("Broj netacnih odgovora je: " + brojNetacnih);
		return brojPitanja;
	}

	public static void main(String[] args) {
		
		/** Create scanner */
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj pitanja: ");
		/** Enter a number of questions */
		int brojPitanja = input.nextInt();
		
		/** Invoke "nasumicnaPitanja()" - method */
		nasumicnaPitanja(brojPitanja);
		
	}
}
