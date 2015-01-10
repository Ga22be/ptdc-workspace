
public class TestNormalRandom {
	public static void main(String[] args){
		NormalRandom rnd = new NormalRandom();
		while(true){
			double i = rnd.nextNormal();			
			System.out.println(i);
		}		
	}
}
