/*
Создайте класс Pet (домашний питомец). В этом классе должно быть 4 поля имя, тип (собака, кот ….), возраст, цвет. Необходимо иметь возможность  создавать объекты Pet указывая цвет и не указывая цвет.
Реализуйте метод toString. В Main создайте массив животных. Напишите несколько методов:
метод, который печатает весь массив Pets
метод, который выводить  только питомцев заданного типа
Немного сложнее: метод, который создает и возвращает массив из питомцев, старше заданного возраста.
Подсказка: метод должен создать новый массив из питомщев, но для этого, нужно определить его размер т.е. сосчитать всех питомцев, которые подходят под условие, далее создать массив и  записать туда питомцев.

 */
public class Main {
    public static void main(String[] args) {
        Pet[] pets = new Pet[]{
                new Pet("Bob", "dog",10,"черный"),
                new Pet("Tom", "cat",3,"черный"),
                new Pet("Jack", "dog",5,"серый"),
                new Pet("Mike", "mouse",1,"серый"),
        };
        printPets(pets);
        System.out.println("-----------------------------");
        printPets(pets, "cat");

        System.out.println("--------------------------");
        Pet[] pets1 = arrayPetsByAge(pets,2);
        printPets(pets1);


    }

    public static void printPets(Pet[] pets){
        for(int i=0; i<pets.length;i++){
            System.out.println(pets[i]);
        }
    }

    public static void printPets(Pet[] pets, String type){
        for(int i=0; i<pets.length;i++){
            if ( pets[i].type.equalsIgnoreCase(type)   ) {
                System.out.println(pets[i]);
            }
        }
    }


    public static int countPetsByAge(Pet[] pets, int age){
        int counter = 0;
        for(int i=0; i<pets.length;i++){
            if ( pets[i].age > age   ) {
                counter++;
            }
        }
        return counter;
    }

    public static Pet[] arrayPetsByAge(Pet[] pets, int age){
        int quantityOfPets = countPetsByAge(pets,age);
        if (quantityOfPets>0) {
            Pet[] result = new Pet[quantityOfPets];
            int j = 0;
            for (int i = 0; i < pets.length; i++) {
                if (pets[i].age > age) {
                    result[j++] = pets[i];
                }
            }
            return result;
        } else {
            return null;
        }

    }



}
