public class Pet {
    private String name;
    private int height;
    private int weight;

    public Pet(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void eat(){
        System.out.println(name + " ням!");
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }


    public void say(){
        System.out.println("ha-ha");
    };


}
