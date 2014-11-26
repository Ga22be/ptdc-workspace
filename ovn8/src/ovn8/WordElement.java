package ovn8;

public class WordElement {
	private String word;
	private int times;

	public WordElement(String word) {
		this.word = word;
		times = 1;
	}
	
	public String getWord(){
		return word;
	}
	
	public int getTimes(){
		return times;
	}
	
	public void incrementTimes(){
		times++;
	}
	
	public void decrementTimes(){
		times--;
	}
}
