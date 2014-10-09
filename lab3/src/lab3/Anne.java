package lab3;

import se.lth.cs.window.*;
import se.lth.cs.ptdc.square.*;

public class Anne {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "drawSquares");
		Square sq = new Square(0, 0, 50);
		int oldX = 0;
		int oldY = 0;
		int newX = 0;
		int newY = 0;
		// För att kontrollera om det är första varvet i loopen
		boolean first = true;
		
		// Plocka ut de första koordinaterna vi vill räkna från (första trycket)
		w.waitForMouseClick();
		oldX = w.getMouseX();
		oldY = w.getMouseY();


		while (true) {
			/** Första körningen: Om det är första rundan så ritar vi ut kvadraten i punkten vi precis läste av!
			
			 	Andra körningen: Nu har vi redan en kvadrat där vi börjar, den sista i förra lopen eftersom 
			 	oldX=newX &  oldY=newY. Alltså ritar vi inte ut den igen! 
			 */
			if(first){
				sq.move(oldX, oldY);
				sq.draw(w);
				first = false;
			}
			
			// Läser av nästa mustryck
			w.waitForMouseClick();
			newX = w.getMouseX();
			newY = w.getMouseY();
			
			/** Beräknar hur mycket sq ska flyttas var gång i for loopen både i x-led och i y-led. 
			 	Men bara /9 för vi hoppar bara 9 steg var "linje".
			 	
			 	Math.round avrundar talet man får precis som vanlig avrundning i matematik
			*/
			int distX = Math.round((newX - oldX) / 9);
			int distY = Math.round((newY - oldY) / 9);
			
			/** Ritar ut de resterande kvadraterna med distX och distY som mellanrum. 

			 	sq.move(dx, dy) vill ju att man ger hur mycket man ska flytta sq från den tidigare positionen! 		 	
			 */

			for (int i = 0; i < 9; i++) {
				sq.move(distX, distY);
				sq.draw(w);
			}
			
			//Ser till att den nya punkten vi startar i är den gammla slutpunkten!
			oldX = newX;
			oldY = newY;
		}
	}
}
