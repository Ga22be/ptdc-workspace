package se.lth.cs.ptdc.square;

import se.lth.cs.window.SimpleWindow;

/**
 * Beskriver en kvadrat med ett läge och en sidlängd.
 */
public class Square {
	private int x; // x-koordinat för medelpunkten
	private int y; // y-koordinat
	private int side; // sidlängd
	private double alpha; // rotationsvinkel (i radianer)

	/**
	 * Skapar en kvadrat med medelpunkten i x,y och med en given sidlängd.
	 * Kvadratens sidor är parallella med koordinataxlarna.
	 * 
	 * @param x
	 *            x-koordinat för medelpunkten
	 * @param y
	 *            y-koordinat för medelpunkten
	 * @param side
	 *            sidlängd
	 */
	public Square(int x, int y, int side) {
		this.x = x;
		this.y = y;
		this.side = side;
		this.alpha = 0;
	}

	/**
	 * Tar reda på x-koordinaten.
	 * 
	 * @return x-koordinaten för medelpunkten
	 */
	public int getX() {
		return x;
	}

	/**
	 * Tar reda på y-koordinaten.
	 * 
	 * @return y-koordinaten för medelpunkten
	 */
	public int getY() {
		return y;
	}

	/**
	 * Tar reda på sidlängden.
	 * 
	 * @return sidlängden
	 */
	public int getSide() {
		return side;
	}

	/**
	 * Flyttar kvadraten relativt det aktuella läget.
	 * 
	 * @param dx
	 *            relativ förflyttning i x-led
	 * @param dy
	 *            relativ förflyttning i y-led
	 */
	public void move(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}

	/**
	 * Ändrar sidlängden.
	 * 
	 * @param newSide
	 *            den nya sidlängden
	 */
	public void setSide(int newSide) {
		side = newSide;
	}

	/**
	 * Roterar kvadraten motsols kring sin medelpunkt.
	 * 
	 * @param beta
	 *            antalet grader som kvadraten roteras
	 */
	public void rotate(int beta) {
		alpha = alpha - beta * Math.PI / 180;
	}

	/**
	 * Ritar kvadraten.
	 * 
	 * @param w
	 *            Fönstret där kvadraten ritas.
	 */
	public void draw(SimpleWindow w) {
		double pi4 = Math.PI / 4;
		double r = side / 2 * Math.sqrt(2);
		w.moveTo(x + (int) Math.round(r * Math.cos(alpha + pi4)), y
				+ (int) Math.round(r * Math.sin(alpha + pi4)));
		w.lineTo(x + (int) Math.round(r * Math.cos(alpha + 3 * pi4)), y
				+ (int) Math.round(r * Math.sin(alpha + 3 * pi4)));
		w.lineTo(x + (int) Math.round(r * Math.cos(alpha + 5 * pi4)), y
				+ (int) Math.round(r * Math.sin(alpha + 5 * pi4)));
		w.lineTo(x + (int) Math.round(r * Math.cos(alpha + 7 * pi4)), y
				+ (int) Math.round(r * Math.sin(alpha + 7 * pi4)));
		w.lineTo(x + (int) Math.round(r * Math.cos(alpha + pi4)), y
				+ (int) Math.round(r * Math.sin(alpha + pi4)));
	}

	/**
	 * Raderar bilden av kvadraten. Kvadraten får inte flyttas mellan uppritning
	 * och radering. Raderingen görs genom att bilden ritas över med vit färg,
	 * så även korsande linjer kommer att raderas.
	 * 
	 * @param w
	 *            fönstret där bilden raderas och ritas.
	 */
	public void erase(SimpleWindow w) {
		java.awt.Color savedColor = w.getLineColor();
		w.setLineColor(java.awt.Color.WHITE);
		draw(w);
		w.setLineColor(savedColor);
	}
}
