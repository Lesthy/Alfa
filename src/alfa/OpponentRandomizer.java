package alfa;

import java.util.Random;

public class OpponentRandomizer {
    public static ProgrammingLanguages RandomizeOpponentJava() {
        Random opp = new Random();
        int opponentJava = opp.nextInt(3);

        switch (opponentJava) {
            case 0 -> {
                System.out.println("Your opponent is C");
                return new C();
            }
            case 1 -> {
                System.out.println("Your opponent is PHP");
                return new PHP();
            }
            case 2 -> {
                System.out.println("Your opponent is Python");
                return new Python();
            }
            case 3 -> {
                System.out.println("Your opponent is JavaScript");
                return new JavaScript();
            }
            default -> {
                return null;
            }
        }
    }

    public static ProgrammingLanguages RandomizeOpponentC() {
        Random opp = new Random();
        int opponentC = opp.nextInt(3);
        switch (opponentC) {
            case 0 -> {
                System.out.println("Your opponent is Java");
                return new Java();
            }
            case 1 -> {
                System.out.println("Your opponent is PHP");
                return new PHP();
            }
            case 2 -> {
                System.out.println("Your opponent is Python");
                return new Python();
            }
            case 3 -> {
                System.out.println("Your opponent is JavaScript");
                return new JavaScript();
            }
            default -> {
                return null;
            }
        }
    }

    public static ProgrammingLanguages RandomizeOpponentPHP() {
        Random opp = new Random();
        int opponentC = opp.nextInt(3);
        switch (opponentC) {
            case 0 -> {
                System.out.println("Your opponent is Java");
                return new Java();
            }
            case 1 -> {
                System.out.println("Your opponent is C");
                return new C();
            }
            case 2 -> {
                System.out.println("Your opponent is Python");
                return new Python();
            }
            case 3 -> {
                System.out.println("Your opponent is JavaScript");
                return new JavaScript();
            }
            default -> {
                return null;
            }
        }
    }

    public static ProgrammingLanguages RandomizeOpponentPython() {
        Random opp = new Random();
        int opponentC = opp.nextInt(3);
        switch (opponentC) {
            case 0 -> {
                System.out.println("Your opponent is Java");
                return new Java();
            }
            case 1 -> {
                System.out.println("Your opponent is PHP");
                return new PHP();
            }
            case 2 -> {
                System.out.println("Your opponent is C");
                return new C();
            }
            case 3 -> {
                System.out.println("Your opponent is JavaScript");
                return new JavaScript();
            }
            default -> {
                return null;
            }
        }
    }

    public static ProgrammingLanguages RandomizeOpponentJavaScript() {
        Random opp = new Random();
        int opponentC = opp.nextInt(3);
        switch (opponentC) {
            case 0 -> {
                System.out.println("Your opponent is Java");
                return new Java();
            }
            case 1 -> {
                System.out.println("Your opponent is PHP");
                return new PHP();
            }
            case 2 -> {
                System.out.println("Your opponent is Python");
                return new Python();
            }
            case 3 -> {
                System.out.println("Your opponent is C");
                return new C();
            }
            default -> {
                return null;
            }
        }
    }
}