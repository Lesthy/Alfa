package src.alfa;

import java.util.Random;

public class OpponentRandomizer {
    src.alfa.Java java = new src.alfa.Java();
    src.alfa.C c = new src.alfa.C();
    alfa.PHP php = new alfa.PHP();
    src.alfa.Python python = new src.alfa.Python();
    src.alfa.JavaScript javaScript = new src.alfa.JavaScript();
    public static int getRandom(){
        Random opp = new Random();
        int opponentJava = opp.nextInt(3);
        return opponentJava;
    }
    public static int oppon = getRandom();

    public static String RandomizeOpponentJava() {
        String opponentJavaString = "test";


        switch (oppon) {
            case 0:
                opponentJavaString = "C";
                break;
            case 1:
                opponentJavaString = "PHP";
                break;
            case 2:
                opponentJavaString = "Python";
                break;
            case 3:
                opponentJavaString = "JavaScript";
                break;
        }
        return opponentJavaString;
    }



    public static void RandomizeOpponentC() {
        Random opp = new Random();
        int opponentC = opp.nextInt(3);
        switch (opponentC) {
            case 0:
                System.out.println("Your opponent is Java");
                break;
            case 1:
                System.out.println("Your opponent is PHP");
                break;
            case 2:
                System.out.println("Your opponent is Python");
                break;
            case 3:
                System.out.println("Your opponent is JavaScript");
                break;
        }
    }
    public static void RandomizeOpponentPHP() {
        Random opp = new Random();
        int opponentC = opp.nextInt(3);
        switch (opponentC) {
            case 0:
                System.out.println("Your opponent is Java");
                break;
            case 1:
                System.out.println("Your opponent is C");
                break;
            case 2:
                System.out.println("Your opponent is Python");
                break;
            case 3:
                System.out.println("Your opponent is JavaScript");
                break;
        }
    }
    public static void RandomizeOpponentPython() {
        Random opp = new Random();
        int opponentC = opp.nextInt(3);
        switch (opponentC) {
            case 0:
                System.out.println("Your opponent is Java");
                break;
            case 1:
                System.out.println("Your opponent is PHP");
                break;
            case 2:
                System.out.println("Your opponent is C");
                break;
            case 3:
                System.out.println("Your opponent is JavaScript");
                break;
        }
    }
    public static void RandomizeOpponentJavaScript() {
        Random opp = new Random();
        int opponentC = opp.nextInt(3);
        switch (opponentC) {
            case 0:
                System.out.println("Your opponent is Java");
                break;
            case 1:
                System.out.println("Your opponent is PHP");
                break;
            case 2:
                System.out.println("Your opponent is Python");
                break;
            case 3:
                System.out.println("Your opponent is C");
                break;
        }
    }
}
