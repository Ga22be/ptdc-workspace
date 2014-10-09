package se.lth.cs.ptdc.cardGames;

import se.lth.cs.ptdc.cardGames.Card;

/**
 * En kortlek med Card-objekt.
 * OBSERVERA: bara skelett, du ska själv skriva denna klass.
 */
public class CardDeck {
	/**
	 * Skapar en kortlek som inte är blandad.
	 */
	public CardDeck() {
		// ...
	}

	/**
	 * Blandar kortleken.
	 */
	public void shuffle() {
		// ...
	}

	/**
	 * Undersöker om det finns fler kort i kortleken.
	 * 
	 * @return true om det finns fler kort, false annars
	 */
	public boolean moreCards() {
		// ...
		return false;
	}

	/**
	 * Drar det översta kortet i leken. Fungerar bara om moreCards är true.
	 * 
	 * @return det översta kortet i leken
	 */
	public Card getCard() {
		// ...
		return null;
	}
}
