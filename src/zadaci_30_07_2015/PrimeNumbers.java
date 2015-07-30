package zadaci_30_07_2015;

public class PrimeNumbers {
	
	/**
	 * Zadatak: 3. 
	 * Napisati metodu sa sljedećim headerom: 
	 * public static int isPrime(int n) 
	 * koja provjerava da li je broj prost/prime. 
	 * Napsati test program koji poziva ovu metodu 
	 * i ispisuje sve proste brojeve u rasponu od 0 do 100000.
	 */

	public static int isPrime(int n) {
		int isPrime = 1; // initially set isPrime to 1, like a true
		for(int i = 2; i < n; i++) {
			if(n % i == 0) { // if number "n" is divisible by number "i"
				isPrime = 0; // set isPrime to false
			} 
		}
		return isPrime; // return isPrime
	}
	
	public static void main(String[] args) {
		
		for(int i = 2; i <= 100000; i++) {
			if(isPrime(i) == 0) { // if isPrime is equals to false
				System.out.println(i); // print numbers
			}
		}
		
	}

}
