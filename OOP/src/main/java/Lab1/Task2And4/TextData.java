package Lab1.Task2And4;

import java.nio.file.Paths;

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

    public TextData(String fileName, String text) {
        this.fileName = fileName;
        this.text = text;
        this.numberOfVowels = Counter.countVowels(text);
        this.numberOfConsonants = Counter.countConsonants(text);
        this.numberOfLetters = Counter.countLetters(text);
        this.numberOfSentences = Counter.countSentences(text);
        this.longestWord = Counter.findLongestWord(text);
    }

    public String getFileName() {
        return fileName;
    }

    public String getLongestWord() {
        return longestWord;
    }

    public int getNumberOfSentences() {
        return numberOfSentences;
    }

    public int getNumberOfLetters() {
        return numberOfLetters;
    }

    public int getNumberOfConsonants() {
        return numberOfConsonants;
    }

    public int getNumberOfVowels() {
        return numberOfVowels;
    }

    public String getText() {
        return text;
    }

    public String getFileNameShort(){
        return Paths.get(fileName).getFileName().toString();
    }
}
