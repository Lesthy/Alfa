package alfa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Java java = new Java();
        C c = new C();
        PHP php = new PHP();
        Python python = new Python();
        JavaScript javaScript = new JavaScript();
        Scanner scan = new Scanner(System.in);


        System.out.println("Language Battle");
        System.out.println(" ");
        System.out.println("Choose your language : Java, C, PHP, Python or JavaScript");
        String choice = scan.nextLine();

        System.out.println("What do you think you're better at? Syntax/Usage/Speed/Security/Simplicity");

        if (choice.equalsIgnoreCase("Java")) {
            OpponentRandomizer.RandomizeOpponentJava();
        } else if (choice.equalsIgnoreCase("C")) {
            OpponentRandomizer.RandomizeOpponentC();
        } else if (choice.equalsIgnoreCase("PHP")) {
            OpponentRandomizer.RandomizeOpponentPHP();
        } else if (choice.equalsIgnoreCase("Python")) {
            OpponentRandomizer.RandomizeOpponentPython();
        }  else if (choice.equalsIgnoreCase("JavaScript")) {
            OpponentRandomizer.RandomizeOpponentJavaScript();
        } else {
            throw new Exception("There is no such option!");
        }

        String arg = scan.nextLine();
    }
}