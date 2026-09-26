import java.util.*;

class Transposition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String s = sc.nextLine().replace(" ", "");

        System.out.print("Enter key: ");
        int k = sc.nextInt();

        String single = "", dbl = "";

        // Single Transposition
        for (int i = 0; i < k; i++)
            for (int j = i; j < s.length(); j += k)
                single += s.charAt(j);

        // Double Transposition
        for (int i = 0; i < k; i++)
            for (int j = i; j < single.length(); j += k)
                dbl += single.charAt(j);

        System.out.println("Single Transposition: " + single);
        System.out.println("Double Transposition: " + dbl);
    }
}
