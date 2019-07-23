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


    public String EnCrypt(){
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < getWord().length(); i++){
            char wordChar = getWord().charAt(i);
            char encrypted = (char) (wordChar + getKey());
            encryptedText.append(encrypted);
        }
        return encryptedText.toString();
    }
}
