package zadaci_02_08_2015;

public class CurrentTime {
	
	/**
	 * Zadatak: 4. 
	 * Napisati metodu koja vraća datum i trenutačno vrijeme.
	 */
	
	public static String currentTime() {
		/** Instantiate an object from Date class */
		java.util.Date date = new java.util.Date();
		/** Return date and time using the String.format() */
		return String.format("%s", date); 
	}

	public static void main(String[] args) {
		
		/** Invoke method */
		System.out.println(currentTime());
		
	}

}
