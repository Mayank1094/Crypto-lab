import java.util.*;

class Hill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] k = {{3,3},{2,5}};
        int[][] inv = {{15,17},{20,9}};

        System.out.print("Enter text (even length): ");
        String s = sc.next().toUpperCase();

        String enc = "", dec = "";

        // Encryption
        for (int i = 0; i < s.length(); i += 2) {
            int x = s.charAt(i) - 'A';
            int y = s.charAt(i+1) - 'A';
            enc += (char)('A' + (k[0][0]*x + k[0][1]*y) % 26);
            enc += (char)('A' + (k[1][0]*x + k[1][1]*y) % 26);
        }

        // Decryption
        for (int i = 0; i < enc.length(); i += 2) {
            int x = enc.charAt(i) - 'A';
            int y = enc.charAt(i+1) - 'A';
            dec += (char)('A' + (inv[0][0]*x + inv[0][1]*y) % 26);
            dec += (char)('A' + (inv[1][0]*x + inv[1][1]*y) % 26);
        }

        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + dec);
    }
}
