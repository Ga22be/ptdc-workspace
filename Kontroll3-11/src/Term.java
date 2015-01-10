
public class Term {
	private double coeff;
	private int degree;
	/** Skapar en term med koefficienten coeff och gradtalet degree */
	public Term(double coeff, int degree){
		this.coeff = coeff;
		this.degree = degree;
	}
	/** Tar reda på koefficientvärdet */
	public double getCoeff(){
		return coeff;
	}
	/** Adderar x till koefficientvärdet */
	public void addToCoeff(double x){
		coeff += x;
	}
	/** Tar reda på gradtalet */
	public int getDegree(){
		return degree;
	}

}
