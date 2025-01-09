/*
Schreiben Sie ein Programm, das den Benutzer zur Eingabe einer Monatsnummer auffordert und den Namen des eingegebenen Monats ausgibt:
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Geben Sie die Nummer des Monats ein [1-12]: ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        //----------------------------------------------------------------
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "Januar";
                break;
            case 2:
                monthName = "Februar";
                break;
            case 3:
                monthName = "März";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "Mai";
                break;
            case 6:
                monthName = "Juni";
                break;
            case 7:
                monthName = "Juli";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "Oktober";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "Dezember";
                break;
            default:
                monthName = "kein solcher Monat";
        }
        // -------------------------------------------------
        System.out.print("Monat Nummer " + month + ": ");
        System.out.println(monthName);
    }
}
