public class Pet {
    String name;
    String type;
    int age;
    String color;


    public Pet(String name, String type, int age, String color) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.color = color;
    }

    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.color = "";
    }

    public String toString(){
        return String.format( "Имя:%s Тип:%s Возраст:%d Цвет:%s", name,type,age,color );
    }
}
