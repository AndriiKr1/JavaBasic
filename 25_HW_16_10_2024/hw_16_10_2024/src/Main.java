public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Понедельник начинается в субботу", 1965,
                new Author("Борис", "Стругацкий", 1933),
                new Author("Аркадий", "Стругацкий", 1925)
        );


        Book book2 = new Book("Трудно быть богом", 1965,
                new Author("Борис", "Стругацкий", 1933),
                new Author("Аркадий", "Стругацкий", 1925)
        );

        Book book3 = new Book("Жизнь насекомых", 1993,
                new Author("Виктор", "Пелевин", 1962)
        );

        Book book4 = new Book("Чапаев и пустота", 1996,
                new Author("Виктор", "Пелевин", 1962)
        );

        Book book5 = new Book("Мастер и Маргарита", 1929,
                new Author("Михаил", "Булгаков", 1891)
        );

        BookList bookList = new BookList();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);

        System.out.println(bookList);
        System.out.println(bookList.get(10));

        System.out.println(bookList.findBookByAuthorLastName("Стругацкий"));

    }
}
