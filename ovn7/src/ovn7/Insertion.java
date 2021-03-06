package ovn7;

import java.util.ArrayList;
import java.util.Random;

public class Insertion {
	public static void main(String[] args) {
		int length = 10;
		int[] val = new int[length];
		Random rnd = new Random();
		int newVal;
		int index = 0;
		int tempVal;

		for (int load = 0; load < length; load++) {
			val[load] = 1 + rnd.nextInt(25);
			System.out.println(val[load]);
		}
		
		for (int current = 1; current < val.length; current++) {
			index = current;
			for (int prev = (current - 1); prev >= 0; prev--) {
				if (val[current] < val[prev]) {
					index = prev;
				}
			}

			if (index < current) {
				tempVal = val[current];
				for(int i = current; i > index; i--){
					val[i] = val[i-1];
				}
				val[index] = tempVal;
			}
		}
		
		for(int j = 0; j < length; j++){
			System.out.println(val[j]);
		}
		
	}
}
