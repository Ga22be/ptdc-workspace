import java.util.ArrayList;


public class Ring {
	private ArrayList<Person> ring;
	private int current; 
	
	public Ring(){
		ring = new ArrayList<Person>(); 
	}
	
	public void insert(Person p){
		ring.add(p);
	}
	
	public void reset(){
		current = 0;
	}
	
	public void countTo(int n){
		current = (current + (n-1))%ring.size();
	}
	
	public Person removeCurrent(){
		return ring.remove(current);
	}
	
	public int size(){
		return ring.size();
	}
}
