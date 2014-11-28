package ovn8;

public class IntStack {
	private int[] v = new int[8]; // talen p� stacken
	private int top; // index f�r den f�rsta lediga platsen i v

	/** Skapar en tom heltalsstack med plats f�r maxSize element */
	public IntStack() {
		top = 0;
	}

	/** L�gger talet nbr p� stacken */
	public void push(int nbr) {
		add(nbr);
		top++;
	}

	/** Tar bort det �versta talet fr�n stacken, returnerar det */
	public int pop() {
		top--;
		return v[top];
	}

	/** Unders�ker om stacken �r tom */
	public boolean isEmpty() {
		return top == 0;
	}
	
	/** L�gger till l�ngd p� stacken om n�dv�ndigt */ 
	private void add(int nbr){
		if(v.length-1 == top){
			int[] temp = v;
			v = new int[temp.length*2];
			for (int i = 0; i < temp.length; i++){
				v[i] = temp[i];
			}
			v[top] = nbr;
		} else {
			v[top] = nbr;
		}
	}
}
