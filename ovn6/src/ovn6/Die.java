package ovn6;

import java.util.Random;

public class Die {
	private Random rnd = new Random();
	
	public Die(){		
		
	}
	
	public int roll(){
		return 1+rnd.nextInt(6);
	}

}
