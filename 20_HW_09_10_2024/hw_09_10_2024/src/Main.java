public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Bobik", 50, 10);
        Cat cat = new Cat("Tom", 20, 6);
        Pig pig = new Pig("Pepa", 30, 8);
        Pet pet = new Dog("Sharik", 20,6);

        dog.say();
        cat.say();
        pet.say();
        System.out.println("--------");
        //pet = pig;
        //pet.say();

        Cow cow = new Cow("MuMu", 150,150);
        System.out.println(cow.toString());



 /*
        qwe = cat;

        Pets pets = new Pets();
        pets.add(dog);
        pets.add(new Dog("Reks",75,20));
        pets.add(new Cat("Murka",15,3));
        pets.add(pig);
        pets.add(cat);

        System.out.println(pets);


        for (int i = 0; i< pets.size(); i++){
            System.out.println(pets.get(i).getName());
        }

        for (int i = 0; i< pets.size(); i++){
            pets.get(i).eat();
        }

/*
        Pet[] pets = new Pet[]{dog,cat,pig};
        for (int i=0; i< pets.length; i++ ){
            System.out.println(pets[i]);
        }

        for (int i=0; i< pets.length; i++ ){
            pets[i].eat();
            pets[i].say();
        }

 */
    }
}
