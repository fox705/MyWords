package MyWords.Core;

public class TranslationSentence {

    private int id;
    private String sentence;
    private int parentSentenceId;
    private int languageId;

    public TranslationSentence(int id, String sentence, int parentSentenceId, int languageId) {
        this.id = id;
        this.sentence = sentence;
        this.parentSentenceId = parentSentenceId;
        this.languageId = languageId;
    }

    @Override
    public String toString() {
        return sentence;
    }

    @Override
    public boolean equals(Object o) {
        Boolean isEqual = false;
        if(this.toString().equalsIgnoreCase(o.toString()))
            isEqual = true;

        return isEqual;
    }

    @Override
    public int hashCode() {
        return sentence.hashCode();
    }
}
