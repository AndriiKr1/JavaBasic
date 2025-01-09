/*
Вам необходимо реализовать 2 метода:
Первый метод, который позволяет пользователю ввести 5 имен, и создает массив с этими именами.
Второй метод должен вывести все имена начиная с последнего введенного заканчивая первым введенным.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {                    // метод main
        String[] array = inputArrayFromScanner(3);
        System.out.println();
        printArrayReversOrder(array);

    }

    // комментарий  ctrl+shift+/

    public static String[] inputArrayFromScanner(int quantity){   // метод inputArrayFromScanner возвращает массив строк, quantity - параметр метода
        Scanner scanner = new Scanner(System.in);                 // создаем Scanner
        String[] names = new String[quantity];                    // создаем массив строк, имя names, количество ячеек quantity

        for (int i=0; i<names.length; i++){    // i   j           // перебираем ячейки массива    0 < i < длинна массива
            System.out.printf("Введите имя №%d:",i+1);              // на каждом шаге: выводим запрос
            names[i] = scanner.nextLine();                        // заполняем i-тую ячейку
        }

        return names;                                             //
    }

    public static void printArrayReversOrder(String[] array){
        for (int i= array.length - 1; i>=0; i--){
            System.out.printf("[%d] = %s%n", i, array[i] );
        }

    }



}
