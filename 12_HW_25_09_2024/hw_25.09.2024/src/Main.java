/*
Напишите метод, который получает массив строк, и два индекса (index1 и index2). Метод должен менять местами строки
с соответствующими индексами
 */

public class Main {
    public static void main(String[] args) {
        String[] array = new String[5];
        array[0] = "Jack1";
        array[1] = "Jack2";
        array[2] = "Jack3";
        array[3] = "Jack4";
        array[4] = "Jack5";
        System.out.println("Массив до работы метода:");
        print(array);
        swap(array, 2, 4);
        System.out.println("После работы метода:");
        print(array);
        swap(array, -2, 9);
        System.out.println("");
        print(array);

        System.out.println("----------------- primitive type ---------");
        int a= 10;
        int b = 20;
        System.out.printf("1) до метода: a = %d; b = %d%n ", a,b);
        swap(a,b);

        System.out.printf("4) после метода: a = %d; b = %d%n ", a,b);

    }

    public static void swap(String[] strings, int index1, int index2) {
        if (index1 != index2 && index1 >= 0 && index2 >= 0 && index1 < strings.length && index2 < strings.length) {
            String temp = strings[index1];
            strings[index1] = strings[index2];
            strings[index2] = temp;
        }
    }

    public static void print(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%d]: %s%n", i, array[i]);
        }
    }


    public static void swap(int a, int b){
        System.out.printf("2) старт метода: a = %d; b = %d%n ", a,b);
        int temp = a;
        a = b;
        b = temp;
        ////a=1000;
        System.out.printf("3) финиш метода: a = %d; b = %d%n ", a,b);
    }


}




