package zadaci_31_07_2015;

import java.util.Scanner;

public class TwoProducts {
	
	/**
	 * Zadatak: 5. 
	 * Pretpostavimo da kupujemo rižu ili neki drugi proizvod 
	 * u dva različita pakovanja. Želimo napisati program koji 
	 * upoređuje cijene ta dva pakovanja. Program pita korisnika 
	 * da unese težinu i cijenu oba pakovanja te ispisuje koje 
	 * pakovanje ima bolju cijenu.
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/** Prompt the user to enter weight and price for the first product */
		System.out.println("Enter weight of the first product: ");
		double weightProduct1 = input.nextDouble();
		System.out.println("Enter price for first product: ");
		double priceProduct1 = input.nextDouble();
		
		/** Prompt the user to enter weight and price for the second product */
		System.out.println("ENter weight of the second product: ");
		double weightProduct2 = input.nextDouble();
		System.out.println("Enter price for the second product: ");
		double priceProduct2 = input.nextDouble();
		
		double firstPackage = weightProduct1 / priceProduct1; // get average of the first product
		double secondPackage = weightProduct2 / priceProduct2; // get average of the second product
		
		if(firstPackage > secondPackage) {
			System.out.println("First product has better price. ");
		} else {
			System.out.println("Second product has better price. ");
		}
		
		input.close();
	}

}
