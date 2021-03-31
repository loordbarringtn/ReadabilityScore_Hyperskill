

public class ScoreCounter {
    private static double ariScore;
    private static double fkScore;
    private static double smogScore;
    private static double clScore;
    
    public static void getScore(String choice){
        switch (choice){
            case "ARI":
                getARI();
                break;
            case "FK":
                getFK();
                break;
            case "SMOG":
                getSmog();
                break;
            case "CL":
                getCl();
                break;
            case "all":
                System.out.println();
                getARI();
                getFK();
                getSmog();
                getCl();
                getAverageYearFromScores();
                break;
        }
    }

    private static void getARI(){
        ariScore = 4.71 * Calculations.charactersQuantity/ Calculations.wordsQuantity +
                0.5 * Calculations.wordsQuantity/ Calculations.sentencesQuantity - 21.43;
        System.out.printf("Automated Readability Index: %.2f (about %d-year-olds).%n", ariScore, GettingAge.getAge(ariScore));
    }

    private static void getFK(){
        fkScore = 0.39 * Calculations.wordsQuantity/ Calculations.sentencesQuantity + 11.8 * Calculations.syllablesQuantity/ Calculations.wordsQuantity - 15.59;
        System.out.printf("Flesch–Kincaid readability tests: %.2f (about %d-year-olds).%n", fkScore, GettingAge.getAge(fkScore));
    }

    private static void getSmog(){
        smogScore = 1.043 * Math.sqrt(Calculations.polysyllablesQuantity * 30/ Calculations.sentencesQuantity) + 3.1291;
        System.out.printf("Simple Measure of Gobbledygook: %.2f (about %d-year-olds).%n", smogScore, GettingAge.getAge(smogScore));
    }

    private static void getCl(){
        clScore = 0.0588 * ((double) Calculations.charactersQuantity/ Calculations.wordsQuantity * 100) - 0.296 * ((double) Calculations.sentencesQuantity/ Calculations.wordsQuantity * 100) - 15.8;
        System.out.printf("Coleman–Liau index: %.2f (about %d-year-olds).%n", clScore, GettingAge.getAge(clScore));


    }

    private static void getAverageYearFromScores(){
        double averageYearFromScores = (ariScore + fkScore + smogScore + clScore)/4;
        System.out.println();
        System.out.printf("This text should be understood in average by %.2f-year-olds.", averageYearFromScores);
    }
}
