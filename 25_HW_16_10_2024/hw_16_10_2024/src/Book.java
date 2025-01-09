public class Book {
    private String title;
    private Author[] authors;
    private int year;

    /*public Book(String title, Author[] authors, int year) {
        this.title = title;
        this.authors = authors;
        this.year = year;
    }

    public Book(String title, int year, Author author ) {
        this.title = title;
        this.authors = new Author[1];
        this.authors[0] = author;
        this.year = year;
    }*/



    public Book(String title, int year, Author... authors) {
        this.title = title;
        this.authors = authors;
        this.year = year;
    }



    @Override
    public String toString(){
        return String.format("\"%s\" %s (год издания: %d)", title, authorsToString(),year );
    }

    public Author[] getAuthors() {
        return authors;
    }

    private String authorsToString(){
        if(authors==null){
            return "";
        } else if (authors.length==1) {
            return "автор: " + authors[0].toStringShort();
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <authors.length ; i++) {
                sb.append(authors[i].toStringShort()).append(',');
            }
            sb.setLength(sb.length()-1);
            return "авторы:" +sb.toString();
        }



    }





}

