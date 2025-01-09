/*
Angenommen, wir haben ein Gerät mit drei Kolben. Das Programm kennt die Werte der Temperaturen in jedem der Kolben.
Nehmen wir an, dass sie durch 3 Variablen Kolben1, Kolben2 und Kolben3 festgelegt werden. Das Gerät arbeitet korrekt, wenn die folgenden Bedingungen erfüllt sind.
die folgenden Bedingungen:
- Die Temperatur in einem der Kolben überschreitet nicht den vom Benutzer eingestellten Wert.
- Die Temperatur in einer der Küvetten ist gleich der Summe der Temperaturen der beiden anderen Küvetten.
- keine zwei Kolben haben die gleiche Temperatur.
Schreiben Sie ein Programm, das feststellt, ob das Gerät korrekt arbeitet.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double flask1 = 20;
        double flask2 = 20;
        double flask3 = 20;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die Höchsttemperatur ein: ");
        double maxTemperature = scanner.nextDouble();

        boolean condition1 = flask1 < maxTemperature && flask2 < maxTemperature && flask3 < maxTemperature;
        boolean condition2 = (flask1 == flask2 + flask3) || (flask2 == flask1 + flask3) || (flask3 == flask1 + flask2);
        boolean condition3 = (flask1 != flask2) && (flask1 != flask3) && (flask2 != flask3);

        if (condition1 && condition2 && condition3) {
            System.out.println("good");
        } else {
            System.out.println("alarm!");
        }
    }

}