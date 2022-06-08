package alfa;

import java.util.Random;

public class OpponentRandomizer {
    public static alfa.ProgrammingLanguages RandomizeOpponentJava() {
        Random opp = new Random();
        int opponentJava = opp.nextInt(3);

        switch (opponentJava) {
            case 0 -> {
                System.out.println("Your opponent is C");
                return new alfa.C();
            }
            case 1 -> {
                System.out.println("Your opponent is PHP");
                return new alfa.PHP();
            }
            case 2 -> {
                System.out.println("Your opponent is Python");
                return new alfa.Python();
            }
            case 3 -> {
                System.out.println("Your opponent is JavaScript");
                return new alfa.JavaScript();
            }
            default -> {
                return null;
            }
        }
    }

    public static alfa.ProgrammingLanguages RandomizeOpponentC() {
        Random opp = new Random();
        int opponentC = opp.nextInt(3);
        switch (opponentC) {
            case 0 -> {
                System.out.println("Your opponent is Java");
                return new alfa.Java();
            }
            case 1 -> {
                System.out.println("Your opponent is PHP");
                return new alfa.PHP();
            }
            case 2 -> {
                System.out.println("Your opponent is Python");
                return new alfa.Python();
            }
            case 3 -> {
                System.out.println("Your opponent is JavaScript");
                return new alfa.JavaScript();
            }
            default -> {
                return null;
            }
        }
    }

    public static alfa.ProgrammingLanguages RandomizeOpponentPHP() {
        Random opp = new Random();
        int opponentC = opp.nextInt(3);
        switch (opponentC) {
            case 0 -> {
                System.out.println("Your opponent is Java");
                return new alfa.Java();
            }
            case 1 -> {
                System.out.println("Your opponent is C");
                return new alfa.C();
            }
            case 2 -> {
                System.out.println("Your opponent is Python");
                return new alfa.Python();
            }
            case 3 -> {
                System.out.println("Your opponent is JavaScript");
                return new alfa.JavaScript();
            }
            default -> {
                return null;
            }
        }
    }

    public static alfa.ProgrammingLanguages RandomizeOpponentPython() {
        Random opp = new Random();
        int opponentC = opp.nextInt(3);
        switch (opponentC) {
            case 0 -> {
                System.out.println("Your opponent is Java");
                return new alfa.Java();
            }
            case 1 -> {
                System.out.println("Your opponent is PHP");
                return new alfa.PHP();
            }
            case 2 -> {
                System.out.println("Your opponent is C");
                return new alfa.C();
            }
            case 3 -> {
                System.out.println("Your opponent is JavaScript");
                return new alfa.JavaScript();
            }
            default -> {
                return null;
            }
        }
    }

    public static alfa.ProgrammingLanguages RandomizeOpponentJavaScript() {
        Random opp = new Random();
        int opponentC = opp.nextInt(3);
        switch (opponentC) {
            case 0 -> {
                System.out.println("Your opponent is Java");
                return new alfa.Java();
            }
            case 1 -> {
                System.out.println("Your opponent is PHP");
                return new alfa.PHP();
            }
            case 2 -> {
                System.out.println("Your opponent is Python");
                return new alfa.Python();
            }
            case 3 -> {
                System.out.println("Your opponent is C");
                return new alfa.C();
            }
            default -> {
                return null;
            }
        }
    }
}