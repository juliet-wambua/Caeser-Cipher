package models;

import org.junit.Test;
import static org.junit.Assert.*;

        public class DecryptTest {

            @Test

            public void getWord_String(){
                Decrypt testDecrypt= new Decrypt("hello",1);
                assertEquals("hello", testDecrypt.getWord());
            }


            @Test
            public void getKey_int(){
                Decrypt testDecrypt= new Decrypt("hello",1);
                assertEquals(1, testDecrypt.getKey());
            }


        }