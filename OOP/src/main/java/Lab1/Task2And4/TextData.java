package Lab1.Task2And4;

public class TextData {
    private String fileName;
    private String text;
    private int numberOfVowels;
    private int numberOfConsonants;
    private int numberOfLetters;
    private int numberOfSentences;
    private String longestWord;

    public TextData(String text) {
        this.text = text;
    }

    public TextData(String fileName, String text, int numberOfVowels, int numberOfConsonants, int numberOfLetters, int numberOfSentences, String longestWord) {
        this.fileName = fileName;
        this.text = text;
        this.numberOfVowels = numberOfVowels;
        this.numberOfConsonants = numberOfConsonants;
        this.numberOfLetters = numberOfLetters;
        this.numberOfSentences = numberOfSentences;
        this.longestWord = longestWord;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getLongestWord() {
        return longestWord;
    }

    public void setLongestWord(String longestWord) {
        this.longestWord = longestWord;
    }

    public int getNumberOfSentences() {
        return numberOfSentences;
    }

    public void setNumberOfSentences(int numberOfSentences) {
        this.numberOfSentences = numberOfSentences;
    }

    public int getNumberOfLetters() {
        return numberOfLetters;
    }

    public void setNumberOfLetters(int numberOfLetters) {
        this.numberOfLetters = numberOfLetters;
    }

    public int getNumberOfConsonants() {
        return numberOfConsonants;
    }

    public void setNumberOfConsonants(int numberOfConsonants) {
        this.numberOfConsonants = numberOfConsonants;
    }

    public int getNumberOfVowels() {
        return numberOfVowels;
    }

    public void setNumberOfVowels(int numberOfVowels) {
        this.numberOfVowels = numberOfVowels;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
