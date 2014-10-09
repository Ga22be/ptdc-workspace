package ovn2;

import se.lth.cs.window.*;
import se.lth.cs.ptdc.square.*;

public class DrawSqrs {
	public static void main(String[] args) {
		int sqX = 50;
		int sqY = 50;
		int moveDist = 40;
		boolean first = true;
		int iO = 1;
		
		SimpleWindow w = new SimpleWindow(400, 400, "Many funny squares");
		Square sq = new Square(sqX, sqY, 20);
		
		while (true) {
			if(moveDist <= 20){
				iO = -1;
			}
			else if(moveDist >= 40){
				iO = 1;
			}
				
			for (int j = 0; j < 5; j++) {
				first = true;
				for (int i = 0; i < 10; i++) {
					if (first) {
						sq.move(0, moveDist);
						sq.draw(w);
						SimpleWindow.delay(10);
						first = false;
					} else {
						sq.move(moveDist, 0);
						sq.draw(w);
						SimpleWindow.delay(10);
					}
				}
				sq.move(moveDist * (-9), 0);
			}
			sq.move(moveDist * (-9), moveDist * (-4));
			w.clear();
		}
	}
}
