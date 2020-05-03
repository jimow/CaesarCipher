import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class Cipher {

    private static final int Letter = 26;
    private int shuftBy;
    private  String message;

    public Cipher(String message, int shiftBy){
        this.message = message;
        this.shuftBy = shiftBy;
    }

    public String getMessage() {
        return message;
    }

    public int getShuftBy() {
        return shuftBy;
    }

    public String cipher(String message, int shiftBy) {

        shiftBy %= Letter;
        char[] chars = message.toCharArray();
        shift(chars, shiftBy);
        return new String(chars);
    }

    public void shift(char[] chars, int shiftBy) {
        for (int i = 0; i < chars.length; ++i) {
            if (isLowerCase(chars[i])) {
                chars[i] = shiftChar(chars[i], shiftBy, 'a', 'z');
            } else if (isUpperCase(chars[i])) {
                chars[i] = shiftChar(chars[i], shiftBy, 'A', 'Z');
            }
        }
    }

    public char shiftChar(char c, int shiftBy, char firstChar, char lastChar) {
        c += shiftBy;
        if (c < firstChar) {
            return (char) (c + Letter);
        }
        if (c > lastChar) {
            return (char) (c - Letter);
        }
        return c;
    }
}