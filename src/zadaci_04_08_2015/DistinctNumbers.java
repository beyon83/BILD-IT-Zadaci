package zadaci_04_08_2015;

import java.util.Scanner;

public class DistinctNumbers {
	
	/**
	 * Zadatak: 5. 
	 * Napisati program koji učitava 10 brojeva te ispisuje
	 * koilko je jedinstvenih brojeva unijeto te sve jedinstvene 
	 * brojeve koji su unijeti, razmaknute jednim spaceom. 
	 * Ukoliko se neki broj pojavljuje više puta, broj treba ispisati samo jednom. 
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/** Create array of 10 numbers */
		int[] numbers = new int[10];
		/** Create a counter for numbers */
		int[] counter = new int[numbers.length];
		/** Distinct numbers */
		boolean[] jedinstveni = new boolean[numbers.length];
		int jedBrojevi = 0; // Counter for distinct numbers
		System.out.println("Unesite " + numbers.length + " brojeva od 1 do 9: ");
		
		int x = 0;
		/** Insert 10 numbers */
		while(x < numbers.length) {
			numbers[x] = input.nextInt();
			x++;
		}
		
		/** Iterate through the two loops and check for double numbers */
		System.out.println("Dupli brojevi: ");
		for(int i = 0; i < numbers.length; i++) {
			jedinstveni[i] = true;
			for(int j = i + 1; j < numbers.length; j++) {
				if(numbers[i] == numbers[j]) {
					/** Print double numbers */
					System.out.print(numbers[j] + " ");
					jedinstveni[i] = false;
					counter[numbers[j]]++; // Count double numbers
				} 
			}
		}
		
		/** Distinct numbers */
		System.out.println("\nJedinstveni brojevi su: ");
		for(int i = 0; i < numbers.length; i++) {
			jedBrojevi = numbers[i] - counter[i];
			if(jedinstveni[i] == true) {
				/** Print distinct numbers */
				System.out.print(numbers[i] + " | ");
			}
		}
		
		System.out.println("\nUkupno: " + jedBrojevi + " jedinstvenih brojeva.");
		
		input.close();
		
	}

}
