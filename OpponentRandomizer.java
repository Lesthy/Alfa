import java.util.Random;

public class OpponentRandomizer {
    public static void RandomizeOpponentJava() {
        Random opp = new Random();
        int opponentJava = opp.nextInt(3);
        switch (opponentJava) {
            case 0:
                System.out.println("Your opponent is C");
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
}
