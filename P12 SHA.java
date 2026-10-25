import java.util.*;
import java.security.*;

public class SHA1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        MessageDigest md = MessageDigest.getInstance("SHA-1");
        byte[] digest = md.digest(text.getBytes("UTF-8"));

        for (byte b : digest)
            System.out.printf("%02x", b & 0xff);

        sc.close();
    }
}
