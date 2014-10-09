package lab10;
import se.lth.cs.ptdc.shapes.Shape;
import se.lth.cs.window.SimpleWindow;

public class ShapeList {
	/** Skapar en tom lista */
	public ShapeList() {
		// ...
	}
	
	/** Lägger in figuren s i listan */
	public void insert(Shape s) {
		// ...
	}
	
	/** Ritar upp figurerna i listan i fönstret w */
	public void draw(SimpleWindow w) {
		// ...
	}
	
	/** Tar reda på en figur som ligger nära punkten xc,yc (null om ingen
		sådan figur finns i listan */
	public Shape findHit(int xc, int yc) {
		// ...
		return null;
	}
}
