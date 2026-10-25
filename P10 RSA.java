import java.util.*;
import java.security.*;
import javax.crypto.*;
import java.util.Base64;

public class RSA {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        kpg.initialize(2048);
        KeyPair kp = kpg.generateKeyPair();

        Cipher c = Cipher.getInstance("RSA");
        c.init(Cipher.ENCRYPT_MODE, kp.getPublic());
        byte[] encrypted = c.doFinal(text.getBytes("UTF-8"));

        System.out.println("Encrypted: " +
            Base64.getEncoder().encodeToString(encrypted));

        c.init(Cipher.DECRYPT_MODE, kp.getPrivate());
        System.out.println("Decrypted: " +
            new String(c.doFinal(encrypted), "UTF-8"));

        sc.close();
    }
}
