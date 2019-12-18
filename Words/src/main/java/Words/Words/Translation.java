package Words.Words;

import java.util.Date;

public class Translation extends Word{

	private Double score;
	private int goodAnswers;
	private int badAnswers;
	private String enterDate;
	
	public Translation(String word, String language) {
		super(word, language);
		this.score = 0.0;
		this.goodAnswers = 0;
		this.badAnswers = 0; 
		
		Date data = new Date();
		this.enterDate = data.toString();
	}
	
	public void answerCorrect() {
		this.goodAnswers +=1;
		this.score = (double) ((goodAnswers)/(goodAnswers+ badAnswers));
	}
	
	public void answerWrong() {
		this.badAnswers +=1;
		this.score = (double) ((goodAnswers)/(goodAnswers + badAnswers));
	}
	
	@Override
	public String toString() {
		
		return super.getWord() + score + enterDate;
	}
	
	
}
