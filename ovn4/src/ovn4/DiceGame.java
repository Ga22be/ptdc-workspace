package ovn4;

public class DiceGame {
	public static void main(String[] args) {
		Die dice = new Die();
		int p1 = 0;
		int p2 = 0;
		boolean run = true;
		String winner = " ";
		
		while(run){
			dice.roll();
			p1 = dice.getResult();
			if(p1 == 6){
				winner = "Person 1 vinner!";
				run = false;
			} else {
				dice.roll();
				p2 = dice.getResult();
				if(p2 == 6);{
					winner = "Person 2 vinner!";
					run = false;
				}
			}
		}
		System.out.println(winner);
	}
}
