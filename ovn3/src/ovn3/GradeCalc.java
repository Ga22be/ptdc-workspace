package ovn3;

import java.util.Scanner;

public class GradeCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int loopCount = 0;
		int grade[] = new int[5];
		int sum = 0;
		int fCount = 0;
		int medel = 0;

		while (scan.hasNextInt()) {
			grade[loopCount] = scan.nextInt();
			// System.out.println(grade[loopCount]);
			loopCount++;
		}

		System.out.println("Antalet betyg: " + loopCount);

		for (int i = 0; i < loopCount; i++) {
			if (grade[i] > 0) {
				sum = sum + grade[i];
			} else {
				fCount++;
			}
		}
		
		if(sum > 0){
			medel = Math.round(sum/loopCount);
			System.out.println("Medel av betygen: " + medel);
		} else {
			System.out.println("Inga godkända betyg!");
		}
		
		for (int i = 0; i < loopCount; i++) {
			System.out.print(grade[i] + " ");
		}
	}
}
