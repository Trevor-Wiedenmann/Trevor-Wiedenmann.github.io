import java.util.Random;

public class DeckOfCards implements DeckOfCardsInterface {
	private Card[] cards;
	private final int DECKSIZE = 52;
	private int nextCardIndex;

	public DeckOfCards() {
		cards = new Card[DECKSIZE];
		nextCardIndex = 0;
		int i = 0;
		for (Suit s : Suit.values()) {
			for (FaceValue v : FaceValue.values()) {
				cards[i] = new Card(s, v);
				i++;
			}
		}
	}

	@Override
	public void shuffle() {
		// TODO Auto-generated method stub
		Random generator = new Random();

		// Attempt to swap each card with a random card in the deck.
		// This isn't a perfect random shuffle but it is a simple one.
		// A better shuffle requires a more complex algorithm.

		for (int i = 0; i < cards.length; i++) {
			int j = generator.nextInt(cards.length);
			Card temp = cards[i];
			cards[i] = cards[j];
			cards[j] = temp;
		}

		// Reset instance variable that keeps track of dealt and remaining
		// cards.
		nextCardIndex = 0;
	}

	@Override
	public Card draw() {
		// TODO Auto-generated method stub
		if (nextCardIndex < 52) {
			nextCardIndex++;
			return cards[nextCardIndex - 1];
		}
		return null;
	}

	@Override
	public void restoreDeck() {
		// TODO Auto-generated method stub
		nextCardIndex = 0;
		int i = 0;
		for (Suit s : Suit.values()) {
			for (FaceValue v : FaceValue.values()) {
				cards[i] = new Card(s, v);
				i++;
			}
		}
	}

	@Override
	public int numCardsRemaining() {
		// TODO Auto-generated method stub
		return cards.length - nextCardIndex;
	}

	@Override
	public int numCardsDealt() {
		// TODO Auto-generated method stub
		return nextCardIndex;
	}

	@Override
	public Card[] dealtCards() {
		// TODO Auto-generated method stub
		Card[] dealtCards = new Card[nextCardIndex];
		for (int i = 0; i < nextCardIndex; i++) {
			dealtCards[i] = cards[i];
		}
		return null;
	}

	@Override
	public Card[] remainingCards() {
		// TODO Auto-generated method stub
		Card[] remainingCards = new Card[cards.length - nextCardIndex];
		for (int i = 0; i < remainingCards.length; i++) {
			remainingCards[i] = cards[nextCardIndex + i];
		}
		return null;
	}

	@Override
	public String toString() {
		String unshuffled = "";
		for (int i = 0; i < DECKSIZE; i++) {
			unshuffled += cards[i] + " ";
			if((i + 1) % 4 == 0) {
				unshuffled += "\n";
			}
		}
		return unshuffled;
	}
}
