package zadaci_30_07_2015;

public class VehiclePlateNumbers {
	
	/**
	 * Zadatak: 1. 
	 * Pretpostavimo da se registarska tablica za auto 
	 * sastoji od tri uppercase karaktera i 4 broja u 
	 * sljedećem formatu AAA-1234. 
	 * Napisati program koji nasumično generiše tablicu.
	 */

	public static void main(String[] args) {
		
		String plateLetters[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		
		for(int i = 0; i < 3; i++) {
			int randomLetters = (int)(Math.random() * plateLetters.length);
			System.out.print(plateLetters[randomLetters]);
		}
		
		System.out.print("-");
		
		for(int j = 0; j < 4; j++) {
			int randomNumbers = (int)(Math.random() * 10);
			System.out.print(randomNumbers);
		}
		
	}

}
