package ovn4;

import java.util.Random;

public class FrogTest {

	public static void main(String[] args) {
		Random rnd = new Random();
		Frog frog = new Frog();
		
		while(frog.getX() < 5 && frog.getX() > -5 && frog.getY() < 5 && frog.getY() > -5){
			switch(rnd.nextInt(4)){
			case 0: frog.jumpNorth(); break;
			case 1: frog.jumpSouth(); break;
			case 2: frog.jumpEast(); break;
			case 3: frog.jumpWest(); break;
			} 
		}
		
		System.out.println("x: " + frog.getX() + ", y: " + frog.getY());
		
		

	}

}
