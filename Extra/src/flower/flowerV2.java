package flower;

import java.awt.Color;
import se.lth.cs.window.SimpleWindow;

public class flowerV2 {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(800, 800, "Flower");
		int x0 = w.getWidth() / 2;
		int y0 = w.getHeight() / 2;
		int radius = Math.min(x0, y0) - 20;
		int fat = 2;
		int xMod = 1;
		int yMod = 1;
		int reverse = 0;
		boolean color = false;
		Color c = null;

		for (int j = 0; j < 4; j++) {
			switch (j) {
			case 0:
				xMod = 1;
				yMod = 1;
				reverse = 1;
				c = new Color(255,0,0);
				break;

			case 1:
				xMod = 1;
				yMod = -1;
				reverse = -1;
				c = new Color(0,255,0);
				break;

			case 2:
				xMod = -1;
				yMod = 1;
				reverse = -1;
				c = new Color(0,0,255);
				break;

			case 3:
				xMod = -1;
				yMod = -1;
				reverse = 1;
				c = new Color(255,255,0);
				break;
			}
			
			if(color){
				w.setLineColor(c);
			}
			int runRad = Math.min(x0, y0) - 20;
			w.moveTo(x0 + xMod * radius, y0);
			for (int i = 0; i <= 45; i++) {
				double angle = Math.toRadians(i);
				runRad = (int) (runRad * Math.cos(fat * angle));
				int x = x0
						+ (int) (xMod * Math.round(runRad * Math.cos(angle)));
				int y = y0
						+ (int) (yMod * Math.round(runRad * Math.sin(angle)));
				w.lineTo(x, y);
			}
			
			runRad = Math.min(x0, y0) - 20;
			w.moveTo(x0, y0 + yMod * reverse * radius);
			for (int i = 0; i <= 45; i++) {
				double angle = Math.toRadians(i);
				runRad = (int) (runRad * Math.cos(fat * angle));
				int x = x0
						+ (int) (xMod * Math.round(runRad * Math.cos(angle)));
				int y = y0
						+ (int) (yMod * Math.round(runRad * Math.sin(angle)));
				w.lineTo(y, x);
			}
		}
	}
}
