import models.Decrypt;
import models.Encrypt;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        System.out.println("\n The Encryption and Decryption Game");
        boolean run = true;
        while(run){
            Scanner myScanner = new Scanner(System.in);
            System.out.println("\t. Press 1: to Encrypt\n\t. Press 2:to Decrypt\n\t. Press 0: to Exit");
            Integer branch = Integer.parseInt(myScanner.nextLine());

            if(branch.equals(1)) {
                System.out.println("\n Enter a word to encrypt");
                String stringWord = myScanner.nextLine();
                System.out.println("You entered: " + stringWord);
                System.out.println("\n Enter the key to encrypt with, make sure it's a number!");
                int intkey = myScanner.nextInt();
                Encrypt Encrypt = new Encrypt(stringWord,intkey);
                String encrypt= Encrypt.EnCrypt();
                System.out.println("\t| Your encrypt word is: " + encrypt);



            }
            if(branch.equals(2)) {
                System.out.println("\n Enter a word to decrypt");
                String stringWord = myScanner.nextLine();
                System.out.println("You entered: " + stringWord);
                System.out.println("\n Enter the key to decrypt with, make sure it's a number!");
                int intkey = myScanner.nextInt();
                Decrypt Decrypt = new Decrypt(stringWord,intkey);
                String decrypt= Decrypt.DeCrypt();
                System.out.println("\t| Your decrypt word is: " + decrypt);


            }

        }
    }
}