import java.util.*;

class Caesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String s = sc.nextLine();

        System.out.print("Enter key: ");
        int k = sc.nextInt();

        String enc = "", dec = "";

        // Encryption
        for (char c : s.toCharArray())
            enc += (char)('A' + (c - 'A' + k) % 26);

        // Decryption
        for (char c : enc.toCharArray())
            dec += (char)('A' + (c - 'A' - k + 26) % 26);

        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + dec);
    }
}
