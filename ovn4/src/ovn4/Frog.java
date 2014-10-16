package ovn4;

public class Frog {
	private int x = 0;
	private int y = 0;
	private int jumps = 0;
	
	public Frog(){
		x = 0;
		y = 0;
		jumps = 0;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public int getJumps(){
		return jumps;
	}
	
	public void jumpNorth(){
		y = y + 1;
		jumps++;
	}
	
	public void jumpSouth(){
		y = y - 1;
		jumps++;
	}
	
	public void jumpWest(){
		x = x - 1;
		jumps++;
	}
	
	public void jumpEast(){
		x = x + 1;
		jumps++;
	}
	
}
