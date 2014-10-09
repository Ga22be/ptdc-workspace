package sin;

import se.lth.cs.window.SimpleWindow;

public class sin {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(720, 600, "Sinuskurva");
		int width = w.getWidth();
		int x0 = 0;
		int y0 = w.getHeight() / 2;
		w.moveTo(x0, y0);

		for (int i = 0; i < width; i++) {
			double angle = Math.toRadians(i);
			int yPos = (int) (y0 + -y0 * Math.sin(angle));
			w.lineTo(i, yPos);
		}
	}
}
