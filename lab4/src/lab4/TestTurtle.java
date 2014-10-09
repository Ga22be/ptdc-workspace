package lab4;
import se.lth.cs.window.SimpleWindow;

public class TestTurtle {;
	private static Turtle t;
	
	public static void check(String description, int x, int y, int dir) {
		System.out.print("Turtle state after " + description + " ... ");
		if (t.getX() == x && t.getY() == y && t.getDirection() == dir) {
			System.out.println("passed");
		} else {
			System.out.println("FAILED");
			System.out.println();
			System.out.println("The turtle's x, y, and direction are " +
					t.getX() + ", " + t.getY() + ", " + t.getDirection());
			System.out.println("but should be " + x + ", " + y + ", " + dir);
			System.out.println();
			System.out.println("Correct the error and try again.");
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(200, 200, "");
		
		t = new Turtle(w, 10, 10);
		check("new Turtle(w, 10, 10)", 10, 10, 90);
		
		t.jumpTo(100, 100);
		check("jumpTo(100, 100)", 100, 100, 90);
		
		t.forward(50);
		check("forward(50)", 100, 50, 90);
		
		t.jumpTo(100, 100);
		t.left(45);
		check("left(45)", 100, 100, 135);
		
		t.turnNorth();
		check("turnNorth()", 100, 100, 90);
		
		t.left(45);
		t.forward(100);
		check("left(45) and forward(100)", 100 - 71, 100 - 71, 135);
	}
}
