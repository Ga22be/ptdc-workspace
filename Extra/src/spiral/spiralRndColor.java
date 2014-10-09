package spiral;

import se.lth.cs.window.*;
import java.awt.Color;
import java.util.Random;

public class spiralRndColor {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(800, 800, "Circle");
		Random rnd = new Random();

		int x0 = w.getWidth() / 2;
		int y0 = w.getHeight() / 2;
		int radius = Math.min(x0, y0) - 20;
		w.moveTo(x0, y0);

		for (int i = 0; i <= 720; ++i) {
			radius = i / 2;
			if (i % 2 == 0) {
				Color c = new Color(rnd.nextInt(256), rnd.nextInt(256),rnd.nextInt(256));
				w.setLineColor(c);
			}
			double angle = Math.toRadians(i);
			int x = x0 + (int) Math.round(radius * Math.cos(angle));
			int y = y0 + (int) Math.round(radius * Math.sin(angle));
			w.lineTo(x, y);
		}
	}
}
