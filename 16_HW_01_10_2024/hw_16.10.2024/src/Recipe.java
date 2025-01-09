public class Recipe {
    String title;
    int coffee;
    int milk;
    int water;

    public Recipe(String title, int coffee, int milk, int water) {
        this.title = title;
        this.coffee = coffee;
        this.milk = milk;
        this.water = water;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "title='" + title + '\'' +
                ", coffee=" + coffee +
                ", milk=" + milk +
                ", water=" + water +
                '}';
    }
}

