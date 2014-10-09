package ovn2;

import se.lth.cs.ptdc.square.Square;
import se.lth.cs.window.SimpleWindow;

public class DrawSqrsV2 {
	public static void main(String[] args) {
		int moveDist = 20;

		SimpleWindow w = new SimpleWindow(400, 400, "Hej");
		Square sq = new Square(20, 20, 20);

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 10; i++) {
				sq.draw(w);
				sq.move(moveDist, 0);
			}
			sq.move(-10 * moveDist, moveDist);
		}
	}
}
