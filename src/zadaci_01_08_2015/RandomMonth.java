package zadaci_01_08_2015;

import java.util.Random;

public class RandomMonth {
	
	/**
	 * Zadatak: 1. 
	 * Napisati program koji nasumično generiše cijeli broj 
	 * između 1 i 12 te ispisuje ime mjeseca za taj broj. 
	 * (Januar za 1, Ferbruar za 2....)
	 */

	public static void main(String[] args) {
		
		/** Create Random object */
		Random rand = new Random();
		
		/** Initialize array with months */
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November" , "December"};
		
		for(int i = 0; i < 1; i++) {
			/** Display randomly one month using Random object */
			System.out.println(months[rand.nextInt(12)]);
		}
		
	}

}
