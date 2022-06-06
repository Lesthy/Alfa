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
        System.out.println("Choose your language : src.alfa.Java, src.alfa.C, src.alfa.PHP, src.alfa.Python or src.alfa.JavaScript");
        String choice = scan.nextLine();

        if (choice.equalsIgnoreCase("src.alfa.Java")) {
            OpponentRandomizer.RandomizeOpponentJava();
            System.out.println("What do you think you're better at? Syntax/Usage/Speed/Security/Simplicity");
            String arg = scan.nextLine();
        } else if (choice.equalsIgnoreCase("src.alfa.C")) {
            OpponentRandomizer.RandomizeOpponentC();
            System.out.println("What do you think you're better at? Syntax/Usage/Speed/Security/Simplicity");
            String arg = scan.nextLine();
        } else if (choice.equalsIgnoreCase("src.alfa.PHP")) {
            OpponentRandomizer.RandomizeOpponentPHP();
            System.out.println("What do you think you're better at? Syntax/Usage/Speed/Security/Simplicity");
            String arg = scan.nextLine();
        } else if (choice.equalsIgnoreCase("src.alfa.Python")) {
            OpponentRandomizer.RandomizeOpponentPython();
            System.out.println("What do you think you're better at? Syntax/Usage/Speed/Security/Simplicity");
            String arg = scan.nextLine();
        }  else if (choice.equalsIgnoreCase("src.alfa.JavaScript")) {
            OpponentRandomizer.RandomizeOpponentJavaScript();
            System.out.println("What do you think you're better at? Syntax/Usage/Speed/Security/Simplicity");
            String arg = scan.nextLine();
        } else {
            System.out.println("Something went wrong :(");
        }

    }

}