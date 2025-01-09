public class Bus extends Vehicle {
    private int capacity;

    public Bus(long id, String number, String brand, int year, int capacity) {
        super(id, number, brand, year);
        this.capacity = capacity;
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("   Повезли " + capacity + " человек");
    }
}
