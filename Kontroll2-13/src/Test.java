import java.util.ArrayList;

public class Test {
	private int nbrQuestions; // antalet fr�gor
	private ArrayList<Student> students; // studenterna som deltar
	private int[] statistics = new int[7];
	
	/**
	 * Skriver ut statistik �ver hur m�nga studenter som har svarat r�tt p� 0,
	 * 1, 2, ... fr�gor (se exemplet ovan)
	 */
	public void printStatistics() {
		int correct = 0;
		for(int i = 0; i < students.size(); i++){
			Student student = students.get(i);
			for(int j = 0; j < student.getNbrAnswers(); j++){
				Answer answer = student.getAnswer(j);
				if(answer.isCorrect()){
					correct++;
				}
			}
			statistics[correct]++;
			correct = 0;
		}
		for(int r = 0; r < statistics.length; r++){
			System.out.println(r + "	" + statistics[r]);
		}
	}
}