public class Author {
    private String fName;
    private String lName;
    private int year;

    public Author(String fName, String lName, int year) {
        this.fName = fName;
        this.lName = lName;
        this.year = year;
    }


    @Override
    public String toString() {
        return String.format("%s %s %d", fName,lName,year);
    }


    public String toStringShort() {
        return String.format("%s.%s", fName.charAt(0),lName);
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }
}
