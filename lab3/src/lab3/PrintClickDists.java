package lab3;
import se.lth.cs.window.SimpleWindow;

public class PrintClickDists {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "PrintClickDists");
		int oldX = 0;
		int oldY = 0;
		while (true) {
			w.waitForMouseClick();
			int newX = w.getMouseX();
			int newY = w.getMouseY();
			System.out.println("Avstånd i x-led: " + (newX - oldX) + ", "
					+ "i y-led: " + (newY - oldY));
			oldX = newX;
			oldY = newY;
		}
	}
}
