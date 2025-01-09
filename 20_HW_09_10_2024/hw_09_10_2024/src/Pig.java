public class Pig extends Pet {


    public Pig(String name, int height, int weight) {
        super(name,height,weight);
    }


    /*
    public void say(){
        System.out.println(getName() + " хрю!");
    }

     */

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + getName() + '\'' +
                ", height=" + getHeight() +
                ", weight=" + getWeight() +
                '}';
    }
}
