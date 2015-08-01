package zadaci_01_08_2015;

public class SumNumbers {
	
	/**
	 * Zadatak: 3. 
	 * Napisati program koji sabira sljedeću seriju 
	 * 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 ..... + 95/97 + 97/99.
	 */

	public static void main(String[] args) {
		
		int sum = 0; // Result
		
		for(int i = 1; i < 100; i = i + 2) {
			System.out.println(sum += i / i + 2); // Sum of every second number
		}
		
	}

}
