package ovn10;

public class Parser {
	public static void main(String[] args){
		ParseIntV2 parser = new ParseIntV2();
		String s = "123f2";
		
		int i = parser.parseInt(s);
		System.out.println(i);
	}
}