import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
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

        if (choice.equalsIgnoreCase("Java")){
            OpponentRandomizer.RandomizeOpponentJava();
            System.out.println("What do you think you're better at? Syntax/Usage/Speed/Security/Simplicity");
            String arg = scan.nextLine();
        }








    }






}
