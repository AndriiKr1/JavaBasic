public class Cat extends Pet{


    public Cat(String name, int height, int weight) {
        super(name,height,weight);
    }



    public void say(){
        System.out.println(getName() + " мяу!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", height=" + getHeight() +
                ", weight=" + getWeight() +
                '}';
    }
}

