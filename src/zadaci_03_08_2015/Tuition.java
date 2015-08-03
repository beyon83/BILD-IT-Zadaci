package zadaci_03_08_2015;

public class Tuition {
	
	/**
	 * Zadatak: 5. 
	 * Pretpostavimo da školarina za godinu dana na fakultetu 
	 * košta 10.000 i da se povećava za 5% svake godine. 
	 * Godinu dana od danas, školarina će iznositi 10.500. 
	 * Napisati program koji izračunava koliko će školarina 
	 * za godinu dana iznositi kroz 10 godina.
	 */

	public static void main(String[] args) {
		
		double godisnjaSkolarina = 10000; // godisnja skolarina
		final double GODISNJE_POVECANJE = 0.05; // godisnje povecanje u %
		
		/** Formula za izracunavanje koliko ce godisnja skolarina iznositi za 10 godina */
		double zaDesetGodina = (godisnjaSkolarina * (GODISNJE_POVECANJE * 10)) + godisnjaSkolarina;
		
		System.out.println(zaDesetGodina); // printaj rezultat
		
	}

}
