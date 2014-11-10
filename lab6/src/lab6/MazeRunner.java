package lab6;

import se.lth.cs.ptdc.maze.Maze;
import se.lth.cs.window.SimpleWindow;

public class MazeRunner {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600,600,"MazeRunner");
		Maze[] maze = new Maze[5];
		for(int i = 0; i < 5; i++){maze[i]=new Maze(i+1);}
		MazeTurtle turtle = new MazeTurtle(w,0,0);
		
		turtle.penDown();
		
		for(int j = 0; j < 5; j++){
			maze[j].draw(w);
			w.moveTo(w.getWidth()/2, 30);
			w.writeText("Nivå: " + (j+1));
			w.waitForMouseClick();
			turtle.walk(maze[j]);
			w.clear();
		}
		System.out.println("Klar");
	}
}
