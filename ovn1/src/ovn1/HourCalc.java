package ovn1;

import java.util.Scanner;

public class HourCalc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int startH = 0;
		int startM = 0;
		//boolean skipFirst = true;
		//System.out.println("Starttimme? (negativt tal för att sluta)");
		System.out.println("Starttid? (negativt timme för att sluta)");
		startH = scan.nextInt();
		startM = scan.nextInt();
		//if (startH >= 0) {
		//	skipFirst = false;
		//	System.out.println("Ange start minuter");
		//	startM = scan.nextInt();
		//}
		while (startH >= 0) {
			//if (skipFirst == true) {
			//	startH = scan.nextInt();
			//	startM = scan.nextInt();
			//	skipFirst = false;
			//}
			startM = startM + (startH * 60);
			System.out.println("Sluttid?");
			int endH = scan.nextInt();
			int endM = scan.nextInt();
			endM = endM + (endH * 60);
			int resultH = (endM - startM) / 60;
			int resultM = (endM - startM) % 60;
			System.out.println("Skillnaden är: " + resultH + "h " + resultM
					+ "m.");
			System.out.println("Starttid? (negativt tal för att sluta)");
			startH = scan.nextInt();
			startM = scan.nextInt();
		}
		System.out.println("Hejdå");
		scan.close();
	}
}
