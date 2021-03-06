import java.util.ArrayList;

public class Student {
	private String name;
	private ArrayList<Answer> answers;
	private ArrayList<Integer> correct;

	/** Skapar en student med namnet name */
	public Student(String name) {
		this.name = name;
		answers = new ArrayList<Answer>();
		correct = new ArrayList<Integer>();
	}

	/** Tar reda p� studentens namn */
	public String getName() {
		return name;
	}

	/**
	 * L�gger in svaret a i listan med studentens svar, under f�ruts�ttning att
	 * fr�gan inte redan �r korrekt besvarad. Om svaret lagts in i listan
	 * returneras true, annars false
	 */
	public boolean submitAnswer(Answer a) {
		if (correct.contains(a.getQNbr())) {
			return false;
		}
		if(a.isCorrect) {
			correct.add(a.getQNbr());
		}
		answers.add(a);
		return true;
	}

	/**
	 * Tar reda p� antalet svar som studenten har l�mnat in (p� alla fr�gor,
	 * b�de felaktiga och korrekta svar r�knas)
	 */
	public int getNbrAnswers() {
		return answers.size();
	}

	/** Returnerar svar nummer n. Det m�ste g�lla att 0 <= n < getNbrAnswers */
	public Answer getAnswer(int n) {
		if (n >= 0 && n < getNbrAnswers()) {
			return answer.get(n);
		}
	}

}
