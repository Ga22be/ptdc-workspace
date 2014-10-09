package palette;

import se.lth.cs.window.*;
import java.awt.Color;
import java.util.Scanner;

public class PaletteV2 {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(1500, 1000, "Palette");
		Color c = new Color(0, 0, 0);
		System.out.println("Storlek på pixlar?");
		Scanner scan = new Scanner(System.in);

		int currentX = 10;
		int currentY = 10;
		int size = scan.nextInt();
		scan.close();

		for (int j = 0; j < 256; j++) {
			for (int i = 0; i < 256; i++) {
				c = new Color(i, j, 0);
				w.setLineColor(c);
				w.moveTo(currentX, currentY);
				w.lineTo(currentX + (size - 1), currentY);
				w.lineTo(currentX + (size - 1), currentY + (size - 1));
				w.lineTo(currentX, currentY + (size - 1));
				w.lineTo(currentX, currentY);
				currentX = currentX + size;
			}
			currentY = currentY + size;
			currentX = 10;
		}
	}
}
