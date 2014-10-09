package pattern;

import java.awt.Color;
import se.lth.cs.window.SimpleWindow;

public class patternV2 {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "Bakgrund");
		int width = w.getWidth();
		double height = w.getHeight();
		int colVal = 0;
		double temp = (360/height);
		Color c = null;
		
		for(int i = 0; i <= height; i++){
			double radian = temp * Math.toRadians(i);
			colVal =  (int) (Math.abs((255 * Math.sin(1 * radian))));
			c = new Color(colVal,colVal,colVal);
			w.setLineColor(c);
			w.moveTo(0, i);
			w.lineTo(width, i);
		}
	}
}
