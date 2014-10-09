package ovn3;

import java.util.Scanner;

public class Collatz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Mata in a0:");
		boolean input = true;
		int a0 = 0;
		while (input) {
			a0 = scan.nextInt();
			if (a0 > 0) {
				input = false;
			}
		}
		scan.close();
		boolean run = true;

		System.out.println("Talföljden är: ");
		while (run) {
			System.out.print(a0);
			if (a0 % 2 == 1) {
				if (a0 == 1) {
					run = false;
					System.out.print(".");
				} else {
					a0 = 3 * a0 + 1;
					System.out.print(", ");
				}
			} else {
				a0 = a0 / 2;
				System.out.print(", ");
			}
		}
	}
}
