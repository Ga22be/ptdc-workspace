package lab1;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Skriv två tal");
		Scanner scan = new Scanner(System.in);
		double nbr1 = scan.nextDouble();
		double nbr2 = scan.nextDouble();
		scan.close();
		double sum = nbr1 + nbr2;
		System.out.println("Summan av talen är " + sum);
	}
}
