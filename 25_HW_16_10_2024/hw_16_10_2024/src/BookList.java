public class BookList {
    private Book[] array;
    private int size;

    public BookList(){
        array = new Book[16];
        size = 0;
    }

    public void add(Book book){
        if (size>= array.length){
            enlarge();
        }
        array[size++] = book;
    }

    private void enlarge(){
        Book[] newArray = new Book[array.length * 2];

        for (int i = 0; i < array.length ; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(array[i]).append(System.lineSeparator());
        }
        return sb.toString();
    }

    public Book get(int index){
        if(index<0 || index>=size){
            return null;
        } else {
            return array[index];
        }
    }

    public BookList findBookByAuthorLastName(String nameString){
        BookList result = new BookList();

        for (int i = 0; i < size ; i++) {
            Author[] authors = array[i].getAuthors();

            for (int j = 0; j < authors.length ; j++) {
                if(authors[j].getlName().equals(nameString)){
                    result.add(array[i]);
                    break;
                }
            }
        }

        return result;
    }


}
