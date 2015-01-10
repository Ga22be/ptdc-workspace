
public class Term {
	private double coeff;
	private int degree;
	/** Skapar en term med koefficienten coeff och gradtalet degree */
	public Term(double coeff, int degree){
		this.coeff = coeff;
		this.degree = degree;
	}
	/** Tar reda p� koefficientv�rdet */
	public double getCoeff(){
		return coeff;
	}
	/** Adderar x till koefficientv�rdet */
	public void addToCoeff(double x){
		coeff += x;
	}
	/** Tar reda p� gradtalet */
	public int getDegree(){
		return degree;
	}

}
