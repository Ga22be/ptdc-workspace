package ovn3;

public class Test {
	public static void main(String[] args){
		Points p = new Points(2,3);
		System.out.println("x: " + p.getX() + " y: " + p.getY());
		p.move(1, 1);
		System.out.println("x: " + p.getX() + " y: " + p.getY());
		System.out.println("Avstånd till origo: " + p.getDistanceToOrigo());
	}
}
