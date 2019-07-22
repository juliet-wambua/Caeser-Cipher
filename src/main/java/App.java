import models.Decrypt;
import models.Encrypt;

import javax.swing.*;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        String word;
        int key;
        String inputtedKey;

               word = JOptionPane.showInputDialog("Enter a word to encrypt");
        inputtedKey = JOptionPane.showInputDialog("Enter the key to encrypt with");
                key = Integer.parseInt(inputtedKey);
                Encrypt Encrypt = new Encrypt(word,key);
                String encryption= Encrypt.encryption();
                JOptionPane.showMessageDialog(null,"Your decrypt word is: " + Encrypt);

                word = JOptionPane.showInputDialog("Enter a word to decrypt");
               inputtedKey = JOptionPane.showInputDialog("Enter the key to decrypt with");
               key = Integer.parseInt(inputtedKey);
                Decrypt Decrypt = new Decrypt(word,key);
                String decrypt= Decrypt.decrypter();
        JOptionPane.showMessageDialog( null,"Your decrypt word is: " + Decrypt);

            }


        }
