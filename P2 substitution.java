import java.util.*;

class Substitution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String b = "QWERTYUIOPASDFGHJKLZXCVBNM";

        System.out.print("Enter text: ");
        String s = sc.nextLine().toUpperCase();

        String enc = "", dec = "";

        // Encryption
        for (char c : s.toCharArray())
            enc += b.charAt(a.indexOf(c));

        // Decryption
        for (char c : enc.toCharArray())
            dec += a.charAt(b.indexOf(c));

        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + dec);
    }
}
