package zadaci_27_07_2015;

import java.util.Scanner;

public class DaysInWeek {
	
	/**
	 * Zadatak: 1. 
	 * Napisati program koji pita korisnika da unese cijeli broj 
	 * za današnji dan u sedmici (0 za ponedjeljak, 1 za utorak...) 
	 * i da unese broj dana nakon današnjeg dana te mu ispiše koji je 
	 * to dan u budućnosti. 
	 * (Primjer: ako korisnik unese 1 kao današnji dan a 3 kao dan u 
	 * budućnosti program mu ispisuje da je danas utorak a dan u budućnosti je petak.) 
	 */

	public static void main(String[] args) {
		
		/** Initialize array of days in the week */
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		Scanner input = new Scanner(System.in);
		/** Prompt user to enter a number that represents current day */
		System.out.println("Enter a number that represents current day(Example: 1 = monday, 2 = tuesday...): ");
		int today = input.nextInt();
		
		/** Prompt user to enter number of days in the future */
		System.out.println("Enter a number of days in the future: ");
		int futureDay = input.nextInt();
		
		/** Get result */
		int result = (today + futureDay) % 7;
		
		/** Display result */
		System.out.println("Day in a week you have entered is: " + days[result-1]);
		
		input.close();
	}

}
