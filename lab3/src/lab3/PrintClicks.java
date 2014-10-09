package lab3;
import se.lth.cs.window.SimpleWindow;

public class PrintClicks {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "PrintClicks");
		while (true) {
			w.waitForMouseClick();
			System.out.println("x = " + w.getMouseX() + ", " + "y = "
					+ w.getMouseY());
		}
	}
}
