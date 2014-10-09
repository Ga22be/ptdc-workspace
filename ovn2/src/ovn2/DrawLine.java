package ovn2;

import se.lth.cs.window.*;

public class DrawLine {
	public static void main(String[] args){
		SimpleWindow w = new SimpleWindow(400,400,"Paint");
		int mouseX = 0;
		int mouseY = 0;
		
		while(true){
			w.waitForMouseClick();
			mouseX = w.getMouseX();
			mouseY = w.getMouseY();
			
			w.lineTo(mouseX, mouseY);
		}
	}
}
