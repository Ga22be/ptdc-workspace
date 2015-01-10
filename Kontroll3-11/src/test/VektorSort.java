package test;

import java.util.Random;

public class VektorSort {
	public static void main(String[] args){
		Random rnd = new Random();
		int[] vektor = new int[20];
		
		for(int i = 0; i < vektor.length; i++){
			vektor[i] = rnd.nextInt(41);
			System.out.println(vektor[i]);
		}
		
		sort(vektor);
		
		for(int j = 0; j < vektor.length; j++){
			System.out.println(vektor[j]);
		}
		
		
	}
	
	private static void sort(int[] vektor){
		for(int i = 0; i < vektor.length - 1; i++){
			int min = Integer.MAX_VALUE;
			int index = -1;
			
			for(int j = i; j < vektor.length; j++){
				if(vektor[j] < min){
					min = vektor[j];
					index = j;
				}
			}
			
			vektor[index] = vektor[i];
			vektor[i] = min;
		}
	}
}
