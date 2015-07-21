package zadaci_21_07_2015;

import java.util.Scanner;

public class BacanjeNovcica {
	
	/**
	 * Zadatak: 5. Napisati metodu koja prima jedan argument 
	 * te simulira bacanje novčića toliko puta. 
	 * Nakon što se simulacija završi, program ispisuje 
	 * koliko puta je novčić pokazao glavu a koliko puta pismo.
	 */
	
	public static void flipCoin(int flip) {
		int heads = 0; // declare heads
		int tails = 0; // declare tails
		
		for(int i = 0; i < flip; i++) {
			/** Use Math.random() to limit numbers at 0 and 1, and assign them randomly to the throwing variable */
			int throwing = (int)(Math.random() * 2);
			if(throwing == 1) { // If randomly assigned number is 1, count heads
				heads++;
			} else { // otherwise count tails
				tails++;
			}
		}
		/** Display heads */
		System.out.println("Heads: " + heads);
		/** Display tails */
		System.out.println("Tails: " + tails);
	}

	public static void main(String[] args) {
		
		/** Create a scanner */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how many times do you want coin to flip: ");
		/** Enter a number of throwing */
		int flip = input.nextInt();
		
		/** Invoke flipCoin() method */
		flipCoin(flip);
		
		input.close(); // close scanner
		
	}

}
