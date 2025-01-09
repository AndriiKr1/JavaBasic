/*
Verwenden Sie eine While-Schleife, um ein Programm zu schreiben,
das einen "Countdown" auf dem Bildschirm anzeigt.
 */
public class Main {
    public static void main(String[] args) {
        int counter = 5; // Startwert
        while (counter > 0) { // Bedingung
            System.out.println(counter);
            counter--; // Schritt (counter = counter - 1)
        }
        System.out.println("Los geht's!!!!"); // Ausgabe nach dem Countdown
    }
}
