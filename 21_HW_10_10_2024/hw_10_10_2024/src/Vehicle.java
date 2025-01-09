public class Vehicle {

    long id;
    private String number;
    private String brand;
    private int year;

    public Vehicle(long id, String number, String brand, int year) {
        this.id = id;
        this.number = number;
        this.brand = brand;
        this.year = year;
    }

    public long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }


    public void drive(){
        System.out.printf("%d. %s №%s поехал%n",id,brand,number);
    }



}
