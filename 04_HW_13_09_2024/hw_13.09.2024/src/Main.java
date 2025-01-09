/*
Schreiben Sie ein Programm, das: den Namen eines Produkts abfragt. den Preis des Artikels abfragt. Sie auffordert, den Geldbetrag einzugeben.
Je nach Höhe des Geldbetrags sollte Ihr Programm entweder „Sie können diesen Artikel kaufen“ oder „Sie haben nicht genug Geld“ ausgeben.
~~~
Geben Sie den Namen des Artikels ein:
Pizza
Geben Sie den Preis für das Produkt Pizza ein:
2.59
Geben Sie den Geldbetrag ein:
10
Sie können das Produkt pizza kaufen
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie den Produktnamen ein: ");
        String productName = scanner.nextLine();

        System.out.println("Geben Sie den Preis des Artikels ein: ");
        double price = scanner.nextDouble();

        System.out.println("Geben Sie den Geldbetrag ein: ");
        double money = scanner.nextDouble();

        if(money >= price){
            System.out.println("Sie können " +productName +" kaufen.");
        } else {
            System.out.println("Sie haben nicht genug Geld.");

        }
    }
}