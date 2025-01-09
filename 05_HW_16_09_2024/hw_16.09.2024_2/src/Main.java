/*
Angenommen, ein Benutzer gibt 3 ganze Zahlen ein. Ihr Programm muss das Maximum der eingegebenen Zahlen ermitteln.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie die erste Zahl ein:");
        int number1 = scanner.nextInt();

        System.out.println("Geben Sie die zweite Zahl ein:");
        int number2 = scanner.nextInt();

        System.out.println("Geben Sie die dritte Zahl ein:");
        int number3 = scanner.nextInt();

        // ------------------------------------------------

        boolean isMaxNumber1 = number1 >= number2 && number1 >= number3;  // true
        boolean isMaxNumber2 = number2 >= number1 && number2 >= number3;  // true

        // if () {} else if ()

        if (isMaxNumber1) {
            System.out.println(number1);
        } else if (isMaxNumber2) {
            System.out.println(number2);
        } else {
            System.out.println(number3);
        }


    }
}