import javax.crypto.*;
import java.util.*;

class Blowfish {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        KeyGenerator kg = KeyGenerator.getInstance("Blowfish");
        SecretKey key = kg.generateKey();

        Cipher c = Cipher.getInstance("Blowfish");

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encrypted = c.doFinal(text.getBytes());
        System.out.println("Encrypted: " + Base64.getEncoder().encodeToString(encrypted));

        c.init(Cipher.DECRYPT_MODE, key);
        byte[] decrypted = c.doFinal(encrypted);
        System.out.println("Decrypted: " + new String(decrypted));
    }
}
