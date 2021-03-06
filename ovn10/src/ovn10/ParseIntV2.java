package ovn10;

public class ParseIntV2 {
	public ParseIntV2() {

	}

	public int parseInt(String text) {
		if (text == null) {
			throw new NumberFormatException();
		}
		int index = 0;
		boolean negative = false;

		if (text.length() > 0 && text.charAt(0) == '-') {
			index = 1;
			negative = true;
		}

		if (index == text.length()) {
			throw new NumberFormatException();
		}
		int sum = 0;

		while (index < text.length() && text.charAt(index) >= '0' && text.charAt(index) <= '9') {
				sum = sum * 10 + (text.charAt(index) - '0');
				index++;
		}
		
		if(index < text.length()){
			throw new NumberFormatException();
		}
		
		if(negative){
			sum *= -1;
		}
		
		return sum;
	}
}
