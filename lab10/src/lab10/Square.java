package lab10;

import se.lth.cs.ptdc.shapes.Shape;
import se.lth.cs.window.SimpleWindow;

public class Square extends Shape{
	private int side;
	public Square(int x, int y, int side){
		super(x, y);
		this.side = side;
	}
	
	public void draw(SimpleWindow w){
		w.moveTo(x, y);
		w.lineTo(x+side, y);
		w.lineTo(x+side, y+side);
		w.lineTo(x, y+side);
		w.lineTo(x, y);
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public int getSide(){
		return side;
	}

}

