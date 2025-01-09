public class Dictionary {
    private Word[] words;
    private int size = 0;

    public Dictionary(Word[] words) {
        this.words = words;
        size= words.length;
    }

    public Dictionary(){
        this.words = new Word[3];
    }

    public void add(Word word){
        if (size>= words.length){
            // увеличить массив
            enlarge();
        }

        words[size++] = word;
    }

    private void  enlarge(){
        Word[] newArray = new Word[words.length*2];

        // скопировать элементы
        for (int i = 0; i< words.length; i++){
            newArray[i] = words[i];
        }

        words = newArray;
    }

    public String translation(String value){
        for (int i = 0; i<size; i++){
            if (words[i].getValue().equalsIgnoreCase(value)){
                return words[i].getTranslation();
            }
        }
        return "";
    }

    public String getWordByTranslation(String translation){
        for (int i = 0; i<size; i++){
            if (words[i].getTranslation().equalsIgnoreCase(translation)){
                return words[i].getValue();
            }
        }
        return "";
    }

    public String toString(){
        String result="";
        for (int i = 0; i < size; i++) {
            result+= words[i]+ System.lineSeparator();  // \n
        }
        return result;
    }

    public Word find(String value){
        for (int i = 0; i<size; i++ ){
            if (words[i].getValue().equalsIgnoreCase(value)){
                return words[i];
            }
        }
        return null;
    }

    public int findIndex(String value){
        for (int i = 0; i<size; i++ ){
            if (words[i].getValue().equalsIgnoreCase(value)){
                return i;
            }
        }
        return -1;
    }

    public  void delete (String value ){
        int deleteElementIndex = findIndex(value);
        words[deleteElementIndex] = words[size-1];
        size--;
    }




    public Word changeWordCard(String value, String newDescription, String newExample){
        Word word = find(value);
        if (word!=null){
            word.setDescription(newDescription);
            word.setExample(newExample);
        }
        return word;
    }

    public Word changeDescription(String value, String newDescription){
        return changeWordCard(value,newDescription,"");
    }
    public Word changeExample(String value, String newExample){
        return changeWordCard(value,"",newExample);
    }


}
