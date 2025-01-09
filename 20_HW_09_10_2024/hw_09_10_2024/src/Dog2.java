public class Dog2 extends Pet {

    public Dog2(String name, int height, int weight) {
        super(name,height,weight);
    }

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

