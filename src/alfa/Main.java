package src.alfa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

        if (choice.equalsIgnoreCase("Java")) {
            OpponentRandomizer.RandomizeOpponentJava();
            System.out.println("What do you think you're better at? Syntax/Usage/Speed/Security/Simplicity");
            String arg = scan.nextLine();
        } else if (choice.equalsIgnoreCase("C")) {
            OpponentRandomizer.RandomizeOpponentC();
            System.out.println("What do you think you're better at? Syntax/Usage/Speed/Security/Simplicity");
            String arg = scan.nextLine();
        } else if (choice.equalsIgnoreCase("PHP")) {
            OpponentRandomizer.RandomizeOpponentPHP();
            System.out.println("What do you think you're better at? Syntax/Usage/Speed/Security/Simplicity");
            String arg = scan.nextLine();
        } else if (choice.equalsIgnoreCase("Python")) {
            OpponentRandomizer.RandomizeOpponentPython();
            System.out.println("What do you think you're better at? Syntax/Usage/Speed/Security/Simplicity");
            String arg = scan.nextLine();
        }  else if (choice.equalsIgnoreCase("JavaScript")) {
            OpponentRandomizer.RandomizeOpponentJavaScript();
            System.out.println("What do you think you're better at? Syntax/Usage/Speed/Security/Simplicity");
            String arg = scan.nextLine();
        } else {
            System.out.println("Something went wrong :(");
        }

    }

}