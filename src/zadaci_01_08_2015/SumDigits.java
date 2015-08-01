package zadaci_01_08_2015;

import java.util.Scanner;

public class SumDigits {
	
	/**
	 * Zadatak: 4. 
	 * Napisati metodu koja izračunava zbir svih brojeva u cijelom broju. 
	 * Koristite sljedeći header: 
	 * public static int sumDigits(long n). 
	 * Na primjer, ako pozovemo metodu i proslijedimo joj broj 234 
	 * (sumDigits(234)) metoda treba da vrati 9. (2 + 3 + 4 = 9)
	 */
	
	public static int sumDigits(long n) {
		int sum = 0; // Sum
		/** Convert number into string using valueOf() method */
		String number = String.valueOf(n);
		for(int i = 0; i < number.length(); i++) {
			/** Convert string back to integer and get the sum */
			sum += Integer.parseInt(number.charAt(i) + "");
			/** Display separated numbers */
			System.out.print(number.charAt(i) + " + ");
		}
		return sum; // Return sum
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/** Prompt the user to enter number */
		System.out.println("Enter number: ");
		long number = input.nextLong();
		
		/** Display result */
		System.out.println("= " + sumDigits(number));
		
		input.close();
	}

}
