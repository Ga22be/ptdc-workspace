package ovn10;

public class IntToString {
	public static void main(String[] args) {
		ToString tS = new ToString();
		
		String s = tS.toString(-125608883);
		if(tS.toString(125608883) instanceof String){
			System.out.println(s);			
		}
		
	}
}
