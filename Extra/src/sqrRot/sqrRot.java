package sqrRot;

import se.lth.cs.ptdc.square.Square;
import se.lth.cs.window.SimpleWindow;

public class sqrRot {
	public static void main(String[] args){
		SimpleWindow w = new SimpleWindow(800,600,"Roterande Kvadrater");
		int side = 70;
		int x0 = (w.getWidth()%(side*10))/2;
		int y0 = w.getHeight()/2;
		Square sq = new Square(x0,y0,side);
		
		for(int i = 0; i <= 10; i++){
			sq.draw(w);
			sq.rotate(9);
			sq.move(side, 0);
		}
	}
}
