package zadaci_31_07_2015;

import java.util.Scanner;

public class ReverseNumbers {
	
	/**
	 * Zadatak: 2. 
	 * Napišite metodu sa sljedećim headerom koja vraća naopako 
	 * ispisan broj koji joj je proslijeđen kao argument: 
	 * public static void reverse(int number).
	 * Na primjer, reverse(3456) treba da vrati 6543. 
	 * Napisati program koji pita korisnika da unese neki cijeli 
	 * broj te mu vrati isti ispisan naopako. 
	 */
	
	public static void reverse(int number) {
		/** Convert integer into string */
		String n = String.valueOf(number);
		for(int i = n.length()-1; i >= 0; i--) {
			/** Use charAt() method to separate indices */
			System.out.print(n.charAt(i) + " ");
		}
	}
	
	/** 
	 * Another way to get this done is by using StringBuilder's method reverse()
		public static void reverse(int number) {
			StringBuilder builder = new StringBuilder();
			String n = String.valueOf(number);
			for(int i = 0; i < n.length(); i++) {
				char num = n.charAt(i);
				builder.append(num);
			}
			builder.reverse();
			System.out.println(builder);
		}
	*/
	
////////////////////////////////////////////////////////////
	                /** Main */
////////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		/** Prompt the user to enter number */
		System.out.println("Enter a 4-digits number: ");
		int number = input.nextInt();
		
		/** Invoke reverse() method */
		reverse(number);
		input.close();
	}
}
