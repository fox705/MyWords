package MyWords.Core;

public class Sentence {

    private int id;
    private String sentence;
    private int languageId;
    private long enterData;
    private int frequency;
    private int correctAnswerRate;
    private int answerNumber;
    private long pointer;

    public Sentence(int id, String sentence, int languageId) {
        this.id = id;
        this.sentence = sentence;
        this.languageId = languageId;
        this.enterData = System.currentTimeMillis();
        this.frequency = 1;
    }

    public int getId() {
        return id;
    }

    public String getSentence() {
        return sentence;
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
        return  sentence;
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
