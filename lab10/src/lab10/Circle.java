package lab10;

import se.lth.cs.ptdc.shapes.Shape;
import se.lth.cs.window.SimpleWindow;

public class Circle extends Shape{
	private int radius;
	public Circle(int x, int y, int radius){
		super(x, y);
		this.radius = radius;
	}
	
	public void draw(SimpleWindow w){
		final int CORNERS = 90;
		w.moveTo(x+radius, y);
		double conv = 2 * Math.PI/CORNERS;
		for (int i = 0; i <= CORNERS; i++){
			double angle = i * conv;
			w.lineTo((int) Math.round(x + radius * Math.cos(angle)),
					(int) Math.round(y + radius * Math.sin(angle)));
		}
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public int getRadius(){
		return radius;
	}
}
