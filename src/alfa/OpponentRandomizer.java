package src.alfa;

import java.util.Random;

public class OpponentRandomizer {
    public static void RandomizeOpponentJava() {
        Random opp = new Random();
        int opponentJava = opp.nextInt(3);
        switch (opponentJava) {
            case 0:
                System.out.println("Your opponent is src.alfa.C");
                break;
            case 1:
                System.out.println("Your opponent is src.alfa.PHP");
                break;
            case 2:
                System.out.println("Your opponent is src.alfa.Python");
                break;
            case 3:
                System.out.println("Your opponent is src.alfa.JavaScript");
                break;
        }
    }

    public static void RandomizeOpponentC() {
        Random opp = new Random();
        int opponentC = opp.nextInt(3);
        switch (opponentC) {
            case 0:
                System.out.println("Your opponent is src.alfa.Java");
                break;
            case 1:
                System.out.println("Your opponent is src.alfa.PHP");
                break;
            case 2:
                System.out.println("Your opponent is src.alfa.Python");
                break;
            case 3:
                System.out.println("Your opponent is src.alfa.JavaScript");
                break;
        }
    }
    public static void RandomizeOpponentPHP() {
        Random opp = new Random();
        int opponentC = opp.nextInt(3);
        switch (opponentC) {
            case 0:
                System.out.println("Your opponent is src.alfa.Java");
                break;
            case 1:
                System.out.println("Your opponent is src.alfa.C");
                break;
            case 2:
                System.out.println("Your opponent is src.alfa.Python");
                break;
            case 3:
                System.out.println("Your opponent is src.alfa.JavaScript");
                break;
        }
    }
    public static void RandomizeOpponentPython() {
        Random opp = new Random();
        int opponentC = opp.nextInt(3);
        switch (opponentC) {
            case 0:
                System.out.println("Your opponent is src.alfa.Java");
                break;
            case 1:
                System.out.println("Your opponent is src.alfa.PHP");
                break;
            case 2:
                System.out.println("Your opponent is src.alfa.C");
                break;
            case 3:
                System.out.println("Your opponent is src.alfa.JavaScript");
                break;
        }
    }
    public static void RandomizeOpponentJavaScript() {
        Random opp = new Random();
        int opponentC = opp.nextInt(3);
        switch (opponentC) {
            case 0:
                System.out.println("Your opponent is src.alfa.Java");
                break;
            case 1:
                System.out.println("Your opponent is src.alfa.PHP");
                break;
            case 2:
                System.out.println("Your opponent is src.alfa.Python");
                break;
            case 3:
                System.out.println("Your opponent is src.alfa.C");
                break;
        }
    }
}
