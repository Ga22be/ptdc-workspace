
public class TestPolynom {
	public static void main(String[] args) {
		Polynom polynom = new Polynom();
		
		polynom.addTerm(2, 2);
		polynom.addTerm(1, -1);
		polynom.addTerm(2, 0);
		
//		polynom.addTerm(-2, 0);
//		polynom.addTerm(1, 5);
//		polynom.addTerm(1, 4);
		
		Polynom diff = polynom.differentiate();
		polynom.print();
		System.out.println(" ");
		diff.print();
//		System.out.println(polynom.getValue(2));
	}
}
