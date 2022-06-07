package src.alfa;

import java.util.Scanner;

public class BattleChoice {
    src.alfa.Java java = new src.alfa.Java();
    src.alfa.C c = new src.alfa.C();
    alfa.PHP php = new alfa.PHP();
    src.alfa.Python python = new src.alfa.Python();
    src.alfa.JavaScript javaScript = new src.alfa.JavaScript();
    OpponentRandomizer opp = new OpponentRandomizer();



    public static void ChoiceToBattleJava() {
        Scanner scan = new Scanner(System.in);
        String arg = scan.nextLine();
        switch (arg){
            case "Syntax":
                switch (OpponentRandomizer.RandomizeOpponentJava()) {
                    case "C":
                        String JavaSyntaxC = (Java.javaCompare()[0] > C.cCompare()[0]) ? "You won" : "You lost";
                        System.out.println(JavaSyntaxC);
                        break;
                    case "PHP":
                        String JavaSyntaxPHP = (Java.javaCompare()[0] > alfa.PHP.phpCompare()[0]) ? "You won" : "You lost";
                        System.out.println(JavaSyntaxPHP);
                        break;
                    case "Pyhton":
                        String JavaSyntaxPython = (Java.javaCompare()[0] > Python.pythonCompare()[0]) ? "You won" : "You lost";
                        System.out.println(JavaSyntaxPython);
                        break;
                    case "JavaScript":
                        String JavaSyntaxJavaScript = (Java.javaCompare()[0] > JavaScript.javaScriptCompare()[0]) ? "You won" : "You lost";
                        System.out.println(JavaSyntaxJavaScript);
                        break;

                }
                break;
        }

    }
}
