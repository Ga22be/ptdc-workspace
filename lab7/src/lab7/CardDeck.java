package lab7;

import java.util.Random;
import se.lth.cs.ptdc.cardGames.Card;

/**
 * En kortlek med Card-objekt. OBSERVERA: bara skelett, du ska själv skriva
 * denna klass.
 */
public class CardDeck {
	private Card[] cards; // korten
	private int current;
	private static Random rand = new Random();

	/**
	 * Skapar en kortlek som inte är blandad.
	 */
	public CardDeck() {
		cards = new Card[52]; // skapa vektorn
		for (int suit = Card.SPADES; suit <= Card.CLUBS; suit++) {
			for (int rank = 0 + current; rank < (13 + current); rank++) {
				cards[rank] = new Card(suit, rank - (current-1));
			}
			current += 13;
		}
		current = 0;
	}
	
	public Card getV(int i){
		return cards[i];
	}

	/**
	 * Blandar kortleken.
	 */
	public void shuffle() {
		int nbr;
		for(int i = 51; i > 0; i--){
			nbr = rand.nextInt(i+1);
			Card tempCard = cards[i];
			cards[i] = cards[nbr];
			cards[nbr] = tempCard;
		}
	}

	/**
	 * Undersöker om det finns fler kort i kortleken.
	 * 
	 * @return true om det finns fler kort, false annars
	 */
	public boolean moreCards() {
		if(current < 52){
			return true;
		} else {
			return false;			
		}
	}

	/**
	 * Drar det översta kortet i leken. Fungerar bara om moreCards är true.
	 * 
	 * @return det översta kortet i leken
	 */
	public Card getCard() {
		if(moreCards()){
			return cards[current++];
		}
		return null;
	}
}