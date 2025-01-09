import java.util.Date;
import java.util.Scanner;

public class Main {
    /*
    Пусть пользователь вводит 3 целых числа: день, месяц и год.
    Ваша программа должна определить, могут ли эти числа составлять дату. Например:
        10.3.2024 - да
        32.3.2024 - нет
        29.2.2021 - нет
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день:");
        int day=scanner.nextInt();
        System.out.println("Введите месяц:");
        int month=scanner.nextInt();
        System.out.println("Введите год:");
        int year=scanner.nextInt();


        MyDate d1 = new MyDate(day,month,year);
    }
}
