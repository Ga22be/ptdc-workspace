package lab6;

import se.lth.cs.window.SimpleWindow;
import se.lth.cs.ptdc.maze.*;
import lab4.Turtle;

public class MazeTurtle extends Turtle {
	public MazeTurtle(SimpleWindow w, int x, int y) {
		super(w, x, y);
	}

	public void walk(Maze maze) {
		jumpTo(maze.getXEntry(), maze.getYEntry());
		while (!maze.atExit(getX(), getY())) {
			if (!wallAtLeft(maze) && !wallInFront(maze)) {
				left(90);
				forward(1);
			} else if (!wallAtLeft(maze) && wallInFront(maze)) {
				left(90);
				forward(1);
			} else if (wallAtLeft(maze) && wallInFront(maze)) {
				left(270);
			}
			if (wallAtLeft(maze) && !wallInFront(maze)) {
				forward(1);
			}
			w.delay(8);
		}
	}

	private boolean wallAtLeft(Maze maze) {
		return maze.wallAtLeft(getDirection(), getX(), getY());
	}

	private boolean wallInFront(Maze maze) {
		return maze.wallInFront(getDirection(), getX(), getY());
	}
}
