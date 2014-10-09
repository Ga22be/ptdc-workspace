package pattern;

import se.lth.cs.window.*;
import java.awt.Color;

public class pattern {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 1000, "Bakgrund");
		int width = w.getWidth();
		int height = w.getHeight();
		int first = 0;
		int second = 0;

		for (int i = 0; i <= height; i++) {
			Color c = null;
			if (first < 255) {
				first++;
				int temp1 = i%255;
				c = new Color(255-temp1, 255-temp1, 255-temp1);
				w.setLineColor(c);
				if(first == 255){
					second = 0;
				}
			}
			else if(second < 255){
				second++;
				int temp2 = i%255;
				c = new Color(temp2, temp2, temp2);
				w.setLineColor(c);
				if(second == 255){
					first = 0;
				}
			}
			w.moveTo(0, i);
			w.lineTo(width, i);
		}

	}
}
