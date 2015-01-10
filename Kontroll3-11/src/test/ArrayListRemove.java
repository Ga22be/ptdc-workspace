package test;

import java.util.ArrayList;

public class ArrayListRemove {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			array.add(i + 1);
			System.out.println(array.get(i));
		}

		System.out.println("Storlek före: " + array.size());
		array.remove(4);
		System.out.println("Storlek efter: " + array.size());

		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}

	}

}
