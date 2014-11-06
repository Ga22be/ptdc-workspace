package lab4;

import se.lth.cs.window.SimpleWindow;

public class Turtle {
	private double x;
	private double y;
	private int curAngle = 90;
	protected SimpleWindow w;
	private boolean pen = false;

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
		w.moveTo((int) Math.round(x), (int) Math.round(y));
		x = x + (n * Math.cos(Math.toRadians(curAngle)));
		y = y + (-n * Math.sin(Math.toRadians(curAngle)));
		w.lineTo((int) Math.round(x), (int) Math.round(y));
		if (pen) {
			w.lineTo((int) Math.round(x), (int) Math.round(y));
		} else {
			w.moveTo((int) Math.round(x), (int) Math.round(y));
		}
	}

	/** Vrider beta grader åt vänster runt pennan */
	public void left(int beta) {
		if((curAngle+beta)<=360){
			curAngle = curAngle + beta;
		} else{
			curAngle = (curAngle+beta)%360;
		}
	}

	/**
	 * Går till punkten newX,newY utan att rita. Pennans läge (sänkt eller lyft)
	 * och huvudets riktning påverkas inte
	 */
	public void jumpTo(int newX, int newY) {
		x = newX;
		y = newY;
		w.moveTo((int) Math.round(x), (int) Math.round(y));
	}

	/** Återställer huvudriktningen till den ursprungliga */
	public void turnNorth() {
		curAngle = 90;
	}

	/** Tar reda på x-koordinaten för sköldpaddans aktuella position */
	public int getX() {
		return (int) Math.round(x);
	}

	/** Tar reda på y-koordinaten för sköldpaddans aktuella position */
	public int getY() {
		return (int) Math.round(y);
	}

	/** Tar reda på sköldpaddans riktning, i grader från positiv x-led */
	public int getDirection() {
		return curAngle;
	}
}
