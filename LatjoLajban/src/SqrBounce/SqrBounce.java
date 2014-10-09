package SqrBounce;

import java.util.Random;

import se.lth.cs.window.SimpleWindow;
import se.lth.cs.ptdc.square.*;

public class SqrBounce {

	public static void main(String[] args) {
		boolean run = true;
		short horizontal = 1;
		short vertical = 1;

		// Window variables
		int windowSide = 600;
		int sqrSide = 20;
		int maxX = windowSide - sqrSide / 2;
		int maxY = windowSide - sqrSide / 2;
		int minX = windowSide - maxX;
		;
		int minY = windowSide - maxY;
		//int maxdxdy = 5;

		// Square position
		int x = 10;
		int y = 10;
		int dx = 0;
		int dy = 0;

		// Create window and square
		SimpleWindow w = new SimpleWindow(windowSide, windowSide, "Fönster");
		Square sq = new Square(10, 10, sqrSide);

		// New randomizer for changing x and y
		//Random rndm = new Random();

		// Draw first square
		sq.draw(w);

		// Move square loop
		while (run) {
			// Are we within the window?
			if (x >= maxX) {
				vertical = -1;
				dx = rndX(null);
				if (y >= maxY) {
					horizontal = -1;
					dy = rndY(null);
				} else if (y <= minY) {
					horizontal = 1;
					dy = rndY(null);
				}
			} else if (x <= minX) {
				vertical = 1;
				dx = rndX(null);
				if (y >= maxY) {
					horizontal = -1;
					dy = rndY(null);
				} else if (y <= minY) {
					horizontal = 1;
					dy = rndY(null);
				}
			}
			// Decide random dx and dy
			//dx = rndm.nextInt(maxdxdy);
			//dy = rndm.nextInt(maxdxdy);

			// Up or down
			dx = dx * vertical;
			dy = dy * horizontal;

			// Give x,y new values
			x = x + dx;
			y = y + dy;

			sq.move(dx, dy);
			sq.draw(w);

		}
	}
	
	private static int rndX(String args) {
		Random rnd = new Random();
		return rnd.nextInt(5);
	}
	
	private static int rndY(String args){
		Random rnd = new Random();
		return rnd.nextInt(5);
	}
}