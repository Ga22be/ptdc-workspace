package ovn3;

public class Points {
	private int x = 0;
	private int y = 0;
	
	public Points(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public void move(int dX, int dY){
		x = x + dX;
		y = y + dY;
	}
	
	public int getDistanceToOrigo(){
		return (int) Math.sqrt(x*x + y*y);
	}
}
