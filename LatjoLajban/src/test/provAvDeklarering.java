package test;

import java.awt.Point;

public class provAvDeklarering {
	public static void main(String[] args){
		Point p1 = new Point(10,10);
		Point p2 = new Point(20, 20);
		
		System.out.print("p1: " + p1.getX() + " " + p1.getY());
		System.out.println(", p2: " + p2.getX() + " " + p2.getY());
		
		p2 = p1;
		p1.move(30, 30);
		

		System.out.print("p1: " + p1.getX() + " " + p1.getY());
		System.out.println(", p2: " + p2.getX() + " " + p2.getY());

	}
}
