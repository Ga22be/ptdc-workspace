package ovn6;

public class Player {
	private int nbr;
	private int pos;
	
	public Player(int nbr){
		this.nbr = nbr;
	}
	
	public int getNbr(){
		return nbr;
	}
	
	public int getPos(){
		return pos;
	}
	
	public void move(Die die){
		int jumps = die.roll();
		pos += jumps;
	}
	
	public void pos(int pos){
		this.pos = pos;
	}

}
