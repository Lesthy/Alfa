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
                    case "Python":
                        String JavaSyntaxPython = (Java.javaCompare()[0] > Python.pythonCompare()[0]) ? "You won" : "You lost";
                        System.out.println(JavaSyntaxPython);
                        break;
                    case "JavaScript":
                        String JavaSyntaxJavaScript = (Java.javaCompare()[0] > JavaScript.javaScriptCompare()[0]) ? "You won" : "You lost";
                        System.out.println(JavaSyntaxJavaScript);
                        break;

                }
                break;
            case "Usage":
                switch (OpponentRandomizer.RandomizeOpponentJava()) {
                    case "C":
                        String JavaUsageC = (Java.javaCompare()[1] > C.cCompare()[1]) ? "You won" : "You lost";
                        System.out.println(JavaUsageC);
                        break;
                    case "PHP":
                        String JavaUsagePHP = (Java.javaCompare()[1] > alfa.PHP.phpCompare()[1]) ? "You won" : "You lost";
                        System.out.println(JavaUsagePHP);
                        break;
                    case "Python":
                        String JavaUsagePython = (Java.javaCompare()[1] > Python.pythonCompare()[1]) ? "You won" : "You lost";
                        System.out.println(JavaUsagePython);
                        break;
                    case "JavaScript":
                        String JavaUsageJavaScript = (Java.javaCompare()[1] > JavaScript.javaScriptCompare()[1]) ? "You won" : "You lost";
                        System.out.println(JavaUsageJavaScript);
                        break;

                }
                break;
            case "Speed":
                switch (OpponentRandomizer.RandomizeOpponentJava()) {
                    case "C":
                        String JavaSpeedC = (Java.javaCompare()[2] > C.cCompare()[2]) ? "You won" : "You lost";
                        System.out.println(JavaSpeedC);
                        break;
                    case "PHP":
                        String JavaSpeedPHP = (Java.javaCompare()[2] > alfa.PHP.phpCompare()[2]) ? "You won" : "You lost";
                        System.out.println(JavaSpeedPHP);
                        break;
                    case "Python":
                        String JavaSpeedPython = (Java.javaCompare()[2] > Python.pythonCompare()[2]) ? "You won" : "You lost";
                        System.out.println(JavaSpeedPython);
                        break;
                    case "JavaScript":
                        String JavaSpeedJavaScript = (Java.javaCompare()[2] > JavaScript.javaScriptCompare()[2]) ? "You won" : "You lost";
                        System.out.println(JavaSpeedJavaScript);
                        break;

                }
                break;
            case "Security":
                switch (OpponentRandomizer.RandomizeOpponentJava()) {
                    case "C":
                        String JavaSecC = (Java.javaCompare()[3] > C.cCompare()[3]) ? "You won" : "You lost";
                        System.out.println(JavaSecC);
                        break;
                    case "PHP":
                        String JavaSecPHP = (Java.javaCompare()[3] > alfa.PHP.phpCompare()[3]) ? "You won" : "You lost";
                        System.out.println(JavaSecPHP);
                        break;
                    case "Python":
                        String JavaSecPython = (Java.javaCompare()[3] > Python.pythonCompare()[3]) ? "You won" : "You lost";
                        System.out.println(JavaSecPython);
                        break;
                    case "JavaScript":
                        String JavaSecJavaScript = (Java.javaCompare()[3] > JavaScript.javaScriptCompare()[3]) ? "You won" : "You lost";
                        System.out.println(JavaSecJavaScript);
                        break;

                }
                break;
            case "Simplicity":
                switch (OpponentRandomizer.RandomizeOpponentJava()) {
                    case "C":
                        String JavaSimpC = (Java.javaCompare()[4] > C.cCompare()[4]) ? "You won" : "You lost";
                        System.out.println(JavaSimpC);
                        break;
                    case "PHP":
                        String JavaSimpPHP = (Java.javaCompare()[4] > alfa.PHP.phpCompare()[4]) ? "You won" : "You lost";
                        System.out.println(JavaSimpPHP);
                        break;
                    case "Python":
                        String JavaSimpPython = (Java.javaCompare()[4] > Python.pythonCompare()[4]) ? "You won" : "You lost";
                        System.out.println(JavaSimpPython);
                        break;
                    case "JavaScript":
                        String JavaSimpJavaScript = (Java.javaCompare()[4] > JavaScript.javaScriptCompare()[4]) ? "You won" : "You lost";
                        System.out.println(JavaSimpJavaScript);
                        break;

                }
                break;

        }

    }
    public static void ChoiceToBattleC() {
        Scanner scan = new Scanner(System.in);
        String arg = scan.nextLine();
        switch (arg) {
            case "Syntax":
                switch (OpponentRandomizer.RandomizeOpponentC()) {
                    case "Java":
                        String CSyntaxJava = (C.cCompare()[0] > Java.javaCompare()[0]) ? "You won" : "You lost";
                        System.out.println(CSyntaxJava);
                        break;
                    case "PHP":
                        String CSyntaxPHP = (C.cCompare()[0] > alfa.PHP.phpCompare()[0]) ? "You won" : "You lost";
                        System.out.println(CSyntaxPHP);
                        break;
                    case "Python":
                        String CSyntaxPython = (C.cCompare()[0] > Python.pythonCompare()[0]) ? "You won" : "You lost";
                        System.out.println(CSyntaxPython);
                        break;
                    case "JavaScript":
                        String CSyntaxJavaScript = (C.cCompare()[0] > JavaScript.javaScriptCompare()[0]) ? "You won" : "You lost";
                        System.out.println(CSyntaxJavaScript);
                        break;

                }
                break;
            case "Usage":
                switch (OpponentRandomizer.RandomizeOpponentC()) {
                    case "C":
                        String CUsageJava = (C.cCompare()[1] > Java.javaCompare()[1]) ? "You won" : "You lost";
                        System.out.println(CUsageJava);
                        break;
                    case "PHP":
                        String CUsagePHP = (C.cCompare()[1] > alfa.PHP.phpCompare()[1]) ? "You won" : "You lost";
                        System.out.println(CUsagePHP);
                        break;
                    case "Python":
                        String CUsagePython = (C.cCompare()[0] > Python.pythonCompare()[1]) ? "You won" : "You lost";
                        System.out.println(CUsagePython);
                        break;
                    case "JavaScript":
                        String CUsageJavaScript = (C.cCompare()[1] > JavaScript.javaScriptCompare()[1]) ? "You won" : "You lost";
                        System.out.println(CUsageJavaScript);
                        break;

                }
                break;
            case "Speed":
                switch (OpponentRandomizer.RandomizeOpponentC()) {
                    case "C":
                        String CSpeedJava = (C.cCompare()[2] > Java.javaCompare()[2]) ? "You won" : "You lost";
                        System.out.println(CSpeedJava);
                        break;
                    case "PHP":
                        String CSpeedPHP = (C.cCompare()[2] > alfa.PHP.phpCompare()[2]) ? "You won" : "You lost";
                        System.out.println(CSpeedPHP);
                        break;
                    case "Python":
                        String CSpeedPython = (C.cCompare()[2] > Python.pythonCompare()[2]) ? "You won" : "You lost";
                        System.out.println(CSpeedPython);
                        break;
                    case "JavaScript":
                        String CSpeedJavaScript = (C.cCompare()[2] > JavaScript.javaScriptCompare()[2]) ? "You won" : "You lost";
                        System.out.println(CSpeedJavaScript);
                        break;

                }
                break;
            case "Security":
                switch (OpponentRandomizer.RandomizeOpponentC()) {
                    case "C":
                        String CSecC = (C.cCompare()[3] > Java.javaCompare()[3]) ? "You won" : "You lost";
                        System.out.println(CSecC);
                        break;
                    case "PHP":
                        String CSecPHP = (C.cCompare()[3] > alfa.PHP.phpCompare()[3]) ? "You won" : "You lost";
                        System.out.println(CSecPHP);
                        break;
                    case "Python":
                        String CSecPython = (C.cCompare()[3] > Python.pythonCompare()[3]) ? "You won" : "You lost";
                        System.out.println(CSecPython);
                        break;
                    case "JavaScript":
                        String CSecJavaScript = (C.cCompare()[3] > JavaScript.javaScriptCompare()[3]) ? "You won" : "You lost";
                        System.out.println(CSecJavaScript);
                        break;

                }
                break;
            case "Simplicity":
                switch (OpponentRandomizer.RandomizeOpponentC()) {
                    case "C":
                        String CSimpJava = (C.cCompare()[4] > Java.javaCompare()[4] ) ? "You won" : "You lost";
                        System.out.println(CSimpJava);
                        break;
                    case "PHP":
                        String CSimpPHP = (C.cCompare()[4] > alfa.PHP.phpCompare()[4]) ? "You won" : "You lost";
                        System.out.println(CSimpPHP);
                        break;
                    case "Python":
                        String CSimpPython = (C.cCompare()[4] > Python.pythonCompare()[4]) ? "You won" : "You lost";
                        System.out.println(CSimpPython);
                        break;
                    case "JavaScript":
                        String CSimpJavaScript = (C.cCompare()[4] > JavaScript.javaScriptCompare()[4]) ? "You won" : "You lost";
                        System.out.println(CSimpJavaScript);
                        break;

                }
                break;

        }
    }
    public static void ChoiceToBattlePHP() {
        Scanner scan = new Scanner(System.in);
        String arg = scan.nextLine();
        switch (arg) {
            case "Syntax":
                switch (OpponentRandomizer.RandomizeOpponentPHP()) {
                    case "Java":
                        String PHPSyntaxJava = (alfa.PHP.phpCompare()[0] > Java.javaCompare()[0]) ? "You won" : "You lost";
                        System.out.println(PHPSyntaxJava);
                        break;
                    case "C":
                        String PHPSyntaxC = ( alfa.PHP.phpCompare()[0] > C.cCompare()[0]) ? "You won" : "You lost";
                        System.out.println(PHPSyntaxC);
                        break;
                    case "Python":
                        String PhpSyntaxPython = ( alfa.PHP.phpCompare()[0] > Python.pythonCompare()[0]) ? "You won" : "You lost";
                        System.out.println(PhpSyntaxPython);
                        break;
                    case "JavaScript":
                        String PHPSyntaxJavaScript = ( alfa.PHP.phpCompare()[0] > JavaScript.javaScriptCompare()[0]) ? "You won" : "You lost";
                        System.out.println(PHPSyntaxJavaScript);
                        break;

                }
                break;
            case "Usage":
                switch (OpponentRandomizer.RandomizeOpponentPHP()) {
                    case "Java":
                        String PHPUsageJava = (alfa.PHP.phpCompare()[1] > Java.javaCompare()[1]) ? "You won" : "You lost";
                        System.out.println(PHPUsageJava);
                        break;
                    case "C":
                        String PHPUsageC = (alfa.PHP.phpCompare()[1] > C.cCompare()[1]) ? "You won" : "You lost";
                        System.out.println(PHPUsageC);
                        break;
                    case "Python":
                        String PHPUsagePython = (alfa.PHP.phpCompare()[1] > Python.pythonCompare()[1]) ? "You won" : "You lost";
                        System.out.println(PHPUsagePython);
                        break;
                    case "JavaScript":
                        String PHPUsageJavaScript = (alfa.PHP.phpCompare()[1] > JavaScript.javaScriptCompare()[1]) ? "You won" : "You lost";
                        System.out.println(PHPUsageJavaScript);
                        break;

                }
                break;
            case "Speed":
                switch (OpponentRandomizer.RandomizeOpponentPHP()) {
                    case "Java":
                        String PHPSpeedJava = (alfa.PHP.phpCompare()[2]> Java.javaCompare()[2]) ? "You won" : "You lost";
                        System.out.println(PHPSpeedJava);
                        break;
                    case "C":
                        String PHPSpeedC = (alfa.PHP.phpCompare()[2] > C.cCompare()[2]) ? "You won" : "You lost";
                        System.out.println(PHPSpeedC);
                        break;
                    case "Python":
                        String PHPSpeedPython = (alfa.PHP.phpCompare()[2] > Python.pythonCompare()[2]) ? "You won" : "You lost";
                        System.out.println(PHPSpeedPython);
                        break;
                    case "JavaScript":
                        String PHPSpeedJavaScript = (alfa.PHP.phpCompare()[2] > JavaScript.javaScriptCompare()[2]) ? "You won" : "You lost";
                        System.out.println(PHPSpeedJavaScript);
                        break;

                }
                break;
            case "Security":
                switch (OpponentRandomizer.RandomizeOpponentPHP()) {
                    case "Java":
                        String PHPSecJava = (alfa.PHP.phpCompare()[3] > Java.javaCompare()[3]) ? "You won" : "You lost";
                        System.out.println(PHPSecJava);
                        break;
                    case "C":
                        String PHPSecC = (alfa.PHP.phpCompare()[3] > C.cCompare()[3]) ? "You won" : "You lost";
                        System.out.println(PHPSecC);
                        break;
                    case "Python":
                        String PHPSecPython = (alfa.PHP.phpCompare()[3] > Python.pythonCompare()[3]) ? "You won" : "You lost";
                        System.out.println(PHPSecPython);
                        break;
                    case "JavaScript":
                        String PHPSecJavaScript = (alfa.PHP.phpCompare()[3] > JavaScript.javaScriptCompare()[3]) ? "You won" : "You lost";
                        System.out.println(PHPSecJavaScript);
                        break;

                }
                break;
            case "Simplicity":
                switch (OpponentRandomizer.RandomizeOpponentPHP()) {
                    case "Java":
                        String PHPSimpJava = (alfa.PHP.phpCompare()[4] > Java.javaCompare()[4] ) ? "You won" : "You lost";
                        System.out.println(PHPSimpJava);
                        break;
                    case "C":
                        String PHPSimpC = (alfa.PHP.phpCompare()[4] > C.cCompare()[4]) ? "You won" : "You lost";
                        System.out.println(PHPSimpC);
                        break;
                    case "Python":
                        String PHPSimpPython = (alfa.PHP.phpCompare()[4] > Python.pythonCompare()[4]) ? "You won" : "You lost";
                        System.out.println(PHPSimpPython);
                        break;
                    case "JavaScript":
                        String PHPSimpJavaScript = (alfa.PHP.phpCompare()[4] > JavaScript.javaScriptCompare()[4]) ? "You won" : "You lost";
                        System.out.println(PHPSimpJavaScript);
                        break;

                }
                break;

        }
    }
    public static void ChoiceToBattlePy() {
        Scanner scan = new Scanner(System.in);
        String arg = scan.nextLine();
        switch (arg){
            case "Syntax":
                switch (OpponentRandomizer.RandomizeOpponentPy()) {
                    case "C":
                        String PySyntaxC = (Python.pythonCompare()[0] > C.cCompare()[0]) ? "You won" : "You lost";
                        System.out.println(PySyntaxC);
                        break;
                    case "PHP":
                        String PySyntaxPHP = (Python.pythonCompare()[0] > alfa.PHP.phpCompare()[0]) ? "You won" : "You lost";
                        System.out.println(PySyntaxPHP);
                        break;
                    case "Java":
                        String PySyntaxJava = (Python.pythonCompare()[0] > Java.javaCompare()[0]) ? "You won" : "You lost";
                        System.out.println(PySyntaxJava);
                        break;
                    case "JavaScript":
                        String PySyntaxJavaScript = (Python.pythonCompare()[0] > JavaScript.javaScriptCompare()[0]) ? "You won" : "You lost";
                        System.out.println(PySyntaxJavaScript);
                        break;

                }
                break;
            case "Usage":
                switch (OpponentRandomizer.RandomizeOpponentPy()) {
                    case "C":
                        String PyUsageC = (Python.pythonCompare()[1] > C.cCompare()[1]) ? "You won" : "You lost";
                        System.out.println(PyUsageC);
                        break;
                    case "PHP":
                        String PyUsagePHP = (Python.pythonCompare()[1] > alfa.PHP.phpCompare()[1]) ? "You won" : "You lost";
                        System.out.println(PyUsagePHP);
                        break;
                    case "Java":
                        String PyUsagePython = (Python.pythonCompare()[1] > Java.javaCompare()[1]) ? "You won" : "You lost";
                        System.out.println(PyUsagePython);
                        break;
                    case "JavaScript":
                        String PyUsageJavaScript = (Python.pythonCompare()[1] > JavaScript.javaScriptCompare()[1]) ? "You won" : "You lost";
                        System.out.println(PyUsageJavaScript);
                        break;

                }
                break;
            case "Speed":
                switch (OpponentRandomizer.RandomizeOpponentPy()) {
                    case "C":
                        String PySpeedC = (Python.pythonCompare()[2] > C.cCompare()[2]) ? "You won" : "You lost";
                        System.out.println(PySpeedC);
                        break;
                    case "PHP":
                        String PySpeedPHP = (Python.pythonCompare()[2] > alfa.PHP.phpCompare()[2]) ? "You won" : "You lost";
                        System.out.println(PySpeedPHP);
                        break;
                    case "Java":
                        String PySpeedPython = (Python.pythonCompare()[2] > Java.javaCompare()[2]) ? "You won" : "You lost";
                        System.out.println(PySpeedPython);
                        break;
                    case "JavaScript":
                        String PySpeedJavaScript = (Python.pythonCompare()[2] > JavaScript.javaScriptCompare()[2]) ? "You won" : "You lost";
                        System.out.println(PySpeedJavaScript);
                        break;

                }
                break;
            case "Security":
                switch (OpponentRandomizer.RandomizeOpponentPy()) {
                    case "C":
                        String PySecC = (Python.pythonCompare()[3] > C.cCompare()[3]) ? "You won" : "You lost";
                        System.out.println(PySecC);
                        break;
                    case "PHP":
                        String PySecPHP = (Python.pythonCompare()[3] > alfa.PHP.phpCompare()[3]) ? "You won" : "You lost";
                        System.out.println(PySecPHP);
                        break;
                    case "Java":
                        String PySecPython = (Python.pythonCompare()[3] > Java.javaCompare()[3]) ? "You won" : "You lost";
                        System.out.println(PySecPython);
                        break;
                    case "JavaScript":
                        String PySecJavaScript = (Python.pythonCompare()[3] > JavaScript.javaScriptCompare()[3]) ? "You won" : "You lost";
                        System.out.println(PySecJavaScript);
                        break;

                }
                break;
            case "Simplicity":
                switch (OpponentRandomizer.RandomizeOpponentPy()) {
                    case "C":
                        String PySimpC = (Python.pythonCompare()[4] > C.cCompare()[4]) ? "You won" : "You lost";
                        System.out.println(PySimpC);
                        break;
                    case "PHP":
                        String PySimpPHP = (Python.pythonCompare()[4] > alfa.PHP.phpCompare()[4]) ? "You won" : "You lost";
                        System.out.println(PySimpPHP);
                        break;
                    case "Java":
                        String PySimpPython = (Python.pythonCompare()[4] > Java.javaCompare()[4]) ? "You won" : "You lost";
                        System.out.println(PySimpPython);
                        break;
                    case "JavaScript":
                        String PySimpJavaScript = (Python.pythonCompare()[4] > JavaScript.javaScriptCompare()[4]) ? "You won" : "You lost";
                        System.out.println(PySimpJavaScript);
                        break;

                }
                break;

        }

    }
    public static void ChoiceToBattleJS() {
        Scanner scan = new Scanner(System.in);
        String arg = scan.nextLine();
        switch (arg){
            case "Syntax":
                switch (OpponentRandomizer.RandomizeOpponentJS()) {
                    case "C":
                        String JSSyntaxC = (JavaScript.javaScriptCompare()[0] > C.cCompare()[0]) ? "You won" : "You lost";
                        System.out.println(JSSyntaxC);
                        break;
                    case "PHP":
                        String JSSyntaxPHP = (JavaScript.javaScriptCompare()[0] > alfa.PHP.phpCompare()[0]) ? "You won" : "You lost";
                        System.out.println(JSSyntaxPHP);
                        break;
                    case "Python":
                        String JSSyntaxPython = (JavaScript.javaScriptCompare()[0] > Python.pythonCompare()[0]) ? "You won" : "You lost";
                        System.out.println(JSSyntaxPython);
                        break;
                    case "Java":
                        String JSSyntaxJava = (JavaScript.javaScriptCompare()[0] > Java.javaCompare()[0]) ? "You won" : "You lost";
                        System.out.println(JSSyntaxJava);
                        break;

                }
                break;
            case "Usage":
                switch (OpponentRandomizer.RandomizeOpponentJS()) {
                    case "C":
                        String JSUsageC = (JavaScript.javaScriptCompare()[1] > C.cCompare()[1]) ? "You won" : "You lost";
                        System.out.println(JSUsageC);
                        break;
                    case "PHP":
                        String JSUsagePHP = (JavaScript.javaScriptCompare()[1] > alfa.PHP.phpCompare()[1]) ? "You won" : "You lost";
                        System.out.println(JSUsagePHP);
                        break;
                    case "Python":
                        String JSUsagePython = (JavaScript.javaScriptCompare()[1] > Python.pythonCompare()[1]) ? "You won" : "You lost";
                        System.out.println(JSUsagePython);
                        break;
                    case "Java":
                        String JSUsageJava = (JavaScript.javaScriptCompare()[1] > Java.javaCompare()[1]) ? "You won" : "You lost";
                        System.out.println(JSUsageJava);
                        break;

                }
                break;
            case "Speed":
                switch (OpponentRandomizer.RandomizeOpponentJS()) {
                    case "C":
                        String JSSpeedC = (JavaScript.javaScriptCompare()[2] > C.cCompare()[2]) ? "You won" : "You lost";
                        System.out.println(JSSpeedC);
                        break;
                    case "PHP":
                        String JSSpeedPHP = (JavaScript.javaScriptCompare()[2] > alfa.PHP.phpCompare()[2]) ? "You won" : "You lost";
                        System.out.println(JSSpeedPHP);
                        break;
                    case "Python":
                        String JSSpeedPython = (JavaScript.javaScriptCompare()[2] > Python.pythonCompare()[2]) ? "You won" : "You lost";
                        System.out.println(JSSpeedPython);
                        break;
                    case "Java":
                        String JSSpeedJava = (JavaScript.javaScriptCompare()[2] > Java.javaCompare()[2]) ? "You won" : "You lost";
                        System.out.println(JSSpeedJava);
                        break;

                }
                break;
            case "Security":
                switch (OpponentRandomizer.RandomizeOpponentJS()) {
                    case "C":
                        String JSSecC = (JavaScript.javaScriptCompare()[3] > C.cCompare()[3]) ? "You won" : "You lost";
                        System.out.println(JSSecC);
                        break;
                    case "PHP":
                        String JSSecPHP = (JavaScript.javaScriptCompare()[3] > alfa.PHP.phpCompare()[3]) ? "You won" : "You lost";
                        System.out.println(JSSecPHP);
                        break;
                    case "Python":
                        String JSSecPython = (JavaScript.javaScriptCompare()[3] > Python.pythonCompare()[3]) ? "You won" : "You lost";
                        System.out.println(JSSecPython);
                        break;
                    case "Java":
                        String JSSecJava = (JavaScript.javaScriptCompare()[3] > Java.javaCompare()[3]) ? "You won" : "You lost";
                        System.out.println(JSSecJava);
                        break;

                }
                break;
            case "Simplicity":
                switch (OpponentRandomizer.RandomizeOpponentJS()) {
                    case "C":
                        String JSSimpC = (JavaScript.javaScriptCompare()[4] > C.cCompare()[4]) ? "You won" : "You lost";
                        System.out.println(JSSimpC);
                        break;
                    case "PHP":
                        String JSSimpPHP = (JavaScript.javaScriptCompare()[4] > alfa.PHP.phpCompare()[4]) ? "You won" : "You lost";
                        System.out.println(JSSimpPHP);
                        break;
                    case "Python":
                        String JSSimpPython = (JavaScript.javaScriptCompare()[4] > Python.pythonCompare()[4]) ? "You won" : "You lost";
                        System.out.println(JSSimpPython);
                        break;
                    case "Java":
                        String JSSimpJava = (JavaScript.javaScriptCompare()[4] > Java.javaCompare()[4]) ? "You won" : "You lost";
                        System.out.println(JSSimpJava);
                        break;

                }
                break;

        }

    }



}
