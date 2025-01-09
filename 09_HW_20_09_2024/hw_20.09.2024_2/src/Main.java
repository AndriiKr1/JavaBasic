/*
## Задание 2
Реализуйте метод, который получает в качестве параметров число (a) и строку (str), и выводит на экран
эту строку a раз.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int a=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        printString(a, str);
    }

    public static void printString(int a, String str){

        for (int i = 0; i<a; i=i+1){
            System.out.println(str);
        }

    }

}
