package zadaci_31_07_2015;

public class PalindromePrime {
	
	/**
	 * Zadatak: 4. 
	 * Palindrome prime je prosti broj koji je također i palindrom. 
	 * Na primjer, 131 je palindrome prime, kao i brojevi 313 i 757. 
	 * Napisati program koji ispisuje prvih 100 palindrome prime brojeva, 
	 * 10 brojeva po liniji. 
	 */
	
	/** Method for checking whether number is prime */
	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2 ; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
//////////////////////////////////////////////////////////////////	
	
	public static int reverse(int number) {
		/** Convert number into string, using valueOf() method */
		String s1 = String.valueOf(number);
		String s2 = "";
		/** Iterate for loop in reverse order */
		for(int i = s1.length()-1; i >= 0; i--) {
			/** Divide string by character sequence */
			s2 = s2 + s1.charAt(i);
		}
		/** Convert string s2 into integer */
		int n = Integer.parseInt(s2);
		return n; // return number
	}
	
///////////////////////////////////////////////////////////
	
	/** Method for checking whether number is palindrome */
	public static boolean isPalindrome(int number) {
		if(number == reverse(number)) {
			return true;
		} else {
			return false;
		}
	}
	
///////////////////////////////////////////////////////////
	                  /** Main */
///////////////////////////////////////////////////////////

	public static void main(String[] args) {
		
		int counter = 0; // set counter for new lines
		
		for(int i = 2; i < 100000; i++) {
			if(isPrime(i) && isPalindrome(i)) { // if number is prime, print it 
				System.out.print(i + " ");
				counter++; // increment counter
				if(counter == 10) { // enter new line after 10 numbers
					System.out.println();
					counter = 0;
				}
			}
		}
		
	}

}
