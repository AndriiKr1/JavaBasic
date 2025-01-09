/*
Verwenden Sie eine While-Schleife, um ein Programm zu schreiben,
das den Benutzer auffordert, Zahlen einzugeben,
bis der Benutzer 0 eingibt.
Das Programm soll die Anzahl der eingegebenen Zahlen zählen und anzeigen.
*/

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber =1;     // Startwert, um die Schleife zu starten
        int counter=0;          // Zähler für die Anzahl der eingegebenen Zahlen
        while (inputNumber!=0){
            System.out.println("Geben Sie eine Zahl ein oder 0, um das Programm zu beenden:");
            inputNumber = scanner.nextInt();
            if (inputNumber!=0) {
                counter++;      //counter+=1; //counter=counter+1;  // Erhöhen des Zählers
            }
            System.out.println("Eingegebene Zahl: " + inputNumber );
        }
        System.out.println("Insgesamt eingegebene Zahlen: "+counter);

    }
}
