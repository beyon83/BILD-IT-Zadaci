package zadaci_30_07_2015;

import java.util.Scanner;
// import java.util.TreeSet;

public class IncreasingNumbers {
	
	/**
	 * Zadatak: 4. 
	 * Napisati program koji pita korisnika da unese 3 cijela 
	 * broja te mu ispiše ta ista tri broja u rastućem redosljedu. 
	 * Bonus: 
	 * Napisati metodu koja prima tri cijela broja kao argumente 
	 * te vraća brojeve u rastućem redosljedu. 
	 * @return 
	 */
	
	public static int[] increasingOrder(int n1, int n2, int n3) {
		/** Put numbers in array */
		int[] numbers = {n1, n2, n3};
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length; j++) {
				if(numbers[i] < numbers[j]) {
					/** Switch numbers using the temp variable */
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		return numbers; // return numbers
	}
	
///////////////////////////////////////////////////////////////////////
	                   /** Main */
///////////////////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		/** One way would be using TreeSet that automatically sorts numbers 
		 * or using ArrayList and Collections.sort() method*/
	//	TreeSet<Integer> treeSet = new TreeSet<>();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		/** Another way is by using the "old-fashion" style :) ... */
		/** Prompt the user to enter 3 numbers */
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		/** Invoke method and print sorted numbers */
		int numbers[] = increasingOrder(number1, number2, number3);
		for(int n: numbers) {
			System.out.println(n);
		}
		/*
		for(int i = 0; i < 3; i++) {
			int numbers = input.nextInt();
			treeSet.add(numbers);
		}
		System.out.println("Sorted numbers are: ");
		for(Integer tSet: treeSet) {
			System.out.print(tSet + " ");
		}
		*/
		input.close();
	}

}
