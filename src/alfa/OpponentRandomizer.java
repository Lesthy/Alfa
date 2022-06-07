package src.alfa;

import java.util.Random;

public class OpponentRandomizer {
    src.alfa.Java java = new src.alfa.Java();
    src.alfa.C c = new src.alfa.C();
    alfa.PHP php = new alfa.PHP();
    src.alfa.Python python = new src.alfa.Python();
    src.alfa.JavaScript javaScript = new src.alfa.JavaScript();
    public static int getRandomJava(){
        Random opp = new Random();
        int opponentJava = opp.nextInt(3);
        return opponentJava;
    }
    public static int oppon = getRandomJava();

    public static String RandomizeOpponentJava() {
        String opponentJavaString = "test";


        switch (oppon) {
            case 0:
                opponentJavaString = "C";
                break;
            case 1:
                opponentJavaString = "PHP";
                break;
            case 2:
                opponentJavaString = "Python";
                break;
            case 3:
                opponentJavaString = "JavaScript";
                break;
        }
        return opponentJavaString;
    }

    public static int getRandomC(){
        Random opp = new Random();
        int opponentC = opp.nextInt(3);
        return opponentC;
    }
    public static int opC = getRandomC();


    public static String RandomizeOpponentC() {
        String opponentCString = "test";


        switch (opC) {
            case 0:
                opponentCString = "Java";
                break;
            case 1:
                opponentCString = "PHP";
                break;
            case 2:
                opponentCString = "Python";
                break;
            case 3:
                opponentCString = "JavaScript";
                break;
        }
        return opponentCString;
    }
    public static int getRandomPHP(){
        Random opp = new Random();
        int opponentPHP = opp.nextInt(3);
        return opponentPHP;
    }
    public static int opPHP = getRandomPHP();


    public static String RandomizeOpponentPHP() {
        String opponentPHPString = "test";


        switch (opPHP) {
            case 0:
                opponentPHPString = "C";
                break;
            case 1:
                opponentPHPString = "Java";
                break;
            case 2:
                opponentPHPString = "Python";
                break;
            case 3:
                opponentPHPString = "JavaScript";
                break;
        }
        return opponentPHPString;
    }
    public static int getRandomPy(){
        Random opp = new Random();
        int opponentPy = opp.nextInt(3);
        return opponentPy;
    }
    public static int opPy = getRandomPy();


    public static String RandomizeOpponentPy() {
        String opponentPyString = "test";


        switch (opPy) {
            case 0:
                opponentPyString = "C";
                break;
            case 1:
                opponentPyString = "PHP";
                break;
            case 2:
                opponentPyString = "Java";
                break;
            case 3:
                opponentPyString = "JavaScript";
                break;
        }
        return opponentPyString;
    }
    public static int getRandomJS(){
        Random opp = new Random();
        int opponentJS = opp.nextInt(3);
        return opponentJS;
    }
    public static int opJS = getRandomJS();


    public static String RandomizeOpponentJS() {
        String opponentJSString = "test";


        switch (opJS) {
            case 0:
                opponentJSString = "C";
                break;
            case 1:
                opponentJSString = "PHP";
                break;
            case 2:
                opponentJSString = "Python";
                break;
            case 3:
                opponentJSString = "Java";
                break;
        }
        return opponentJSString;
    }
}
