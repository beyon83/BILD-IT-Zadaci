package zadaci_24_07_2015;

import java.util.Scanner;

public class SavingAccount {

	public static void main(String[] args) {
		
		/*
		 * Zadatak: 1. 
		 * Pretpostavimo da uplatimo $100 svaki mjesec na štedni račun 
		 * koji ima godišnju interesnu stopu od 5%. 
		 * Mjesečna interesna stopa je stoga 0.05 / 12 = 0.00417. 
		 * Nakon prvog mjeseca vrijednost na računu postaje 100 * (1 + 0.00417) = 100.417. 
		 * Nakon drugog mjeseca, vrijednost na računu postaje 
		 * (100 + 100.417) * (1 + 0.00417) = 201.252. 
		 * Nakon trećeg mjeseca, vrijednost na računu postaje 
		 * (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje. 
		 * Napisati program koji pita korisnika da unese mjesečni 
		 * iznos štednje te broj mjeseci nakon kojeg bi želio znati stanje računa. 
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a monthly saving balance: ");
		int savingAmount = input.nextInt();
		
		System.out.println("Enter a number of months: ");
		int numOfMonths = input.nextInt();
		
		double monthlyInterestRate = 0.05 / 12; // Monthly interest rate
		
		double savingBalance = 0; // Saving balance
		
		for(int i = 0; i < numOfMonths; i++) {
			/** Formula for calculating saving balance */
			savingBalance = (savingBalance + savingAmount) * (monthlyInterestRate + 1);
		}
		
		System.out.println("Your saving amount after " + numOfMonths + " months is: ");
		/** Display amount of savings */
		System.out.printf("%.3f", savingBalance);
		
		input.close();
	}

}
