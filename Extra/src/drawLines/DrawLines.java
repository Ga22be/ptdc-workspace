package drawLines;

import se.lth.cs.window.*;

public class DrawLines {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "Paint");

		while (true) {
			w.waitForMouseClick();
			w.lineTo(w.getMouseX(), w.getMouseY());
		}
	}
}
