package models;

public class Encrypt {
    private String word;
    private int key;

    public Encrypt(String word, int key){
        this.word = word;
        this.key = key;
    }
    public String getWord(){
        return word;
    }
    public int getKey(){
        return key;
    }
}
