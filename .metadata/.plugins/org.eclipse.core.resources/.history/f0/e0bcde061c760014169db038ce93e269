package mandelbrot;

import se.lth.cs.ptdc.fractal.MandelbrotGUI;

public class Mandelbrot {

	public static void main(String[] args) {

		// TODO kommentera koden -.-

		// Skapar gui som ska visas på skärmen
		MandelbrotGUI gui = new MandelbrotGUI();

		// Skapar en mandelbrotgenerator
		Generator generator = new Generator();

		// För kontroll om renderad
		boolean rendered = false;

		/**
		 * Hanterar knapptryckningar i GUI och anropar motsvarande metoder i
		 * generatorn. Renderar inte vid zoom om inte renderad sedan tidigare.
		 */
		while (true) {
			switch (gui.getCommand()) {
			case MandelbrotGUI.RENDER:
				generator.render(gui);
				rendered = true;
				break;
			case MandelbrotGUI.RESET:
				gui.resetPlane();
				gui.clearPlane();
				rendered = false;
				break;
			case MandelbrotGUI.QUIT:
				System.exit(0);
				break;
			case MandelbrotGUI.ZOOM:
				if (rendered) {
					generator.render(gui);
				}
				break;
			}
		}
	}
}
