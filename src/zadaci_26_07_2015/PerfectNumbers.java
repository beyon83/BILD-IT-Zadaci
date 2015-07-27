package zadaci_26_07_2015;

public class PerfectNumbers {
	
	/**
	 * Zaadatak: 4. 
	 * Pozitivni cijeli broj je savršen broj ukoliko je jednak 
	 * zbiru svih svojih pozitivnih djelilaca, isključujući sebe. 
	 * Na primjer, 6 je prvi savršeni broj jer 6 = 3 + 2 + 1. 
	 * Sljedeći savršeni broj je 28 jer 28 = 14 + 7 + 4 + 2 + 1. 
	 * Samo 4 savršena broja postoje u rasponu od 0 do 10.000. 
	 * Napišite program koji ispisuje sva 4.
	 */

	public static void main(String[] args) {
		
		System.out.println("Perfect numbers are: ");
		
		for(int i = 1; i <= 10000; i++) {
			int sum = 0; // sum perfect numbers
			for(int j = 1; j < i; j++) {
				/** If i number is divisible by j number ...*/
				if(i % j == 0) {
					sum = sum + j; // ... add it to the sum
				}
			}
			if(sum == i) { // if sum equals to i, number is a perfect
				System.out.println(i); // perfect numbers
			}
		}
		
	}

}
