package Words.Words;

import java.util.Date;

public class Word implements Comparable<Word>{

	private String word;
	private String language;
	private Boolean known; 
	
	
	public Word(String word, String language) 
	{
		this.word = word;
		this.known = false;
		this.language = language;
	}
	
	public String getWord() {
		
		return word;
	}
	
	public String getLanguage() {
		
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public Boolean getKnown() {
		
		return known;
	}
	
	public void setKnown(Boolean known){
		
		this.known = known;
	}
	
	

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Word))
			return false;
		Word other = (Word) obj;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}

	public int compareTo(Word o) {
		
		int result = this.word.compareToIgnoreCase(o.getWord());
		
		return result;
	}

	
	

	
	
	
	
	
	
}
