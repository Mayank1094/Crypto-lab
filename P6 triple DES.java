import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class TripleDES {
    public static void main(String[] args) throws Exception {
        KeyGenerator kg = KeyGenerator.getInstance("DESede");
        kg.init(168);
        SecretKey key = kg.generateKey();

        Cipher c = Cipher.getInstance("DESede");
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encrypted = c.doFinal("Hello".getBytes());

        c.init(Cipher.DECRYPT_MODE, key);
        byte[] decrypted = c.doFinal(encrypted);

        System.out.println("Encrypted: " +
            java.util.Base64.getEncoder().encodeToString(encrypted));
        System.out.println("Decrypted: " +
            new String(decrypted));
    }
}
