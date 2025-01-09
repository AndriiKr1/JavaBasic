import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = 1;
        int counter = 0;
        int summa = 0;

        while (inputNumber != 0) {
            System.out.println("Geben Sie eine Zahl ein oder 0, um das Programm zu beenden:");
            inputNumber = scanner.nextInt();
            summa += inputNumber;           // summa = summa + inputNumber;
            if (inputNumber % 2 == 0) {     // если введенное число делится на 2
                counter++;                  // counter+=1; // counter=counter+1;
            }
            System.out.println("Eingegebene Zahl: " + inputNumber);
        }
        System.out.println("Es wurden " + (counter - 1) + " gerade Zahlen eingegeben.");        // -1 исключает 0
        System.out.println("Summe der eingegebenen Zahlen: " + summa);
    }
}
