package zadaci_23_07_2015;

import java.util.Scanner;

public class Factorial {
	
	/**
	 * Zadatak: 1. 
	 * Napisati program koji pita korisnika da unese 
	 * neki cijeli broj te ispisuje njegove najmanje 
	 * faktore u rastućem redosljedu. Na primjer, 
	 * ukoliko korisnik unese 120 program treba da 
	 * ispiše 2, 2, 2, 3, 5. (2 * 2 * 2 * 3 * 5 = 120)

	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/** Prompt user to enter a number */
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		
		int result = number; 
		
		String s = ""; // Make empty string for adding numbers
		
		int j = 2;
		
		/** Keep looping while inputs number is divisible by 2 */
		while(number % 2 == 0) {
			number = number / j;
		    s = s + " * " + j; // add number to the "s" variable
		}
		
		for(int i = 3; i <= number; i = i + 2){
			/** Loop through while number is divisible by i */
	        while(number % i == 0){
	        	number = number / i;
	            j = i;
	            s = s + " * " + j; // add number to the s variable
	        }
	    }
		
		/** Display result, and use substring() to remove asterisk at the beginning */
		System.out.println("String: " + s.substring(2, s.length()) + " = " + result);
	}
}
