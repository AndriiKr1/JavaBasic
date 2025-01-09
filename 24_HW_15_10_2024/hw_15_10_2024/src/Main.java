public class Main {
    /*
    Создайте класс Card (банковская карта) У карты должен быть номер, и строковое поле - имя владельца. Пример: номер 123456789637 имя: Jack Smith Реализуйте метод secureToString который сформирует строку вида

1234********  Jack S.
т.е. первые 4 цифры номера, вместо оставшихся цифр звездочки + first name + первый символ last name
     */
    public static void main(String[] args) {
        Card card = new Card("1234567890", "Jack Smith");
        System.out.println(card);
    }
}
