package test;

import java.awt.Point;
import java.util.ArrayList;

public class provAvArrayList {

	public static void main(String[] args) {
		ArrayList<Point> points = new ArrayList<Point>();
		
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 30);
		points.add(p1);
		points.add(p2);
		Point p3 = new Point(10, 30);
		
		if(points.contains(p3)){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
