import org.junit.Test;
import static org.junit.Assert.*;

public class EncryptTest {

    @Test
    public void runCipher_instantiates(){
        Cipher cipTest = new Cipher("JAMAL",2);
        assertEquals(true, cipTest instanceof Cipher);
    }

    @Test
    public void Cipher_ifInputMessage_String() {
        Cipher cipherTest = new Cipher("abc",3);
        assertEquals("abc", cipherTest.getMessage());
    }

    @Test
    public void Cipher_ifInputMessage_String() {
        Cipher cipherTest = new Cipher("abc",3);
        assertEquals(3, cipherTest.getMessage());
    }
    @Test
    public void Cipher_ifEncryptsVariousInputs() {
        Cipher cipTest = new Ciphert("JAMAL", 1);
        // does not decrypt integers and other characters but returns them as is
        assertEquals("KBNBM",Cipher.cipher(cipTest));
    }
}