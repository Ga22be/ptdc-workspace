package lab10;
import java.util.ArrayList;

import se.lth.cs.ptdc.shapes.Shape;
import se.lth.cs.window.SimpleWindow;

public class ShapeList {
	private ArrayList<Shape> list;
	/** Skapar en tom lista */
	public ShapeList() {
		list = new ArrayList<Shape>();
	}
	
	/** Returnerar listans storlek */
	public int size(){
		return list.size();
	}
	
	/** Returnerar shape med p� plats index i listans */
	public Shape get(int index){
		return list.get(index);
	}
	
	/** Lägger in figuren s i listan */
	public void insert(Shape s) {
		list.add(s);
	}
	
	/** Ritar upp figurerna i listan i fönstret w */
	public void draw(SimpleWindow w) {
		for (int i = 0; i < list.size(); i++){
			list.get(i).draw(w);
		}
	}
	
	/** Tar reda på en figur som ligger nära punkten xc,yc (null om ingen
		sådan figur finns i listan */
	public Shape findHit(int xc, int yc) {
		if(list.size() <= 0){
			return null;			
		} 
		for(int i = 0; i < list.size(); i++){
			Shape testShape = list.get(i);
			if(testShape.near(xc, yc)){
				return testShape;
			}			
		}
		return null;
	}
}
