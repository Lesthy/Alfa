package src.alfa;

import src.alfa.BattleChoice;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        src.alfa.Java java = new src.alfa.Java();
        src.alfa.C c = new src.alfa.C();
        alfa.PHP php = new alfa.PHP();
        src.alfa.Python python = new src.alfa.Python();
        src.alfa.JavaScript javaScript = new src.alfa.JavaScript();
        Scanner scan = new Scanner(System.in);


        System.out.println("Language Battle");
        System.out.println(" ");
        System.out.println("Choose your language : Java, C, PHP, Python or JavaScript");
        String choice = scan.nextLine();

        if (choice.equalsIgnoreCase("Java")) {
            System.out.println("Your opponent is " + OpponentRandomizer.RandomizeOpponentJava());
            System.out.println("What do you think you're better at? Syntax/Usage/Speed/Security/Simplicity");
            BattleChoice.ChoiceToBattleJava();
        } else if (choice.equalsIgnoreCase("C")) {
            System.out.println("Your opponent is " + OpponentRandomizer.RandomizeOpponentC());
            System.out.println("What do you think you're better at? Syntax/Usage/Speed/Security/Simplicity");
            BattleChoice.ChoiceToBattleC();
        } else if (choice.equalsIgnoreCase("PHP")) {
            System.out.println("Your opponent is " + OpponentRandomizer.RandomizeOpponentPHP());
            System.out.println("What do you think you're better at? Syntax/Usage/Speed/Security/Simplicity");
            BattleChoice.ChoiceToBattlePHP();
        } else if (choice.equalsIgnoreCase("Python")) {
            System.out.println("Your opponent is " + OpponentRandomizer.RandomizeOpponentPy());
            System.out.println("What do you think you're better at? Syntax/Usage/Speed/Security/Simplicity");
            BattleChoice.ChoiceToBattlePy();
        }  else if (choice.equalsIgnoreCase("JavaScript")) {
            System.out.println("Your opponent is " + OpponentRandomizer.RandomizeOpponentJS());
            System.out.println("What do you think you're better at? Syntax/Usage/Speed/Security/Simplicity");
            BattleChoice.ChoiceToBattleJS();
        } else {
            throw new Exception("There is no such option!");
        }

    }
}