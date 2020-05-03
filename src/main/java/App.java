import java.util.Scanner;
public class App {

    public static void main (String[] args) {
        System.out.println("############### CAESAR CIPHER APPLICATION ##########");
        System.out.println("This application will allow input from users with shift key number and encrypts then decrypts");
        Scanner scann = new Scanner(System.in);
        System.out.println("Please enter the string or Word to be encrypted");
        String input = scann.next();
        System.out.println("Please enter the shift Key");
        String keyInput = scann.next();
        Integer intKeyInput = Integer.parseInt(keyInput);
        System.out.println("Thank you for your Input.");
        System.out.println("The string you gave is " + input + " and the key is " + intKeyInput);

        Cipher encryptThis = new Cipher(input, intKeyInput);
        System.out.println("The encryption for the given string with the input key given is " + encryptThis.cipher(input, intKeyInput));
        String encryptedText = encryptThis.cipher(input, intKeyInput);
        System.out.println("Do you want to Decrypt the given string with the shiftkey or you give your own string to be decrypted " + encryptedText + "  " + intKeyInput );
        System.out.println("1 for Yes    2 for No"); //+ " 1 Yes 2. No");
        String choice = scann.next();
        Integer intChoice = Integer.parseInt(choice);

        if (intChoice.equals(1)) {
            Decipher decipherThis = new Decipher(input, intKeyInput);
            System.out.println("The decryption of the string " + encryptedText + " with the key " + intKeyInput + "is " + decipherThis.decipher(encryptedText, intKeyInput));
        }

    }
}