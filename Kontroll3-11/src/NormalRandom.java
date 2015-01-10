import java.util.Random;

public class NormalRandom {
	private Random rnd;
	private boolean first = true;
	private double[] norm;

	public NormalRandom() {
		rnd = new Random();
		norm = new double[2];
	}

	public double nextNormal() {
		if (first) {
			double[] rekt = { 1.0 - rnd.nextDouble(), 1.0 - rnd.nextDouble() };
			
			double r = Math.sqrt(-2 * Math.log(rekt[0]));
			double deg = 2*Math.PI*rekt[1];
			
			norm[0] = r*Math.cos(deg);
			norm[1] = r*Math.sin(deg);
			
			first = false;
			return norm[0];
		} else {
			first = true;
			return norm[1];
		}
	}
}
