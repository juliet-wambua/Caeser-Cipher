package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {

    @Test
    public void Encrypt_getAWord(){
        Encrypt testEncrypt = new Encrypt("hello", 1);
        assertEquals("hello", testEncrypt.getWord());
    }

   @Test
    public void Encrypt_getKey(){
        Encrypt testEncrypt = new Encrypt("hello", 1);
           assertEquals(1, testEncrypt.getKey());
        }


   }
