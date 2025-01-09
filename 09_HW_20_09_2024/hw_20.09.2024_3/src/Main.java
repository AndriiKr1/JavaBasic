import java.util.Scanner;

/*
Дано целое число num. Необходимо написать метод, который выводит на экран таблицу умножения num  до 10.
Например, если num=3 то вывод должен быть таким
 */
public class Main {

    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();
        printTable(number);

         */
        for (int j= 1; j<=10; j+=1){
            System.out.println("--------------- " + j + " -------------");
            printTable(j);
            System.out.println();
        }
    }

    public static void printTable (int number){

        for (int i = 1; i<=10; i=i+1){
            System.out.printf("%d*%d=%d%n",number,i,number*i);
        }

    }


}

