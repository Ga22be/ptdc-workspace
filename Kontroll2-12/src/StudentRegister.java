public class StudentRegister {
	private int nbrStudents; // antalet studenter
	private Student[] students; // vektor med nbrStudents studenter
	// konstruktorer och metoder där vektorn students bildas

	/** Beräknar medelantalet poäng som studenterna klarade under året year */
	public double getAveragePoints(int year) {
		double sum;
		for (int i = 0; i < nbrStudents; i++){
			sum += students[i].getPoints(year);
		}
		return sum/nbrStudents;
	}

	/**
	 * Räknar hur många studenter som under året year klarade 0-9, 10-19, ...,
	 * 50-59, >=60 poäng, skriver ut antalen med ett tal per rad
	 */
	public void printStatistics(int year) {
		int[] results = new int[7];
		int temp;
		for (int i = 0; i < nbrStudents; i++){
			temp = students[i].getPoints()/10;
			if(temp < 6){
				results[temp]++;
			} else {
				results[6]++;
			}
		}
		for(int r = 0; r < results.length; r++){
			System.out.println(results[r]);
		}
	}
}
