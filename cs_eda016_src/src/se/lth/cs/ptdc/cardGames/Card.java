package se.lth.cs.ptdc.cardGames;

/**
 * Ett spelkort med en färg och en valör.
 */
public class Card {
	/** Konstant för kortets färg: Spader */
	public static final int SPADES = 1;
	/** Konstant för kortets färg: Hjärter */
	public static final int HEARTS = SPADES + 1;
	/** Konstant för kortets färg: Ruter */
	public static final int DIAMONDS = SPADES + 2;
	/** Konstant för kortets färg: Klöver */
	public static final int CLUBS = SPADES + 3;

	private int suit; // färg
	private int rank; // valör

	/**
	 * Skapar ett spelkort med en given färg och valör.
	 * 
	 * @param suit
	 *            färgen (SPADES, HEARTS, DIAMONDS, eller CLUBS)
	 * @param rank
	 *            valören (1-13)
	 */
	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}

	/**
	 * Tar reda på kortets färg.
	 * 
	 * @return färgen (SPADES, HEARTS, DIAMONDS eller CLUBS)
	 */
	public int getSuit() {
		return suit;
	}

	/**
	 * Tar reda på kortets valör.
	 * 
	 * @return valören (1-13)
	 */
	public int getRank() {
		return rank;
	}
}
