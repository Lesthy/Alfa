package alfa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        ProgrammingLanguages hero;

        ProgrammingLanguages enemy;

        Scanner scan = new Scanner(System.in);


        System.out.println("Language Battle");
        System.out.println(" ");
        System.out.println("Choose your language : Java, C, PHP, Python or JavaScript");
        String choice = scan.nextLine();

        if (choice.equalsIgnoreCase("Java")) {
            hero = new Java();
            enemy = OpponentRandomizer.RandomizeOpponentJava();
        } else if (choice.equalsIgnoreCase("C")) {
            hero = new C();
            enemy = OpponentRandomizer.RandomizeOpponentC();
        } else if (choice.equalsIgnoreCase("PHP")) {
            hero = new PHP();
            enemy = OpponentRandomizer.RandomizeOpponentPHP();
        } else if (choice.equalsIgnoreCase("Python")) {
            hero = new Python();
            enemy = OpponentRandomizer.RandomizeOpponentPython();
        }  else if (choice.equalsIgnoreCase("JavaScript")) {
            hero = new JavaScript();
            enemy = OpponentRandomizer.RandomizeOpponentJavaScript();
        } else {
            throw new Exception("There is no such option!");
        }

        System.out.println("What do you want to compete with: Syntax/Usage/Speed/Simplicity/Security");
        String arg = scan.nextLine();


        if (arg.equalsIgnoreCase("Syntax")) {
            if (hero.syntax > enemy.syntax) {
                System.out.println("You won, congratulations!");
            } else {
                System.out.println("Sorry, You lost!");
            }
        }
    }
}