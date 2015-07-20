package zadaci_20_07_2015;

public class CountRandomNumbers {
	
	/**
	 * Zadatak: 4. 
	 * Napišite program koji generiše 100 nasumičnih cijelih
	 * brojeva između 0 i 9 te ispisuje koliko se puta koji broj ponovio.
	 */

	public static void main(String[] args) {
		
		/** Initialize array of 100 numbers */
		int[] numbers = new int[100];
		/** Create a counter for occurrences of numbers */
		int[] counter = new int[numbers.length];
		
		for(int i = 0; i < numbers.length; i++) {
			/** Create numbers randomly and assign them to the numbers[] */
			numbers[i] = (int)(Math.random() * 10);
		}
		
		/** Go through array of numbers and check occurrences of each number */
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length; j++) {
				if(numbers[i] == numbers[j]) {
					/** Count occurrences of numbers */
					counter[i]++;
				}
			}
		}
		
		/** Print occurrences of each number */
		for(int i = 0; i < counter.length; i++) {
			System.out.println("Integer: " + numbers[i] + " repeated " + counter[i] + " times");
		}
		
		/** Print random numbers (optional) */
		System.out.println("Random numbers are: ");
		for(int n: numbers) {
			System.out.print(n + " | ");
		}
		
	}
}
