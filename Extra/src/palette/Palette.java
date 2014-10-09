package palette;

import se.lth.cs.window.*;
import java.awt.Color;

public class Palette {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "Palette");
		Color c = new Color(0, 0, 0);
		int startX = 50;
		int startY = 50;

		for (int j = 0; j < 256; j++) {
			for (int i = 0; i < 256; i++) {
				c = new Color(i, j, 0);
				w.setLineColor(c);
				w.moveTo(startX + i, startY + j);
				w.lineTo(startX + i, startY + j);
			}
		}
	}
}
