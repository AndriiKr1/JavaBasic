import java.util.Scanner;

public class CoffeeMachine {
    String title;
    int water = 0;
    int coffee = 0;
    int milk = 0;

    final int MAX_WATER = 1000;
    final int MAX_COFFEE = 500;
    final int MAX_MILK = 500;
    final Scanner SCANNER = new Scanner(System.in);

    Recipe[] recipes = {
            new Recipe("капучино", 30,150,100),
            new Recipe("Эспрессо", 30,0,50),
            new Recipe("Латте", 40,300,50)
    };

    public CoffeeMachine(String title){
        this.title = title;
    }

    public String toString(){
        return String.format("Кофе машина: %s Кофе: %dг.  Вода: %dмл. Молоко: %dмл.", title, coffee, water,milk);
    }

    public void addCoffee(int coffee){
        //1. if
        /*
        if (this.coffee + coffee > MAX_COFFEE){
            this.coffee = MAX_COFFEE;
        } else {
            this.coffee = this.coffee + coffee;
        }
        */

        // 2. тернарный оператор
        // this.coffee = this.coffee + coffee > MAX_COFFEE ? MAX_COFFEE : this.coffee + coffee ;

        // 3. используя Math.min
        this.coffee = Math.min(this.coffee + coffee, MAX_COFFEE);

    }

    public void addWater(int water) {
        this.water = Math.min(this.water + water, MAX_WATER);
    }

    public void addMilk(int milk) {
        this.milk = Math.min(this.milk + milk, MAX_MILK);
    }

    public void makeCoffee(){
        makeCoffee(new Recipe("Кофе из первой задачи", 30,50,100));
    }

    public void makeCoffee(Recipe recipe){
        int coffee = recipe.coffee;
        int milk = recipe.milk;
        int water = recipe.water;

        boolean isCoffeeWaterMilkEnough = this.coffee>=coffee && this.water >= water && this.milk >= milk;
        if (isCoffeeWaterMilkEnough){  // готовим кофе
            System.out.println("Готовим кофе " + recipe.title);
            System.out.printf("Добавляем %dг. кофе%n",coffee);
            System.out.printf("Добавляем %dмл. воды%n",water);
            System.out.printf("Добавляем %dмл. молока%n",milk);
            this.coffee -=coffee;
            this.water -=water;
            this.milk -=milk;
            System.out.println("Кофе готов");
        } else { // не можем приготовить кофе
            System.out.println("На приготовление кофе " + recipe.title + " нет ресурсов:");
            if (this.coffee<coffee){
                System.out.printf("Добавьте кофе, необходимо %d г. сейчас в машине %d г.%n", coffee, this.coffee);
            }
            if (this.water<water){
                System.out.printf("Добавьте воды, необходимо %d мл. сейчас в машине %d мл.%n", water, this.water);
            }
            if (this.milk<milk){
                System.out.printf("Добавьте молока, необходимо %d мл. сейчас в машине %d мл.%n", milk, this.milk);
            }
        }
    }

    public Recipe menu(){
        System.out.println("Выберите номер кофе:");
        for (int i=0; i<recipes.length; i++ ){
            System.out.printf("%d. %s%n",(i+1), recipes[i].title);
        }
        int selectedRecipe= SCANNER.nextInt()-1;
        return recipes[selectedRecipe];
    }

}

