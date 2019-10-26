package MyWords.Core;


public class TranslationWord {

    private int id;
    private String word;
    private int parentWordId;
    private int languageId;


    public TranslationWord(int id, String word, int parentWordId, int languageId) {
        this.id = id;
        this.word = word;
        this.parentWordId = parentWordId;
        this.languageId = languageId;
    }

    @Override
    public String toString() {
        return word;
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
        return word.hashCode();
    }
}
