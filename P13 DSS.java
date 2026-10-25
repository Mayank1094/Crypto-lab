import java.util.*;
import java.security.*;

class DSS {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the message: ");
        String msg = sc.nextLine();

        KeyPairGenerator k = KeyPairGenerator.getInstance("DSA");
        k.initialize(2048);
        KeyPair kp = k.generateKeyPair();

        Signature s = Signature.getInstance("SHA256withDSA");
        s.initSign(kp.getPrivate());
        s.update(msg.getBytes("UTF-8"));
        byte[] sig = s.sign();

        System.out.println("Digital Signature: " +
            Base64.getEncoder().encodeToString(sig));

        s.initVerify(kp.getPublic());
        s.update(msg.getBytes("UTF-8"));
        System.out.println("Signature Verified: " + s.verify(sig));
        sc.close();
    }
}
