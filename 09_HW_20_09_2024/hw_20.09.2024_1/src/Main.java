/*
Реализовать метод calcPercent(amount, percent) , который принимает 2 параметра:
amount - сумма операции
percent - процентная ставка
в качестве результата метод должен возвращать число, составляющее заданный процент (percent) от суммы (amount)
Вызовите ваш метод с разными данными.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        runApplication(scanner);
        scanner.close();
    }
    public static void runApplication(Scanner scanner){
        while (true) {
            System.out.println("Введите сумму:");
            double amount = scanner.nextDouble();
            if(amount==0){
                return;  //break;
            }

            System.out.println("Введите процент:");
            double percent = scanner.nextDouble();

            double result = calcPercent(amount, percent);
            print(amount, percent, result);
        }
    }

    public static double calcPercent(double amount, double percent) {
        double result = amount * percent / 100;
        return result;
    }

    public static void print(double amount, double percent, double result) {
        String percentNoun = "";
        if (percent % 10 == 1) {
            percentNoun = "процент";
        } else if (percent % 10 == 2 || percent % 10 == 3 || percent % 10 == 4) {
            percentNoun = "процента";
        } else if (percent % 10 == 0 || percent % 10 == 5 || percent % 10 == 6 || percent % 10 == 7 ||
                percent % 10 == 8 || percent % 10 == 9) {
            percentNoun = "процентов";
        } else {
            percentNoun = "процента";
        }
        System.out.printf("%.1f %s от %.2f будет %.2f%n", percent, percentNoun, amount, result);
        System.out.println("_____________________________________");
    }
}
