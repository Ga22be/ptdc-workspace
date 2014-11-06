import java.util.Scanner;

public class ovn5 {
	public static void main(String[] args) {
		int[] nbr = new int[1000];
		Scanner scan = new Scanner(System.in);
		int n = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		System.out.println("Skriv in heltal: ");
		while (scan.hasNextInt()) {
			nbr[n] = scan.nextInt();
			n++;
		}
		scan.close();

		for (int i = 0; i < n; i++) {
			if ((nbr[i] % 2) == 0) {
				if (nbr[i] < min) {
					min = nbr[i];
				}
			} else {
				if (nbr[i] > max) {
					max = nbr[i];
				}
			}
		}

		if (n > 0) {
			System.out.println("Max ojämna talet är: " + max);
			System.out.println("Min jämna talet är: " + min);
		} else {
			System.err.println("Inga tal angivna!");
		}
	}
}
