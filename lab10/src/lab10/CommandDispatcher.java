package lab10;

import se.lth.cs.window.SimpleWindow;
import se.lth.cs.ptdc.shapes.Shape;

class CommandDispatcher {
	private SimpleWindow w;
	private ShapeList shapes;

	public CommandDispatcher(SimpleWindow w, ShapeList shapes) {
		this.w = w;
		this.shapes = shapes;
	}

	public void mainLoop() {
		while (true) {
			// användaren klickar på en figur
			w.waitForMouseClick();
			char quit = w.getKey();
			if(quit == 's'){
				break;
			}
			int mouseX = w.getMouseX();
			int mouseY = w.getMouseY();
			Shape tempShape = shapes.findHit(mouseX, mouseY);
			
			if(tempShape != null){
				// användaren klickar på en ny position
				w.waitForMouseClick();
				mouseX = w.getMouseX();
				mouseY = w.getMouseY();
				// figuren flyttas till den nya positionen
				tempShape.moveToAndDraw(w, mouseX, mouseY);
			}
		}
	}
}