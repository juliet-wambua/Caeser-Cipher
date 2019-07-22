package models;

import org.junit.Test;
import static org.junit.Assert.*;

        public class DecryptTest {

            @Test

            public void instantiates_correct(){

                Decrypt testDecrypt = new Decrypt("jere",5);
                assertTrue(testDecrypt instanceof Decrypt);
            }


            @Test

            public void getWord_String(){
                Decrypt testDecrypt= new Decrypt("jere",5);
                assertEquals("jere",testDecrypt.getWord());
            }


            @Test
            public void getKey_int(){
                Decrypt testDecrypt= new Decrypt("jere",5);
                assertEquals(5,testDecrypt.getKey());
            }


        }