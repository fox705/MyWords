package Words.Words;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordManager {

	HashMap<Word, Translation> wordDb;
	
	TranslateManager tm = new TranslateManager();

	List<String> sentences = new ArrayList<String>();
	Set<Word> words = new TreeSet<Word>();

	public WordManager(String fileName) throws FileNotFoundException {

		this.wordDb = new HashMap<Word, Translation>();
		readFile(fileName);

	}

	
	private void readFile(String fileName) throws FileNotFoundException {

		Scanner sc = new Scanner(new File(fileName));
		Pattern regex = Pattern.compile(">(.*)<");
		String line;
		while (sc.hasNextLine()) {
			line = sc.nextLine();
			if (!(line.isBlank() && line.isEmpty())) {
				Matcher regexMatcher = regex.matcher(line);
				while (regexMatcher.find()) {
					extractWords(regexMatcher.group(1));
				}
			}
		}
		sc.close();
	}

	private void extractWords(String sentence) {
		if (!sentence.contains("</font>")) {
			Scanner sc1 = new Scanner(sentence);
			sc1.useDelimiter(
					" |,|<|>|color=\"#00ffff\"|font|\n|1|2|3|4|5|6|7|8|9|0|/|color=\"#ffffff\"|-|:|color=\"#|ffff|\\t|\n|\\.|\\?|!|%");
			while (sc1.hasNext()) {
				Word word = new Word(sc1.next(), "english");
				words.add(word);
			}
			sc1.close();
		}
	}
	

}
