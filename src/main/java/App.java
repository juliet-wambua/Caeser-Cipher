import models.Decrypt;
import models.Encrypt;

import javax.swing.*;
import java.io.IOException;


public class App {
    public static void main(String[] args) throws IOException {
        String word;
        int key;
        String inputtedKey;
        word = JOptionPane.showInputDialog("Enter a word to encrypt");
        inputtedKey = JOptionPane.showInputDialog("Enter the key to encrypt with");
        key = Integer.parseInt(inputtedKey);
        Encrypt Encrypt = new Encrypt(word, key);
        JOptionPane.showMessageDialog(null, "Your encrypt word is: " + Encrypt);
    }
//                word = JOptionPane.showInputDialog("Enter a word to decrypt");
//               inputtedKey = JOptionPane.showInputDialog("Enter the key to decrypt with");
//               key = Integer.parseInt(inputtedKey);
//                Decrypt Decrypt = new Decrypt(word,key);
//                String decryptText= Decrypt.DeCrypt();
//        JOptionPane.showMessageDialog( null,"Your decrypt word is: " + Decrypt);

            }



