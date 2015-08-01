package zadaci_01_08_2015;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	
	/**
	 * Zadatak: 2.  
	 * Napisati program koji igra sa protivnikom rock-paper-scissors. 
	 * (papir-bunar-makaze ili tako nekako po naški) 
	 * Program nasumično generiše brojeve 0, 1 i 2 koji predstavljaju 
	 * papir, bunar i makaze. 
	 * Program pita korisnika da unese 0, 1 ili 2 te mu ispisuje poruku 
	 * da li je korisnik pobijedio, da li je računar pobijedio ili je bilo neriješeno.
	 */

	public static void main(String[] args) {
		
		/** Create Random object */
		Random rand = new Random();
		
		/** Prompt the user to choose number */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter \"0\" for paper, \"1\" for Rock, or \"2\" for scissors: ");
		
		int user = input.nextInt(); // User's input
		int program = rand.nextInt(2); // Random number that represents program's input
		
		if(user == 0 && program == 1) {
			System.out.println("User: Paper | Program: Rock\nUser won! ");
		} else if(user == 1 && program == 0) {
			System.out.println("User: Rock | Program: Scissors\nUser won! ");
		} else if(user == 2 && program == 0) {
			System.out.println("User: Scissors | Program: Paper\nUser won! ");
		} else if(user == 0 && program == 2) {
			System.out.println("User: Paper | Program: Scissors\nProgram won! ");
		} else if(user == 1 && program == 0) {
			System.out.println("User: Rock | Program: Paper\nProgram won! ");
		} else if(user == 2 && program == 1) {
			System.out.println("User: Scissors | Program: Rock\nProgram won! ");
		} else if(user == 0 && program == 0 || user == 1 && program == 1 || user == 2 && program == 2) {
			System.out.println("It's tie!");
		}
		
		input.close();
	}

}
