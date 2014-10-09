package ovn1;

import java.util.Scanner;

public class HourCalcV2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int startH = 0;
		int startM = 0;
		int endH = 0;
		int endM = 0;
		while (startH >= 0 && startM >= 0 && endH >= 0 && endM >= 0) {
			System.out.println("Starttid? (negativt tal för att sluta)");
			startH = scan.nextInt();
			startM = scan.nextInt();
			if (startH >= 0 && startM >= 0) {
				System.out.println("Sluttid? (negativt tal för att sluta)");
				endH = scan.nextInt();
				endM = scan.nextInt();
				if (endH >= 0 && endM >= 0) {
					startM = startM + (startH * 60);
					endM = endM + (endH * 60);
					int resultH = (endM - startM) / 60;
					int resultM = (endM - startM) % 60;
					System.out.println("Skillnaden är: " + resultH + "h "
							+ resultM + "m.");
				}
			}
		}
		System.out.println("Hejdå");
		scan.close();
	}
}
