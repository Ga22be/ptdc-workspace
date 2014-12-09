package lab10;

import se.lth.cs.ptdc.shapes.Shape;
import se.lth.cs.window.SimpleWindow;

public class Triangle extends Shape{
	private int side;
	public Triangle(int x, int y, int side){
		super(x, y);
		this.side = side;
	}
	
	public void draw(SimpleWindow w){
		w.moveTo(x, y);
		w.lineTo(x+side, y);
		int xTop = w.getX() + (int) Math.round(side*Math.cos(2*Math.PI/3)); 
		int yTop = w.getY() - (int) Math.round(side*Math.sin(2*Math.PI/3));
		w.lineTo(xTop, yTop);
		w.lineTo(x, y);
	}
}
