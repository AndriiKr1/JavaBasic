public class Pets {
    private Pet[] array;
    private int size;

    public Pets(){
        array = new Pet[16];
        size = 0;
    }

    public void add(Pet pet){
        if(size>=array.length){
            enlargeArray();
        }
        array[size++] = pet;
        /*
             array[size]=pet;
             size=size+1;
         */
    }

    private void enlargeArray() {
        Pet[] newArray = new Pet[array.length*2];

        for (int i=0; i< array.length; i++){
            newArray[i]=array[i];
        }
        array = newArray;
    }

    public String toString(){
        String result="Pets:"+System.lineSeparator();

        for (int i=0; i<size; i++){
            result+=(i+1) + ". " + array[i]+System.lineSeparator();
        }

        return result;
    }

    public int size() {
        return size;
    }

    public Pet get(int index){
        if (index>=0 && index<size){
            return array[index];
        } else {
            return null;
        }
    }



}
