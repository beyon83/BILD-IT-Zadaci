package zadaci_26_07_2015;

import java.util.Scanner;

public class Password {
	
	/*
	 * Zadatak: 5. 
	 * Neke web stranice forsiraju određena pravila za passworde. 
	 * Napisati metodu koja provjerava da li je unijeti string validan password. 
	 * Pravila da bi password bio validan su sljedeća: 
	 * 1. Password mora biti sačinjen od najmanje 8 karaktera. 
	 * 2. Password smije da se sastoji samo od slova i brojeva. 
	 * 3. Password mora sadržati najmanje 2 broja. 
	 * Napisati program koji pita korisnika da unese password 
	 * te mu ispisuje "password je validan" ukoliko su sva pravila 
	 * ispoštovana ili "password nije validan" ukoliko pravila nisu ispoštovana.
	 */
	
	public static boolean isPasswordValid(String password) {
		
		/** Initialize array of punctuation symbols */
		String[] specChar = {"`", "~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "-", "+", "=", "|", "\\", "?", "/", ".", ">", "'", ":", ";", "[", "]", "}", "{"};
		/** Array of numbers */
		String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		int counter = 0; // Counter for number of integers
		
		/** Check if password contain at least 8 characters */
		for(int i = 0; i < password.length(); i++) {
			if(password.length() < 8) {
				return false;
			} else if(counter < 2) { // check if it contains at least two numbers
				return false;
			} 
		}
		
		/** Check if password contains any numbers, if so, increment the counter */
		for(int i = 0; i < numbers.length; i++) {
			if(password.contains(numbers[i])) {
				counter++;
			} 
		}
		
		/** Check if password contains punctuation symbols */
		for(int i = 0; i < specChar.length; i++) {
			if(password.contains(specChar[i])) {
				return false;
			}
		}
		
		return true;
	}
	
//////////////////////////////////////////////////////////
	                /** Main */
//////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/** Prompt user to enter a password */
		System.out.println("Enter a password: ");
		String password = input.next();
		
		/** Invoke isPasswordValid() method and display result */
		boolean b = isPasswordValid(password);
		System.out.println("Is password valid? " + b);
		
		input.close();
	}
}
