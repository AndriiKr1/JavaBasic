public class Dog extends Pet {

    public Dog(String name, int height, int weight) {
        super(name,height,weight);
    }

    @Override
    public void say(){
        System.out.println(getName() + " гав!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + getName() + '\'' +
                ", height=" + getHeight() +
                ", weight=" + getWeight() +
                '}';
    }
}

