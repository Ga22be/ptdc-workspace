package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class testReadFile {

	public static void main(String[] args) {
		Scanner scan = null;
		PrintWriter printer = null;
		String input = "TestFile.txt";
		String output = "Output.txt";
		ArrayList<Integer> tal = new ArrayList<Integer>();
		
		try{
			printer = new PrintWriter(new File(output));
		} catch (FileNotFoundException e) {
			System.err.println("Kunde inte skapa filen " + output);
		}
		
		try{
			scan = new Scanner(new File(input));
		} catch (FileNotFoundException e){
			System.err.println("Finner inte filen " + input);
		}
		
		while(scan.hasNextInt()){
			scan.nextInt();
			scan.next();
			tal.add(scan.nextInt());
		}
		
		for (int i = 0; i < tal.size(); i++){
			printer.println(tal.get(i));
			System.out.println(tal.get(i));
		}
		printer.close();
	}
}
