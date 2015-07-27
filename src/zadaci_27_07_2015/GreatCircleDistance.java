package zadaci_27_07_2015;

import java.util.Scanner;

public class GreatCircleDistance {
	
	/**
	 * Zadatak: 2. 
	 * Great circle distance predstavlja udaljenost između 
	 * dvije tačke na površine sfere. Neka nam (x1, y1) i (x2, y2) 
	 * predstavljaju geografsku širinu i dužinu dvije tačke. 
	 * Great circle distance između ove dvije tačke može biti izračunata 
	 * koristeći se sljedećom formulom: 
	 * d = radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)). 
	 * Napisati program koij pita korisnika da unese geografsku širinu i dužinu 
	 * u stepenima dvije tačke na površini zemlje te mu ispisuje great circle distance. 
	 * Prosječni radius zemlje je 6.371.01 km. 
	 * Stepene koje korisnik unese trebamo promijeniti u radianse koristeći se 
	 * Math.toRadians metodom jer Java trigonometrijske metode koriste radianse. 
	 * Širina i dužina u ovoj formuli se odnose na zapad i sjever. 
	 * Koristimo negativne vrijednosti da označimo istok i jug. 
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter location of the first point: ");
		/** Enter a longitude and latitude of the first point and convert it into radians */
		double x1 = Math.toRadians(input.nextDouble());
		double y1 = Math.toRadians(input.nextDouble());
		
		System.out.println("Enter loctaion of the second point: ");
		/** Enter a longitude and latitude of the second point and convert it into radians */
		double x2 = Math.toRadians(input.nextDouble());
		double y2 = Math.toRadians(input.nextDouble());
		
		final double RADIUS = 6371.01; // Radius of the earth
		/** Formula */
		double d = RADIUS * Math.acos(((Math.sin(x1) * Math.sin(x2)) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2))));
		
		/** Print result */
		System.out.println("Result is: " + d);
		
		input.close();
	}

}
