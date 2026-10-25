import javax.crypto.*;
import javax.crypto.spec.*;
import java.util.*;

class RC4 {
public static void main(String[] args) throws Exception {
    String text = "Hello world";
    SecretKey key = new SecretKeySpec("mysecret".getBytes(), "RC4");
    Cipher c = Cipher.getInstance("RC4");

    c.init(Cipher.ENCRYPT_MODE, key);
    byte[] e = c.doFinal(text.getBytes());
    System.out.println("Encrypted: " + Base64.getEncoder().encodeToString(e));

    c.init(Cipher.DECRYPT_MODE, key);
    System.out.println("Decrypted: " + new String(c.doFinal(e)));
}
}
