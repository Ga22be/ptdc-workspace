package ovn8;

import java.util.ArrayList;

public class IntStackV2 {
	private ArrayList<Integer> v;// talen p� stacken
	private int top; // index f�r den f�rsta lediga platsen i v

	/** Skapar en tom heltalsstack med plats f�r maxSize element */
	public IntStackV2(int maxSize) {
		v = new ArrayList<Integer>();
	}

	/** L�gger talet nbr p� stacken */
	public void push(int nbr) {
		v.add(new Integer(nbr));
	}

	/** Tar bort det �versta talet fr�n stacken, returnerar det */
	public int pop() {
		return v.remove(v.size()-1).intValue();
	}

	/** Unders�ker om stacken �r tom */
	public boolean isEmpty() {
		return v.isEmpty();
	}
}