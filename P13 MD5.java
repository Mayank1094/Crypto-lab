import java.util.*;
import java.security.*;

class MD5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();

        byte[] b = MessageDigest.getInstance("MD5").digest(s.getBytes());

        for (byte x : b)
            System.out.printf("%02x", x & 0xff);

        sc.close();
    }
}
