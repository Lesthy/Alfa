package alfa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        alfa.ProgrammingLanguages hero;

        alfa.ProgrammingLanguages enemy;

        Scanner scan = new Scanner(System.in);


        System.out.println("Language Battle");
        System.out.println(" ");
        Boolean infinite = true;
        int wins = 0;
        int losses = 0;
        do {
            System.out.println("Choose your language : Java, C, PHP, Python or JavaScript");
            String choice = scan.nextLine();

            if (choice.equalsIgnoreCase("Java")) {
                hero = new alfa.Java();
                enemy = alfa.OpponentRandomizer.RandomizeOpponentJava();
            } else if (choice.equalsIgnoreCase("C")) {
                hero = new alfa.C();
                enemy = alfa.OpponentRandomizer.RandomizeOpponentC();
            } else if (choice.equalsIgnoreCase("PHP")) {
                hero = new alfa.PHP();
                enemy = alfa.OpponentRandomizer.RandomizeOpponentPHP();
            } else if (choice.equalsIgnoreCase("Python")) {
                hero = new alfa.Python();
                enemy = alfa.OpponentRandomizer.RandomizeOpponentPython();
            } else if (choice.equalsIgnoreCase("JavaScript")) {
                hero = new alfa.JavaScript();
                enemy = alfa.OpponentRandomizer.RandomizeOpponentJavaScript();
            } else {
                throw new Exception("There is no such option!");
            }

            System.out.println("What do you want to compete with: Syntax/Usage/Speed/Simplicity/Security");
            String arg = scan.nextLine();


            if (arg.equalsIgnoreCase("Syntax")) {
                if (hero.getSyntax() > enemy.getSyntax()) {
                    System.out.println("You won, congratulations!");
                    wins ++;
                } else {
                    System.out.println("Sorry, You lost!");
                    losses++;
                }
            } else if (arg.equalsIgnoreCase("Usage")) {
                if (hero.getUsage() > enemy.getUsage()) {
                    System.out.println("You won, congratulations!");
                    wins ++;
                } else {
                    System.out.println("Sorry, You lost!");
                    losses++;
                }
            } else if (arg.equalsIgnoreCase("Speed")) {
                if (hero.getSpeed() > enemy.getSpeed()) {
                    System.out.println("You won, congratulations!");
                    wins ++;
                } else {
                    System.out.println("Sorry, You lost!");
                    losses++;
                }
            } else if (arg.equalsIgnoreCase("Simplicity")) {
                if (hero.getSimplicity() > enemy.getSimplicity()) {
                    System.out.println("You won, congratulations!");
                    wins ++;
                } else {
                    System.out.println("Sorry, You lost!");
                    losses++;
                }
            } else if (arg.equalsIgnoreCase("Security")) {
                if (hero.getSecurity() > enemy.getSecurity()) {
                    System.out.println("You won, congratulations!");
                    wins ++;
                } else {
                    System.out.println("Sorry, You lost!");
                    losses++;
                }
            } else {
                throw new Exception("There is no such option!");
            }
            System.out.println("Wins: " + wins + ", Losses: " + losses);
        } while (infinite);
    }

}