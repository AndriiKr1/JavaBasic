import java.util.Scanner;

/*
Задача 3
Давайте напишим небольшой англо-русский (или англо-немецкий, или немецко-украинский ….. выберете сами) словарь.
Создайте класс Word. В нем должно быть 2 поля:
слово
значение (перевод)
Создайте класс Dictionary (словарь), который должен содержать поле - массив слов.
(Кстати, массив слов можно передать в конструкторе класса Dictionary или задать прямо в классе, как мы делали на уроке с рецептами).
Вы можете написать два метода 1) метод который ищет перевод по заданному слову 2) мето, который ищет слово, по заданному переводу.
Все, что вам остается, реализовать диалог с пользователем, где ему предлагается выбрать направление перевода и ввести слово для перевода. Система должна либо вывести перевод, либо сказать, что такого слова в словаре нет.

 */
public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.add(new Word("shop","магазин"));
        dictionary.add(new Word("phone","телефон"));
        dictionary.add(new Word("five","пять","qweqwe qwe"));
        dictionary.add(new Word("one","один"));
        System.out.println(dictionary.translation("one"));

        System.out.println(dictionary);


        Word[] words = {
                new Word("dog", "собака"),
                new Word("cat", "кот"),
                new Word("book", "книга", "'описание слова книга'"),
                new Word("table", "стол", "'описание слова стол'", "'пример'")
        };
        Dictionary dictionary2 = new Dictionary(words);
        dictionary2.add(new Word("word", "слово"));
        System.out.println(dictionary2);

        dictionary2.changeWordCard("dog","decription for dog", "Dog");
        System.out.println(dictionary2);
        dictionary2.changeDescription("dog", "description for dog");
        System.out.println(dictionary2);

        /*
        Word word = new Word("qwe", "йцу");
        word.setExample("kh;kh;");
*/
      /*
        Scanner scanner = new Scanner(System.in);
        Word[] words = {
                new Word("dog", "собака"),
                new Word("cat", "кот"),
                new Word("book", "книга"),
                new Word("table", "стол")
        };
        Dictionary dictionary = new Dictionary(words);



        int mode=1;

        while (true) {
            System.out.println("Выберите режим работы:\n '1'. прямой \n '2'. обратный \n '3'. все слова \n '0'. завершить программу");
            mode = scanner.nextInt();
            scanner.nextLine(); //очистить поток ввода
            if (mode==0) break;
            String word="";
            if (mode==1){
                System.out.println("Введите слово:");
                word = scanner.nextLine();
                System.out.println("Перевод:" + dictionary.translation(word));
            } else if (mode==2){
                System.out.println("Введите перевод:");
                word = scanner.nextLine();
                System.out.println("Слово:" + dictionary.getWordByTranslation(word));
            } else if(mode==3){
                System.out.println("Текущий словарь:");
                System.out.println(dictionary);
            }
            System.out.println("-----------------------------------------------------------");
        }

       */
    }

}
