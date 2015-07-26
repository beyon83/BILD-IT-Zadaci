package zadaci_25_07_2015;

import java.util.Scanner;

public class IznosInvesticije {
	
	/**
	 * Zadatak: 1. 
	 * Napisati program koji učitava iznos investicije, 
	 * godišnju interesnu stopu i broj godina te vraća 
	 * buduću vrijednost investicije koristeći se sljedećom formulom: 
	 * buducaVrijednostInvesticije = iznosInvesticije * (1 + mjesecnaInteresnaStopa)^brojGodina*12. 
	 * Na primjer, ukoliko uneste kao iznos investicije 1000, 3.25 kao godišnju interesnu stopu 
	 * i 1 kao broj godina program vam vraća 1032.98 kao buducu vrijednost investicije.
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite iznos investicije: ");
		double iznosInvesticije = input.nextDouble();
		System.out.println("Unesite godisnju interesnu stopu: ");
		double godisnjaInteresnaStopa = input.nextDouble();
		System.out.println("Unesite broj godina: ");
		int brojGodina = input.nextInt();
		
		/** izracunavanje mjesecne int. stope */
		double mjesecnaInteresnaStopa = godisnjaInteresnaStopa / 1200;
		/** Formula za izracunavanje buduce vrijednosti investicije */
		double buducaVrijednostInvesticije = iznosInvesticije * Math.pow((1 + mjesecnaInteresnaStopa), (brojGodina * 12));
		
		/** Isprintaj rezultat */
		System.out.printf("%.2f", buducaVrijednostInvesticije);
		
		input.close();
	}
}
