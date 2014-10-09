package ovn2;

public class Person {
	private int weight;
	private int height;
	private char sex;

	public Person(int weight, int height, char sex) {
		this.weight = weight;
		this.height = height;
		this.sex = sex;
	}

	public int howWellFed() {
		int rtnVal = 2;
		
		if(sex == 'm'){
			int normWeight = height - 110;
			if(normWeight*0.9 > weight){
				rtnVal = -1;
			}
			else if(normWeight*0.9 <= weight && normWeight*1.05 >= weight){
				rtnVal = 0;
			}
			else{
				rtnVal = 1;
			}
		}
		else if(sex == 'k'){
			int normWeight = height - 110;
			if(normWeight*0.95 > weight){
				rtnVal = -1;
			}
			else if(normWeight*0.95 <= weight && normWeight*1.15 >= weight){
				rtnVal = 0;
			}
			else{
				rtnVal = 1;
			}
		}
		return rtnVal;
	}
}
