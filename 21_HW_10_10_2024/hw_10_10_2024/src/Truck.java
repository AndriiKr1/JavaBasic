public class Truck extends Vehicle {
    private double capacity;

    public Truck(long id, String number, String brand, int year, double capacity) {
        super(id, number, brand, year);
        this.capacity = capacity;
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("   Повезли " + capacity + "т. груза");
    }
}

