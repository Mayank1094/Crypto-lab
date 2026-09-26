import javax.crypto.*;
import javax.crypto.spec.*;
import java.util.*;

class DES {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();
        System.out.print("Enter 8 character key: ");
        String key = sc.nextLine();

        SecretKey k = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(key.getBytes()));
        Cipher c = Cipher.getInstance("DES");

        // Encryption
        c.init(Cipher.ENCRYPT_MODE, k);
        byte[] enc = c.doFinal(text.getBytes());
        System.out.println("Encrypted: " + Base64.getEncoder().encodeToString(enc));

        // Decryption
        c.init(Cipher.DECRYPT_MODE, k);
        System.out.println("Decrypted: " + new String(c.doFinal(enc)));
    }
}
