/*
Angenommen, wir haben ein Gerät mit zwei Kolben. Das Programm kennt den Wert der Temperaturen in jedem der Kolben.
Nehmen wir an, dass sie durch 2 Variablen Kolben1 und Kolben2 festgelegt werden.
Es wird davon ausgegangen, dass das Gerät korrekt funktioniert, wenn die Temperatur in
einer der Küvetten im Bereich von 20 bis 40 Grad liegt und die Temperatur in der anderen Küvette die Temperatur der ersten Küvette um nicht mehr als 20 Grad überschreitet.
des ersten Kolbens um mehr als 20 Grad.
Schreiben Sie ein Programm, das feststellt, ob das Gerät korrekt arbeitet.
 */
public class Main {
    public static void main(String[] args) {
        double flask1 = 39;
        double flask2 = 90;
        // --------------------------------------------
        boolean isDeviceCorrect = (flask1 > 20 && flask1 < 40 && flask2 <= flask1 + 20) ||
                (flask2 > 20 && flask2 < 40 && flask1 <= flask2 + 20);


        if (isDeviceCorrect) {
            System.out.println("good");
        } else {
            System.out.println("alarm");
        }
    }
}