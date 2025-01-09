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

        if(money >= price) {
            int maxQuantity = (int) (money / price);
            System.out.println("Sie können " + productName + " in der Menge " + maxQuantity + " kaufen.");

            System.out.println("Wie viele Stück möchten Sie kaufen?");
            int desiredQuantity = scanner.nextInt();
// dry - do not repeat yourself
            double realQuantity;
            if (desiredQuantity <= maxQuantity) {
                realQuantity = desiredQuantity;
            } else {
                realQuantity = maxQuantity;
                System.out.println("Sie können nicht kaufen " + desiredQuantity + " pcs.");
            }
            double totalCost = realQuantity * price;
            double change = money - totalCost;
            System.out.println("Ihr Einkauf: " + totalCost + " für " + realQuantity + " pcs.");
            System.out.println("Aufgeben: " + change);
        }else {
            System.out.println("Sie können das Produkt nicht kaufen " + productName);
            //double addMoney = Math.round(  (price - money)*100  ) /100.0 ;
            double addMoney = price - money;
            System.out.println("Wir müssen Folgendes hinzufügen" + addMoney);
        }
    }
}