package lab10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import se.lth.cs.ptdc.shapes.Shape;
import se.lth.cs.window.SimpleWindow;

public class ShapeTest {
	static ShapeList shapes = new ShapeList();
	static String filename = "shapedata.txt";

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "ShapeTest");
		CommandDispatcher dispatcher = new CommandDispatcher(w, shapes);

		Scanner scan = null;
		PrintWriter printer = null;
		try {
			scan = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			System.err.println("Filen " + filename + "kan inte öppnas!");
		}
		read(scan);
		shapes.draw(w);
		while (true) {
			dispatcher.mainLoop();
			save(printer);
		}
	}

	private static void read(Scanner scan) {
		while (scan.hasNext()) {
			switch (scan.next()) {
			case "S":
				shapes.insert(new Square(scan.nextInt(), scan.nextInt(), scan
						.nextInt()));
				break;
			case "T":
				shapes.insert(new Triangle(scan.nextInt(), scan.nextInt(), scan
						.nextInt()));
				break;
			case "C":
				shapes.insert(new Circle(scan.nextInt(), scan.nextInt(), scan
						.nextInt()));
				break;
			}

		}
	}

	private static void save(PrintWriter printer) {
		try {
			printer = new PrintWriter(new File(filename));
		} catch (FileNotFoundException e) {
			System.err.println("Kunde inte skapa filen " + filename);
		}
		for (int i = 0; i < shapes.size(); i++) {
			StringBuilder builder = new StringBuilder();
			Shape saveShape = shapes.get(i);
			if (saveShape instanceof Triangle) {
				Triangle save = (Triangle) saveShape;
				builder.append("T ");
				builder.append(save.getX() + " ");
				builder.append(save.getY() + " ");
				builder.append(save.getSide());
			} else if (saveShape instanceof Square) {
				Square save = (Square) saveShape;
				builder.append("S ");
				builder.append(save.getX() + " ");
				builder.append(save.getY() + " ");
				builder.append(save.getSide());
			} else if (saveShape instanceof Circle) {
				Circle save = (Circle) saveShape;
				builder.append("C ");
				builder.append(save.getX() + " ");
				builder.append(save.getY() + " ");
				builder.append(save.getRadius());
			} 

			printer.print(builder);
			printer.println();
		}
		printer.close();
	}
}
