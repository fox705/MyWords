package MyWords.Core;

public class Word {

    private int id;
    private String word;
    private int sentenceId;
    private int languageId;
    private long enterData;
    private int frequency;
    private int correctAnswerRate;
    private int answerNumber;
    private long pointer;

    public Word(int id, String word, int sentenceId, int languageId) {
        this.id = id;
        this.word = word;
        this.sentenceId = sentenceId;
        this.languageId = languageId;
        this.enterData = System.currentTimeMillis();
        this.frequency = 1;
    }

    public int getId() {
        return id;
    }

    public String getWord() {
        return word;
    }

    public int getSentenceId() {
        return sentenceId;
    }

    public int getLanguageId(){
        return languageId;
    }

    public int getCorrectAnswerRate() {
        return correctAnswerRate;
    }

    public long getPointer() {
        return pointer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void updateFrequency() {
        this.frequency++;
    }

    public void updateCorrectAnswerRate() {
        this.correctAnswerRate++;
    }

    public void updateAnswerNumber() {
        this.answerNumber++;
    }

    public void updatePointer() {
        this.pointer = (correctAnswerRate/answerNumber) + (frequency)/(System.currentTimeMillis() - enterData);
    }

    @Override
    public String toString() {
        return  word;
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
        return this.toString().hashCode();
    }


}
