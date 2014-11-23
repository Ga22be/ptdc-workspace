package ovn6;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Die die = new Die();
		int furthest = 0;
		int index = 0;
		int winner = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Hur många spelare?");
		int nbrPlayers = scan.nextInt();
		Player[] player = new Player[nbrPlayers];
		
		for(int i = 0; i < player.length; i++){
			player[i] = new Player(i+1);
			player[i].pos(1);
		}
		
		while(furthest < 100){
			player[index].move(die);
			if(player[index].getPos() >= furthest){
				furthest = player[index].getPos();
			}
			if(furthest >= 100){
				winner = player[index].getNbr();
			}
			for(int i = 0; i < player.length; i++){
				if(index+1 == player[i].getPos()){
					player[i].pos(1);
					System.out.println("Spelare " + player[i].getNbr() + " åkte tillbaka till ruta 1");
				}
			}
			index++;
			index %= player.length;
		}
		
		System.out.println("Spelare " + winner + " vinner");
		

	}

}
