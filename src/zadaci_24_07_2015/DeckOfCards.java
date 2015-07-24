package zadaci_24_07_2015;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DeckOfCards {
	
	/**
	 * Zadatak: 2.  
	 * Napisati program koji simulira nasumično izvlačenje 
	 * karte iz špila od 52 karte. Program treba ispisati 
	 * koja karta je izvučena (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q ili K) 
	 * te znak u kojem je data karta (Srce, Pik, Djetelina, Kocka). 
	 * Primjer: Karta koju ste izvukli je 10 u znaku kocke.
	 * 
	 * @author Bojan Aleksic
	 */

	public static void main(String[] args) throws MalformedURLException {
		
		/** Create an array of deck of cards */
		int[] deck = new int[52];
		
		/** OPTIONAL: 
		 * URL and ImageIcon - constructors for loading image file that represents 
		 * a suit of the card 
		 * Read from URL
		*/
		URL urlDiamonds = new URL("http://i.imgur.com/YdXnP3T.png?1");
		URL urlHearts = new URL("http://i.imgur.com/VLhCqqH.png?1");
		URL urlSpades = new URL("http://i.imgur.com/ksucL2M.png?1");
		URL urlClubs = new URL("http://i.imgur.com/qfVvbVE.png?1");
		
		ImageIcon diamonds = new ImageIcon(urlDiamonds);
		ImageIcon hearts = new ImageIcon(urlHearts);
		ImageIcon spades = new ImageIcon(urlSpades);
		ImageIcon clubs = new ImageIcon(urlClubs);
		
		/** Read images from desktop
		ImageIcon diamonds = new ImageIcon("C:\\Users\\Beyon\\Desktop\\karo.png");
		ImageIcon hearts = new ImageIcon("C:\\Users\\Beyon\\Desktop\\herc.png");
		ImageIcon spades = new ImageIcon("C:\\Users\\Beyon\\Desktop\\pik.png");
		ImageIcon clubs = new ImageIcon("C:\\Users\\Beyon\\Desktop\\tref.png");
		*/
		
		String cardTitle = "Card: "; // Title for the window dialog box
		
		/** Initialize array of the suits */
		String[] suits = {"Spades", "Diamonds", "Hearts", "Clubs"};
		/** Initialize array of ranks */
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		/** Shuffle cards randomly */
		for(int i = 0; i < deck.length; i++) {
			deck[i] = (int)(Math.random() * deck.length);
		}
		
		/** Pick four cards from the deck */
		for(int i = 0; i < 4; i++) {
			
			String suit = suits[deck[i] / 13]; // Obtaining suit of the card
			String card = ranks[deck[i] % 13]; // Obtaining rank of the card

			/** If obtained suit correspond to "Spades" - display spades */
			if(suit.equals(suits[0])) { 
				/** OPTIONAL: "JOptionPane" for displaying pop-up window dialog box */
				JOptionPane.showMessageDialog(null, card + " " + suit, cardTitle, JOptionPane.INFORMATION_MESSAGE, spades);
			//	System.out.println("Card: " + card + " of " + suit);
			} 
			/** If obtained suit correspond to "Diamonds" - display diamonds */
			if(suit.equals(suits[1])) {
				/** OPTIONAL: "JOptionPane" for displaying pop-up window dialog box */
				JOptionPane.showMessageDialog(null, card + " " + suit, cardTitle, JOptionPane.INFORMATION_MESSAGE, diamonds);
			//	System.out.println("Card: " + card + " of " + suit);
			}
			/** If obtained suit correspond to "Hearts" - display hearts */
			if(suit.equals(suits[2])) {
				/** OPTIONAL: "JOptionPane" for displaying pop-up window dialog box */
				JOptionPane.showMessageDialog(null, card + " " + suit, cardTitle, JOptionPane.INFORMATION_MESSAGE, hearts);
			//	System.out.println("Card: " + card + " of " + suit);
			} 
			/** If obtained suit correspond to "Clubs" - display clubs */
			if(suit.equals(suits[3])) {
				/** OPTIONAL: "JOptionPane" for displaying pop-up window dialog box */
				JOptionPane.showMessageDialog(null, card + " " + suit, cardTitle, JOptionPane.INFORMATION_MESSAGE, clubs);
			//	System.out.println("Card: " + card + " of " + suit);
			}
		}
		
	}

}
