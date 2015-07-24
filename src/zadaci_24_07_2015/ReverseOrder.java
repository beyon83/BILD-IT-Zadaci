package zadaci_24_07_2015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseOrder {
	
	/**
	 * Zadatak: 4. 
	 * Napisati program koji prima 10 cijelih brojeva 
	 * te ih ispisuje u obrnutom redosljedu. 
	 */

	public static void main(String[] args) {
		
		/** Initialize an array with 10 integers */
		Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		/** Create ArrayList and pass "array" to it using asList() method */
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
		/** Use reverse() method to reverse numbers in the ArrayList */
		Collections.reverse(list); 
		
		/** Display numbers in reversed order */
		System.out.println(list);
		
	}

}
