package zadaci_03_08_2015;

import java.util.Scanner;

public class IntegerToBinary {
	
	/**
	 * Zadatak: 4. 
	 * Napišite program koji pita korisnika da unese cijeli
	 * broj i ispiše njegov ekvivalent u binarnom kodu. 
	 * Za ovaj program NE smijemo koristiti 
	 * Integer.toBinaryString(int) metodu.
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		/** Prompt the user to enter a number */
		System.out.println("Enter integer: ");
		int number = input.nextInt();
		
        /** String builder to store values for reverse */
        StringBuilder strBuild = new StringBuilder();
        
        while(number > 0) {
           int i = number % 2; // getting remainder of number % 2
           strBuild.append(i); // add numbers to the StringBuilder
           number = number / 2;
        }
        
        strBuild.reverse(); // reverse numbers
        System.out.print(strBuild); // display result
        
        input.close();
	}

}
