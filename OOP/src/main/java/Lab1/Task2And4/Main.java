package Lab1.Task2And4;

public class Main {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Please provide the file path!");
            return;
        }

        for (String filePath : args) {
            System.out.println("Reading file: " + filePath);


            String fileData = FileReader.readFileIntoString(filePath);

            TextData data = new TextData(filePath, fileData, Counter.countVowels(fileData), Counter.countConsonants(fileData), Counter.countLetters(fileData), Counter.countSentences(fileData), Counter.findLongestWord(fileData));

            System.out.println("File Name: " + data.getFileName());
            System.out.println("Number of Vowels: " + data.getNumberOfVowels());
            System.out.println("Number of Consonants: " + data.getNumberOfConsonants());
            System.out.println("Number of Letters: " + data.getNumberOfLetters());
            System.out.println("Number of Sentences: " + data.getNumberOfSentences());
            System.out.println("Longest Word: " + data.getLongestWord());
            System.out.println();
            System.out.println("Text: " + data.getText());

            System.out.println("----------------------------------------------------------------------- ");
        }
    }
}
