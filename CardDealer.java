/**
 * 
 */

/**
 * @author trevor.wiedenmann
 *
 */
public class CardDealer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeckOfCards newDeck = new DeckOfCards();
		System.out.println("fresh, unshuffled deck");
		System.out.println(newDeck.toString());
		newDeck.shuffle();
		System.out.println("shuffled deck");
		System.out.println(newDeck.toString());
		System.out.println("Drawing Cards...");
		for (int i = 0; i < 52/2; i++) {
			Card player1 = newDeck.draw();
			Card player2 = newDeck.draw();
			System.out.println("Player 1: " + player1);
			System.out.println("Player 2: " + player2);
			if (player1.compareTo(player2) > 0) {
				System.out.println("Player 1 wins!");
				System.out.println();
			} else if (player2.compareTo(player1) > 0) {
				System.out.println("Player 2 wins!");
				System.out.println();
			} else {
				System.out.println("Everyone wins!");
				System.out.println();
			}
		}
		newDeck.restoreDeck();
		System.out.println("restored deck");
		System.out.println(newDeck.toString());
	}

}
/**
*This program uses encapsulation to get methods from one file (DeckOfCards.java) and call them in another file (CardDealer.java).
*The most challenging part of this program was printing the restored deck because there was an error being thrown when CardDealer played 51 times.
*/