package lab4;
import se.lth.cs.window.SimpleWindow;

public class Turtle {
	// ... lägg till attribut
	
	/**
	 * Skapar en sköldpadda som ritar i ritfönstret w. Från början befinner sig
	 * sköldpaddan i punkten x,y med pennan lyft och huvudet pekande rakt uppåt
	 * i fönstret (i negativ y-riktning)
	 */
	public Turtle(SimpleWindow w, int x, int y) {
		// ... implementera
	}
	
	/** Sänker pennan */
	public void penDown() {
		// ... implementera
	}
	
	/** Lyfter pennan */
	public void penUp() {
		// ... implementera
	}
	
	/** Går rakt framåt n pixlar i den riktning som huvudet pekar */
	public void forward(int n) {
		// ... implementera
	}
	
	/** Vrider beta grader åt vänster runt pennan */
	public void left(int beta) {
		// ... implementera
	}
	
	/** Går till punkten newX,newY utan att rita. Pennans läge (sänkt 
	    eller lyft) och huvudets riktning påverkas inte */
	public void jumpTo(int newX, int newY) {
		// ... implementera
	}
	
	/** Återställer huvudriktningen till den ursprungliga */
	public void turnNorth() {
		// ... implementera
	}
	
	/** Tar reda på x-koordinaten för sköldpaddans aktuella position */
	public int getX() {
		// ... implementera
		return 0;
	}
	
	/** Tar reda på y-koordinaten för sköldpaddans aktuella position */
	public int getY() {
		// ... implementera
		return 0;
	}
	
	/** Tar reda på sköldpaddans riktning, i grader från positiv x-led */
	public int getDirection() {
		// ... implementera
		return 0;
	}
}
