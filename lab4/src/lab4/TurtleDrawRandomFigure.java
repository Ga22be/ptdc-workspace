package lab4;
import se.lth.cs.window.SimpleWindow;

import java.util.Random;

public class TurtleDrawRandomFigure {
	public static void main(String[] args) {
		Random rand = new Random();
		SimpleWindow w = new SimpleWindow(600, 600, "TurtleDrawRandomFigure");
		Turtle t = new Turtle(w, 300, 300);
		t.penDown();
		for (int i = 0; i < 4; i++) {
			t.forward(rand.nextInt(100));
			SimpleWindow.delay(100);
			t.left(90);
		}
	}
}
