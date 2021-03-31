import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    static String inputText = "";

    public static void main(String[] args) throws FileNotFoundException {

        inputText = getTextFromSource(args[0]);
        System.out.println("Words: " + Calculations.wordsQuantity);
        System.out.println("Sentences: " + Calculations.sentencesQuantity);
        System.out.println("Characters: " + Calculations.charactersQuantity);
        System.out.println("Syllables: " + Calculations.syllablesQuantity);
        System.out.println("Polysyllables: " + Calculations.polysyllablesQuantity);
        System.out.print("Enter the score you want to calculate (ARI, FK, SMOG, CL, all): ");
        ScoreCounter.getScore(getAlgorithmType());
    }

    private static String getTextFromSource(String path) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileReader(path))) {
            String textLine = "";
            while (scanner.hasNext()) {
                textLine = scanner.nextLine();
            } return textLine;
        }
    }

    private static String getAlgorithmType() {
        final Scanner scanner = new Scanner(System.in);
        String algorithm = scanner.nextLine();
        scanner.close();
        return algorithm;
    }
}

