package Lab1.Task2And4;

import java.util.Arrays;
import java.util.Comparator;

public class Counter {
    public static int countVowels(String text) {
        return (int) text.chars().filter(c ->"AEIOUaeiou".indexOf(c) != -1).count();
    }

    // Count total consonants in the text
    public static int countConsonants(String text) {
        return (int) text.chars()
                .filter(c -> Character.isLetter(c) && "AEIOUaeiou".indexOf(c) == -1)
                .count();
    }

    // Count total letters in the text
    public static int countLetters(String text) {
        return (int) text.chars()
                .filter(Character::isLetter)
                .count();
    }

    // Count sentences using common sentence-ending punctuation
    public static int countSentences(String text) {
        return text.split("[.!?]").length;
    }

    // Find the longest word in the text
    public static String findLongestWord(String text) {
        return Arrays.stream(text.split("\\W+"))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }
}
