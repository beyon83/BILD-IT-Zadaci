package zadaci_23_07_2015;

public class RandomCharactersAndNumbers {
	
	/**
	 * Zadatak: 4. 
	 * Napisati metodu koja printa 100 nasumičnih 
	 * uppercase karaktera i 100 nasumičnih brojeva, 10 po liniji.
	 */
	
	public static void printRandom() {
		
		/** Initialize character array */
		char[] charArr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		/** Print characters */
		System.out.println("Random characters(10 per line): ");
		for(int i = 0; i < 100; i++) {
			int rand = (int)(Math.random() * charArr.length); // Create random numbers
			if(i % 10 == 0) { // print new line after every 10 characters
				System.out.println();
			} 
			System.out.print(charArr[rand] + " "); // use rand variable to shuffle characters randomly
		}
		
		System.out.println();
		System.out.println();
		
		int[] numbers = new int[100];
		
		/** Print numbers */
		System.out.println("Random numbers: ");
		for(int i = 0; i < 100; i++) {
			numbers[i] = (int)(Math.random() * 99); // Assign 100 random numbers to the numbers array
			if(i % 10 == 0) {
				System.out.println(); // print new line after every 10 characters
			} 
			System.out.print(numbers[i] + " ");
		}
		
	}
	
//////////////////////////////////////////////////////////////////
	                     /** Main */
//////////////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		/** Invoke method */
		printRandom();
		
	}

}
