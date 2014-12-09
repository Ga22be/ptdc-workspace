package lab10;
import se.lth.cs.window.SimpleWindow;
import se.lth.cs.ptdc.shapes.ShapeList;

public class ShapeTest {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "ShapeTest");
		ShapeList shapes = new ShapeList();
		shapes.insert(new Square(100, 300, 100));
		shapes.insert(new Triangle(400, 200, 100));
		//shapes.insert(new Circle(400, 400, 50));
		shapes.insert(new Square(450, 450, 50));
		shapes.insert(new Square(200, 200, 35));
		shapes.draw(w);
	}
}
