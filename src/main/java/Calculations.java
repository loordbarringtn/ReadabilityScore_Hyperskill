
public class Calculations {

    final static int charactersQuantity = Main.inputText.replaceAll("\\s","").length();
    final static int sentencesQuantity = Main.inputText.split("[.!?]").length;
    final static int wordsQuantity = Main.inputText.split("\\s").length;
    final static int syllablesQuantity = syllablesPerWord(Main.inputText);
    final static int polysyllablesQuantity = calculatePolySyllables(Main.inputText);

    private static int syllablesPerWord(String word) {
        int count; // count of vowels
        count = word
                .replaceAll("[aeiouy]{2,}", "a") // replace double vowels
                .replaceAll("e$", "")            // replace word ending in e
                .replaceAll("[^aeiouy]", "")     // replace non-vowels
                .length();
        return count;
    }

    private static int calculatePolySyllables(String text) {
        String[] words = text.split(" ");
        int polySyllableCount = 0;

        for (String word : words){
            int syllables = syllablesPerWord(word);
            if (syllables > 2)
                polySyllableCount++;
        }
        return polySyllableCount;
    }
}
