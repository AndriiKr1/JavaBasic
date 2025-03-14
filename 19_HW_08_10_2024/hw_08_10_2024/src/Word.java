public class Word {
    private String value;
    private String translation;
    private String description;
    private String example;

    public Word(String value, String translation) {
        this(value, translation,"","");
    }


    public Word(String value, String translation, String description) {
        this(value,translation,description, "");
    }

    public Word(String value, String translation, String description, String example) {
        this.value = value;
        this.translation = translation;
        this.description = description;
        this.example = example;
    }



    public  String toString(){
        String str = String.format("Слово: %s; Перевод: %s;",value, translation);
        str+= description.equals("") ? "" : " Описание:"+description;
        str+= example.equals("") ? "" : " Пример:" + example;
        return  str;
    }

    public String getValue() {
        return value;
    }

    public String getTranslation() {
        return translation;
    }

    public void setDescription(String description) {
        if (description==null){
            this.description = "";
        } else {
            this.description = description;
        }
    }

    public void setExample(String example) {
        this.example = example==null? "" : example;
    }
}
