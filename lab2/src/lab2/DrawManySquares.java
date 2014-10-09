package lab2;
import java.util.Scanner;
import se.lth.cs.ptdc.square.Square;
import se.lth.cs.window.SimpleWindow;

public class DrawManySquares {
	public static void main(String[] args) {
		System.out.println("Skriv förminskning och rotationsgrader");
		Scanner scan = new Scanner(System.in);
		int dim = scan.nextInt();
		//int rot = scan.nextInt();
		scan.close();

		SimpleWindow w = new SimpleWindow(600, 600, "DrawManySquares");
		Square sq = new Square(300, 300, 200);
		while (sq.getSide() > 0) {
			sq.draw(w);
			SimpleWindow.delay(1000);
			sq.erase(w);
			sq.setSide(sq.getSide() - dim);
			//sq.rotate(rot);
		}
	}
}
