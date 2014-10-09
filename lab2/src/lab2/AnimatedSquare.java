package lab2;
import java.util.Scanner;
import se.lth.cs.ptdc.square.Square;
import se.lth.cs.window.SimpleWindow;

public class AnimatedSquare {
	public static void main(String[] args) {
		System.out.println("Skriv förminskning, rotationsgrader, hastighet i millis och sida på fönstret");
		Scanner scan = new Scanner(System.in);
		int dim = scan.nextInt();
		int rot = scan.nextInt();
		int speed = scan.nextInt();
		int windSide = scan.nextInt();
		
		// int side = 400;
		int inOut = 1;
		scan.close();

		SimpleWindow w = new SimpleWindow(windSide, windSide, "AnimatedSquare");
		Square sq = new Square(windSide/2, windSide/2, windSide);
		while (true) {
			if(sq.getSide() < 0){
				inOut = -1;
			}
			if(sq.getSide() >= windSide){
				inOut = 1;
			}
			sq.draw(w);
			SimpleWindow.delay(speed);
			sq.erase(w);
			sq.setSide(sq.getSide() - (dim*inOut));
			sq.rotate(rot);
		}
	}
}