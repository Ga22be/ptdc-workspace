package lab6;

import se.lth.cs.window.SimpleWindow;
import se.lth.cs.ptdc.maze.*;
import lab4.Turtle;

public class MazeTurtle extends Turtle{
	public MazeTurtle(SimpleWindow w, int x, int y){
		super(w,x,y);
	}
	
	public void walk(Maze maze){
		jumpTo(maze.getXEntry(), maze.getYEntry());
		while(!maze.atExit(getX(), getY())){
			if(!maze.wallAtLeft(getDirection(), getX(), getY()) && !maze.wallInFront(getDirection(), getX(), getY())){
				left(90);
				forward(1);
			}
			else if(!maze.wallAtLeft(getDirection(), getX(), getY()) && maze.wallInFront(getDirection(), getX(), getY())){
				left(90);
				forward(1);
			}
			else if(maze.wallAtLeft(getDirection(), getX(), getY()) && maze.wallInFront(getDirection(), getX(), getY())){
				left(270);
			}
			if(maze.wallAtLeft(getDirection(), getX(), getY()) && !maze.wallInFront(getDirection(), getX(), getY())){
				forward(1);
			}
			w.delay(8);
		}
	}
}
