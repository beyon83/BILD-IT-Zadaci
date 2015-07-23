package zadaci_23_07_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageNumbers {
	
	/**
	 * Zadatak: 5. 
	 * Napisati program koji učitava neodređeni broj cijelih brojeva 
	 * (nula prekida unos) te ispisuje koliko je brojeva bilo iznad 
	 * ili jednako prosjeku svih unešenih brojeva a koliko je bilo 
	 * brojeva ispod prosjeka. Pretpostavimo da je maksimalan niz 
	 * brojeva koje korisnik može unijeti 100.
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number;
		double sum = 0;
		double average = 0;
		int aboveAverage = 0;
		int belowAverage = 0;
		
		/** Crate ArrayList for storing numbers */
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Enter some numbers: ");
		do {
			/** Input numbers */
			number = input.nextInt();
			/** If number of inputs reach 100, exit while loop */
			if(list.size() == 100) {
				break;
			}
			if(number != 0) {
				list.add(number); // Add numbers into ArrayList
				sum = sum + number; // Sum numbers
			}
		} while(number != 0);
		input.close();
		
		/** Get average */
		average = sum / list.size();
		
		for(Integer l: list) {
			/** If numbers in list are above average... */
			if(l >= Math.round(average)) {
				aboveAverage++; // count numbers above average
			/** ...otherwise count numbers below average */	
			} else if(l < Math.round(average)) {
				belowAverage++; // count numbers below average
			}
		}
		
		/** Display Average, number above average, and number below average */
		System.out.println("Average: " + average);
		System.out.println("Above or equal to average: " + aboveAverage + "\nBelow Average: " + belowAverage);
	}

}
