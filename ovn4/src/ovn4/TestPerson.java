package ovn4;

public class TestPerson {

	public static void main(String[] args) {
		Person p1 = new Person(23);
		Person p2 = new Person(21);
		if(p1.isOlderThan(p2)){
			System.out.println("P1 större än p2");
		}

	}

}
