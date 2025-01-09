import java.util.Scanner;
/*
Angenommen, der Benutzer gibt zwei Zahlen ein: a und b.
Verwenden Sie Schleifen, um den Wert von a hoch b zu berechnen.
*/
public class Main {
    public static void main(String[] args) {
        //long qwe = 4_611_686_018_427_387_904L;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie eine ganze Zahl ein: ");
        int a = scanner.nextInt();

        System.out.println("Geben Sie die Potenz ein, in die die Zahl erhoben werden soll: ");
        int b = scanner.nextInt();

        //-----------------------------------------------------------------------

        long result = 1;
        for (int counter = 0; counter < b; counter += 1) {
            result *= a;
        }

        System.out.printf("%d hoch %d ergibt %d%n", a, b, result);

        //System.out.println( a + " hoch " + b + " ergibt " + result);
        /* printf
            %d - целое число
            %f - дробное число
            %s - строка
            %n - перенос строки
         */
    }
}
