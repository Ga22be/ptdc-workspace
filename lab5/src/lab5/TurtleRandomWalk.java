package lab5;

import java.awt.Color;
import se.lth.cs.window.SimpleWindow;
import java.util.Random;

public class TurtleRandomWalk {
	static SimpleWindow w = new SimpleWindow(600, 600, "RandomTurtleWalk");
	static Random rnd = new Random();
	static int steps = 0;
	
	public static void main(String[] args) {
		ColorTurtle[] cTurtle = new ColorTurtle[2];
		cTurtle[0] = new ColorTurtle(w, 20, w.getHeight() / 2, Color.RED);
		cTurtle[1] = new ColorTurtle(w, w.getWidth() - 20, w.getHeight() / 2, Color.BLUE);
		int distance = 100;

		while (distance > 50){
			for(int i= 0; i < 2; i++){	
				Move(cTurtle[i]);
			}
			distance = (int) Math.sqrt(Math.pow(cTurtle[1].getX()-cTurtle[0].getX(), 2) + Math.pow(cTurtle[1].getX()-cTurtle[0].getY(), 2));
		}
		System.err.println("HOLY FUCK THAT WAS ABUT TIME!!!");
	}

	private static void Move(ColorTurtle cTurtleTest) {
		if (cTurtleTest.getX() >= 10 && cTurtleTest.getX() <= (w.getWidth() - 10)
				&& cTurtleTest.getY() >= 10
				&& cTurtleTest.getY() <= (w.getHeight() - 10)) {
			cTurtleTest.forward(1 + rnd.nextInt(10));
			cTurtleTest.left(-180 + rnd.nextInt(360));
			steps++;
			System.out.println(steps);
			w.delay(10);
		} else if (cTurtleTest.getX() < 10) {
			cTurtleTest.turnNorth();
			cTurtleTest.left(-rnd.nextInt(181));
			cTurtleTest.forward(1 + rnd.nextInt(10));
			steps++;
			w.delay(10);
		} else if (cTurtleTest.getX() > (w.getWidth()-10)) {
			cTurtleTest.turnNorth();
			cTurtleTest.left(rnd.nextInt(181));
			cTurtleTest.forward(1 + rnd.nextInt(10));
			steps++;
			w.delay(10);
		} else if (cTurtleTest.getY() < 10) {
			cTurtleTest.turnNorth();
			cTurtleTest.left(90 + rnd.nextInt(181));
			cTurtleTest.forward(1 + rnd.nextInt(10));
			steps++;
			w.delay(10);
		} else if (cTurtleTest.getY() > (w.getHeight()-10)) {
			cTurtleTest.turnNorth();
			cTurtleTest.left(90 - rnd.nextInt(181));
			cTurtleTest.forward(1 + rnd.nextInt(10));
			steps++;
			w.delay(10);
		}
	}
}
