package lab7;

import se.lth.cs.ptdc.cardGames.Card;
import se.lth.cs.ptdc.cardGames.CardDeck;

public class Patiens {
	public static void main(String[] args) {
		CardDeck deck;
		Card card;
		double wins = 0;
		boolean gickUt = true;

		//for (int i = 0; i < 1; i++) {
		while(wins != 1){
			deck = new CardDeck();
			deck.shuffle();
			gickUt = true;
			while (deck.moreCards() && gickUt) {
				card = deck.getCard();
				if (deck.moreCards() && card.getRank() != 1) {
					gickUt = true;
					System.out.println("Rätt på 1");
					card = deck.getCard();
					if (deck.moreCards() && card.getRank() != 2) {
						gickUt = true;
						System.out.println("Rätt på 2");
						card = deck.getCard();
						if (deck.moreCards() && card.getRank() != 3) {
							gickUt = true;
							System.out.println("Rätt på 3");
						} else {
							gickUt = false;
							System.out.println("Fel på 3");
						}
					} else {
						gickUt = false;
						System.out.println("Fel på 2");
					}
				} else {
					gickUt = false;
					System.out.println("Fel på 1");
				}
			}
			if(gickUt){
				wins++;
				System.out.println(wins + " patienser gick ut!");
			}		
		}
	}
}
