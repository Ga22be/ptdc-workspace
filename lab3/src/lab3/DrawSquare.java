package lab3;

import se.lth.cs.ptdc.square.Square;
import se.lth.cs.window.SimpleWindow;

public class DrawSquare {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(500, 500, "DrawSquare");
		Square sq = new Square(0, 0, 50);
		sq.draw(w);
		int oldX = 0;
		int oldY = 0;
		int newX = 0;
		int newY = 0;

		while (true) {
			w.waitForMouseClick();
			newX = w.getMouseX();
			newY = w.getMouseY();
			w.clear();
			sq.move(newX - oldX, newY - oldY);
			sq.draw(w);
			oldX = newX;
			oldY = newY;
		}
	}
}
