package lab5;

import java.awt.Color;
import se.lth.cs.window.SimpleWindow;
import java.util.Random;

public class TurtleMeet {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(400, 400, "RandomTurtleWalk");
		ColorTurtle cTurtle = new ColorTurtle(w, w.getWidth() / 2,
				w.getHeight() / 2, Color.RED);
		Random rnd = new Random();
		int steps = 0;

		while (steps < 1000) {
			if (cTurtle.getX() >= 10 && cTurtle.getX() <= (w.getWidth() - 10)
					&& cTurtle.getY() >= 10
					&& cTurtle.getY() <= (w.getHeight() - 10)) {
				cTurtle.forward(1 + rnd.nextInt(10));
				cTurtle.left(-180 + rnd.nextInt(360));
			} else if (cTurtle.getX() < 10) {
				cTurtle.turnNorth();
				cTurtle.left(-rnd.nextInt(181));
				cTurtle.forward(1 + rnd.nextInt(10));
			} else if (cTurtle.getX() > (w.getWidth()-10)) {
				cTurtle.turnNorth();
				cTurtle.left(rnd.nextInt(181));
				cTurtle.forward(1 + rnd.nextInt(10));
			} else if (cTurtle.getY() < 10) {
				cTurtle.turnNorth();
				cTurtle.left(90 + rnd.nextInt(181));
				cTurtle.forward(1 + rnd.nextInt(10));
			} else if (cTurtle.getY() > (w.getHeight()-10)) {
				cTurtle.turnNorth();
				cTurtle.left(90 - rnd.nextInt(181));
				cTurtle.forward(1 + rnd.nextInt(10));
			}
			System.out.println(++steps);
			w.delay(10);
		}
	}
}
