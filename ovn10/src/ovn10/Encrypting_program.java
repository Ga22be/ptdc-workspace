package ovn10;

public class Encrypting_program {
	public static void main(String[] args) {
		Encrypter encrypter = new Encrypter();
		
		String plainText = "Attack!";
		
		System.out.println(encrypter.encrypt(plainText, 123));
		
	}
}
