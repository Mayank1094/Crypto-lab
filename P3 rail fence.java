import java.util.*;

class RailFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String s = sc.nextLine().replace(" ", "");

        System.out.print("Enter rails: ");
        int r = sc.nextInt();

        String enc = "", dec = "";

        // Encryption
        for (int row = 0; row < r; row++)
            for (int i = row; i < s.length(); i += r)
                enc += s.charAt(i);

        // Decryption
        int p = 0;
        for (int row = 0; row < r; row++)
            for (int i = row; i < s.length(); i += r)
                dec += enc.charAt(p++);

        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + dec);
    }
}
