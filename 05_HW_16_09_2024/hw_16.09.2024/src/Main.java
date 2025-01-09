/*
Angenommen, wir haben ein Gerät mit zwei Kolben. Das Programm kennt den Wert der Temperaturen in jedem der Kolben.
Nehmen wir an, dass sie durch 2 Variablen Kolben1 und Kolben2 festgelegt werden.
Es wird davon ausgegangen, dass das Gerät korrekt funktioniert, wenn die Temperatur in einem der Kolben zwischen 20 und 40 Grad liegt,
und die Temperatur im anderen Kolben größer als 75 Grad ist. Schreiben Sie ein Programm, das feststellt, ob das Gerät richtig funktioniert.
 */
public class Main {
    public static void main(String[] args) {
        double flask1=65;
        double flask2=100;
        // -------------------------------------------------------

        boolean isDeviceCorrect = (flask1>20 && flask1<40 && flask2>75) || (flask2>20 & flask2<40 & flask1>75);
        if (isDeviceCorrect){
            System.out.println("good!");
        } else {
            System.out.println("alarm!");
        }


    }
}