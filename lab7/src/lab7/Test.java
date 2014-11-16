package lab7;

import se.lth.cs.ptdc.cardGames.Card;

public abstract class Test {

	public static void main(String[] args) {
		CardDeck deck = new CardDeck();
		
		Card[] cards = new Card[52];
		
		for(int i = 0; i < 52; i++){
			cards[i] = deck.getV(i);
			System.out.println(cards[i].getRank() + " och " + cards[i].getSuit());
		}
		
		deck.shuffle();
		
		for(int i = 0; i < 52; i++){
			cards[i] = deck.getV(i);
			System.out.println(cards[i].getRank() + " och " + cards[i].getSuit());
		}
		

	}

}
