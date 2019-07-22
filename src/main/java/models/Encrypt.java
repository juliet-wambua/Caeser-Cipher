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

    public String encryption() {
        StringBuilder encryptedText = new StringBuilder();
        if (key > 26) {
            key = key % 26;
        } else if (key < 0) {
            key = (key % 26) + 26;
        }
        for (int i = 0; i <= getWord().length(); i++) {
            char wordChar = this.word.charAt(i);
            char encryptedMessage = (char) (wordChar + getKey());
            encryptedText.append(encryptedMessage);
        }
        return encryptedText.toString();
    }
}
