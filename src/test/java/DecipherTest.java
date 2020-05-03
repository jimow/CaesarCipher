import org.junit.*;
import static org.junit.Assert.*;

public class DecipherTest {

    @Test
    public void runDecrypt_instantiates(){
        Decipher decTest = new Decipher("Jamal", 1);
        assertEquals(true, decTest instanceof Decipher);
    }

    @Test
    public void runDecrypt_ifInputMessage_String() {
        Decipher decTest1 = new Decipher("Hassan", 1);
        assertEquals("Hassan", decTest1.getMessage());
    }

    @Test
    public void runDecrypt_ifKeyShiftby_Integer() {
        Decipher decTest2 = new Decipher("Hassan",2);
        assertEquals(2, decTest2.getShiftBy());
    }
    @Test
    public void Decipher_ifDecipher_String() {
        Decrypt decTest = new Decrypt("KBLBM", 1);
        // does not decrypt integers and other characters but returns them as is
        assertEquals("JAMAL", Decipher.decipher(decTest));
    }
}