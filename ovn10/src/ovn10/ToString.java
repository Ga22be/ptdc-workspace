package ovn10;

public class ToString {
	public ToString(){
		
	}
	
	public String toString(int number){
		boolean negative = false;
		StringBuilder builder = new StringBuilder();
		
		if(number < 0){
			number *= -1;
			negative = true;
		}
		
		while(number > 0){
			builder.insert(0, number%10);
			number /= 10;
		}
		
		if(negative){
			builder.insert(0, "-");
		}
		
		return builder.toString();
	}
}
