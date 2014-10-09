package lab4;
import se.lth.cs.window.SimpleWindow;

public class TestFourTurtles {;
		public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(350, 350, "Four Turtles");
		
		// The four turtles should have been stored in an array,
		// but we haven't looked at arrays yet so we call the
		// turtles t1, t2, t3 and t4 instead.
		Turtle t1 = new Turtle(w, 150, 150);
		Turtle t2 = new Turtle(w, 300, 150);
		Turtle t3 = new Turtle(w, 300, 300);
		Turtle t4 = new Turtle(w, 150, 300);
		
		t1.penDown();
		t2.penDown();
		t3.penDown();
		t4.penDown();
		
		// Let each turtle draw a square. Note that the turtles
		// alternate drawing the lines.
		for (int i = 0; i < 4; i++) {
			t1.forward(100);
			t1.left(90);
			t2.forward(100);
			t2.left(90);
			t3.forward(100);
			t3.left(90);
			t4.forward(100);
			t4.left(90);
		}
	}
}
