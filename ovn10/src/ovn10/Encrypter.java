package ovn10;

import java.util.Random;

public class Encrypter {
	private Random rnd;
	public Encrypter(){
		
	}
	
	public String encrypt(String plainText, long key){
		rnd = new Random(key);
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0; i < plainText.length(); i++){
			int letter = plainText.charAt(i);
			System.out.println(letter);			
			letter = (letter + rnd.nextInt(256))%256;
			System.out.println(letter);
			builder.append((char) letter);
		}
		
		return builder.toString();
	}
}
