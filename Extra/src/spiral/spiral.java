package spiral;

import se.lth.cs.window.*;

public class spiral {
	public static void main(String[] args){
		SimpleWindow w = new SimpleWindow(800, 800, "Circle");
		int x0 = w.getWidth() / 2;
		int y0 = w.getHeight() / 2;
		int radius = 0;
		w.moveTo(x0, y0);
		for (int i = 0; i <= 720; ++i) {
			radius = i/2;
			double angle = Math.toRadians(i);
			int x = x0 + (int) Math.round(radius * Math.cos(angle));
			int y = y0 + (int) Math.round(radius * Math.sin(angle));
			w.lineTo(x, y);
		}
	}
}
