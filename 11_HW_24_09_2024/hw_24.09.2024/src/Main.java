/*
 Задание 1
        Ваша программа должна:
        1) предлагать пользователю ввести 5 имен,
        2) вывести список всех имен введенных пользователем
        3) запросить у пользователя имя для поиска
        4) вывести, сколько раз заданное пользователем имя встречается во введенном списке


        Задание 2
        Пользователь вводит массив String. Ваша задача написать метод, который определит, есть ли в этом массиве два одинаковых
        **рядом стоящих** элемента. Например:
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("hell\no ja\tva!");

        Scanner scanner = new Scanner(System.in);
        String[] names = inputNames(scanner,5);
        System.out.println("-------------------------------------------");
        printAllNames(names);

        System.out.println("введите имя для поиска: ");
        String findName = scanner.nextLine();
        System.out.printf("Имя %s встречается в списке %d раз %n",findName,countNameUsage(names,findName)  );


        /*
        if (checkAdjacentDuplicates(names)){
            System.out.println("присутствуют рядом стоящие повторы");
        } else  {
            System.out.println("рядом стоящих повторов нет");
        }

         */
        System.out.println( checkAdjacentDuplicates(names)? "присутствуют рядом стоящие повторы": "рядом стоящих повторов нет"       );

        scanner.close();
    }

    public static String[] inputNames(Scanner scanner, int size){

        String[] names = new String[size];
        System.out.println("Введите " + names.length + " имен");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Введите имя" + (i+1) +": ");
            names[i] = scanner.nextLine();
        }

        return names;
    }

    public static void printAllNames(String[] names){
        for (int i=0; i<names.length; i++){
            System.out.printf("[%d] %s      ", (i+1),names[i]);   // [0] jack    [1] lena    [2] olga ......
        }
        System.out.println();
    }

    public static int countNameUsage(String[] names, String findName){
        int counter = 0;
        for (int i=0; i < names.length; i++){
            if (names[i].equalsIgnoreCase(findName)){
                counter++;
            }
        }
        return counter;
    }

    public static boolean checkAdjacentDuplicates(String[] names){

        for (int i=1; i<names.length; i++){
            if (names[i-1].equalsIgnoreCase(names[i])){
                return true;
            }

        }
        return false;
    }

    public static boolean checkAdjacentDuplicates2(String[] names){

        for (int i=0; i<names.length-1; i++){
            if (names[i+1].equalsIgnoreCase(names[i])){
                return true;
            }

        }
        return false;
    }


}
