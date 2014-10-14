package lab4;

import se.lth.cs.window.SimpleWindow;

public class Turtle {
	// ... lägg till attribut
	private int x = 0;
	private int y = 0;
	private int curAngle = 90;
	private SimpleWindow w = null;
	private boolean pen = true;

	/**
	 * Skapar en sköldpadda som ritar i ritfönstret w. Från början befinner sig
	 * sköldpaddan i punkten x,y med pennan lyft och huvudet pekande rakt uppåt
	 * i fönstret (i negativ y-riktning)
	 */

	public Turtle(SimpleWindow w, int x, int y) {
		this.x = x;
		this.y = y;
		this.w = w;
		w.moveTo(x, y);
	}

	/** Sänker pennan */
	public void penDown() {
		pen = true;
	}

	/** Lyfter pennan */
	public void penUp() {
		pen = false;
	}

	/** Går rakt framåt n pixlar i den riktning som huvudet pekar */
	public void forward(int n) {
		w.moveTo(x, y);
		x = (int) Math.round((x + (n * Math.cos(Math.toRadians(curAngle)))));
		y = (int) Math.round((y + (-n * Math.sin(Math.toRadians(curAngle)))));
		w.lineTo(x, y);
		if (pen) {
			w.lineTo(x, y);
		} else {
			w.moveTo(x, y);
		}
	}

	/** Vrider beta grader åt vänster runt pennan */
	public void left(int beta) {
		if((curAngle+beta)<=360){
			curAngle = curAngle + beta;
		} else{
			int k = (curAngle+beta)/360;
			curAngle = 0;
			curAngle = (curAngle + beta) - (k*360);
		}
	}

	/**
	 * Går till punkten newX,newY utan att rita. Pennans läge (sänkt eller lyft)
	 * och huvudets riktning påverkas inte
	 */
	public void jumpTo(int newX, int newY) {
		x = newX;
		y = newY;
		w.moveTo(x, y);
	}

	/** Återställer huvudriktningen till den ursprungliga */
	public void turnNorth() {
		curAngle = 90;
	}

	/** Tar reda på x-koordinaten för sköldpaddans aktuella position */
	public int getX() {
		return x;
	}

	/** Tar reda på y-koordinaten för sköldpaddans aktuella position */
	public int getY() {
		return y;
	}

	/** Tar reda på sköldpaddans riktning, i grader från positiv x-led */
	public int getDirection() {
		return curAngle;
	}
}
