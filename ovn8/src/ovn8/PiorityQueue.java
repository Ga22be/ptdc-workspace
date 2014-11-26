package ovn8;

import java.util.ArrayList;

public class PiorityQueue {
	ArrayList<Person> queue;
	public PiorityQueue(){
		queue = new ArrayList<Person>();
	}
	
	public int size(){
		return queue.size();
	}
	
	public void insert(Person p){
		queue.add(p);
	}
	
	public Person getOldest(){
		int oldest = Integer.MIN_VALUE;
		int index = -1;
		for(int i = 0; i < queue.size(); i++){
			int age = queue.get(i).getAge();
			if(age > oldest){
				oldest = age;
				index = i;
			}
		}
		return queue.remove(index);
	}
}
