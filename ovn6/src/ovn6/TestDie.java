package ovn6;

public class TestDie {
	public static void main(String[] args) {
		Die die = new Die();
		
		for (int i = 0; i < 10; i++){
			System.out.println(die.roll());
		}

	}
}
