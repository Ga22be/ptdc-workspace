package ovn4;

import java.util.Random;

public class Die {
	private Random rnd = new Random();
	private int side = 0;
	
	public Die(){

	}
	
	public void roll(){
		side = 1 + rnd.nextInt(6);
	}
	
	public int getResult(){
		return side;
	}
}
