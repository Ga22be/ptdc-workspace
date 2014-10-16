package ovn4;

public class Person {
	private int age = 0;
	
	public Person(int age){
		this.age = age;
	}
	
	public boolean isOlderThan(Person other){
		if(age > other.age){
			return true;
		} else {
			return false;
		}
	}
	
}
