package lab7;

import se.lth.cs.ptdc.cardGames.Card;
//import se.lth.cs.ptdc.cardGames.CardDeck;

public class PatiensV2 {
	public static void main(String[] args) {
		CardDeck deck;
		Card card;
		double wins = 0;
		boolean gickUt;
		int testValue = 1;
		int times = 10000000;
		
		for(int i = 0; i < times; i++) {
			deck = new CardDeck();
			deck.shuffle();
			gickUt = true;

			while (deck.moreCards() && gickUt) {
				//System.out.println("Kontrollerar " + testValue);
				card = deck.getCard();
				if (card.getRank() != testValue) {
					gickUt = true;
					//System.out.println("R�tt p� " + testValue);
				} else {
					//System.out.println("Fel p� " + testValue);
					gickUt = false;
				}
				testValue++;
				if (testValue > 3) {
					testValue = 1;
				}
			}

			if (gickUt) {
				wins++;
			}
		}
		System.out.println((wins/times) + " vinster!");
	}
}
