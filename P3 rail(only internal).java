import java.util.*;

class RailFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String s = sc.nextLine().replace(" ", "");

        String enc = "", dec = "";
        int n = s.length();

        // Encryption
        for (int i = 0; i < n; i += 2) enc += s.charAt(i);
        for (int i = 1; i < n; i += 2) enc += s.charAt(i);

        // Decryption
        int m = (n + 1) / 2;
        for (int i = 0; i < m; i++) {
            dec += enc.charAt(i);
            if (i + m < n) dec += enc.charAt(i + m);
        }

        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + dec);
    }
}
