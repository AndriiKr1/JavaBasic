import java.util.Scanner;

/*
Erstellen Sie ein neues Modul.
Ihr Programm soll den Benutzer nach dem Preis des Produkts fragen.
Die Steuer soll 19 Prozent betragen. Ihr Programm soll berechnen
die Steuer und den Preis mit Steuer berechnen und anzeigen:
 */
public class Main {
    public static void main(String[] args) {
        int taxRate = 19;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie den Preis des Produkts ein: ");
        double price = scanner.nextDouble();

        double tax = price*taxRate/100;
       double taxWithRate = price+tax;
        System.out.println("Preis der Waren: " + price);
        System.out.println("Steuer : " + taxRate + "% "+ "ist: " +tax);
        System.out.println("Preis der Waren mit Steuer: "+taxWithRate);
    }
}