package ovn8;

public class IntStack {
	private int[] v = new int[8]; // talen på stacken
	private int top; // index för den första lediga platsen i v

	/** Skapar en tom heltalsstack med plats för maxSize element */
	public IntStack() {
		top = 0;
	}

	/** Lägger talet nbr på stacken */
	public void push(int nbr) {
		add(nbr);
		top++;
	}

	/** Tar bort det översta talet från stacken, returnerar det */
	public int pop() {
		top--;
		return v[top];
	}

	/** Undersöker om stacken är tom */
	public boolean isEmpty() {
		return top == 0;
	}
	
	/** Lägger till längd på stacken om nödvändigt */ 
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
