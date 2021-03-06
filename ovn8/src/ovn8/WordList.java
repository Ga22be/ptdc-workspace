package ovn8;

import java.util.ArrayList;

public class WordList {
	ArrayList<WordElement> wordList;

	public WordList() {
		wordList = new ArrayList<WordElement>();
	}

	public void insert(String w) {
		boolean exists = false;
		WordElement word = null;
		for (int i = 0; i < wordList.size(); i++) {
			word = wordList.get(i);
			if (word.getWord().equals(w)) {
				exists = true;
				word.incrementTimes();
			}
		}
		if (!exists) {
			wordList.add(new WordElement(w));
		}
	}

	public void remove(String w) {
		int i = 0;
		WordElement word;
		while (i < wordList.size()) {
			word = wordList.get(i);
			if (word.getWord().equals(w)) {
				wordList.remove(i);
			}
			i++;
		}
	}

	public boolean contains(String w) {
		WordElement word = null;
		for (int i = 0; i < wordList.size(); i++) {
			word = wordList.get(i);
			if (word.getWord().equals(w)) {
				return true;
			}
		}
		return false;
	}
}
